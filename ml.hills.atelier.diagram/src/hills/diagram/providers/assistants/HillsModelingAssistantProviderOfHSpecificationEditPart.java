/*
 * 
 */
package hills.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import hills.diagram.providers.HillsElementTypes;
import hills.diagram.providers.HillsModelingAssistantProvider;

/**
 * @generated
 */
public class HillsModelingAssistantProviderOfHSpecificationEditPart extends HillsModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(HillsElementTypes.HSystem_2001);
		types.add(HillsElementTypes.HClass_2002);
		types.add(HillsElementTypes.GenericNode_2003);
		types.add(HillsElementTypes.HRequirementSpecification_2004);
		return types;
	}

}
