/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.Declaration2CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HClassHClassDeclaratiosCompartmentItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HClassHClassDeclaratiosCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.HClass_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Declaration_3016 == req.getElementType()) {
			return getGEFWrapper(new Declaration2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
