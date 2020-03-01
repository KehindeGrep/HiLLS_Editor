/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.PropertyCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class FiniteConfigurationFiniteConfigurationProprietesCompartmentItemSemanticEditPolicy
		extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FiniteConfigurationFiniteConfigurationProprietesCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.FiniteConfiguration_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.Property_3002 == req.getElementType()) {
			return getGEFWrapper(new PropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
