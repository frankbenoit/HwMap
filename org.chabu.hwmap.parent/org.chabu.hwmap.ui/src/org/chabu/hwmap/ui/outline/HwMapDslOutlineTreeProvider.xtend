/*
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.ui.outline

import org.chabu.hwmap.hwMapDsl.Instantiation
import org.chabu.hwmap.hwMapDsl.MemoryMap
import org.chabu.hwmap.hwMapDsl.Register
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class HwMapDslOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def _isLeaf(Register el) { true }
	def _isLeaf(Instantiation el) { true }
	
	def void _createChildren( DocumentRootNode outlineNode, MemoryMap mm ) {
		mm.components.forEach[ c |
			createNode( outlineNode, c )
		]
	}
	
}
