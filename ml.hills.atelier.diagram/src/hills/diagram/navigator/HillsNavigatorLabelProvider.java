/*
* 
*/
package hills.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import hills.HSpecification;
import hills.diagram.edit.parts.Activity2EditPart;
import hills.diagram.edit.parts.Activity3EditPart;
import hills.diagram.edit.parts.ActivityAcname12EditPart;
import hills.diagram.edit.parts.ActivityAcname13EditPart;
import hills.diagram.edit.parts.ActivityAcname1EditPart;
import hills.diagram.edit.parts.ActivityEditPart;
import hills.diagram.edit.parts.AggregationEditPart;
import hills.diagram.edit.parts.AggregationLlabelEditPart;
import hills.diagram.edit.parts.BExistenceBenameEditPart;
import hills.diagram.edit.parts.BExistenceEditPart;
import hills.diagram.edit.parts.CAbsenceCanameEditPart;
import hills.diagram.edit.parts.CAbsenceEditPart;
import hills.diagram.edit.parts.CompositionEditPart;
import hills.diagram.edit.parts.CompositionLlabelEditPart;
import hills.diagram.edit.parts.ConfluentTransitionCtnameEditPart;
import hills.diagram.edit.parts.ConfluentTransitionEditPart;
import hills.diagram.edit.parts.Declaration2EditPart;
import hills.diagram.edit.parts.DeclarationEditPart;
import hills.diagram.edit.parts.DeclarationEname2EditPart;
import hills.diagram.edit.parts.DeclarationEnameEditPart;
import hills.diagram.edit.parts.EExistenceEditPart;
import hills.diagram.edit.parts.EExistenceEenameEditPart;
import hills.diagram.edit.parts.ExternalTransitionEditPart;
import hills.diagram.edit.parts.ExternalTransitionEtnameEditPart;
import hills.diagram.edit.parts.FiniteConfigurationEditPart;
import hills.diagram.edit.parts.FiniteConfigurationLibelleEditPart;
import hills.diagram.edit.parts.Function2EditPart;
import hills.diagram.edit.parts.FunctionEditPart;
import hills.diagram.edit.parts.FunctionFname2EditPart;
import hills.diagram.edit.parts.FunctionFnameEditPart;
import hills.diagram.edit.parts.GenericNodeEditPart;
import hills.diagram.edit.parts.GenericNodeNtimeEditPart;
import hills.diagram.edit.parts.HClassEditPart;
import hills.diagram.edit.parts.HClassNtimeEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationNtimeEditPart;
import hills.diagram.edit.parts.HSpecificationEditPart;
import hills.diagram.edit.parts.HSystemEditPart;
import hills.diagram.edit.parts.HSystemNtimeEditPart;
import hills.diagram.edit.parts.InitialConfigurationEditPart;
import hills.diagram.edit.parts.InitialConfigurationLibelleEditPart;
import hills.diagram.edit.parts.InternalTransitionEditPart;
import hills.diagram.edit.parts.InternalTransitionItnameEditPart;
import hills.diagram.edit.parts.PassiveConfigurationEditPart;
import hills.diagram.edit.parts.PassiveConfigurationLibelleEditPart;
import hills.diagram.edit.parts.PortDeclaration2EditPart;
import hills.diagram.edit.parts.PortDeclaration3EditPart;
import hills.diagram.edit.parts.PortDeclaration4EditPart;
import hills.diagram.edit.parts.PortDeclarationEditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration2EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration3EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration4EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclarationEditPart;
import hills.diagram.edit.parts.PortEditPart;
import hills.diagram.edit.parts.PortPnameEditPart;
import hills.diagram.edit.parts.Property2EditPart;
import hills.diagram.edit.parts.Property3EditPart;
import hills.diagram.edit.parts.PropertyEditPart;
import hills.diagram.edit.parts.PropertyPrname12EditPart;
import hills.diagram.edit.parts.PropertyPrname13EditPart;
import hills.diagram.edit.parts.PropertyPrname1EditPart;
import hills.diagram.edit.parts.ReferenceEditPart;
import hills.diagram.edit.parts.ReferenceLlabelEditPart;
import hills.diagram.edit.parts.SojournTimeEditPart;
import hills.diagram.edit.parts.SojournTimeStimeEditPart;
import hills.diagram.edit.parts.TestNodeEditPart;
import hills.diagram.edit.parts.TestNodeTtimeEditPart;
import hills.diagram.edit.parts.TransientConfigurationEditPart;
import hills.diagram.edit.parts.TransientConfigurationLibelleEditPart;
import hills.diagram.edit.parts.UExistenceEditPart;
import hills.diagram.edit.parts.UExistenceUenameEditPart;
import hills.diagram.part.HillsDiagramEditorPlugin;
import hills.diagram.part.HillsVisualIDRegistry;
import hills.diagram.providers.HillsElementTypes;
import hills.diagram.providers.HillsParserProvider;

