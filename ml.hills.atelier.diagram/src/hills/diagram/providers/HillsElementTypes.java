/*
 * 
 */
package hills.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import hills.HillsPackage;
import hills.diagram.edit.parts.Activity2EditPart;
import hills.diagram.edit.parts.Activity3EditPart;
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
import hills.diagram.edit.parts.Function2EditPart;
import hills.diagram.edit.parts.FunctionEditPart;
import hills.diagram.edit.parts.GenericNodeEditPart;
import hills.diagram.edit.parts.HClassEditPart;
import hills.diagram.edit.parts.HRequirementSpecificationEditPart;
import hills.diagram.edit.parts.HSpecificationEditPart;
import hills.diagram.edit.parts.HSystemEditPart;
import hills.diagram.edit.parts.InitialConfigurationEditPart;
import hills.diagram.edit.parts.InternalTransitionEditPart;
import hills.diagram.edit.parts.PassiveConfigurationEditPart;
import hills.diagram.edit.parts.PortDeclaration2EditPart;
import hills.diagram.edit.parts.PortDeclaration3EditPart;
import hills.diagram.edit.parts.PortDeclaration4EditPart;
import hills.diagram.edit.parts.PortDeclarationEditPart;
import hills.diagram.edit.parts.PortEditPart;
import hills.diagram.edit.parts.Property2EditPart;
import hills.diagram.edit.parts.Property3EditPart;
import hills.diagram.edit.parts.PropertyEditPart;
import hills.diagram.edit.parts.ReferenceEditPart;
import hills.diagram.edit.parts.SojournTimeEditPart;
import hills.diagram.edit.parts.TestNodeEditPart;
import hills.diagram.edit.parts.TransientConfigurationEditPart;
import hills.diagram.edit.parts.UExistenceEditPart;
import hills.diagram.part.HillsDiagramEditorPlugin;

/**
 * @generated
 */
public class HillsElementTypes {

