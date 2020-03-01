/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.PortDeclaration3CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class PortPortEntreePortsCompartmentItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PortPortEntreePortsCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.Port_3013);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.PortDeclaration_3024 == req.getElementType()) {
			return getGEFWrapper(new PortDeclaration3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
