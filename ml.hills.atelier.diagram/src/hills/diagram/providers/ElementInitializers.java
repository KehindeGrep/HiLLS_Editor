/*
 * 
 */
package hills.diagram.providers;

import hills.diagram.part.HillsDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = HillsDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			HillsDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
