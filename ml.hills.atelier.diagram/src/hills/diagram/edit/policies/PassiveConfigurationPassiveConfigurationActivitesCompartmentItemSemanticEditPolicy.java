/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.Activity2CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class PassiveConfigurationPassiveConfigurationActivitesCompartmentItemSemanticEditPolicy
		extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PassiveConfigurationPassiveConfigurationActivitesCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.PassiveConfiguration_3006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Activity_3008 == req.getElementType()) {
			return getGEFWrapper(new Activity2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
