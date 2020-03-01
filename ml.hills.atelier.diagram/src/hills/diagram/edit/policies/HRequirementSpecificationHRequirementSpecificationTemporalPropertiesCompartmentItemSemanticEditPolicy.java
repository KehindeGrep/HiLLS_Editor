/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hills.diagram.edit.commands.BExistenceCreateCommand;
import hills.diagram.edit.commands.CAbsenceCreateCommand;
import hills.diagram.edit.commands.EExistenceCreateCommand;
import hills.diagram.edit.commands.UExistenceCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentItemSemanticEditPolicy
		extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentItemSemanticEditPolicy() {
		super(HillsElementTypes.HRequirementSpecification_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.BExistence_3018 == req.getElementType()) {
			return getGEFWrapper(new BExistenceCreateCommand(req));
		}
		if (HillsElementTypes.UExistence_3019 == req.getElementType()) {
			return getGEFWrapper(new UExistenceCreateCommand(req));
		}
		if (HillsElementTypes.EExistence_3020 == req.getElementType()) {
			return getGEFWrapper(new EExistenceCreateCommand(req));
		}
		if (HillsElementTypes.CAbsence_3021 == req.getElementType()) {
			return getGEFWrapper(new CAbsenceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
