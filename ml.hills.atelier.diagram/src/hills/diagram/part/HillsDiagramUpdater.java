/*
* 
*/
package hills.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import hills.Activity;
import hills.Aggregation;
import hills.Composition;
import hills.ConfNomme;
import hills.Configuration;
import hills.ConfluentTransition;
import hills.Declaration;
import hills.ExternalTransition;
import hills.FiniteConfiguration;
import hills.Function;
import hills.GenericNode;
import hills.HClass;
import hills.HClassifier;
import hills.HRequirementSpecification;
import hills.HSpecification;
import hills.HSystem;
import hills.HillsPackage;
import hills.InitialConfiguration;
import hills.InternalTransition;
import hills.Nomme;
import hills.PassiveConfiguration;
import hills.Port;
import hills.PortDeclaration;
import hills.Property;
import hills.Reference;
import hills.SojournTime;
import hills.TLProperty;
import hills.TestNode;
import hills.TransientConfiguration;
import hills.diagram.edit.parts.Activity2EditPart;
import hills.diagram.edit.parts.Activity3EditPart;
import hills.diagram.edit.parts.ActivityActivityPpredicatsCompartment2EditPart;
import hills.diagram.edit.parts.ActivityActivityPpredicatsCompartment3EditPart;
import hills.diagram.edit.parts.ActivityActivityPpredicatsCompartmentEditPart;
import hills.diagram.edit.parts.ActivityEditPart;
import hills.diagram.edit.parts.AggregationEditPart;
import hills.diagram.edit.parts.BExistenceEditPart;
import hills.diagram.edit.parts.CAbsenceEditPart;
import hills.diagram.edit.parts.CompositionEditPart;
import hills.diagram.edit.parts.ConfluentTransitionEditPart;
import hills.diagram.edit.parts.Declaration2EditPart;
import hills.diagram.edit.parts.DeclarationEditPart;
import hills.diagram.edit.parts.EExistenceEditPart;
import hills.diagram.edit.parts.ExternalTransitionEditPart;
import hills.diagram.edit.parts.FiniteConfigurationEditPart;
import hills.diagram.edit.parts.FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart;
import hills.diagram.edit.parts.FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart;
import hills.diagram.edit.parts.FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart;
import hills.diagram.edit.parts.Function2EditPart;
import hills.diagram.edit.parts.FunctionEditPart;
import hills.diagram.edit.parts.FunctionFunctionPpredicatsCompartment2EditPart;
import hills.diagram.edit.parts.FunctionFunctionPpredicatsCompartmentEditPart;
import hills.diagram.edit.parts.GenericNodeEditPart;
import hills.diagram.edit.parts.HClassEditPart;
import hills.diagram.edit.parts.HClassHClassDeclaratiosCompartmentEditPart;
import hills.diagram.edit.parts.HClassHClassFonctionsCompartmentEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart;
import hills.diagram.edit.parts.HSpecificationEditPart;
import hills.diagram.edit.parts.HSystemEditPart;
import hills.diagram.edit.parts.HSystemHSystemConfigurationsCompartmentEditPart;
import hills.diagram.edit.parts.HSystemHSystemDeclaratiosCompartmentEditPart;
import hills.diagram.edit.parts.HSystemHSystemFonctionsCompartmentEditPart;
import hills.diagram.edit.parts.InitialConfigurationEditPart;
import hills.diagram.edit.parts.InternalTransitionEditPart;
import hills.diagram.edit.parts.PassiveConfigurationEditPart;
import hills.diagram.edit.parts.PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart;
import hills.diagram.edit.parts.PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart;
import hills.diagram.edit.parts.PortDeclaration2EditPart;
import hills.diagram.edit.parts.PortDeclaration3EditPart;
import hills.diagram.edit.parts.PortDeclaration4EditPart;
import hills.diagram.edit.parts.PortDeclarationEditPart;
import hills.diagram.edit.parts.PortEditPart;
import hills.diagram.edit.parts.PortPortEntreePortsCompartmentEditPart;
import hills.diagram.edit.parts.Property2EditPart;
import hills.diagram.edit.parts.Property3EditPart;
import hills.diagram.edit.parts.PropertyEditPart;
import hills.diagram.edit.parts.PropertyPropertyPpredicatsCompartment2EditPart;
import hills.diagram.edit.parts.PropertyPropertyPpredicatsCompartment3EditPart;
import hills.diagram.edit.parts.PropertyPropertyPpredicatsCompartmentEditPart;
import hills.diagram.edit.parts.ReferenceEditPart;
import hills.diagram.edit.parts.SojournTimeEditPart;
import hills.diagram.edit.parts.TestNodeEditPart;
import hills.diagram.edit.parts.TransientConfigurationEditPart;
import hills.diagram.edit.parts.TransientConfigurationTransientConfigurationActivitesCompartmentEditPart;
import hills.diagram.edit.parts.TransientConfigurationTransientConfigurationProprietesCompartmentEditPart;
import hills.diagram.edit.parts.UExistenceEditPart;
import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HillsDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getSemanticChildren(View view) {
		switch (HillsVisualIDRegistry.getVisualID(view)) {
		case HSpecificationEditPart.VISUAL_ID:
			return getHSpecification_1000SemanticChildren(view);
		case HSystemEditPart.VISUAL_ID:
			return getHSystem_2001SemanticChildren(view);
		case HClassEditPart.VISUAL_ID:
			return getHClass_2002SemanticChildren(view);
		case HSystemHSystemDeclaratiosCompartmentEditPart.VISUAL_ID:
			return getHSystemHSystemDeclaratiosCompartment_7001SemanticChildren(view);
		case HSystemHSystemFonctionsCompartmentEditPart.VISUAL_ID:
			return getHSystemHSystemFonctionsCompartment_7002SemanticChildren(view);
		case HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID:
			return getHSystemHSystemConfigurationsCompartment_7003SemanticChildren(view);
		case FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			return getFiniteConfigurationFiniteConfigurationProprietesCompartment_7004SemanticChildren(view);
		case FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			return getFiniteConfigurationFiniteConfigurationActivitesCompartment_7005SemanticChildren(view);
		case FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart.VISUAL_ID:
			return getFiniteConfigurationFiniteConfigurationSojTimeCompartment_7006SemanticChildren(view);
		case PropertyPropertyPpredicatsCompartmentEditPart.VISUAL_ID:
			return getPropertyPropertyPpredicatsCompartment_7018SemanticChildren(view);
		case ActivityActivityPpredicatsCompartmentEditPart.VISUAL_ID:
			return getActivityActivityPpredicatsCompartment_7019SemanticChildren(view);
		case PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			return getPassiveConfigurationPassiveConfigurationProprietesCompartment_7007SemanticChildren(view);
		case PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			return getPassiveConfigurationPassiveConfigurationActivitesCompartment_7008SemanticChildren(view);
		case PropertyPropertyPpredicatsCompartment2EditPart.VISUAL_ID:
			return getPropertyPropertyPpredicatsCompartment_7020SemanticChildren(view);
		case ActivityActivityPpredicatsCompartment2EditPart.VISUAL_ID:
			return getActivityActivityPpredicatsCompartment_7021SemanticChildren(view);
		case TransientConfigurationTransientConfigurationProprietesCompartmentEditPart.VISUAL_ID:
			return getTransientConfigurationTransientConfigurationProprietesCompartment_7009SemanticChildren(view);
		case TransientConfigurationTransientConfigurationActivitesCompartmentEditPart.VISUAL_ID:
			return getTransientConfigurationTransientConfigurationActivitesCompartment_7010SemanticChildren(view);
		case PropertyPropertyPpredicatsCompartment3EditPart.VISUAL_ID:
			return getPropertyPropertyPpredicatsCompartment_7022SemanticChildren(view);
		case ActivityActivityPpredicatsCompartment3EditPart.VISUAL_ID:
			return getActivityActivityPpredicatsCompartment_7023SemanticChildren(view);
		case PortPortEntreePortsCompartmentEditPart.VISUAL_ID:
			return getPortPortEntreePortsCompartment_7024SemanticChildren(view);
		case FunctionFunctionPpredicatsCompartmentEditPart.VISUAL_ID:
			return getFunctionFunctionPpredicatsCompartment_7025SemanticChildren(view);
		case HClassHClassDeclaratiosCompartmentEditPart.VISUAL_ID:
			return getHClassHClassDeclaratiosCompartment_7011SemanticChildren(view);
		case HClassHClassFonctionsCompartmentEditPart.VISUAL_ID:
			return getHClassHClassFonctionsCompartment_7012SemanticChildren(view);
		case FunctionFunctionPpredicatsCompartment2EditPart.VISUAL_ID:
			return getFunctionFunctionPpredicatsCompartment_7026SemanticChildren(view);
		case HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID:
			return getHRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartment_7013SemanticChildren(
					view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHSpecification_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HSpecification modelElement = (HSpecification) view.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComposants().iterator(); it.hasNext();) {
			HClassifier childElement = (HClassifier) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HSystemEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HClassEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGenericNodes().iterator(); it.hasNext();) {
			GenericNode childElement = (GenericNode) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GenericNodeEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRequirementSpecification().iterator(); it.hasNext();) {
			HRequirementSpecification childElement = (HRequirementSpecification) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == HRequirementSpecificationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHSystem_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HSystem modelElement = (HSystem) view.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHClass_2002SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HClass modelElement = (HClass) view.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPorts().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHSystemHSystemDeclaratiosCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HSystem modelElement = (HSystem) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeclaratios().iterator(); it.hasNext();) {
			Declaration childElement = (Declaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DeclarationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHSystemHSystemFonctionsCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HSystem modelElement = (HSystem) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFonctions().iterator(); it.hasNext();) {
			Function childElement = (Function) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FunctionEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHSystemHSystemConfigurationsCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HSystem modelElement = (HSystem) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConfigurations().iterator(); it.hasNext();) {
			Configuration childElement = (Configuration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FiniteConfigurationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialConfigurationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PassiveConfigurationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransientConfigurationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TestNodeEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getFiniteConfigurationFiniteConfigurationProprietesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FiniteConfiguration modelElement = (FiniteConfiguration) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProprietes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getFiniteConfigurationFiniteConfigurationActivitesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FiniteConfiguration modelElement = (FiniteConfiguration) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivites().iterator(); it.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getFiniteConfigurationFiniteConfigurationSojTimeCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FiniteConfiguration modelElement = (FiniteConfiguration) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		{
			SojournTime childElement = modelElement.getSojTime();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SojournTimeEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getPropertyPropertyPpredicatsCompartment_7018SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Property modelElement = (Property) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPpredicats().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclarationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getActivityActivityPpredicatsCompartment_7019SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPpredicats().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclaration2EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getPassiveConfigurationPassiveConfigurationProprietesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PassiveConfiguration modelElement = (PassiveConfiguration) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProprietes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property2EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getPassiveConfigurationPassiveConfigurationActivitesCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PassiveConfiguration modelElement = (PassiveConfiguration) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivites().iterator(); it.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Activity2EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getPropertyPropertyPpredicatsCompartment_7020SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Property modelElement = (Property) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPpredicats().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclarationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getActivityActivityPpredicatsCompartment_7021SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPpredicats().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclaration2EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getTransientConfigurationTransientConfigurationProprietesCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TransientConfiguration modelElement = (TransientConfiguration) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProprietes().iterator(); it.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Property3EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getTransientConfigurationTransientConfigurationActivitesCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TransientConfiguration modelElement = (TransientConfiguration) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActivites().iterator(); it.hasNext();) {
			Activity childElement = (Activity) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Activity3EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getPropertyPropertyPpredicatsCompartment_7022SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Property modelElement = (Property) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPpredicats().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclarationEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getActivityActivityPpredicatsCompartment_7023SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Activity modelElement = (Activity) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPpredicats().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclaration2EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getPortPortEntreePortsCompartment_7024SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Port modelElement = (Port) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEntreePorts().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclaration3EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getFunctionFunctionPpredicatsCompartment_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPpredicats().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclaration4EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHClassHClassDeclaratiosCompartment_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HClass modelElement = (HClass) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDeclaratios().iterator(); it.hasNext();) {
			Declaration childElement = (Declaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Declaration2EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHClassHClassFonctionsCompartment_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HClass modelElement = (HClass) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFonctions().iterator(); it.hasNext();) {
			Function childElement = (Function) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Function2EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getFunctionFunctionPpredicatsCompartment_7026SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Function modelElement = (Function) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPpredicats().iterator(); it.hasNext();) {
			PortDeclaration childElement = (PortDeclaration) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PortDeclaration4EditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsNodeDescriptor> getHRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		HRequirementSpecification modelElement = (HRequirementSpecification) containerView.getElement();
		LinkedList<HillsNodeDescriptor> result = new LinkedList<HillsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTemporalProperties().iterator(); it.hasNext();) {
			TLProperty childElement = (TLProperty) it.next();
			int visualID = HillsVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BExistenceEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UExistenceEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EExistenceEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CAbsenceEditPart.VISUAL_ID) {
				result.add(new HillsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getContainedLinks(View view) {
		switch (HillsVisualIDRegistry.getVisualID(view)) {
		case HSpecificationEditPart.VISUAL_ID:
			return getHSpecification_1000ContainedLinks(view);
		case HSystemEditPart.VISUAL_ID:
			return getHSystem_2001ContainedLinks(view);
		case HClassEditPart.VISUAL_ID:
			return getHClass_2002ContainedLinks(view);
		case GenericNodeEditPart.VISUAL_ID:
			return getGenericNode_2003ContainedLinks(view);
		case HRequirementSpecificationEditPart.VISUAL_ID:
			return getHRequirementSpecification_2004ContainedLinks(view);
		case FiniteConfigurationEditPart.VISUAL_ID:
			return getFiniteConfiguration_3001ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3002ContainedLinks(view);
		case PortDeclarationEditPart.VISUAL_ID:
			return getPortDeclaration_3022ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_3003ContainedLinks(view);
		case PortDeclaration2EditPart.VISUAL_ID:
			return getPortDeclaration_3023ContainedLinks(view);
		case SojournTimeEditPart.VISUAL_ID:
			return getSojournTime_3004ContainedLinks(view);
		case InitialConfigurationEditPart.VISUAL_ID:
			return getInitialConfiguration_3005ContainedLinks(view);
		case PassiveConfigurationEditPart.VISUAL_ID:
			return getPassiveConfiguration_3006ContainedLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3007ContainedLinks(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3008ContainedLinks(view);
		case TransientConfigurationEditPart.VISUAL_ID:
			return getTransientConfiguration_3009ContainedLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3010ContainedLinks(view);
		case Activity3EditPart.VISUAL_ID:
			return getActivity_3011ContainedLinks(view);
		case TestNodeEditPart.VISUAL_ID:
			return getTestNode_3012ContainedLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3013ContainedLinks(view);
		case PortDeclaration3EditPart.VISUAL_ID:
			return getPortDeclaration_3024ContainedLinks(view);
		case DeclarationEditPart.VISUAL_ID:
			return getDeclaration_3014ContainedLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3015ContainedLinks(view);
		case PortDeclaration4EditPart.VISUAL_ID:
			return getPortDeclaration_3025ContainedLinks(view);
		case Declaration2EditPart.VISUAL_ID:
			return getDeclaration_3016ContainedLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3017ContainedLinks(view);
		case BExistenceEditPart.VISUAL_ID:
			return getBExistence_3018ContainedLinks(view);
		case UExistenceEditPart.VISUAL_ID:
			return getUExistence_3019ContainedLinks(view);
		case EExistenceEditPart.VISUAL_ID:
			return getEExistence_3020ContainedLinks(view);
		case CAbsenceEditPart.VISUAL_ID:
			return getCAbsence_3021ContainedLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001ContainedLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4002ContainedLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4003ContainedLinks(view);
		case ConfluentTransitionEditPart.VISUAL_ID:
			return getConfluentTransition_4004ContainedLinks(view);
		case InternalTransitionEditPart.VISUAL_ID:
			return getInternalTransition_4005ContainedLinks(view);
		case ExternalTransitionEditPart.VISUAL_ID:
			return getExternalTransition_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getIncomingLinks(View view) {
		switch (HillsVisualIDRegistry.getVisualID(view)) {
		case HSystemEditPart.VISUAL_ID:
			return getHSystem_2001IncomingLinks(view);
		case HClassEditPart.VISUAL_ID:
			return getHClass_2002IncomingLinks(view);
		case GenericNodeEditPart.VISUAL_ID:
			return getGenericNode_2003IncomingLinks(view);
		case HRequirementSpecificationEditPart.VISUAL_ID:
			return getHRequirementSpecification_2004IncomingLinks(view);
		case FiniteConfigurationEditPart.VISUAL_ID:
			return getFiniteConfiguration_3001IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3002IncomingLinks(view);
		case PortDeclarationEditPart.VISUAL_ID:
			return getPortDeclaration_3022IncomingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_3003IncomingLinks(view);
		case PortDeclaration2EditPart.VISUAL_ID:
			return getPortDeclaration_3023IncomingLinks(view);
		case SojournTimeEditPart.VISUAL_ID:
			return getSojournTime_3004IncomingLinks(view);
		case InitialConfigurationEditPart.VISUAL_ID:
			return getInitialConfiguration_3005IncomingLinks(view);
		case PassiveConfigurationEditPart.VISUAL_ID:
			return getPassiveConfiguration_3006IncomingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3007IncomingLinks(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3008IncomingLinks(view);
		case TransientConfigurationEditPart.VISUAL_ID:
			return getTransientConfiguration_3009IncomingLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3010IncomingLinks(view);
		case Activity3EditPart.VISUAL_ID:
			return getActivity_3011IncomingLinks(view);
		case TestNodeEditPart.VISUAL_ID:
			return getTestNode_3012IncomingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3013IncomingLinks(view);
		case PortDeclaration3EditPart.VISUAL_ID:
			return getPortDeclaration_3024IncomingLinks(view);
		case DeclarationEditPart.VISUAL_ID:
			return getDeclaration_3014IncomingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3015IncomingLinks(view);
		case PortDeclaration4EditPart.VISUAL_ID:
			return getPortDeclaration_3025IncomingLinks(view);
		case Declaration2EditPart.VISUAL_ID:
			return getDeclaration_3016IncomingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3017IncomingLinks(view);
		case BExistenceEditPart.VISUAL_ID:
			return getBExistence_3018IncomingLinks(view);
		case UExistenceEditPart.VISUAL_ID:
			return getUExistence_3019IncomingLinks(view);
		case EExistenceEditPart.VISUAL_ID:
			return getEExistence_3020IncomingLinks(view);
		case CAbsenceEditPart.VISUAL_ID:
			return getCAbsence_3021IncomingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001IncomingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4002IncomingLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4003IncomingLinks(view);
		case ConfluentTransitionEditPart.VISUAL_ID:
			return getConfluentTransition_4004IncomingLinks(view);
		case InternalTransitionEditPart.VISUAL_ID:
			return getInternalTransition_4005IncomingLinks(view);
		case ExternalTransitionEditPart.VISUAL_ID:
			return getExternalTransition_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getOutgoingLinks(View view) {
		switch (HillsVisualIDRegistry.getVisualID(view)) {
		case HSystemEditPart.VISUAL_ID:
			return getHSystem_2001OutgoingLinks(view);
		case HClassEditPart.VISUAL_ID:
			return getHClass_2002OutgoingLinks(view);
		case GenericNodeEditPart.VISUAL_ID:
			return getGenericNode_2003OutgoingLinks(view);
		case HRequirementSpecificationEditPart.VISUAL_ID:
			return getHRequirementSpecification_2004OutgoingLinks(view);
		case FiniteConfigurationEditPart.VISUAL_ID:
			return getFiniteConfiguration_3001OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_3002OutgoingLinks(view);
		case PortDeclarationEditPart.VISUAL_ID:
			return getPortDeclaration_3022OutgoingLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_3003OutgoingLinks(view);
		case PortDeclaration2EditPart.VISUAL_ID:
			return getPortDeclaration_3023OutgoingLinks(view);
		case SojournTimeEditPart.VISUAL_ID:
			return getSojournTime_3004OutgoingLinks(view);
		case InitialConfigurationEditPart.VISUAL_ID:
			return getInitialConfiguration_3005OutgoingLinks(view);
		case PassiveConfigurationEditPart.VISUAL_ID:
			return getPassiveConfiguration_3006OutgoingLinks(view);
		case Property2EditPart.VISUAL_ID:
			return getProperty_3007OutgoingLinks(view);
		case Activity2EditPart.VISUAL_ID:
			return getActivity_3008OutgoingLinks(view);
		case TransientConfigurationEditPart.VISUAL_ID:
			return getTransientConfiguration_3009OutgoingLinks(view);
		case Property3EditPart.VISUAL_ID:
			return getProperty_3010OutgoingLinks(view);
		case Activity3EditPart.VISUAL_ID:
			return getActivity_3011OutgoingLinks(view);
		case TestNodeEditPart.VISUAL_ID:
			return getTestNode_3012OutgoingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3013OutgoingLinks(view);
		case PortDeclaration3EditPart.VISUAL_ID:
			return getPortDeclaration_3024OutgoingLinks(view);
		case DeclarationEditPart.VISUAL_ID:
			return getDeclaration_3014OutgoingLinks(view);
		case FunctionEditPart.VISUAL_ID:
			return getFunction_3015OutgoingLinks(view);
		case PortDeclaration4EditPart.VISUAL_ID:
			return getPortDeclaration_3025OutgoingLinks(view);
		case Declaration2EditPart.VISUAL_ID:
			return getDeclaration_3016OutgoingLinks(view);
		case Function2EditPart.VISUAL_ID:
			return getFunction_3017OutgoingLinks(view);
		case BExistenceEditPart.VISUAL_ID:
			return getBExistence_3018OutgoingLinks(view);
		case UExistenceEditPart.VISUAL_ID:
			return getUExistence_3019OutgoingLinks(view);
		case EExistenceEditPart.VISUAL_ID:
			return getEExistence_3020OutgoingLinks(view);
		case CAbsenceEditPart.VISUAL_ID:
			return getCAbsence_3021OutgoingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_4001OutgoingLinks(view);
		case AggregationEditPart.VISUAL_ID:
			return getAggregation_4002OutgoingLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4003OutgoingLinks(view);
		case ConfluentTransitionEditPart.VISUAL_ID:
			return getConfluentTransition_4004OutgoingLinks(view);
		case InternalTransitionEditPart.VISUAL_ID:
			return getInternalTransition_4005OutgoingLinks(view);
		case ExternalTransitionEditPart.VISUAL_ID:
			return getExternalTransition_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHSpecification_1000ContainedLinks(View view) {
		HSpecification modelElement = (HSpecification) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Composition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Aggregation_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Reference_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHSystem_2001ContainedLinks(View view) {
		HSystem modelElement = (HSystem) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConfluentTransition_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_InternalTransition_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExternalTransition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHClass_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getGenericNode_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHRequirementSpecification_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFiniteConfiguration_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getSojournTime_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getInitialConfiguration_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getPassiveConfiguration_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getTransientConfiguration_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getTestNode_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getPort_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getDeclaration_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFunction_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getDeclaration_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFunction_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getBExistence_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getUExistence_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getEExistence_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getCAbsence_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getComposition_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getAggregation_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getReference_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getConfluentTransition_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getInternalTransition_4005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getExternalTransition_4006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHSystem_2001IncomingLinks(View view) {
		HSystem modelElement = (HSystem) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHClass_2002IncomingLinks(View view) {
		HClass modelElement = (HClass) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getGenericNode_2003IncomingLinks(View view) {
		GenericNode modelElement = (GenericNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHRequirementSpecification_2004IncomingLinks(View view) {
		HRequirementSpecification modelElement = (HRequirementSpecification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Composition_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Aggregation_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFiniteConfiguration_3001IncomingLinks(View view) {
		FiniteConfiguration modelElement = (FiniteConfiguration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConfluentTransition_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InternalTransition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalTransition_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getSojournTime_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getInitialConfiguration_3005IncomingLinks(View view) {
		InitialConfiguration modelElement = (InitialConfiguration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConfluentTransition_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InternalTransition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalTransition_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getPassiveConfiguration_3006IncomingLinks(View view) {
		PassiveConfiguration modelElement = (PassiveConfiguration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConfluentTransition_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InternalTransition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalTransition_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getTransientConfiguration_3009IncomingLinks(View view) {
		TransientConfiguration modelElement = (TransientConfiguration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConfluentTransition_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InternalTransition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalTransition_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getTestNode_3012IncomingLinks(View view) {
		TestNode modelElement = (TestNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConfluentTransition_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_InternalTransition_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExternalTransition_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getPort_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getDeclaration_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFunction_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getDeclaration_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFunction_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getBExistence_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getUExistence_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getEExistence_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getCAbsence_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getComposition_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getAggregation_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getReference_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getConfluentTransition_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getInternalTransition_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getExternalTransition_4006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHSystem_2001OutgoingLinks(View view) {
		HSystem modelElement = (HSystem) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHClass_2002OutgoingLinks(View view) {
		HClass modelElement = (HClass) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Composition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Aggregation_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getGenericNode_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getHRequirementSpecification_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFiniteConfiguration_3001OutgoingLinks(View view) {
		FiniteConfiguration modelElement = (FiniteConfiguration) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConfluentTransition_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InternalTransition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalTransition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getSojournTime_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getInitialConfiguration_3005OutgoingLinks(View view) {
		InitialConfiguration modelElement = (InitialConfiguration) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConfluentTransition_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InternalTransition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalTransition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getPassiveConfiguration_3006OutgoingLinks(View view) {
		PassiveConfiguration modelElement = (PassiveConfiguration) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConfluentTransition_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InternalTransition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalTransition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getTransientConfiguration_3009OutgoingLinks(View view) {
		TransientConfiguration modelElement = (TransientConfiguration) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConfluentTransition_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InternalTransition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalTransition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getProperty_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getActivity_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getTestNode_3012OutgoingLinks(View view) {
		TestNode modelElement = (TestNode) view.getElement();
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConfluentTransition_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_InternalTransition_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExternalTransition_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getPort_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getDeclaration_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFunction_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HillsLinkDescriptor> getPortDeclaration_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getDeclaration_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getFunction_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getBExistence_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getUExistence_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getEExistence_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getCAbsence_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getComposition_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getAggregation_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getReference_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getConfluentTransition_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getInternalTransition_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HillsLinkDescriptor> getExternalTransition_4006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getContainedTypeModelFacetLinks_Composition_4001(
			HSpecification container) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getLiens().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nomme dst = link.getTarget();
			HClassifier src = link.getSource();
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.Composition_4001,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getContainedTypeModelFacetLinks_Aggregation_4002(
			HSpecification container) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getLiens().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nomme dst = link.getTarget();
			HClassifier src = link.getSource();
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.Aggregation_4002,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getContainedTypeModelFacetLinks_Reference_4003(
			HSpecification container) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getLiens().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Reference) {
				continue;
			}
			Reference link = (Reference) linkObject;
			if (ReferenceEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nomme dst = link.getTarget();
			HClassifier src = link.getSource();
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.Reference_4003,
					ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getContainedTypeModelFacetLinks_ConfluentTransition_4004(
			HSystem container) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConfluentTransition) {
				continue;
			}
			ConfluentTransition link = (ConfluentTransition) linkObject;
			if (ConfluentTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConfNomme dst = link.getTarget();
			Configuration src = link.getSource();
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.ConfluentTransition_4004,
					ConfluentTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getContainedTypeModelFacetLinks_InternalTransition_4005(
			HSystem container) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InternalTransition) {
				continue;
			}
			InternalTransition link = (InternalTransition) linkObject;
			if (InternalTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConfNomme dst = link.getTarget();
			Configuration src = link.getSource();
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.InternalTransition_4005,
					InternalTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getContainedTypeModelFacetLinks_ExternalTransition_4006(
			HSystem container) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalTransition) {
				continue;
			}
			ExternalTransition link = (ExternalTransition) linkObject;
			if (ExternalTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConfNomme dst = link.getTarget();
			Configuration src = link.getSource();
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.ExternalTransition_4006,
					ExternalTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HillsLinkDescriptor> getIncomingTypeModelFacetLinks_Composition_4001(Nomme target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != HillsPackage.eINSTANCE.getLien_Target()
					|| false == setting.getEObject() instanceof Composition) {
				continue;
			}
			Composition link = (Composition) setting.getEObject();
			if (CompositionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			HClassifier src = link.getSource();
			result.add(new HillsLinkDescriptor(src, target, link, HillsElementTypes.Composition_4001,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HillsLinkDescriptor> getIncomingTypeModelFacetLinks_Aggregation_4002(Nomme target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != HillsPackage.eINSTANCE.getLien_Target()
					|| false == setting.getEObject() instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) setting.getEObject();
			if (AggregationEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			HClassifier src = link.getSource();
			result.add(new HillsLinkDescriptor(src, target, link, HillsElementTypes.Aggregation_4002,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HillsLinkDescriptor> getIncomingTypeModelFacetLinks_Reference_4003(Nomme target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != HillsPackage.eINSTANCE.getLien_Target()
					|| false == setting.getEObject() instanceof Reference) {
				continue;
			}
			Reference link = (Reference) setting.getEObject();
			if (ReferenceEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			HClassifier src = link.getSource();
			result.add(new HillsLinkDescriptor(src, target, link, HillsElementTypes.Reference_4003,
					ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HillsLinkDescriptor> getIncomingTypeModelFacetLinks_ConfluentTransition_4004(
			ConfNomme target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != HillsPackage.eINSTANCE.getTransition_Target()
					|| false == setting.getEObject() instanceof ConfluentTransition) {
				continue;
			}
			ConfluentTransition link = (ConfluentTransition) setting.getEObject();
			if (ConfluentTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Configuration src = link.getSource();
			result.add(new HillsLinkDescriptor(src, target, link, HillsElementTypes.ConfluentTransition_4004,
					ConfluentTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HillsLinkDescriptor> getIncomingTypeModelFacetLinks_InternalTransition_4005(
			ConfNomme target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != HillsPackage.eINSTANCE.getTransition_Target()
					|| false == setting.getEObject() instanceof InternalTransition) {
				continue;
			}
			InternalTransition link = (InternalTransition) setting.getEObject();
			if (InternalTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Configuration src = link.getSource();
			result.add(new HillsLinkDescriptor(src, target, link, HillsElementTypes.InternalTransition_4005,
					InternalTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<HillsLinkDescriptor> getIncomingTypeModelFacetLinks_ExternalTransition_4006(
			ConfNomme target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != HillsPackage.eINSTANCE.getTransition_Target()
					|| false == setting.getEObject() instanceof ExternalTransition) {
				continue;
			}
			ExternalTransition link = (ExternalTransition) setting.getEObject();
			if (ExternalTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Configuration src = link.getSource();
			result.add(new HillsLinkDescriptor(src, target, link, HillsElementTypes.ExternalTransition_4006,
					ExternalTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getOutgoingTypeModelFacetLinks_Composition_4001(HClassifier source) {
		HSpecification container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof HSpecification) {
				container = (HSpecification) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getLiens().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nomme dst = link.getTarget();
			HClassifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.Composition_4001,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getOutgoingTypeModelFacetLinks_Aggregation_4002(HClassifier source) {
		HSpecification container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof HSpecification) {
				container = (HSpecification) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getLiens().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Aggregation) {
				continue;
			}
			Aggregation link = (Aggregation) linkObject;
			if (AggregationEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nomme dst = link.getTarget();
			HClassifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.Aggregation_4002,
					AggregationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getOutgoingTypeModelFacetLinks_Reference_4003(HClassifier source) {
		HSpecification container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof HSpecification) {
				container = (HSpecification) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getLiens().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Reference) {
				continue;
			}
			Reference link = (Reference) linkObject;
			if (ReferenceEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Nomme dst = link.getTarget();
			HClassifier src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.Reference_4003,
					ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getOutgoingTypeModelFacetLinks_ConfluentTransition_4004(
			Configuration source) {
		HSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof HSystem) {
				container = (HSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConfluentTransition) {
				continue;
			}
			ConfluentTransition link = (ConfluentTransition) linkObject;
			if (ConfluentTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConfNomme dst = link.getTarget();
			Configuration src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.ConfluentTransition_4004,
					ConfluentTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getOutgoingTypeModelFacetLinks_InternalTransition_4005(
			Configuration source) {
		HSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof HSystem) {
				container = (HSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InternalTransition) {
				continue;
			}
			InternalTransition link = (InternalTransition) linkObject;
			if (InternalTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConfNomme dst = link.getTarget();
			Configuration src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.InternalTransition_4005,
					InternalTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<HillsLinkDescriptor> getOutgoingTypeModelFacetLinks_ExternalTransition_4006(
			Configuration source) {
		HSystem container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof HSystem) {
				container = (HSystem) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<HillsLinkDescriptor> result = new LinkedList<HillsLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ExternalTransition) {
				continue;
			}
			ExternalTransition link = (ExternalTransition) linkObject;
			if (ExternalTransitionEditPart.VISUAL_ID != HillsVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ConfNomme dst = link.getTarget();
			Configuration src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new HillsLinkDescriptor(src, dst, link, HillsElementTypes.ExternalTransition_4006,
					ExternalTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<HillsNodeDescriptor> getSemanticChildren(View view) {
			return HillsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HillsLinkDescriptor> getContainedLinks(View view) {
			return HillsDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HillsLinkDescriptor> getIncomingLinks(View view) {
			return HillsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HillsLinkDescriptor> getOutgoingLinks(View view) {
			return HillsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
