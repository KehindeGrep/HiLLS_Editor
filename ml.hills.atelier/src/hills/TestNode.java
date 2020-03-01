/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.TestNode#getTtime <em>Ttime</em>}</li>
 *   <li>{@link hills.TestNode#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getTestNode()
 * @model annotation="gmf.node label='ttime' label.icon='false' figure='org.eclipse.gmf.runtime.gef.ui.internal.figures.DiamondFigure' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface TestNode extends Configuration {
	/**
	 * Returns the value of the '<em><b>Ttime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttime</em>' attribute.
	 * @see #setTtime(String)
	 * @see hills.HillsPackage#getTestNode_Ttime()
	 * @model
	 * @generated
	 */
	String getTtime();

	/**
	 * Sets the value of the '{@link hills.TestNode#getTtime <em>Ttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttime</em>' attribute.
	 * @see #getTtime()
	 * @generated
	 */
	void setTtime(String value);

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contenu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see hills.HillsPackage#getTestNode_Contenu()
	 * @model annotation="emf.gen propertyMultiline='true'"
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link hills.TestNode#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

} // TestNode
