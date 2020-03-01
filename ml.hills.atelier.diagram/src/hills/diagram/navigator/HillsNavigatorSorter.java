/*
* 
*/
package hills.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import hills.diagram.part.HillsVisualIDRegistry;

/**
 * @generated
 */
public class HillsNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7028;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7027;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof HillsNavigatorItem) {
			HillsNavigatorItem item = (HillsNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return HillsVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
