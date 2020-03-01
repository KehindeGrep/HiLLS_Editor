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
public class ActivityActivityPpredicatsCompartment2ItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActivityActivityPpredicatsCompartment2ItemSemanticEditPolicy() {
		super(HillsElementTypes.Activity_3008);
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
