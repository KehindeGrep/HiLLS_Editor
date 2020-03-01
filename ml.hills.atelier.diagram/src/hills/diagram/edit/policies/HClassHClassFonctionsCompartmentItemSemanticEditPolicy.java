/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.Function2CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HClassHClassFonctionsCompartmentItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HClassHClassFonctionsCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.HClass_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Function_3017 == req.getElementType()) {
			return getGEFWrapper(new Function2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
