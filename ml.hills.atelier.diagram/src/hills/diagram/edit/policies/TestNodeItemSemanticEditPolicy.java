/*
* 
*/
package hills.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import hills.diagram.edit.commands.ConfluentTransitionCreateCommand;
import hills.diagram.edit.commands.ConfluentTransitionReorientCommand;
import hills.diagram.edit.commands.ExternalTransitionCreateCommand;
import hills.diagram.edit.commands.ExternalTransitionReorientCommand;
import hills.diagram.edit.commands.InternalTransitionCreateCommand;
import hills.diagram.edit.commands.InternalTransitionReorientCommand;
import hills.diagram.edit.parts.ConfluentTransitionEditPart;
import hills.diagram.edit.parts.ExternalTransitionEditPart;
import hills.diagram.edit.parts.InternalTransitionEditPart;
import hills.diagram.part.HillsVisualIDRegistry;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class TestNodeItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TestNodeItemSemanticEditPolicy() {
		super(HillsElementTypes.TestNode_3012);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (HillsVisualIDRegistry.getVisualID(incomingLink) == ConfluentTransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HillsVisualIDRegistry.getVisualID(incomingLink) == InternalTransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HillsVisualIDRegistry.getVisualID(incomingLink) == ExternalTransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (HillsVisualIDRegistry.getVisualID(outgoingLink) == ConfluentTransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (HillsVisualIDRegistry.getVisualID(outgoingLink) == InternalTransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (HillsVisualIDRegistry.getVisualID(outgoingLink) == ExternalTransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (HillsElementTypes.ConfluentTransition_4004 == req.getElementType()) {
			return getGEFWrapper(new ConfluentTransitionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (HillsElementTypes.InternalTransition_4005 == req.getElementType()) {
			return getGEFWrapper(new InternalTransitionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (HillsElementTypes.ExternalTransition_4006 == req.getElementType()) {
			return getGEFWrapper(new ExternalTransitionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (HillsElementTypes.ConfluentTransition_4004 == req.getElementType()) {
			return getGEFWrapper(new ConfluentTransitionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (HillsElementTypes.InternalTransition_4005 == req.getElementType()) {
			return getGEFWrapper(new InternalTransitionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (HillsElementTypes.ExternalTransition_4006 == req.getElementType()) {
			return getGEFWrapper(new ExternalTransitionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConfluentTransitionEditPart.VISUAL_ID:
			return getGEFWrapper(new ConfluentTransitionReorientCommand(req));
		case InternalTransitionEditPart.VISUAL_ID:
			return getGEFWrapper(new InternalTransitionReorientCommand(req));
		case ExternalTransitionEditPart.VISUAL_ID:
			return getGEFWrapper(new ExternalTransitionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}