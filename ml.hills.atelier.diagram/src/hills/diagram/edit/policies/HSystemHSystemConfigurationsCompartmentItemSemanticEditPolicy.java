/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.FiniteConfigurationCreateCommand;
import hills.diagram.edit.commands.InitialConfigurationCreateCommand;
import hills.diagram.edit.commands.PassiveConfigurationCreateCommand;
import hills.diagram.edit.commands.TestNodeCreateCommand;
import hills.diagram.edit.commands.TransientConfigurationCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HSystemHSystemConfigurationsCompartmentItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HSystemHSystemConfigurationsCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.HSystem_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.FiniteConfiguration_3001 == req.getElementType()) {
			return getGEFWrapper(new FiniteConfigurationCreateCommand(req));
		}
		if (HillsElementTypes.InitialConfiguration_3005 == req.getElementType()) {
			return getGEFWrapper(new InitialConfigurationCreateCommand(req));
		}
		if (HillsElementTypes.PassiveConfiguration_3006 == req.getElementType()) {
			return getGEFWrapper(new PassiveConfigurationCreateCommand(req));
		}
		if (HillsElementTypes.TransientConfiguration_3009 == req.getElementType()) {
			return getGEFWrapper(new TransientConfigurationCreateCommand(req));
		}
		if (HillsElementTypes.TestNode_3012 == req.getElementType()) {
			return getGEFWrapper(new TestNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
