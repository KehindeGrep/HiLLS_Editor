/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.ActivityCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class FiniteConfigurationFiniteConfigurationActivitesCompartmentItemSemanticEditPolicy
		extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FiniteConfigurationFiniteConfigurationActivitesCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.FiniteConfiguration_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Activity_3003 == req.getElementType()) {
			return getGEFWrapper(new ActivityCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
