/*
 * 
 */
package hills.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import hills.HillsPackage;
import hills.diagram.edit.parts.ActivityAcname12EditPart;
import hills.diagram.edit.parts.ActivityAcname13EditPart;
import hills.diagram.edit.parts.ActivityAcname1EditPart;
import hills.diagram.edit.parts.AggregationLlabelEditPart;
import hills.diagram.edit.parts.BExistenceBenameEditPart;
import hills.diagram.edit.parts.CAbsenceCanameEditPart;
import hills.diagram.edit.parts.CompositionLlabelEditPart;
import hills.diagram.edit.parts.ConfluentTransitionCtnameEditPart;
import hills.diagram.edit.parts.DeclarationEname2EditPart;
import hills.diagram.edit.parts.DeclarationEnameEditPart;
import hills.diagram.edit.parts.EExistenceEenameEditPart;
import hills.diagram.edit.parts.ExternalTransitionEtnameEditPart;
import hills.diagram.edit.parts.FiniteConfigurationLibelleEditPart;
import hills.diagram.edit.parts.FunctionFname2EditPart;
import hills.diagram.edit.parts.FunctionFnameEditPart;
import hills.diagram.edit.parts.GenericNodeNtimeEditPart;
import hills.diagram.edit.parts.HClassNtimeEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationNtimeEditPart;
import hills.diagram.edit.parts.HSystemNtimeEditPart;
import hills.diagram.edit.parts.InitialConfigurationLibelleEditPart;
import hills.diagram.edit.parts.InternalTransitionItnameEditPart;
import hills.diagram.edit.parts.PassiveConfigurationLibelleEditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration2EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration3EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclaration4EditPart;
import hills.diagram.edit.parts.PortDeclarationPdeclarationEditPart;
import hills.diagram.edit.parts.PortOthernameEditPart;
import hills.diagram.edit.parts.PortPnameEditPart;
import hills.diagram.edit.parts.PropertyPrname12EditPart;
import hills.diagram.edit.parts.PropertyPrname13EditPart;
import hills.diagram.edit.parts.PropertyPrname1EditPart;
import hills.diagram.edit.parts.ReferenceLlabelEditPart;
import hills.diagram.edit.parts.SojournTimeStimeEditPart;
import hills.diagram.edit.parts.TestNodeTtimeEditPart;
import hills.diagram.edit.parts.TransientConfigurationLibelleEditPart;
import hills.diagram.edit.parts.UExistenceUenameEditPart;
import hills.diagram.parsers.MessageFormatParser;
import hills.diagram.part.HillsVisualIDRegistry;

/**
 * @generated
 */
