/*
 * 
 */
package hills.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import hills.diagram.part.HillsVisualIDRegistry;

/**
 * @generated
 */
public class HillsEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (HillsVisualIDRegistry.getVisualID(view)) {

			case HSpecificationEditPart.VISUAL_ID:
				return new HSpecificationEditPart(view);

			case HSystemEditPart.VISUAL_ID:
				return new HSystemEditPart(view);

			case HSystemNtimeEditPart.VISUAL_ID:
				return new HSystemNtimeEditPart(view);

			case HClassEditPart.VISUAL_ID:
				return new HClassEditPart(view);

			case HClassNtimeEditPart.VISUAL_ID:
				return new HClassNtimeEditPart(view);

			case GenericNodeEditPart.VISUAL_ID:
				return new GenericNodeEditPart(view);

			case GenericNodeNtimeEditPart.VISUAL_ID:
				return new GenericNodeNtimeEditPart(view);

			case HRequirementSpecificationEditPart.VISUAL_ID:
				return new HRequirementSpecificationEditPart(view);

			case HRequirementSpecificationNtimeEditPart.VISUAL_ID:
				return new HRequirementSpecificationNtimeEditPart(view);

			case FiniteConfigurationEditPart.VISUAL_ID:
				return new FiniteConfigurationEditPart(view);

			case FiniteConfigurationLibelleEditPart.VISUAL_ID:
				return new FiniteConfigurationLibelleEditPart(view);

			case PropertyEditPart.VISUAL_ID:
				return new PropertyEditPart(view);

			case PropertyPrname1EditPart.VISUAL_ID:
				return new PropertyPrname1EditPart(view);

			case PortDeclarationEditPart.VISUAL_ID:
				return new PortDeclarationEditPart(view);

			case PortDeclarationPdeclarationEditPart.VISUAL_ID:
				return new PortDeclarationPdeclarationEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityAcname1EditPart.VISUAL_ID:
				return new ActivityAcname1EditPart(view);

			case PortDeclaration2EditPart.VISUAL_ID:
				return new PortDeclaration2EditPart(view);

			case PortDeclarationPdeclaration2EditPart.VISUAL_ID:
				return new PortDeclarationPdeclaration2EditPart(view);

			case SojournTimeEditPart.VISUAL_ID:
				return new SojournTimeEditPart(view);

			case SojournTimeStimeEditPart.VISUAL_ID:
				return new SojournTimeStimeEditPart(view);

			case InitialConfigurationEditPart.VISUAL_ID:
				return new InitialConfigurationEditPart(view);

			case InitialConfigurationLibelleEditPart.VISUAL_ID:
				return new InitialConfigurationLibelleEditPart(view);

			case PassiveConfigurationEditPart.VISUAL_ID:
				return new PassiveConfigurationEditPart(view);

			case PassiveConfigurationLibelleEditPart.VISUAL_ID:
				return new PassiveConfigurationLibelleEditPart(view);

			case Property2EditPart.VISUAL_ID:
				return new Property2EditPart(view);

			case PropertyPrname12EditPart.VISUAL_ID:
				return new PropertyPrname12EditPart(view);

			case Activity2EditPart.VISUAL_ID:
				return new Activity2EditPart(view);

			case ActivityAcname12EditPart.VISUAL_ID:
				return new ActivityAcname12EditPart(view);

			case TransientConfigurationEditPart.VISUAL_ID:
				return new TransientConfigurationEditPart(view);

			case TransientConfigurationLibelleEditPart.VISUAL_ID:
				return new TransientConfigurationLibelleEditPart(view);

			case Property3EditPart.VISUAL_ID:
				return new Property3EditPart(view);

			case PropertyPrname13EditPart.VISUAL_ID:
				return new PropertyPrname13EditPart(view);

			case Activity3EditPart.VISUAL_ID:
				return new Activity3EditPart(view);

			case ActivityAcname13EditPart.VISUAL_ID:
				return new ActivityAcname13EditPart(view);

			case TestNodeEditPart.VISUAL_ID:
				return new TestNodeEditPart(view);

			case TestNodeTtimeEditPart.VISUAL_ID:
				return new TestNodeTtimeEditPart(view);

			case PortEditPart.VISUAL_ID:
				return new PortEditPart(view);

			case PortPnameEditPart.VISUAL_ID:
				return new PortPnameEditPart(view);

			case PortDeclaration3EditPart.VISUAL_ID:
				return new PortDeclaration3EditPart(view);

			case PortDeclarationPdeclaration3EditPart.VISUAL_ID:
				return new PortDeclarationPdeclaration3EditPart(view);

			case DeclarationEditPart.VISUAL_ID:
				return new DeclarationEditPart(view);

			case DeclarationEnameEditPart.VISUAL_ID:
				return new DeclarationEnameEditPart(view);

			case FunctionEditPart.VISUAL_ID:
				return new FunctionEditPart(view);

			case FunctionFnameEditPart.VISUAL_ID:
				return new FunctionFnameEditPart(view);

			case PortDeclaration4EditPart.VISUAL_ID:
				return new PortDeclaration4EditPart(view);

			case PortDeclarationPdeclaration4EditPart.VISUAL_ID:
				return new PortDeclarationPdeclaration4EditPart(view);

			case Declaration2EditPart.VISUAL_ID:
				return new Declaration2EditPart(view);

			case DeclarationEname2EditPart.VISUAL_ID:
				return new DeclarationEname2EditPart(view);

			case Function2EditPart.VISUAL_ID:
				return new Function2EditPart(view);

			case FunctionFname2EditPart.VISUAL_ID:
				return new FunctionFname2EditPart(view);

