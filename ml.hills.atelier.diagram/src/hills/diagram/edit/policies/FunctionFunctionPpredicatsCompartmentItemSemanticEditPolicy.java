/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.PortDeclaration4CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class FunctionFunctionPpredicatsCompartmentItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FunctionFunctionPpredicatsCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.Function_3015);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.PortDeclaration_3025 == req.getElementType()) {
			return getGEFWrapper(new PortDeclaration4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