/**
 * @generated
 */
public class HillsNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		HillsDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		HillsDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof HillsNavigatorItem && !isOwnView(((HillsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof HillsNavigatorGroup) {
			HillsNavigatorGroup group = (HillsNavigatorGroup) element;
			return HillsDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof HillsNavigatorItem) {
			HillsNavigatorItem navigatorItem = (HillsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (HillsVisualIDRegistry.getVisualID(view)) {
		case HSpecificationEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.webfst.fst-usttb-edu.ml/hills?HSpecification", //$NON-NLS-1$
					HillsElementTypes.HSpecification_1000);
		case HSystemEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.webfst.fst-usttb-edu.ml/hills?HSystem", //$NON-NLS-1$
					HillsElementTypes.HSystem_2001);
		case HClassEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.webfst.fst-usttb-edu.ml/hills?HClass", //$NON-NLS-1$
					HillsElementTypes.HClass_2002);
		case GenericNodeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.webfst.fst-usttb-edu.ml/hills?GenericNode", //$NON-NLS-1$
					HillsElementTypes.GenericNode_2003);
		case HRequirementSpecificationEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.webfst.fst-usttb-edu.ml/hills?HRequirementSpecification", //$NON-NLS-1$
					HillsElementTypes.HRequirementSpecification_2004);
		case FiniteConfigurationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?FiniteConfiguration", //$NON-NLS-1$
					HillsElementTypes.FiniteConfiguration_3001);
		case PropertyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Property", //$NON-NLS-1$
					HillsElementTypes.Property_3002);
		case ActivityEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Activity", //$NON-NLS-1$
					HillsElementTypes.Activity_3003);
		case SojournTimeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?SojournTime", //$NON-NLS-1$
					HillsElementTypes.SojournTime_3004);
		case InitialConfigurationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?InitialConfiguration", //$NON-NLS-1$
					HillsElementTypes.InitialConfiguration_3005);
		case PassiveConfigurationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?PassiveConfiguration", //$NON-NLS-1$
					HillsElementTypes.PassiveConfiguration_3006);
		case Property2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Property", //$NON-NLS-1$
					HillsElementTypes.Property_3007);
		case Activity2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Activity", //$NON-NLS-1$
					HillsElementTypes.Activity_3008);
		case TransientConfigurationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?TransientConfiguration", //$NON-NLS-1$
					HillsElementTypes.TransientConfiguration_3009);
		case Property3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Property", //$NON-NLS-1$
					HillsElementTypes.Property_3010);
		case Activity3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Activity", //$NON-NLS-1$
					HillsElementTypes.Activity_3011);
		case TestNodeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?TestNode", //$NON-NLS-1$
					HillsElementTypes.TestNode_3012);
		case PortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Port", //$NON-NLS-1$
					HillsElementTypes.Port_3013);
		case DeclarationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Declaration", //$NON-NLS-1$
					HillsElementTypes.Declaration_3014);
		case FunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Function", //$NON-NLS-1$
					HillsElementTypes.Function_3015);
		case Declaration2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Declaration", //$NON-NLS-1$
					HillsElementTypes.Declaration_3016);
		case Function2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?Function", //$NON-NLS-1$
					HillsElementTypes.Function_3017);
		case BExistenceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?BExistence", //$NON-NLS-1$
					HillsElementTypes.BExistence_3018);
		case UExistenceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?UExistence", //$NON-NLS-1$
					HillsElementTypes.UExistence_3019);
		case EExistenceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?EExistence", //$NON-NLS-1$
					HillsElementTypes.EExistence_3020);
		case CAbsenceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?CAbsence", //$NON-NLS-1$
					HillsElementTypes.CAbsence_3021);
		case PortDeclarationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?PortDeclaration", //$NON-NLS-1$
					HillsElementTypes.PortDeclaration_3022);
		case PortDeclaration2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?PortDeclaration", //$NON-NLS-1$
					HillsElementTypes.PortDeclaration_3023);
		case PortDeclaration3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?PortDeclaration", //$NON-NLS-1$
					HillsElementTypes.PortDeclaration_3024);
		case PortDeclaration4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.webfst.fst-usttb-edu.ml/hills?PortDeclaration", //$NON-NLS-1$
					HillsElementTypes.PortDeclaration_3025);
		case CompositionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.webfst.fst-usttb-edu.ml/hills?Composition", //$NON-NLS-1$
					HillsElementTypes.Composition_4001);
		case AggregationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.webfst.fst-usttb-edu.ml/hills?Aggregation", //$NON-NLS-1$
					HillsElementTypes.Aggregation_4002);
		case ReferenceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.webfst.fst-usttb-edu.ml/hills?Reference", //$NON-NLS-1$
					HillsElementTypes.Reference_4003);
		case ConfluentTransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.webfst.fst-usttb-edu.ml/hills?ConfluentTransition", //$NON-NLS-1$
					HillsElementTypes.ConfluentTransition_4004);
		case InternalTransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.webfst.fst-usttb-edu.ml/hills?InternalTransition", //$NON-NLS-1$
					HillsElementTypes.InternalTransition_4005);
		case ExternalTransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.webfst.fst-usttb-edu.ml/hills?ExternalTransition", //$NON-NLS-1$
					HillsElementTypes.ExternalTransition_4006);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = HillsDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && HillsElementTypes.isKnownElementType(elementType)) {
			image = HillsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof HillsNavigatorGroup) {
			HillsNavigatorGroup group = (HillsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof HillsNavigatorItem) {
			HillsNavigatorItem navigatorItem = (HillsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (HillsVisualIDRegistry.getVisualID(view)) {
		case HSpecificationEditPart.VISUAL_ID:
			return getHSpecification_1000Text(view);
		case HSystemEditPart.VISUAL_ID:
			return getHSystem_2001Text(view);
		case HClassEditPart.VISUAL_ID:
			return getHClass_2002Text(view);
		case GenericNodeEditPart.VISUAL_ID:
			return getGenericNode_2003Text(view);
		case HRequirementSpecificationEditPart.VISUAL_ID:
			return getHRequirementSpecification_2004Text(view);
		case FiniteConfigurationEditPart.VISUAL_ID:
			return getFiniteConfiguration_3001Text(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3002Text(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_3003Text(view);
		case SojournTimeEditPart.VISUAL_ID:
			return getSojournTime_3004Text(view);
		case InitialConfigurationEditPart.VISUAL_ID:
			return getInitialConfiguration_3005Text(view);
		case PassiveConfigurationEditPart.VISUAL_ID:
			return getPassiveConfiguration_3006Text(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3007Text(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3008Text(view);
		case TransientConfigurationEditPart.VISUAL_ID:
			return getTransientConfiguration_3009Text(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3010Text(view);
		case Activity3EditPart.VISUAL_ID:
			return getActivity_3011Text(view);
		case TestNodeEditPart.VISUAL_ID:
			return getTestNode_3012Text(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3013Text(view);
		case DeclarationEditPart.VISUAL_ID:
			return getDeclaration_3014Text(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3015Text(view);
		case Declaration2EditPart.VISUAL_ID:
			return getDeclaration_3016Text(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3017Text(view);
		case BExistenceEditPart.VISUAL_ID:
			return getBExistence_3018Text(view);
		case UExistenceEditPart.VISUAL_ID:
			return getUExistence_3019Text(view);
		case EExistenceEditPart.VISUAL_ID:
			return getEExistence_3020Text(view);
		case CAbsenceEditPart.VISUAL_ID:
			return getCAbsence_3021Text(view);
		case PortDeclarationEditPart.VISUAL_ID:
			return getPortDeclaration_3022Text(view);
		case PortDeclaration2EditPart.VISUAL_ID:
			return getPortDeclaration_3023Text(view);
		case PortDeclaration3EditPart.VISUAL_ID:
			return getPortDeclaration_3024Text(view);
		case PortDeclaration4EditPart.VISUAL_ID:
			return getPortDeclaration_3025Text(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001Text(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4002Text(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4003Text(view);
		case ConfluentTransitionEditPart.VISUAL_ID:
			return getConfluentTransition_4004Text(view);
		case InternalTransitionEditPart.VISUAL_ID:
			return getInternalTransition_4005Text(view);
		case ExternalTransitionEditPart.VISUAL_ID:
			return getExternalTransition_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getHSpecification_1000Text(View view) {
		HSpecification domainModelElement = (HSpecification) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNomModele();
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHSystem_2001Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.HSystem_2001,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(HSystemNtimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHClass_2002Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.HClass_2002,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(HClassNtimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGenericNode_2003Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.GenericNode_2003,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(GenericNodeNtimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHRequirementSpecification_2004Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.HRequirementSpecification_2004,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(HRequirementSpecificationNtimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFiniteConfiguration_3001Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.FiniteConfiguration_3001,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(FiniteConfigurationLibelleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProperty_3002Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Property_3002,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PropertyPrname1EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivity_3003Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Activity_3003,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(ActivityAcname1EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSojournTime_3004Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.SojournTime_3004,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(SojournTimeStimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInitialConfiguration_3005Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.InitialConfiguration_3005,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(InitialConfigurationLibelleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPassiveConfiguration_3006Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.PassiveConfiguration_3006,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PassiveConfigurationLibelleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProperty_3007Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Property_3007,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PropertyPrname12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivity_3008Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Activity_3008,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(ActivityAcname12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransientConfiguration_3009Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.TransientConfiguration_3009,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(TransientConfigurationLibelleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProperty_3010Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Property_3010,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PropertyPrname13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActivity_3011Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Activity_3011,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(ActivityAcname13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTestNode_3012Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.TestNode_3012,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(TestNodeTtimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPort_3013Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Port_3013,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PortPnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeclaration_3014Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Declaration_3014,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(DeclarationEnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3015Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Function_3015,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(FunctionFnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeclaration_3016Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Declaration_3016,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(DeclarationEname2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFunction_3017Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Function_3017,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(FunctionFname2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBExistence_3018Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.BExistence_3018,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(BExistenceBenameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUExistence_3019Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.UExistence_3019,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(UExistenceUenameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEExistence_3020Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.EExistence_3020,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(EExistenceEenameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCAbsence_3021Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.CAbsence_3021,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(CAbsenceCanameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPortDeclaration_3022Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.PortDeclaration_3022,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PortDeclarationPdeclarationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPortDeclaration_3023Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.PortDeclaration_3023,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PortDeclarationPdeclaration2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPortDeclaration_3024Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.PortDeclaration_3024,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PortDeclarationPdeclaration3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPortDeclaration_3025Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.PortDeclaration_3025,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(PortDeclarationPdeclaration4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComposition_4001Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Composition_4001,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(CompositionLlabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAggregation_4002Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Aggregation_4002,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(AggregationLlabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReference_4003Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.Reference_4003,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(ReferenceLlabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConfluentTransition_4004Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.ConfluentTransition_4004,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(ConfluentTransitionCtnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInternalTransition_4005Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.InternalTransition_4005,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(InternalTransitionItnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getExternalTransition_4006Text(View view) {
		IParser parser = HillsParserProvider.getParser(HillsElementTypes.ExternalTransition_4006,
				view.getElement() != null ? view.getElement() : view,
				HillsVisualIDRegistry.getType(ExternalTransitionEtnameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HillsDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return HSpecificationEditPart.MODEL_ID.equals(HillsVisualIDRegistry.getModelID(view));
	}

}
