/*
 * 
 */
package hills.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import hills.diagram.edit.parts.FiniteConfigurationEditPart;
import hills.diagram.edit.parts.InitialConfigurationEditPart;
import hills.diagram.edit.parts.PassiveConfigurationEditPart;
import hills.diagram.edit.parts.TestNodeEditPart;
import hills.diagram.edit.parts.TransientConfigurationEditPart;
import hills.diagram.providers.HillsElementTypes;
import hills.diagram.providers.HillsModelingAssistantProvider;

/**
 * @generated
 */
public class HillsModelingAssistantProviderOfTransientConfigurationEditPart extends HillsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TransientConfigurationEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TransientConfigurationEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(HillsElementTypes.ConfluentTransition_4004);
		types.add(HillsElementTypes.InternalTransition_4005);
		types.add(HillsElementTypes.ExternalTransition_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TransientConfigurationEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TransientConfigurationEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FiniteConfigurationEditPart) {
			types.add(HillsElementTypes.ConfluentTransition_4004);
		}
		if (targetEditPart instanceof InitialConfigurationEditPart) {
			types.add(HillsElementTypes.ConfluentTransition_4004);
		}
		if (targetEditPart instanceof PassiveConfigurationEditPart) {
			types.add(HillsElementTypes.ConfluentTransition_4004);
		}
		if (targetEditPart instanceof TransientConfigurationEditPart) {
			types.add(HillsElementTypes.ConfluentTransition_4004);
		}
		if (targetEditPart instanceof TestNodeEditPart) {
			types.add(HillsElementTypes.ConfluentTransition_4004);
		}
		if (targetEditPart instanceof FiniteConfigurationEditPart) {
			types.add(HillsElementTypes.InternalTransition_4005);
		}
		if (targetEditPart instanceof InitialConfigurationEditPart) {
			types.add(HillsElementTypes.InternalTransition_4005);
		}
		if (targetEditPart instanceof PassiveConfigurationEditPart) {
			types.add(HillsElementTypes.InternalTransition_4005);
		}
		if (targetEditPart instanceof TransientConfigurationEditPart) {
			types.add(HillsElementTypes.InternalTransition_4005);
		}
		if (targetEditPart instanceof TestNodeEditPart) {
			types.add(HillsElementTypes.InternalTransition_4005);
		}
		if (targetEditPart instanceof FiniteConfigurationEditPart) {
			types.add(HillsElementTypes.ExternalTransition_4006);
		}
		if (targetEditPart instanceof InitialConfigurationEditPart) {
			types.add(HillsElementTypes.ExternalTransition_4006);
		}
		if (targetEditPart instanceof PassiveConfigurationEditPart) {
			types.add(HillsElementTypes.ExternalTransition_4006);
		}
		if (targetEditPart instanceof TransientConfigurationEditPart) {
			types.add(HillsElementTypes.ExternalTransition_4006);
		}
		if (targetEditPart instanceof TestNodeEditPart) {
			types.add(HillsElementTypes.ExternalTransition_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TransientConfigurationEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TransientConfigurationEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HillsElementTypes.ConfluentTransition_4004) {
			types.add(HillsElementTypes.FiniteConfiguration_3001);
			types.add(HillsElementTypes.InitialConfiguration_3005);
			types.add(HillsElementTypes.PassiveConfiguration_3006);
			types.add(HillsElementTypes.TransientConfiguration_3009);
			types.add(HillsElementTypes.TestNode_3012);
		} else if (relationshipType == HillsElementTypes.InternalTransition_4005) {
			types.add(HillsElementTypes.FiniteConfiguration_3001);
			types.add(HillsElementTypes.InitialConfiguration_3005);
			types.add(HillsElementTypes.PassiveConfiguration_3006);
			types.add(HillsElementTypes.TransientConfiguration_3009);
			types.add(HillsElementTypes.TestNode_3012);
		} else if (relationshipType == HillsElementTypes.ExternalTransition_4006) {
			types.add(HillsElementTypes.FiniteConfiguration_3001);
			types.add(HillsElementTypes.InitialConfiguration_3005);
			types.add(HillsElementTypes.PassiveConfiguration_3006);
			types.add(HillsElementTypes.TransientConfiguration_3009);
			types.add(HillsElementTypes.TestNode_3012);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TransientConfigurationEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TransientConfigurationEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(HillsElementTypes.ConfluentTransition_4004);
		types.add(HillsElementTypes.InternalTransition_4005);
		types.add(HillsElementTypes.ExternalTransition_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TransientConfigurationEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TransientConfigurationEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HillsElementTypes.ConfluentTransition_4004) {
			types.add(HillsElementTypes.FiniteConfiguration_3001);
			types.add(HillsElementTypes.InitialConfiguration_3005);
			types.add(HillsElementTypes.PassiveConfiguration_3006);
			types.add(HillsElementTypes.TransientConfiguration_3009);
			types.add(HillsElementTypes.TestNode_3012);
		} else if (relationshipType == HillsElementTypes.InternalTransition_4005) {
			types.add(HillsElementTypes.FiniteConfiguration_3001);
			types.add(HillsElementTypes.InitialConfiguration_3005);
			types.add(HillsElementTypes.PassiveConfiguration_3006);
			types.add(HillsElementTypes.TransientConfiguration_3009);
			types.add(HillsElementTypes.TestNode_3012);
		} else if (relationshipType == HillsElementTypes.ExternalTransition_4006) {
			types.add(HillsElementTypes.FiniteConfiguration_3001);
			types.add(HillsElementTypes.InitialConfiguration_3005);
			types.add(HillsElementTypes.PassiveConfiguration_3006);
			types.add(HillsElementTypes.TransientConfiguration_3009);
			types.add(HillsElementTypes.TestNode_3012);
		}
		return types;
	}

}
