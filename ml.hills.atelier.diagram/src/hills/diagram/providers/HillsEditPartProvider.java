/*
 * 
 */
package hills.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import hills.diagram.edit.parts.HSpecificationEditPart;
import hills.diagram.edit.parts.HillsEditPartFactory;
import hills.diagram.part.HillsVisualIDRegistry;

/**
 * @generated
 */
public class HillsEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public HillsEditPartProvider() {
		super(new HillsEditPartFactory(), HillsVisualIDRegistry.TYPED_INSTANCE, HSpecificationEditPart.MODEL_ID);
	}

}
