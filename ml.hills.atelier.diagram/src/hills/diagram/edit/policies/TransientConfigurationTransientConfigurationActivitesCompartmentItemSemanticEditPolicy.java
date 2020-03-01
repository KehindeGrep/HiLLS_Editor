/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.Activity3CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class TransientConfigurationTransientConfigurationActivitesCompartmentItemSemanticEditPolicy
		extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransientConfigurationTransientConfigurationActivitesCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.TransientConfiguration_3009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Activity_3011 == req.getElementType()) {
			return getGEFWrapper(new Activity3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
