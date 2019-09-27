/*
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.ui;

import com.google.inject.Injector;
import org.chabu.hwmap.ui.internal.HwmapActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HwMapDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(HwmapActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		HwmapActivator activator = HwmapActivator.getInstance();
		return activator != null ? activator.getInjector(HwmapActivator.ORG_CHABU_HWMAP_HWMAPDSL) : null;
	}

}
