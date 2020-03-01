/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.SojournTimeCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class FiniteConfigurationFiniteConfigurationSojTimeCompartmentItemSemanticEditPolicy
		extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FiniteConfigurationFiniteConfigurationSojTimeCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.FiniteConfiguration_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.SojournTime_3004 == req.getElementType()) {
			return getGEFWrapper(new SojournTimeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
