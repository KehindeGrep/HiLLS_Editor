/*
 * 
 */
package hills.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import hills.diagram.edit.policies.HSystemCanonicalEditPolicy;
import hills.diagram.edit.policies.HSystemItemSemanticEditPolicy;
import hills.diagram.edit.policies.OpenDiagramEditPolicy;
import hills.diagram.part.HillsVisualIDRegistry;

/**
 * @generated
 */
public class HSystemEditPart extends AbstractBorderedShapeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2001;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public HSystemEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(HillsVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new HSystemItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new HSystemCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (HillsVisualIDRegistry.getVisualID(childView)) {
				case PortEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new HSystemFigure();
	}

	/**
	* @generated
	*/
	public HSystemFigure getPrimaryShape() {
		return (HSystemFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HSystemNtimeEditPart) {
			((HSystemNtimeEditPart) childEditPart).setLabel(getPrimaryShape().getFigureHSystemLabelFigure());
			return true;
		}
		if (childEditPart instanceof HSystemHSystemDeclaratiosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getHSystemDeclaratiosCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((HSystemHSystemDeclaratiosCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof HSystemHSystemFonctionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getHSystemFonctionsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((HSystemHSystemFonctionsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof HSystemHSystemConfigurationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getHSystemConfigurationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((HSystemHSystemConfigurationsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(((PortEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HSystemNtimeEditPart) {
			return true;
		}
		if (childEditPart instanceof HSystemHSystemDeclaratiosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getHSystemDeclaratiosCompartmentFigure();
			pane.remove(((HSystemHSystemDeclaratiosCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof HSystemHSystemFonctionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getHSystemFonctionsCompartmentFigure();
			pane.remove(((HSystemHSystemFonctionsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof HSystemHSystemConfigurationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getHSystemConfigurationsCompartmentFigure();
			pane.remove(((HSystemHSystemConfigurationsCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PortEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((PortEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof HSystemHSystemDeclaratiosCompartmentEditPart) {
			return getPrimaryShape().getHSystemDeclaratiosCompartmentFigure();
		}
		if (editPart instanceof HSystemHSystemFonctionsCompartmentEditPart) {
			return getPrimaryShape().getHSystemFonctionsCompartmentFigure();
		}
		if (editPart instanceof HSystemHSystemConfigurationsCompartmentEditPart) {
			return getPrimaryShape().getHSystemConfigurationsCompartmentFigure();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(200, 300);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(HillsVisualIDRegistry.getType(HSystemNtimeEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class HSystemFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHSystemLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fHSystemDeclaratiosCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fHSystemFonctionsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fHSystemConfigurationsCompartmentFigure;

		/**
		 * @generated
		 */
		public HSystemFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(THIS_FORE);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(200), getMapMode().DPtoLP(300)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureHSystemLabelFigure = new WrappingLabel();

			fFigureHSystemLabelFigure.setText("HSystem");
			fFigureHSystemLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureHSystemLabelFigure);

			fHSystemDeclaratiosCompartmentFigure = new RectangleFigure();

			fHSystemDeclaratiosCompartmentFigure.setOutline(false);

			this.add(fHSystemDeclaratiosCompartmentFigure);

			fHSystemFonctionsCompartmentFigure = new RectangleFigure();

			fHSystemFonctionsCompartmentFigure.setOutline(false);

			this.add(fHSystemFonctionsCompartmentFigure);

			fHSystemConfigurationsCompartmentFigure = new RectangleFigure();

			fHSystemConfigurationsCompartmentFigure.setOutline(false);

			this.add(fHSystemConfigurationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHSystemLabelFigure() {
			return fFigureHSystemLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getHSystemDeclaratiosCompartmentFigure() {
			return fHSystemDeclaratiosCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getHSystemFonctionsCompartmentFigure() {
			return fHSystemFonctionsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getHSystemConfigurationsCompartmentFigure() {
			return fHSystemConfigurationsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
