/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.Property2CreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class PassiveConfigurationPassiveConfigurationProprietesCompartmentItemSemanticEditPolicy
		extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PassiveConfigurationPassiveConfigurationProprietesCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.PassiveConfiguration_3006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Property_3007 == req.getElementType()) {
			return getGEFWrapper(new Property2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
