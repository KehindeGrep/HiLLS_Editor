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

import hills.ConfNomme;
import hills.Configuration;
import hills.ExternalTransition;
import hills.HSystem;
import hills.diagram.edit.policies.HillsBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ExternalTransitionReorientCommand extends EditElementCommand {

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
	public ExternalTransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ExternalTransition) {
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
		if (!(oldEnd instanceof Configuration && newEnd instanceof Configuration)) {
			return false;
		}
		ConfNomme target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof HSystem)) {
			return false;
		}
		HSystem container = (HSystem) getLink().eContainer();
		return HillsBaseItemSemanticEditPolicy.getLinkConstraints().canExistExternalTransition_4006(container,
				getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ConfNomme && newEnd instanceof ConfNomme)) {
			return false;
		}
		Configuration source = getLink().getSource();
		if (!(getLink().eContainer() instanceof HSystem)) {
			return false;
		}
		HSystem container = (HSystem) getLink().eContainer();
		return HillsBaseItemSemanticEditPolicy.getLinkConstraints().canExistExternalTransition_4006(container,
				getLink(), source, getNewTarget());
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
	protected ExternalTransition getLink() {
		return (ExternalTransition) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Configuration getOldSource() {
		return (Configuration) oldEnd;
	}

	/**
	* @generated
	*/
	protected Configuration getNewSource() {
		return (Configuration) newEnd;
	}

	/**
	* @generated
	*/
	protected ConfNomme getOldTarget() {
		return (ConfNomme) oldEnd;
	}

	/**
	* @generated
	*/
	protected ConfNomme getNewTarget() {
		return (ConfNomme) newEnd;
	}
}
