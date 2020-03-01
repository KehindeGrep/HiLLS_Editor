/*
 * 
 */
package hills.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import hills.Aggregation;
import hills.HClassifier;
import hills.HSpecification;
import hills.Nomme;
import hills.diagram.edit.policies.HillsBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AggregationReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public AggregationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Aggregation) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof HClassifier && newEnd instanceof HClassifier)) {
			return false;
		}
		Nomme target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof HSpecification)) {
			return false;
		}
		HSpecification container = (HSpecification) getLink().eContainer();
		return HillsBaseItemSemanticEditPolicy.getLinkConstraints().canExistAggregation_4002(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Nomme && newEnd instanceof Nomme)) {
			return false;
		}
		HClassifier source = getLink().getSource();
		if (!(getLink().eContainer() instanceof HSpecification)) {
			return false;
		}
		HSpecification container = (HSpecification) getLink().eContainer();
		return HillsBaseItemSemanticEditPolicy.getLinkConstraints().canExistAggregation_4002(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Aggregation getLink() {
		return (Aggregation) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected HClassifier getOldSource() {
		return (HClassifier) oldEnd;
	}

	/**
	* @generated
	*/
	protected HClassifier getNewSource() {
		return (HClassifier) newEnd;
	}

	/**
	* @generated
	*/
	protected Nomme getOldTarget() {
		return (Nomme) oldEnd;
	}

	/**
	* @generated
	*/
	protected Nomme getNewTarget() {
		return (Nomme) newEnd;
	}
}
