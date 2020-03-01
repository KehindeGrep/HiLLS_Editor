
/*
 * 
 */
package hills.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import hills.diagram.providers.HillsElementTypes;

/**
 * @generated
 */
public class HillsPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
		paletteRoot.add(createTemporalLogic3Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActivity1CreationTool());
		paletteContainer.add(createDeclaration2CreationTool());
		paletteContainer.add(createFiniteConfiguration3CreationTool());
		paletteContainer.add(createFunction4CreationTool());
		paletteContainer.add(createGenericNode5CreationTool());
		paletteContainer.add(createHClass6CreationTool());
		paletteContainer.add(createHRequirementSpecification7CreationTool());
		paletteContainer.add(createHSystem8CreationTool());
		paletteContainer.add(createInitialConfiguration9CreationTool());
		paletteContainer.add(createPassiveConfiguration10CreationTool());
		paletteContainer.add(createPort11CreationTool());
		paletteContainer.add(createPortDeclaration12CreationTool());
		paletteContainer.add(createProperty13CreationTool());
		paletteContainer.add(createSojournTime14CreationTool());
		paletteContainer.add(createTestNode15CreationTool());
		paletteContainer.add(createTransientConfiguration16CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAggregation1CreationTool());
		paletteContainer.add(createComposition2CreationTool());
		paletteContainer.add(createConfluentTransition3CreationTool());
		paletteContainer.add(createExternalTransition4CreationTool());
		paletteContainer.add(createInternalTransition5CreationTool());
		paletteContainer.add(createReference6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "TemporalLogic" palette tool group
	* @generated
	*/
	private PaletteContainer createTemporalLogic3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.TemporalLogic3Group_title);
		paletteContainer.setId("createTemporalLogic3Group"); //$NON-NLS-1$
		paletteContainer.add(createUExistence1CreationTool());
		paletteContainer.add(createBExistence2CreationTool());
		paletteContainer.add(createEExistence3CreationTool());
		paletteContainer.add(createCAbsence4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActivity1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(HillsElementTypes.Activity_3003);
		types.add(HillsElementTypes.Activity_3008);
		types.add(HillsElementTypes.Activity_3011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Activity1CreationTool_title,
				Messages.Activity1CreationTool_desc, types);
		entry.setId("createActivity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.Activity_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeclaration2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HillsElementTypes.Declaration_3014);
		types.add(HillsElementTypes.Declaration_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Declaration2CreationTool_title,
				Messages.Declaration2CreationTool_desc, types);
		entry.setId("createDeclaration2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.Declaration_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFiniteConfiguration3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FiniteConfiguration3CreationTool_title,
				Messages.FiniteConfiguration3CreationTool_desc,
				Collections.singletonList(HillsElementTypes.FiniteConfiguration_3001));
		entry.setId("createFiniteConfiguration3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.FiniteConfiguration_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFunction4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(HillsElementTypes.Function_3015);
		types.add(HillsElementTypes.Function_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Function4CreationTool_title,
				Messages.Function4CreationTool_desc, types);
		entry.setId("createFunction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.Function_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGenericNode5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.GenericNode5CreationTool_title,
				Messages.GenericNode5CreationTool_desc, Collections.singletonList(HillsElementTypes.GenericNode_2003));
		entry.setId("createGenericNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.GenericNode_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHClass6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HClass6CreationTool_title,
				Messages.HClass6CreationTool_desc, Collections.singletonList(HillsElementTypes.HClass_2002));
		entry.setId("createHClass6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.HClass_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHRequirementSpecification7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HRequirementSpecification7CreationTool_title,
				Messages.HRequirementSpecification7CreationTool_desc,
				Collections.singletonList(HillsElementTypes.HRequirementSpecification_2004));
		entry.setId("createHRequirementSpecification7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.HRequirementSpecification_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHSystem8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.HSystem8CreationTool_title,
				Messages.HSystem8CreationTool_desc, Collections.singletonList(HillsElementTypes.HSystem_2001));
		entry.setId("createHSystem8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.HSystem_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInitialConfiguration9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InitialConfiguration9CreationTool_title,
				Messages.InitialConfiguration9CreationTool_desc,
				Collections.singletonList(HillsElementTypes.InitialConfiguration_3005));
		entry.setId("createInitialConfiguration9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.InitialConfiguration_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPassiveConfiguration10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PassiveConfiguration10CreationTool_title,
				Messages.PassiveConfiguration10CreationTool_desc,
				Collections.singletonList(HillsElementTypes.PassiveConfiguration_3006));
		entry.setId("createPassiveConfiguration10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.PassiveConfiguration_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPort11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Port11CreationTool_title,
				Messages.Port11CreationTool_desc, Collections.singletonList(HillsElementTypes.Port_3013));
		entry.setId("createPort11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.Port_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPortDeclaration12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(HillsElementTypes.PortDeclaration_3022);
		types.add(HillsElementTypes.PortDeclaration_3023);
		types.add(HillsElementTypes.PortDeclaration_3024);
		types.add(HillsElementTypes.PortDeclaration_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PortDeclaration12CreationTool_title,
				Messages.PortDeclaration12CreationTool_desc, types);
		entry.setId("createPortDeclaration12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.PortDeclaration_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProperty13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(HillsElementTypes.Property_3002);
		types.add(HillsElementTypes.Property_3007);
		types.add(HillsElementTypes.Property_3010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Property13CreationTool_title,
				Messages.Property13CreationTool_desc, types);
		entry.setId("createProperty13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.Property_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSojournTime14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SojournTime14CreationTool_title,
				Messages.SojournTime14CreationTool_desc, Collections.singletonList(HillsElementTypes.SojournTime_3004));
		entry.setId("createSojournTime14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.SojournTime_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTestNode15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TestNode15CreationTool_title,
				Messages.TestNode15CreationTool_desc, Collections.singletonList(HillsElementTypes.TestNode_3012));
		entry.setId("createTestNode15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.TestNode_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransientConfiguration16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TransientConfiguration16CreationTool_title,
				Messages.TransientConfiguration16CreationTool_desc,
				Collections.singletonList(HillsElementTypes.TransientConfiguration_3009));
		entry.setId("createTransientConfiguration16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.TransientConfiguration_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBExistence2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BExistence2CreationTool_title,
				Messages.BExistence2CreationTool_desc, Collections.singletonList(HillsElementTypes.BExistence_3018));
		entry.setId("createBExistence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.BExistence_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEExistence3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EExistence3CreationTool_title,
				Messages.EExistence3CreationTool_desc, Collections.singletonList(HillsElementTypes.EExistence_3020));
		entry.setId("createEExistence3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.EExistence_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCAbsence4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CAbsence4CreationTool_title,
				Messages.CAbsence4CreationTool_desc, Collections.singletonList(HillsElementTypes.CAbsence_3021));
		entry.setId("createCAbsence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.CAbsence_3021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAggregation1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Aggregation1CreationTool_title,
				Messages.Aggregation1CreationTool_desc, Collections.singletonList(HillsElementTypes.Aggregation_4002));
		entry.setId("createAggregation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.Aggregation_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComposition2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Composition2CreationTool_title,
				Messages.Composition2CreationTool_desc, Collections.singletonList(HillsElementTypes.Composition_4001));
		entry.setId("createComposition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.Composition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConfluentTransition3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ConfluentTransition3CreationTool_title,
				Messages.ConfluentTransition3CreationTool_desc,
				Collections.singletonList(HillsElementTypes.ConfluentTransition_4004));
		entry.setId("createConfluentTransition3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.ConfluentTransition_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createExternalTransition4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.ExternalTransition4CreationTool_title,
				Messages.ExternalTransition4CreationTool_desc,
				Collections.singletonList(HillsElementTypes.ExternalTransition_4006));
		entry.setId("createExternalTransition4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.ExternalTransition_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInternalTransition5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.InternalTransition5CreationTool_title,
				Messages.InternalTransition5CreationTool_desc,
				Collections.singletonList(HillsElementTypes.InternalTransition_4005));
		entry.setId("createInternalTransition5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.InternalTransition_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReference6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Reference6CreationTool_title,
				Messages.Reference6CreationTool_desc, Collections.singletonList(HillsElementTypes.Reference_4003));
		entry.setId("createReference6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.Reference_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUExistence1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UExistence1CreationTool_title,
				Messages.UExistence1CreationTool_desc, Collections.singletonList(HillsElementTypes.UExistence_3019));
		entry.setId("createUExistence1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HillsElementTypes.getImageDescriptor(HillsElementTypes.UExistence_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