public class HillsParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser hSystemNtime_5017Parser;

	/**
	* @generated
	*/
	private IParser getHSystemNtime_5017Parser() {
		if (hSystemNtime_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getNomme_Ntime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hSystemNtime_5017Parser = parser;
		}
		return hSystemNtime_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser hClassNtime_5020Parser;

	/**
	* @generated
	*/
	private IParser getHClassNtime_5020Parser() {
		if (hClassNtime_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getNomme_Ntime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hClassNtime_5020Parser = parser;
		}
		return hClassNtime_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser genericNodeNtime_5021Parser;

	/**
	* @generated
	*/
	private IParser getGenericNodeNtime_5021Parser() {
		if (genericNodeNtime_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getNomme_Ntime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			genericNodeNtime_5021Parser = parser;
		}
		return genericNodeNtime_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser hRequirementSpecificationNtime_5026Parser;

	/**
	* @generated
	*/
	private IParser getHRequirementSpecificationNtime_5026Parser() {
		if (hRequirementSpecificationNtime_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getNomme_Ntime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hRequirementSpecificationNtime_5026Parser = parser;
		}
		return hRequirementSpecificationNtime_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser finiteConfigurationLibelle_5004Parser;

	/**
	* @generated
	*/
	private IParser getFiniteConfigurationLibelle_5004Parser() {
		if (finiteConfigurationLibelle_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getConfNomme_Libelle() };
			MessageFormatParser parser = new MessageFormatParser(features);
			finiteConfigurationLibelle_5004Parser = parser;
		}
		return finiteConfigurationLibelle_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser propertyPrname1_5001Parser;

	/**
	* @generated
	*/
	private IParser getPropertyPrname1_5001Parser() {
		if (propertyPrname1_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getProperty_Prname1() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyPrname1_5001Parser = parser;
		}
		return propertyPrname1_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser portDeclarationPdeclaration_5027Parser;

	/**
	* @generated
	*/
	private IParser getPortDeclarationPdeclaration_5027Parser() {
		if (portDeclarationPdeclaration_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getPortDeclaration_Pdeclaration() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portDeclarationPdeclaration_5027Parser = parser;
		}
		return portDeclarationPdeclaration_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser activityAcname1_5002Parser;

	/**
	* @generated
	*/
	private IParser getActivityAcname1_5002Parser() {
		if (activityAcname1_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getActivity_Acname1() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityAcname1_5002Parser = parser;
		}
		return activityAcname1_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser portDeclarationPdeclaration_5028Parser;

	/**
	* @generated
	*/
	private IParser getPortDeclarationPdeclaration_5028Parser() {
		if (portDeclarationPdeclaration_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getPortDeclaration_Pdeclaration() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portDeclarationPdeclaration_5028Parser = parser;
		}
		return portDeclarationPdeclaration_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser sojournTimeStime_5003Parser;

	/**
	* @generated
	*/
	private IParser getSojournTimeStime_5003Parser() {
		if (sojournTimeStime_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getSojournTime_Stime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sojournTimeStime_5003Parser = parser;
		}
		return sojournTimeStime_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser initialConfigurationLibelle_5005Parser;

	/**
	* @generated
	*/
	private IParser getInitialConfigurationLibelle_5005Parser() {
		if (initialConfigurationLibelle_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getConfNomme_Libelle() };
			MessageFormatParser parser = new MessageFormatParser(features);
			initialConfigurationLibelle_5005Parser = parser;
		}
		return initialConfigurationLibelle_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser passiveConfigurationLibelle_5008Parser;

	/**
	* @generated
	*/
	private IParser getPassiveConfigurationLibelle_5008Parser() {
		if (passiveConfigurationLibelle_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getConfNomme_Libelle() };
			MessageFormatParser parser = new MessageFormatParser(features);
			passiveConfigurationLibelle_5008Parser = parser;
		}
		return passiveConfigurationLibelle_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser propertyPrname1_5006Parser;

	/**
	* @generated
	*/
	private IParser getPropertyPrname1_5006Parser() {
		if (propertyPrname1_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getProperty_Prname1() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyPrname1_5006Parser = parser;
		}
		return propertyPrname1_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser activityAcname1_5007Parser;

	/**
	* @generated
	*/
	private IParser getActivityAcname1_5007Parser() {
		if (activityAcname1_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getActivity_Acname1() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityAcname1_5007Parser = parser;
		}
		return activityAcname1_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser transientConfigurationLibelle_5011Parser;

	/**
	* @generated
	*/
	private IParser getTransientConfigurationLibelle_5011Parser() {
		if (transientConfigurationLibelle_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getConfNomme_Libelle() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transientConfigurationLibelle_5011Parser = parser;
		}
		return transientConfigurationLibelle_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser propertyPrname1_5009Parser;

	/**
	* @generated
	*/
	private IParser getPropertyPrname1_5009Parser() {
		if (propertyPrname1_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getProperty_Prname1() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyPrname1_5009Parser = parser;
		}
		return propertyPrname1_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser activityAcname1_5010Parser;

	/**
	* @generated
	*/
	private IParser getActivityAcname1_5010Parser() {
		if (activityAcname1_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getActivity_Acname1() };
			MessageFormatParser parser = new MessageFormatParser(features);
			activityAcname1_5010Parser = parser;
		}
		return activityAcname1_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser testNodeTtime_5012Parser;

	/**
	* @generated
	*/
	private IParser getTestNodeTtime_5012Parser() {
		if (testNodeTtime_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getTestNode_Ttime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			testNodeTtime_5012Parser = parser;
		}
		return testNodeTtime_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser portPname_5013Parser;

	/**
	* @generated
	*/
	private IParser getPortPname_5013Parser() {
		if (portPname_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getPort_Pname() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portPname_5013Parser = parser;
		}
		return portPname_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser portDeclarationPdeclaration_5029Parser;

	/**
	* @generated
	*/
	private IParser getPortDeclarationPdeclaration_5029Parser() {
		if (portDeclarationPdeclaration_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getPortDeclaration_Pdeclaration() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portDeclarationPdeclaration_5029Parser = parser;
		}
		return portDeclarationPdeclaration_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser declarationEname_5015Parser;

	/**
	* @generated
	*/
	private IParser getDeclarationEname_5015Parser() {
		if (declarationEname_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getDeclaration_Ename() };
			MessageFormatParser parser = new MessageFormatParser(features);
			declarationEname_5015Parser = parser;
		}
		return declarationEname_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser functionFname_5016Parser;

	/**
	* @generated
	*/
	private IParser getFunctionFname_5016Parser() {
		if (functionFname_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getFunction_Fname() };
			MessageFormatParser parser = new MessageFormatParser(features);
			functionFname_5016Parser = parser;
		}
		return functionFname_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser portDeclarationPdeclaration_5030Parser;

	/**
	* @generated
	*/
	private IParser getPortDeclarationPdeclaration_5030Parser() {
		if (portDeclarationPdeclaration_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getPortDeclaration_Pdeclaration() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portDeclarationPdeclaration_5030Parser = parser;
		}
		return portDeclarationPdeclaration_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser declarationEname_5018Parser;

	/**
	* @generated
	*/
	private IParser getDeclarationEname_5018Parser() {
		if (declarationEname_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getDeclaration_Ename() };
			MessageFormatParser parser = new MessageFormatParser(features);
			declarationEname_5018Parser = parser;
		}
		return declarationEname_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser functionFname_5019Parser;

	/**
	* @generated
	*/
	private IParser getFunctionFname_5019Parser() {
		if (functionFname_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getFunction_Fname() };
			MessageFormatParser parser = new MessageFormatParser(features);
			functionFname_5019Parser = parser;
		}
		return functionFname_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser bExistenceBename_5022Parser;

	/**
	* @generated
	*/
	private IParser getBExistenceBename_5022Parser() {
		if (bExistenceBename_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getBExistence_Bename() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bExistenceBename_5022Parser = parser;
		}
		return bExistenceBename_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser uExistenceUename_5023Parser;

	/**
	* @generated
	*/
	private IParser getUExistenceUename_5023Parser() {
		if (uExistenceUename_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getUExistence_Uename() };
			MessageFormatParser parser = new MessageFormatParser(features);
			uExistenceUename_5023Parser = parser;
		}
		return uExistenceUename_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser eExistenceEename_5024Parser;

	/**
	* @generated
	*/
	private IParser getEExistenceEename_5024Parser() {
		if (eExistenceEename_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getEExistence_Eename() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eExistenceEename_5024Parser = parser;
		}
		return eExistenceEename_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser cAbsenceCaname_5025Parser;

	/**
	* @generated
	*/
	private IParser getCAbsenceCaname_5025Parser() {
		if (cAbsenceCaname_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getCAbsence_Caname() };
			MessageFormatParser parser = new MessageFormatParser(features);
			cAbsenceCaname_5025Parser = parser;
		}
		return cAbsenceCaname_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser compositionLlabel_6001Parser;

	/**
	* @generated
	*/
	private IParser getCompositionLlabel_6001Parser() {
		if (compositionLlabel_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getLien_Llabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			compositionLlabel_6001Parser = parser;
		}
		return compositionLlabel_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser aggregationLlabel_6002Parser;

	/**
	* @generated
	*/
	private IParser getAggregationLlabel_6002Parser() {
		if (aggregationLlabel_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getLien_Llabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			aggregationLlabel_6002Parser = parser;
		}
		return aggregationLlabel_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser referenceLlabel_6003Parser;

	/**
	* @generated
	*/
	private IParser getReferenceLlabel_6003Parser() {
		if (referenceLlabel_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getLien_Llabel() };
			MessageFormatParser parser = new MessageFormatParser(features);
			referenceLlabel_6003Parser = parser;
		}
		return referenceLlabel_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser confluentTransitionCtname_6004Parser;

	/**
	* @generated
	*/
	private IParser getConfluentTransitionCtname_6004Parser() {
		if (confluentTransitionCtname_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getConfluentTransition_Ctname() };
			MessageFormatParser parser = new MessageFormatParser(features);
			confluentTransitionCtname_6004Parser = parser;
		}
		return confluentTransitionCtname_6004Parser;
	}

	/**
	* @generated
	*/
	private IParser internalTransitionItname_6005Parser;

	/**
	* @generated
	*/
	private IParser getInternalTransitionItname_6005Parser() {
		if (internalTransitionItname_6005Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getInternalTransition_Itname() };
			MessageFormatParser parser = new MessageFormatParser(features);
			internalTransitionItname_6005Parser = parser;
		}
		return internalTransitionItname_6005Parser;
	}

	/**
	* @generated
	*/
	private IParser externalTransitionEtname_6006Parser;

	/**
	* @generated
	*/
	private IParser getExternalTransitionEtname_6006Parser() {
		if (externalTransitionEtname_6006Parser == null) {
			EAttribute[] features = new EAttribute[] { HillsPackage.eINSTANCE.getExternalTransition_Etname() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalTransitionEtname_6006Parser = parser;
		}
		return externalTransitionEtname_6006Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case HSystemNtimeEditPart.VISUAL_ID:
			return getHSystemNtime_5017Parser();
		case HClassNtimeEditPart.VISUAL_ID:
			return getHClassNtime_5020Parser();
		case GenericNodeNtimeEditPart.VISUAL_ID:
			return getGenericNodeNtime_5021Parser();
		case HRequirementSpecificationNtimeEditPart.VISUAL_ID:
			return getHRequirementSpecificationNtime_5026Parser();
		case FiniteConfigurationLibelleEditPart.VISUAL_ID:
			return getFiniteConfigurationLibelle_5004Parser();
		case PropertyPrname1EditPart.VISUAL_ID:
			return getPropertyPrname1_5001Parser();
		case PortDeclarationPdeclarationEditPart.VISUAL_ID:
			return getPortDeclarationPdeclaration_5027Parser();
		case ActivityAcname1EditPart.VISUAL_ID:
			return getActivityAcname1_5002Parser();
		case PortDeclarationPdeclaration2EditPart.VISUAL_ID:
			return getPortDeclarationPdeclaration_5028Parser();
		case SojournTimeStimeEditPart.VISUAL_ID:
			return getSojournTimeStime_5003Parser();
		case InitialConfigurationLibelleEditPart.VISUAL_ID:
			return getInitialConfigurationLibelle_5005Parser();
		case PassiveConfigurationLibelleEditPart.VISUAL_ID:
			return getPassiveConfigurationLibelle_5008Parser();
		case PropertyPrname12EditPart.VISUAL_ID:
			return getPropertyPrname1_5006Parser();
		case ActivityAcname12EditPart.VISUAL_ID:
			return getActivityAcname1_5007Parser();
		case TransientConfigurationLibelleEditPart.VISUAL_ID:
			return getTransientConfigurationLibelle_5011Parser();
		case PropertyPrname13EditPart.VISUAL_ID:
			return getPropertyPrname1_5009Parser();
		case ActivityAcname13EditPart.VISUAL_ID:
			return getActivityAcname1_5010Parser();
		case TestNodeTtimeEditPart.VISUAL_ID:
			return getTestNodeTtime_5012Parser();
		case PortPnameEditPart.VISUAL_ID:
			return getPortPname_5013Parser();
		case PortDeclarationPdeclaration3EditPart.VISUAL_ID:
			return getPortDeclarationPdeclaration_5029Parser();
		case DeclarationEnameEditPart.VISUAL_ID:
			return getDeclarationEname_5015Parser();
		case FunctionFnameEditPart.VISUAL_ID:
			return getFunctionFname_5016Parser();
		case PortDeclarationPdeclaration4EditPart.VISUAL_ID:
			return getPortDeclarationPdeclaration_5030Parser();
		case DeclarationEname2EditPart.VISUAL_ID:
			return getDeclarationEname_5018Parser();
		case FunctionFname2EditPart.VISUAL_ID:
			return getFunctionFname_5019Parser();
		case BExistenceBenameEditPart.VISUAL_ID:
			return getBExistenceBename_5022Parser();
		case UExistenceUenameEditPart.VISUAL_ID:
			return getUExistenceUename_5023Parser();
		case EExistenceEenameEditPart.VISUAL_ID:
			return getEExistenceEename_5024Parser();
		case CAbsenceCanameEditPart.VISUAL_ID:
			return getCAbsenceCaname_5025Parser();
		case CompositionLlabelEditPart.VISUAL_ID:
			return getCompositionLlabel_6001Parser();
		case AggregationLlabelEditPart.VISUAL_ID:
			return getAggregationLlabel_6002Parser();
		case ReferenceLlabelEditPart.VISUAL_ID:
			return getReferenceLlabel_6003Parser();
		case ConfluentTransitionCtnameEditPart.VISUAL_ID:
			return getConfluentTransitionCtname_6004Parser();
		case InternalTransitionItnameEditPart.VISUAL_ID:
			return getInternalTransitionItname_6005Parser();
		case ExternalTransitionEtnameEditPart.VISUAL_ID:
			return getExternalTransitionEtname_6006Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(HillsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(HillsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (HillsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
