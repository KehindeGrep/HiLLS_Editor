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

import hills.diagram.edit.parts.GenericNodeEditPart;
import hills.diagram.edit.parts.HClassEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationEditPart;
import hills.diagram.edit.parts.HSystemEditPart;
import hills.diagram.providers.HillsElementTypes;
import hills.diagram.providers.HillsModelingAssistantProvider;

/**
 * @generated
 */
public class HillsModelingAssistantProviderOfHClassEditPart extends HillsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(HillsElementTypes.Port_3013);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((HClassEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(HClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(HillsElementTypes.Composition_4001);
		types.add(HillsElementTypes.Aggregation_4002);
		types.add(HillsElementTypes.Reference_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((HClassEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(HClassEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof HSystemEditPart) {
			types.add(HillsElementTypes.Composition_4001);
		}
		if (targetEditPart instanceof HClassEditPart) {
			types.add(HillsElementTypes.Composition_4001);
		}
		if (targetEditPart instanceof GenericNodeEditPart) {
			types.add(HillsElementTypes.Composition_4001);
		}
		if (targetEditPart instanceof HRequirementSpecificationEditPart) {
			types.add(HillsElementTypes.Composition_4001);
		}
		if (targetEditPart instanceof HSystemEditPart) {
			types.add(HillsElementTypes.Aggregation_4002);
		}
		if (targetEditPart instanceof HClassEditPart) {
			types.add(HillsElementTypes.Aggregation_4002);
		}
		if (targetEditPart instanceof GenericNodeEditPart) {
			types.add(HillsElementTypes.Aggregation_4002);
		}
		if (targetEditPart instanceof HRequirementSpecificationEditPart) {
			types.add(HillsElementTypes.Aggregation_4002);
		}
		if (targetEditPart instanceof HSystemEditPart) {
			types.add(HillsElementTypes.Reference_4003);
		}
		if (targetEditPart instanceof HClassEditPart) {
			types.add(HillsElementTypes.Reference_4003);
		}
		if (targetEditPart instanceof GenericNodeEditPart) {
			types.add(HillsElementTypes.Reference_4003);
		}
		if (targetEditPart instanceof HRequirementSpecificationEditPart) {
			types.add(HillsElementTypes.Reference_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((HClassEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(HClassEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HillsElementTypes.Composition_4001) {
			types.add(HillsElementTypes.HSystem_2001);
			types.add(HillsElementTypes.HClass_2002);
			types.add(HillsElementTypes.GenericNode_2003);
			types.add(HillsElementTypes.HRequirementSpecification_2004);
		} else if (relationshipType == HillsElementTypes.Aggregation_4002) {
			types.add(HillsElementTypes.HSystem_2001);
			types.add(HillsElementTypes.HClass_2002);
			types.add(HillsElementTypes.GenericNode_2003);
			types.add(HillsElementTypes.HRequirementSpecification_2004);
		} else if (relationshipType == HillsElementTypes.Reference_4003) {
			types.add(HillsElementTypes.HSystem_2001);
			types.add(HillsElementTypes.HClass_2002);
			types.add(HillsElementTypes.GenericNode_2003);
			types.add(HillsElementTypes.HRequirementSpecification_2004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((HClassEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(HClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(HillsElementTypes.Composition_4001);
		types.add(HillsElementTypes.Aggregation_4002);
		types.add(HillsElementTypes.Reference_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((HClassEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(HClassEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == HillsElementTypes.Composition_4001) {
			types.add(HillsElementTypes.HSystem_2001);
			types.add(HillsElementTypes.HClass_2002);
		} else if (relationshipType == HillsElementTypes.Aggregation_4002) {
			types.add(HillsElementTypes.HSystem_2001);
			types.add(HillsElementTypes.HClass_2002);
		} else if (relationshipType == HillsElementTypes.Reference_4003) {
			types.add(HillsElementTypes.HSystem_2001);
			types.add(HillsElementTypes.HClass_2002);
		}
		return types;
	}

}
