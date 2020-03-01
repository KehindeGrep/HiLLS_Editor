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

import hills.diagram.edit.commands.AggregationCreateCommand;
import hills.diagram.edit.commands.AggregationReorientCommand;
import hills.diagram.edit.commands.CompositionCreateCommand;
import hills.diagram.edit.commands.CompositionReorientCommand;
import hills.diagram.edit.commands.ReferenceCreateCommand;
import hills.diagram.edit.commands.ReferenceReorientCommand;
import hills.diagram.edit.parts.AggregationEditPart;
import hills.diagram.edit.parts.CompositionEditPart;
import hills.diagram.edit.parts.ReferenceEditPart;
import hills.diagram.part.HillsVisualIDRegistry;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class GenericNodeItemSemanticEditPolicy extends HillsBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GenericNodeItemSemanticEditPolicy() {
		super(HillsElementTypes.GenericNode_2003);
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
			if (HillsVisualIDRegistry.getVisualID(incomingLink) == CompositionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HillsVisualIDRegistry.getVisualID(incomingLink) == AggregationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (HillsVisualIDRegistry.getVisualID(incomingLink) == ReferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
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
		if (HillsElementTypes.Composition_4001 == req.getElementType()) {
			return null;
		}
		if (HillsElementTypes.Aggregation_4002 == req.getElementType()) {
			return null;
		}
		if (HillsElementTypes.Reference_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (HillsElementTypes.Composition_4001 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (HillsElementTypes.Aggregation_4002 == req.getElementType()) {
			return getGEFWrapper(new AggregationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (HillsElementTypes.Reference_4003 == req.getElementType()) {
			return getGEFWrapper(new ReferenceCreateCommand(req, req.getSource(), req.getTarget()));
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
		case CompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositionReorientCommand(req));
		case AggregationEditPart.VISUAL_ID:
			return getGEFWrapper(new AggregationReorientCommand(req));
		case ReferenceEditPart.VISUAL_ID:
			return getGEFWrapper(new ReferenceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
