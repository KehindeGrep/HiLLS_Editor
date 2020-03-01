/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.Property3CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class TransientConfigurationTransientConfigurationProprietesCompartmentItemSemanticEditPolicy
		extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransientConfigurationTransientConfigurationProprietesCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.TransientConfiguration_3009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Property_3010 == req.getElementType()) {
			return getGEFWrapper(new Property3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
