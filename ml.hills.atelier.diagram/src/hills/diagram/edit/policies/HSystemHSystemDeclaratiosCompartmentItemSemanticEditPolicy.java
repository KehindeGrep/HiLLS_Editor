/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.DeclarationCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HSystemHSystemDeclaratiosCompartmentItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HSystemHSystemDeclaratiosCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.HSystem_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Declaration_3014 == req.getElementType()) {
			return getGEFWrapper(new DeclarationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
