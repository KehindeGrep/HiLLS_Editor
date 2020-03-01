/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.PortDeclarationCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class PropertyPropertyPpredicatsCompartment2ItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PropertyPropertyPpredicatsCompartment2ItemSemanticEditPolicy() {
		super(HillsElementTypes.Property_3007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.PortDeclaration_3022 == req.getElementType()) {
			return getGEFWrapper(new PortDeclarationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
