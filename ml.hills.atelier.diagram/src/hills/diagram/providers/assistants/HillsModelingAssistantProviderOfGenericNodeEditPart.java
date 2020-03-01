/*
 * 
 */
package hills.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import hills.diagram.edit.parts.GenericNodeEditPart;
import hills.diagram.providers.HillsElementTypes;
import hills.diagram.providers.HillsModelingAssistantProvider;

/**
 * @generated
 */
public class HillsModelingAssistantProviderOfGenericNodeEditPart extends HillsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((GenericNodeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(GenericNodeEditPart target) {
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
		return doGetTypesForSource((GenericNodeEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(GenericNodeEditPart target, IElementType relationshipType) {
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
