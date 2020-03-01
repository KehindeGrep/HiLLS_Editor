/*
* 
*/
package hills.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import hills.HSpecification;
import hills.HillsPackage;
import hills.diagram.edit.parts.Activity2EditPart;
import hills.diagram.edit.parts.Activity3EditPart;
import hills.diagram.edit.parts.ActivityAcname12EditPart;
import hills.diagram.edit.parts.ActivityAcname13EditPart;
import hills.diagram.edit.parts.ActivityAcname1EditPart;
import hills.diagram.edit.parts.ActivityActivityPpredicatsCompartment2EditPart;
import hills.diagram.edit.parts.ActivityActivityPpredicatsCompartment3EditPart;
import hills.diagram.edit.parts.ActivityActivityPpredicatsCompartmentEditPart;
import hills.diagram.edit.parts.ActivityEditPart;
import hills.diagram.edit.parts.AggregationEditPart;
import hills.diagram.edit.parts.AggregationLlabelEditPart;
import hills.diagram.edit.parts.BExistenceBExistencePredicatsCompartmentEditPart;
import hills.diagram.edit.parts.BExistenceBenameEditPart;
import hills.diagram.edit.parts.BExistenceEditPart;
import hills.diagram.edit.parts.CAbsenceCAbsencePredicatsCompartmentEditPart;
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
import hills.diagram.edit.parts.EExistenceEExistencePredicatsCompartmentEditPart;
import hills.diagram.edit.parts.EExistenceEditPart;
import hills.diagram.edit.parts.EExistenceEenameEditPart;
import hills.diagram.edit.parts.ExternalTransitionEditPart;
import hills.diagram.edit.parts.ExternalTransitionEtnameEditPart;
import hills.diagram.edit.parts.FiniteConfigurationEditPart;
import hills.diagram.edit.parts.FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart;
import hills.diagram.edit.parts.FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart;
import hills.diagram.edit.parts.FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart;
import hills.diagram.edit.parts.FiniteConfigurationLibelleEditPart;
import hills.diagram.edit.parts.Function2EditPart;
import hills.diagram.edit.parts.FunctionEditPart;
import hills.diagram.edit.parts.FunctionFname2EditPart;
import hills.diagram.edit.parts.FunctionFnameEditPart;
import hills.diagram.edit.parts.FunctionFunctionPpredicatsCompartment2EditPart;
import hills.diagram.edit.parts.FunctionFunctionPpredicatsCompartmentEditPart;
import hills.diagram.edit.parts.GenericNodeEditPart;
import hills.diagram.edit.parts.GenericNodeNtimeEditPart;
import hills.diagram.edit.parts.HClassEditPart;
import hills.diagram.edit.parts.HClassHClassDeclaratiosCompartmentEditPart;
import hills.diagram.edit.parts.HClassHClassFonctionsCompartmentEditPart;
import hills.diagram.edit.parts.HClassNtimeEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationNtimeEditPart;
import hills.diagram.edit.parts.HSpecificationEditPart;
import hills.diagram.edit.parts.HSystemEditPart;
import hills.diagram.edit.parts.HSystemHSystemConfigurationsCompartmentEditPart;
import hills.diagram.edit.parts.HSystemHSystemDeclaratiosCompartmentEditPart;
import hills.diagram.edit.parts.HSystemHSystemFonctionsCompartmentEditPart;
import hills.diagram.edit.parts.HSystemNtimeEditPart;
import hills.diagram.edit.parts.InitialConfigurationEditPart;
import hills.diagram.edit.parts.InitialConfigurationLibelleEditPart;
import hills.diagram.edit.parts.InternalTransitionEditPart;
import hills.diagram.edit.parts.InternalTransitionItnameEditPart;
import hills.diagram.edit.parts.PassiveConfigurationEditPart;
import hills.diagram.edit.parts.PassiveConfigurationLibelleEditPart;
import hills.diagram.edit.parts.PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart;
import hills.diagram.edit.parts.PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart;
import hills.diagram.edit.parts.PortDeclaration2EditPart;
import hills.diagram.edit.parts.PortDeclaration3EditPart;
import hills.diagram.edit.parts.PortDeclaration4EditPart;
import hills.diagram.edit.parts.PortDeclarationEditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration2EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration3EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration4EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclarationEditPart;
import hills.diagram.edit.parts.PortEditPart;
import hills.diagram.edit.parts.PortOthernameEditPart;
import hills.diagram.edit.parts.PortPnameEditPart;
import hills.diagram.edit.parts.PortPortEntreePortsCompartmentEditPart;
import hills.diagram.edit.parts.Property2EditPart;
import hills.diagram.edit.parts.Property3EditPart;
import hills.diagram.edit.parts.PropertyEditPart;
import hills.diagram.edit.parts.PropertyPrname12EditPart;
import hills.diagram.edit.parts.PropertyPrname13EditPart;
import hills.diagram.edit.parts.PropertyPrname1EditPart;
import hills.diagram.edit.parts.PropertyPropertyPpredicatsCompartment2EditPart;
import hills.diagram.edit.parts.PropertyPropertyPpredicatsCompartment3EditPart;
import hills.diagram.edit.parts.PropertyPropertyPpredicatsCompartmentEditPart;
import hills.diagram.edit.parts.ReferenceEditPart;
import hills.diagram.edit.parts.ReferenceLlabelEditPart;
import hills.diagram.edit.parts.SojournTimeEditPart;
import hills.diagram.edit.parts.SojournTimeStimeEditPart;
import hills.diagram.edit.parts.TestNodeEditPart;
import hills.diagram.edit.parts.TestNodeTtimeEditPart;
import hills.diagram.edit.parts.TransientConfigurationEditPart;
import hills.diagram.edit.parts.TransientConfigurationLibelleEditPart;
import hills.diagram.edit.parts.TransientConfigurationTransientConfigurationActivitesCompartmentEditPart;
import hills.diagram.edit.parts.TransientConfigurationTransientConfigurationProprietesCompartmentEditPart;
import hills.diagram.edit.parts.UExistenceEditPart;
import hills.diagram.edit.parts.UExistenceUExistencePredicatsCompartmentEditPart;
import hills.diagram.edit.parts.UExistenceUenameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class HillsVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "ml.hills.atelier.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (HSpecificationEditPart.MODEL_ID.equals(view.getType())) {
				return HSpecificationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return hills.diagram.part.HillsVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				HillsDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (HillsPackage.eINSTANCE.getHSpecification().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((HSpecification) domainElement)) {
			return HSpecificationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = hills.diagram.part.HillsVisualIDRegistry.getModelID(containerView);
		if (!HSpecificationEditPart.MODEL_ID.equals(containerModelID) && !"hills".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (HSpecificationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hills.diagram.part.HillsVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HSpecificationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case HSpecificationEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getHSystem().isSuperTypeOf(domainElement.eClass())) {
				return HSystemEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getHClass().isSuperTypeOf(domainElement.eClass())) {
				return HClassEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getGenericNode().isSuperTypeOf(domainElement.eClass())) {
				return GenericNodeEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getHRequirementSpecification().isSuperTypeOf(domainElement.eClass())) {
				return HRequirementSpecificationEditPart.VISUAL_ID;
			}
			break;
		case HSystemEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			break;
		case HClassEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			break;
		case HSystemHSystemDeclaratiosCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return DeclarationEditPart.VISUAL_ID;
			}
			break;
		case HSystemHSystemFonctionsCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return FunctionEditPart.VISUAL_ID;
			}
			break;
		case HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getFiniteConfiguration().isSuperTypeOf(domainElement.eClass())) {
				return FiniteConfigurationEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getInitialConfiguration().isSuperTypeOf(domainElement.eClass())) {
				return InitialConfigurationEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getPassiveConfiguration().isSuperTypeOf(domainElement.eClass())) {
				return PassiveConfigurationEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getTransientConfiguration().isSuperTypeOf(domainElement.eClass())) {
				return TransientConfigurationEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getTestNode().isSuperTypeOf(domainElement.eClass())) {
				return TestNodeEditPart.VISUAL_ID;
			}
			break;
		case FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			break;
		case FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getSojournTime().isSuperTypeOf(domainElement.eClass())) {
				return SojournTimeEditPart.VISUAL_ID;
			}
			break;
		case PropertyPropertyPpredicatsCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclarationEditPart.VISUAL_ID;
			}
			break;
		case ActivityActivityPpredicatsCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclaration2EditPart.VISUAL_ID;
			}
			break;
		case PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property2EditPart.VISUAL_ID;
			}
			break;
		case PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return Activity2EditPart.VISUAL_ID;
			}
			break;
		case PropertyPropertyPpredicatsCompartment2EditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclarationEditPart.VISUAL_ID;
			}
			break;
		case ActivityActivityPpredicatsCompartment2EditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclaration2EditPart.VISUAL_ID;
			}
			break;
		case TransientConfigurationTransientConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property3EditPart.VISUAL_ID;
			}
			break;
		case TransientConfigurationTransientConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return Activity3EditPart.VISUAL_ID;
			}
			break;
		case PropertyPropertyPpredicatsCompartment3EditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclarationEditPart.VISUAL_ID;
			}
			break;
		case ActivityActivityPpredicatsCompartment3EditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclaration2EditPart.VISUAL_ID;
			}
			break;
		case PortPortEntreePortsCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclaration3EditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionPpredicatsCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclaration4EditPart.VISUAL_ID;
			}
			break;
		case HClassHClassDeclaratiosCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return Declaration2EditPart.VISUAL_ID;
			}
			break;
		case HClassHClassFonctionsCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getFunction().isSuperTypeOf(domainElement.eClass())) {
				return Function2EditPart.VISUAL_ID;
			}
			break;
		case FunctionFunctionPpredicatsCompartment2EditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getPortDeclaration().isSuperTypeOf(domainElement.eClass())) {
				return PortDeclaration4EditPart.VISUAL_ID;
			}
			break;
		case HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID:
			if (HillsPackage.eINSTANCE.getBExistence().isSuperTypeOf(domainElement.eClass())) {
				return BExistenceEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getUExistence().isSuperTypeOf(domainElement.eClass())) {
				return UExistenceEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getEExistence().isSuperTypeOf(domainElement.eClass())) {
				return EExistenceEditPart.VISUAL_ID;
			}
			if (HillsPackage.eINSTANCE.getCAbsence().isSuperTypeOf(domainElement.eClass())) {
				return CAbsenceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = hills.diagram.part.HillsVisualIDRegistry.getModelID(containerView);
		if (!HSpecificationEditPart.MODEL_ID.equals(containerModelID) && !"hills".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (HSpecificationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hills.diagram.part.HillsVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HSpecificationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case HSpecificationEditPart.VISUAL_ID:
			if (HSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GenericNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HRequirementSpecificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HSystemEditPart.VISUAL_ID:
			if (HSystemNtimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HSystemHSystemDeclaratiosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HSystemHSystemFonctionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HClassEditPart.VISUAL_ID:
			if (HClassNtimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HClassHClassDeclaratiosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HClassHClassFonctionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GenericNodeEditPart.VISUAL_ID:
			if (GenericNodeNtimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HRequirementSpecificationEditPart.VISUAL_ID:
			if (HRequirementSpecificationNtimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FiniteConfigurationEditPart.VISUAL_ID:
			if (FiniteConfigurationLibelleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyEditPart.VISUAL_ID:
			if (PropertyPrname1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyPropertyPpredicatsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortDeclarationEditPart.VISUAL_ID:
			if (PortDeclarationPdeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityEditPart.VISUAL_ID:
			if (ActivityAcname1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityActivityPpredicatsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortDeclaration2EditPart.VISUAL_ID:
			if (PortDeclarationPdeclaration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SojournTimeEditPart.VISUAL_ID:
			if (SojournTimeStimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InitialConfigurationEditPart.VISUAL_ID:
			if (InitialConfigurationLibelleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PassiveConfigurationEditPart.VISUAL_ID:
			if (PassiveConfigurationLibelleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property2EditPart.VISUAL_ID:
			if (PropertyPrname12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyPropertyPpredicatsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Activity2EditPart.VISUAL_ID:
			if (ActivityAcname12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityActivityPpredicatsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransientConfigurationEditPart.VISUAL_ID:
			if (TransientConfigurationLibelleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransientConfigurationTransientConfigurationProprietesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransientConfigurationTransientConfigurationActivitesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property3EditPart.VISUAL_ID:
			if (PropertyPrname13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyPropertyPpredicatsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Activity3EditPart.VISUAL_ID:
			if (ActivityAcname13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityActivityPpredicatsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TestNodeEditPart.VISUAL_ID:
			if (TestNodeTtimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortEditPart.VISUAL_ID:
			if (PortPnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortPortEntreePortsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortDeclaration3EditPart.VISUAL_ID:
			if (PortDeclarationPdeclaration3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeclarationEditPart.VISUAL_ID:
			if (DeclarationEnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionEditPart.VISUAL_ID:
			if (FunctionFnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionPpredicatsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortDeclaration4EditPart.VISUAL_ID:
			if (PortDeclarationPdeclaration4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Declaration2EditPart.VISUAL_ID:
			if (DeclarationEname2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Function2EditPart.VISUAL_ID:
			if (FunctionFname2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FunctionFunctionPpredicatsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BExistenceEditPart.VISUAL_ID:
			if (BExistenceBenameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BExistenceBExistencePredicatsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UExistenceEditPart.VISUAL_ID:
			if (UExistenceUenameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UExistenceUExistencePredicatsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EExistenceEditPart.VISUAL_ID:
			if (EExistenceEenameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EExistenceEExistencePredicatsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CAbsenceEditPart.VISUAL_ID:
			if (CAbsenceCanameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CAbsenceCAbsencePredicatsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HSystemHSystemDeclaratiosCompartmentEditPart.VISUAL_ID:
			if (DeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HSystemHSystemFonctionsCompartmentEditPart.VISUAL_ID:
			if (FunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID:
			if (FiniteConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PassiveConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransientConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TestNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart.VISUAL_ID:
			if (SojournTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyPropertyPpredicatsCompartmentEditPart.VISUAL_ID:
			if (PortDeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityActivityPpredicatsCompartmentEditPart.VISUAL_ID:
			if (PortDeclaration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			if (Property2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			if (Activity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyPropertyPpredicatsCompartment2EditPart.VISUAL_ID:
			if (PortDeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityActivityPpredicatsCompartment2EditPart.VISUAL_ID:
			if (PortDeclaration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransientConfigurationTransientConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			if (Property3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransientConfigurationTransientConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			if (Activity3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyPropertyPpredicatsCompartment3EditPart.VISUAL_ID:
			if (PortDeclarationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityActivityPpredicatsCompartment3EditPart.VISUAL_ID:
			if (PortDeclaration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortPortEntreePortsCompartmentEditPart.VISUAL_ID:
			if (PortDeclaration3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionPpredicatsCompartmentEditPart.VISUAL_ID:
			if (PortDeclaration4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HClassHClassDeclaratiosCompartmentEditPart.VISUAL_ID:
			if (Declaration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HClassHClassFonctionsCompartmentEditPart.VISUAL_ID:
			if (Function2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FunctionFunctionPpredicatsCompartment2EditPart.VISUAL_ID:
			if (PortDeclaration4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID:
			if (BExistenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UExistenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EExistenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CAbsenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CompositionEditPart.VISUAL_ID:
			if (CompositionLlabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AggregationEditPart.VISUAL_ID:
			if (AggregationLlabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReferenceEditPart.VISUAL_ID:
			if (ReferenceLlabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfluentTransitionEditPart.VISUAL_ID:
			if (ConfluentTransitionCtnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InternalTransitionEditPart.VISUAL_ID:
			if (InternalTransitionItnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExternalTransitionEditPart.VISUAL_ID:
			if (ExternalTransitionEtnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (HillsPackage.eINSTANCE.getComposition().isSuperTypeOf(domainElement.eClass())) {
			return CompositionEditPart.VISUAL_ID;
		}
		if (HillsPackage.eINSTANCE.getAggregation().isSuperTypeOf(domainElement.eClass())) {
			return AggregationEditPart.VISUAL_ID;
		}
		if (HillsPackage.eINSTANCE.getReference().isSuperTypeOf(domainElement.eClass())) {
			return ReferenceEditPart.VISUAL_ID;
		}
		if (HillsPackage.eINSTANCE.getConfluentTransition().isSuperTypeOf(domainElement.eClass())) {
			return ConfluentTransitionEditPart.VISUAL_ID;
		}
		if (HillsPackage.eINSTANCE.getInternalTransition().isSuperTypeOf(domainElement.eClass())) {
			return InternalTransitionEditPart.VISUAL_ID;
		}
		if (HillsPackage.eINSTANCE.getExternalTransition().isSuperTypeOf(domainElement.eClass())) {
			return ExternalTransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(HSpecification element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case HSystemHSystemDeclaratiosCompartmentEditPart.VISUAL_ID:
		case HSystemHSystemFonctionsCompartmentEditPart.VISUAL_ID:
		case HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID:
		case FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart.VISUAL_ID:
		case FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart.VISUAL_ID:
		case FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart.VISUAL_ID:
		case PropertyPropertyPpredicatsCompartmentEditPart.VISUAL_ID:
		case ActivityActivityPpredicatsCompartmentEditPart.VISUAL_ID:
		case PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart.VISUAL_ID:
		case PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart.VISUAL_ID:
		case PropertyPropertyPpredicatsCompartment2EditPart.VISUAL_ID:
		case ActivityActivityPpredicatsCompartment2EditPart.VISUAL_ID:
		case TransientConfigurationTransientConfigurationProprietesCompartmentEditPart.VISUAL_ID:
		case TransientConfigurationTransientConfigurationActivitesCompartmentEditPart.VISUAL_ID:
		case PropertyPropertyPpredicatsCompartment3EditPart.VISUAL_ID:
		case ActivityActivityPpredicatsCompartment3EditPart.VISUAL_ID:
		case PortPortEntreePortsCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionPpredicatsCompartmentEditPart.VISUAL_ID:
		case HClassHClassDeclaratiosCompartmentEditPart.VISUAL_ID:
		case HClassHClassFonctionsCompartmentEditPart.VISUAL_ID:
		case FunctionFunctionPpredicatsCompartment2EditPart.VISUAL_ID:
		case HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID:
		case BExistenceBExistencePredicatsCompartmentEditPart.VISUAL_ID:
		case UExistenceUExistencePredicatsCompartmentEditPart.VISUAL_ID:
		case EExistenceEExistencePredicatsCompartmentEditPart.VISUAL_ID:
		case CAbsenceCAbsencePredicatsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case HSpecificationEditPart.VISUAL_ID:
			return false;
		case GenericNodeEditPart.VISUAL_ID:
		case SojournTimeEditPart.VISUAL_ID:
		case InitialConfigurationEditPart.VISUAL_ID:
		case TestNodeEditPart.VISUAL_ID:
		case DeclarationEditPart.VISUAL_ID:
		case Declaration2EditPart.VISUAL_ID:
		case BExistenceEditPart.VISUAL_ID:
		case UExistenceEditPart.VISUAL_ID:
		case EExistenceEditPart.VISUAL_ID:
		case CAbsenceEditPart.VISUAL_ID:
		case PortDeclarationEditPart.VISUAL_ID:
		case PortDeclaration2EditPart.VISUAL_ID:
		case PortDeclaration3EditPart.VISUAL_ID:
		case PortDeclaration4EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return hills.diagram.part.HillsVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return hills.diagram.part.HillsVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return hills.diagram.part.HillsVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return hills.diagram.part.HillsVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return hills.diagram.part.HillsVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return hills.diagram.part.HillsVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
