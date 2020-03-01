/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.FunctionCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HSystemHSystemFonctionsCompartmentItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HSystemHSystemFonctionsCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.HSystem_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Function_3015 == req.getElementType()) {
			return getGEFWrapper(new FunctionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
