package org.chabu.hwmap.ui.handler;

import javax.inject.Inject;
import javax.inject.Provider;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class GenerationHandler extends AbstractHandler implements IHandler {

    @Inject
    private IGenerator2 generator;
    
    @Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
    @Inject
    IResourceDescriptions resourceDescriptions;
     
    @Inject
    IResourceSetProvider resourceSetProvider;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof IFile) {
                IFile file = (IFile) firstElement;
                IProject project = file.getProject();
                
                String srcGenFolder = file.getParent().getProjectRelativePath().toOSString();
 
                final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
                fsa.setOutputPath(srcGenFolder);
                fsa.setProject(project);
                fsa.setMonitor(new NullProgressMonitor());
                 
                URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
                ResourceSet rs = resourceSetProvider.get(project);
                Resource r = rs.getResource(uri, true);
                generator.doGenerate(r, fsa, null );
            }
        }
        return null;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }

}