			case BExistenceEditPart.VISUAL_ID:
				return new BExistenceEditPart(view);

			case BExistenceBenameEditPart.VISUAL_ID:
				return new BExistenceBenameEditPart(view);

			case UExistenceEditPart.VISUAL_ID:
				return new UExistenceEditPart(view);

			case UExistenceUenameEditPart.VISUAL_ID:
				return new UExistenceUenameEditPart(view);

			case EExistenceEditPart.VISUAL_ID:
				return new EExistenceEditPart(view);

			case EExistenceEenameEditPart.VISUAL_ID:
				return new EExistenceEenameEditPart(view);

			case CAbsenceEditPart.VISUAL_ID:
				return new CAbsenceEditPart(view);

			case CAbsenceCanameEditPart.VISUAL_ID:
				return new CAbsenceCanameEditPart(view);

			case HSystemHSystemDeclaratiosCompartmentEditPart.VISUAL_ID:
				return new HSystemHSystemDeclaratiosCompartmentEditPart(view);

			case HSystemHSystemFonctionsCompartmentEditPart.VISUAL_ID:
				return new HSystemHSystemFonctionsCompartmentEditPart(view);

			case HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID:
				return new HSystemHSystemConfigurationsCompartmentEditPart(view);

			case FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart.VISUAL_ID:
				return new FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart(view);

			case FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart.VISUAL_ID:
				return new FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart(view);

			case FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart.VISUAL_ID:
				return new FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart(view);

			case PropertyPropertyPpredicatsCompartmentEditPart.VISUAL_ID:
				return new PropertyPropertyPpredicatsCompartmentEditPart(view);

			case ActivityActivityPpredicatsCompartmentEditPart.VISUAL_ID:
				return new ActivityActivityPpredicatsCompartmentEditPart(view);

			case PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart.VISUAL_ID:
				return new PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart(view);

			case PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart.VISUAL_ID:
				return new PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart(view);

			case PropertyPropertyPpredicatsCompartment2EditPart.VISUAL_ID:
				return new PropertyPropertyPpredicatsCompartment2EditPart(view);

			case ActivityActivityPpredicatsCompartment2EditPart.VISUAL_ID:
				return new ActivityActivityPpredicatsCompartment2EditPart(view);

			case TransientConfigurationTransientConfigurationProprietesCompartmentEditPart.VISUAL_ID:
				return new TransientConfigurationTransientConfigurationProprietesCompartmentEditPart(view);

			case TransientConfigurationTransientConfigurationActivitesCompartmentEditPart.VISUAL_ID:
				return new TransientConfigurationTransientConfigurationActivitesCompartmentEditPart(view);

			case PropertyPropertyPpredicatsCompartment3EditPart.VISUAL_ID:
				return new PropertyPropertyPpredicatsCompartment3EditPart(view);

			case ActivityActivityPpredicatsCompartment3EditPart.VISUAL_ID:
				return new ActivityActivityPpredicatsCompartment3EditPart(view);

			case PortPortEntreePortsCompartmentEditPart.VISUAL_ID:
				return new PortPortEntreePortsCompartmentEditPart(view);

			case FunctionFunctionPpredicatsCompartmentEditPart.VISUAL_ID:
				return new FunctionFunctionPpredicatsCompartmentEditPart(view);

			case HClassHClassDeclaratiosCompartmentEditPart.VISUAL_ID:
				return new HClassHClassDeclaratiosCompartmentEditPart(view);

			case HClassHClassFonctionsCompartmentEditPart.VISUAL_ID:
				return new HClassHClassFonctionsCompartmentEditPart(view);

			case FunctionFunctionPpredicatsCompartment2EditPart.VISUAL_ID:
				return new FunctionFunctionPpredicatsCompartment2EditPart(view);

			case HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID:
				return new HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart(
						view);

			case BExistenceBExistencePredicatsCompartmentEditPart.VISUAL_ID:
				return new BExistenceBExistencePredicatsCompartmentEditPart(view);

			case UExistenceUExistencePredicatsCompartmentEditPart.VISUAL_ID:
				return new UExistenceUExistencePredicatsCompartmentEditPart(view);

			case EExistenceEExistencePredicatsCompartmentEditPart.VISUAL_ID:
				return new EExistenceEExistencePredicatsCompartmentEditPart(view);

			case CAbsenceCAbsencePredicatsCompartmentEditPart.VISUAL_ID:
				return new CAbsenceCAbsencePredicatsCompartmentEditPart(view);

			case CompositionEditPart.VISUAL_ID:
				return new CompositionEditPart(view);

			case CompositionLlabelEditPart.VISUAL_ID:
				return new CompositionLlabelEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case AggregationLlabelEditPart.VISUAL_ID:
				return new AggregationLlabelEditPart(view);

			case ReferenceEditPart.VISUAL_ID:
				return new ReferenceEditPart(view);

			case ReferenceLlabelEditPart.VISUAL_ID:
				return new ReferenceLlabelEditPart(view);

			case ConfluentTransitionEditPart.VISUAL_ID:
				return new ConfluentTransitionEditPart(view);

			case ConfluentTransitionCtnameEditPart.VISUAL_ID:
				return new ConfluentTransitionCtnameEditPart(view);

			case InternalTransitionEditPart.VISUAL_ID:
				return new InternalTransitionEditPart(view);

			case InternalTransitionItnameEditPart.VISUAL_ID:
				return new InternalTransitionItnameEditPart(view);

			case ExternalTransitionEditPart.VISUAL_ID:
				return new ExternalTransitionEditPart(view);

			case ExternalTransitionEtnameEditPart.VISUAL_ID:
				return new ExternalTransitionEtnameEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
