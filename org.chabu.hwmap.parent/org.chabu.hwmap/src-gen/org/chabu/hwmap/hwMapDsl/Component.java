/**
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.hwMapDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.Component#getCompName <em>Comp Name</em>}</li>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.Component#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.Component#getInsts <em>Insts</em>}</li>
 * </ul>
 *
 * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
{
  /**
   * Returns the value of the '<em><b>Comp Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp Name</em>' attribute.
   * @see #setCompName(String)
   * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getComponent_CompName()
   * @model
   * @generated
   */
  String getCompName();

  /**
   * Sets the value of the '{@link org.chabu.hwmap.hwMapDsl.Component#getCompName <em>Comp Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp Name</em>' attribute.
   * @see #getCompName()
   * @generated
   */
  void setCompName(String value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.chabu.hwmap.hwMapDsl.Block}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getComponent_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<Block> getBlocks();

  /**
   * Returns the value of the '<em><b>Insts</b></em>' containment reference list.
   * The list contents are of type {@link org.chabu.hwmap.hwMapDsl.Instantiation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insts</em>' containment reference list.
   * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getComponent_Insts()
   * @model containment="true"
   * @generated
   */
  EList<Instantiation> getInsts();

} // Component