	/**
	* @generated
	*/
	private HillsElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			HillsDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType HSpecification_1000 = getElementType(
			"ml.hills.atelier.diagram.HSpecification_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HSystem_2001 = getElementType("ml.hills.atelier.diagram.HSystem_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HClass_2002 = getElementType("ml.hills.atelier.diagram.HClass_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType GenericNode_2003 = getElementType("ml.hills.atelier.diagram.GenericNode_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType HRequirementSpecification_2004 = getElementType(
			"ml.hills.atelier.diagram.HRequirementSpecification_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FiniteConfiguration_3001 = getElementType(
			"ml.hills.atelier.diagram.FiniteConfiguration_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Property_3002 = getElementType("ml.hills.atelier.diagram.Property_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PortDeclaration_3022 = getElementType(
			"ml.hills.atelier.diagram.PortDeclaration_3022"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Activity_3003 = getElementType("ml.hills.atelier.diagram.Activity_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PortDeclaration_3023 = getElementType(
			"ml.hills.atelier.diagram.PortDeclaration_3023"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType SojournTime_3004 = getElementType("ml.hills.atelier.diagram.SojournTime_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InitialConfiguration_3005 = getElementType(
			"ml.hills.atelier.diagram.InitialConfiguration_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PassiveConfiguration_3006 = getElementType(
			"ml.hills.atelier.diagram.PassiveConfiguration_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Property_3007 = getElementType("ml.hills.atelier.diagram.Property_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Activity_3008 = getElementType("ml.hills.atelier.diagram.Activity_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TransientConfiguration_3009 = getElementType(
			"ml.hills.atelier.diagram.TransientConfiguration_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Property_3010 = getElementType("ml.hills.atelier.diagram.Property_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Activity_3011 = getElementType("ml.hills.atelier.diagram.Activity_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TestNode_3012 = getElementType("ml.hills.atelier.diagram.TestNode_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Port_3013 = getElementType("ml.hills.atelier.diagram.Port_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PortDeclaration_3024 = getElementType(
			"ml.hills.atelier.diagram.PortDeclaration_3024"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Declaration_3014 = getElementType("ml.hills.atelier.diagram.Declaration_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3015 = getElementType("ml.hills.atelier.diagram.Function_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PortDeclaration_3025 = getElementType(
			"ml.hills.atelier.diagram.PortDeclaration_3025"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Declaration_3016 = getElementType("ml.hills.atelier.diagram.Declaration_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Function_3017 = getElementType("ml.hills.atelier.diagram.Function_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BExistence_3018 = getElementType("ml.hills.atelier.diagram.BExistence_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UExistence_3019 = getElementType("ml.hills.atelier.diagram.UExistence_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EExistence_3020 = getElementType("ml.hills.atelier.diagram.EExistence_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CAbsence_3021 = getElementType("ml.hills.atelier.diagram.CAbsence_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Composition_4001 = getElementType("ml.hills.atelier.diagram.Composition_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Aggregation_4002 = getElementType("ml.hills.atelier.diagram.Aggregation_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Reference_4003 = getElementType("ml.hills.atelier.diagram.Reference_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ConfluentTransition_4004 = getElementType(
			"ml.hills.atelier.diagram.ConfluentTransition_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType InternalTransition_4005 = getElementType(
			"ml.hills.atelier.diagram.InternalTransition_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ExternalTransition_4006 = getElementType(
			"ml.hills.atelier.diagram.ExternalTransition_4006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(HSpecification_1000, HillsPackage.eINSTANCE.getHSpecification());

			elements.put(HSystem_2001, HillsPackage.eINSTANCE.getHSystem());

			elements.put(HClass_2002, HillsPackage.eINSTANCE.getHClass());

			elements.put(GenericNode_2003, HillsPackage.eINSTANCE.getGenericNode());

			elements.put(HRequirementSpecification_2004, HillsPackage.eINSTANCE.getHRequirementSpecification());

			elements.put(FiniteConfiguration_3001, HillsPackage.eINSTANCE.getFiniteConfiguration());

			elements.put(Property_3002, HillsPackage.eINSTANCE.getProperty());

			elements.put(PortDeclaration_3022, HillsPackage.eINSTANCE.getPortDeclaration());

			elements.put(Activity_3003, HillsPackage.eINSTANCE.getActivity());

			elements.put(PortDeclaration_3023, HillsPackage.eINSTANCE.getPortDeclaration());

			elements.put(SojournTime_3004, HillsPackage.eINSTANCE.getSojournTime());

			elements.put(InitialConfiguration_3005, HillsPackage.eINSTANCE.getInitialConfiguration());

			elements.put(PassiveConfiguration_3006, HillsPackage.eINSTANCE.getPassiveConfiguration());

			elements.put(Property_3007, HillsPackage.eINSTANCE.getProperty());

			elements.put(Activity_3008, HillsPackage.eINSTANCE.getActivity());

			elements.put(TransientConfiguration_3009, HillsPackage.eINSTANCE.getTransientConfiguration());

			elements.put(Property_3010, HillsPackage.eINSTANCE.getProperty());

			elements.put(Activity_3011, HillsPackage.eINSTANCE.getActivity());

			elements.put(TestNode_3012, HillsPackage.eINSTANCE.getTestNode());

			elements.put(Port_3013, HillsPackage.eINSTANCE.getPort());

			elements.put(PortDeclaration_3024, HillsPackage.eINSTANCE.getPortDeclaration());

			elements.put(Declaration_3014, HillsPackage.eINSTANCE.getDeclaration());

			elements.put(Function_3015, HillsPackage.eINSTANCE.getFunction());

			elements.put(PortDeclaration_3025, HillsPackage.eINSTANCE.getPortDeclaration());

			elements.put(Declaration_3016, HillsPackage.eINSTANCE.getDeclaration());

			elements.put(Function_3017, HillsPackage.eINSTANCE.getFunction());

			elements.put(BExistence_3018, HillsPackage.eINSTANCE.getBExistence());

			elements.put(UExistence_3019, HillsPackage.eINSTANCE.getUExistence());

			elements.put(EExistence_3020, HillsPackage.eINSTANCE.getEExistence());

			elements.put(CAbsence_3021, HillsPackage.eINSTANCE.getCAbsence());

			elements.put(Composition_4001, HillsPackage.eINSTANCE.getComposition());

			elements.put(Aggregation_4002, HillsPackage.eINSTANCE.getAggregation());

			elements.put(Reference_4003, HillsPackage.eINSTANCE.getReference());

			elements.put(ConfluentTransition_4004, HillsPackage.eINSTANCE.getConfluentTransition());

			elements.put(InternalTransition_4005, HillsPackage.eINSTANCE.getInternalTransition());

			elements.put(ExternalTransition_4006, HillsPackage.eINSTANCE.getExternalTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(HSpecification_1000);
			KNOWN_ELEMENT_TYPES.add(HSystem_2001);
			KNOWN_ELEMENT_TYPES.add(HClass_2002);
			KNOWN_ELEMENT_TYPES.add(GenericNode_2003);
			KNOWN_ELEMENT_TYPES.add(HRequirementSpecification_2004);
			KNOWN_ELEMENT_TYPES.add(FiniteConfiguration_3001);
			KNOWN_ELEMENT_TYPES.add(Property_3002);
			KNOWN_ELEMENT_TYPES.add(PortDeclaration_3022);
			KNOWN_ELEMENT_TYPES.add(Activity_3003);
			KNOWN_ELEMENT_TYPES.add(PortDeclaration_3023);
			KNOWN_ELEMENT_TYPES.add(SojournTime_3004);
			KNOWN_ELEMENT_TYPES.add(InitialConfiguration_3005);
			KNOWN_ELEMENT_TYPES.add(PassiveConfiguration_3006);
			KNOWN_ELEMENT_TYPES.add(Property_3007);
			KNOWN_ELEMENT_TYPES.add(Activity_3008);
			KNOWN_ELEMENT_TYPES.add(TransientConfiguration_3009);
			KNOWN_ELEMENT_TYPES.add(Property_3010);
			KNOWN_ELEMENT_TYPES.add(Activity_3011);
			KNOWN_ELEMENT_TYPES.add(TestNode_3012);
			KNOWN_ELEMENT_TYPES.add(Port_3013);
			KNOWN_ELEMENT_TYPES.add(PortDeclaration_3024);
			KNOWN_ELEMENT_TYPES.add(Declaration_3014);
			KNOWN_ELEMENT_TYPES.add(Function_3015);
			KNOWN_ELEMENT_TYPES.add(PortDeclaration_3025);
			KNOWN_ELEMENT_TYPES.add(Declaration_3016);
			KNOWN_ELEMENT_TYPES.add(Function_3017);
			KNOWN_ELEMENT_TYPES.add(BExistence_3018);
			KNOWN_ELEMENT_TYPES.add(UExistence_3019);
			KNOWN_ELEMENT_TYPES.add(EExistence_3020);
			KNOWN_ELEMENT_TYPES.add(CAbsence_3021);
			KNOWN_ELEMENT_TYPES.add(Composition_4001);
			KNOWN_ELEMENT_TYPES.add(Aggregation_4002);
			KNOWN_ELEMENT_TYPES.add(Reference_4003);
			KNOWN_ELEMENT_TYPES.add(ConfluentTransition_4004);
			KNOWN_ELEMENT_TYPES.add(InternalTransition_4005);
			KNOWN_ELEMENT_TYPES.add(ExternalTransition_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case HSpecificationEditPart.VISUAL_ID:
			return HSpecification_1000;
		case HSystemEditPart.VISUAL_ID:
			return HSystem_2001;
		case HClassEditPart.VISUAL_ID:
			return HClass_2002;
		case GenericNodeEditPart.VISUAL_ID:
			return GenericNode_2003;
		case HRequirementSpecificationEditPart.VISUAL_ID:
			return HRequirementSpecification_2004;
		case FiniteConfigurationEditPart.VISUAL_ID:
			return FiniteConfiguration_3001;
		case PropertyEditPart.VISUAL_ID:
			return Property_3002;
		case PortDeclarationEditPart.VISUAL_ID:
			return PortDeclaration_3022;
		case ActivityEditPart.VISUAL_ID:
			return Activity_3003;
		case PortDeclaration2EditPart.VISUAL_ID:
			return PortDeclaration_3023;
		case SojournTimeEditPart.VISUAL_ID:
			return SojournTime_3004;
		case InitialConfigurationEditPart.VISUAL_ID:
			return InitialConfiguration_3005;
		case PassiveConfigurationEditPart.VISUAL_ID:
			return PassiveConfiguration_3006;
		case Property2EditPart.VISUAL_ID:
			return Property_3007;
		case Activity2EditPart.VISUAL_ID:
			return Activity_3008;
		case TransientConfigurationEditPart.VISUAL_ID:
			return TransientConfiguration_3009;
		case Property3EditPart.VISUAL_ID:
			return Property_3010;
		case Activity3EditPart.VISUAL_ID:
			return Activity_3011;
		case TestNodeEditPart.VISUAL_ID:
			return TestNode_3012;
		case PortEditPart.VISUAL_ID:
			return Port_3013;
		case PortDeclaration3EditPart.VISUAL_ID:
			return PortDeclaration_3024;
		case DeclarationEditPart.VISUAL_ID:
			return Declaration_3014;
		case FunctionEditPart.VISUAL_ID:
			return Function_3015;
		case PortDeclaration4EditPart.VISUAL_ID:
			return PortDeclaration_3025;
		case Declaration2EditPart.VISUAL_ID:
			return Declaration_3016;
		case Function2EditPart.VISUAL_ID:
			return Function_3017;
		case BExistenceEditPart.VISUAL_ID:
			return BExistence_3018;
		case UExistenceEditPart.VISUAL_ID:
			return UExistence_3019;
		case EExistenceEditPart.VISUAL_ID:
			return EExistence_3020;
		case CAbsenceEditPart.VISUAL_ID:
			return CAbsence_3021;
		case CompositionEditPart.VISUAL_ID:
			return Composition_4001;
		case AggregationEditPart.VISUAL_ID:
			return Aggregation_4002;
		case ReferenceEditPart.VISUAL_ID:
			return Reference_4003;
		case ConfluentTransitionEditPart.VISUAL_ID:
			return ConfluentTransition_4004;
		case InternalTransitionEditPart.VISUAL_ID:
			return InternalTransition_4005;
		case ExternalTransitionEditPart.VISUAL_ID:
			return ExternalTransition_4006;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return hills.diagram.providers.HillsElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return hills.diagram.providers.HillsElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return hills.diagram.providers.HillsElementTypes.getElement(elementTypeAdapter);
		}
	};

}
