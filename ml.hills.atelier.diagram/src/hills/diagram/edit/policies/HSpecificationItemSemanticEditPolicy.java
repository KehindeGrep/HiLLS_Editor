/*
* 
*/
package hills.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import hills.diagram.edit.commands.GenericNodeCreateCommand;
import hills.diagram.edit.commands.HClassCreateCommand;
import hills.diagram.edit.commands.HRequirementSpecificationCreateCommand;
import hills.diagram.edit.commands.HSystemCreateCommand;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HSpecificationItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HSpecificationItemSemanticEditPolicy() {
		super(HillsElementTypes.HSpecification_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HillsElementTypes.HSystem_2001 == req.getElementType()) {
			return getGEFWrapper(new HSystemCreateCommand(req));
		}
		if (HillsElementTypes.HClass_2002 == req.getElementType()) {
			return getGEFWrapper(new HClassCreateCommand(req));
		}
		if (HillsElementTypes.GenericNode_2003 == req.getElementType()) {
			return getGEFWrapper(new GenericNodeCreateCommand(req));
		}
		if (HillsElementTypes.HRequirementSpecification_2004 == req.getElementType()) {
			return getGEFWrapper(new HRequirementSpecificationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
