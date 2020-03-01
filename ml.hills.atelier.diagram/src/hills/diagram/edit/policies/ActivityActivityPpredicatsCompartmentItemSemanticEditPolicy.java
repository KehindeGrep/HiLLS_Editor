/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.PortDeclaration2CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class ActivityActivityPpredicatsCompartmentItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActivityActivityPpredicatsCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.Activity_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.PortDeclaration_3023 == req.getElementType()) {
			return getGEFWrapper(new PortDeclaration2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
