/*
* 
*/
package hills.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import hills.diagram.part.HillsVisualIDRegistry;
import hills.diagram.part.Messages;

/**
 * @generated
 */
public class HillsNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public HillsNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<HillsNavigatorItem> result = new ArrayList<HillsNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, HSpecificationEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof HillsNavigatorGroup) {
			HillsNavigatorGroup group = (HillsNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof HillsNavigatorItem) {
			HillsNavigatorItem navigatorItem = (HillsNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (HillsVisualIDRegistry.getVisualID(view)) {

		case HSpecificationEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			HillsNavigatorGroup links = new HillsNavigatorGroup(Messages.NavigatorGroupName_HSpecification_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(GenericNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HRequirementSpecificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(CompositionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case HSystemEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_HSystem_2001_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			HillsNavigatorGroup outgoinglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_HSystem_2001_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(FiniteConfigurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(InitialConfigurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PassiveConfigurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(TransientConfigurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemHSystemConfigurationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(TestNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemHSystemDeclaratiosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(DeclarationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemHSystemFonctionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(FunctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(CompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(CompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case HClassEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_HClass_2002_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			HillsNavigatorGroup outgoinglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_HClass_2002_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassHClassDeclaratiosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(Declaration2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassHClassFonctionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(Function2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(CompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(CompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GenericNodeEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_GenericNode_2003_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(CompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case HRequirementSpecificationEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_HRequirementSpecification_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry.getType(
					HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(BExistenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry.getType(
					HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(UExistenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry.getType(
					HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(EExistenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry.getType(
					HRequirementSpecificationHRequirementSpecificationTemporalPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(CAbsenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(CompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(AggregationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ReferenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case FiniteConfigurationEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_FiniteConfiguration_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HillsNavigatorGroup outgoinglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_FiniteConfiguration_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry
					.getType(FiniteConfigurationFiniteConfigurationProprietesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry
					.getType(FiniteConfigurationFiniteConfigurationActivitesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(ActivityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry
					.getType(FiniteConfigurationFiniteConfigurationSojTimeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(SojournTimeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PropertyEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PropertyPropertyPpredicatsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclarationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ActivityEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ActivityActivityPpredicatsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclaration2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case InitialConfigurationEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_InitialConfiguration_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HillsNavigatorGroup outgoinglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_InitialConfiguration_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PassiveConfigurationEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_PassiveConfiguration_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HillsNavigatorGroup outgoinglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_PassiveConfiguration_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry
					.getType(PassiveConfigurationPassiveConfigurationProprietesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry
					.getType(PassiveConfigurationPassiveConfigurationActivitesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(Activity2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Property2EditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PropertyPropertyPpredicatsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclarationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Activity2EditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ActivityActivityPpredicatsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclaration2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TransientConfigurationEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_TransientConfiguration_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HillsNavigatorGroup outgoinglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_TransientConfiguration_3009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry
					.getType(TransientConfigurationTransientConfigurationProprietesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv), HillsVisualIDRegistry
					.getType(TransientConfigurationTransientConfigurationActivitesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(Activity3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Property3EditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PropertyPropertyPpredicatsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclarationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Activity3EditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ActivityActivityPpredicatsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclaration2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TestNodeEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			HillsNavigatorGroup incominglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_TestNode_3012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			HillsNavigatorGroup outgoinglinks = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_TestNode_3012_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ConfluentTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(ExternalTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PortEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PortPortEntreePortsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclaration3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case FunctionEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(FunctionFunctionPpredicatsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclaration4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case Function2EditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(FunctionFunctionPpredicatsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					HillsVisualIDRegistry.getType(PortDeclaration4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case CompositionEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HillsNavigatorGroup target = new HillsNavigatorGroup(Messages.NavigatorGroupName_Composition_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HillsNavigatorGroup source = new HillsNavigatorGroup(Messages.NavigatorGroupName_Composition_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(GenericNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HRequirementSpecificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AggregationEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HillsNavigatorGroup target = new HillsNavigatorGroup(Messages.NavigatorGroupName_Aggregation_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HillsNavigatorGroup source = new HillsNavigatorGroup(Messages.NavigatorGroupName_Aggregation_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(GenericNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HRequirementSpecificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ReferenceEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HillsNavigatorGroup target = new HillsNavigatorGroup(Messages.NavigatorGroupName_Reference_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			HillsNavigatorGroup source = new HillsNavigatorGroup(Messages.NavigatorGroupName_Reference_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(GenericNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HRequirementSpecificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HSystemEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(HClassEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ConfluentTransitionEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HillsNavigatorGroup target = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_ConfluentTransition_4004_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			HillsNavigatorGroup source = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_ConfluentTransition_4004_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(FiniteConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InitialConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PassiveConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TransientConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TestNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(FiniteConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InitialConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PassiveConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TransientConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TestNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InternalTransitionEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HillsNavigatorGroup target = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_InternalTransition_4005_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			HillsNavigatorGroup source = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_InternalTransition_4005_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(FiniteConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InitialConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PassiveConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TransientConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TestNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(FiniteConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InitialConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PassiveConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TransientConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TestNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ExternalTransitionEditPart.VISUAL_ID: {
			LinkedList<HillsAbstractNavigatorItem> result = new LinkedList<HillsAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			HillsNavigatorGroup target = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_ExternalTransition_4006_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			HillsNavigatorGroup source = new HillsNavigatorGroup(
					Messages.NavigatorGroupName_ExternalTransition_4006_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(FiniteConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InitialConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PassiveConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TransientConfigurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TestNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(FiniteConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(InitialConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(PassiveConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TransientConfigurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					HillsVisualIDRegistry.getType(TestNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return HSpecificationEditPart.MODEL_ID.equals(HillsVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<HillsNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<HillsNavigatorItem> result = new ArrayList<HillsNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new HillsNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<HillsNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof HillsAbstractNavigatorItem) {
			HillsAbstractNavigatorItem abstractNavigatorItem = (HillsAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
