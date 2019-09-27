/**
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.hwMapDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.Instantiation#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.Instantiation#getType <em>Type</em>}</li>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.Instantiation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getInstantiation()
 * @model
 * @generated
 */
public interface Instantiation extends EObject
{
  /**
   * Returns the value of the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr</em>' attribute.
   * @see #setAddr(Integer)
   * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getInstantiation_Addr()
   * @model
   * @generated
   */
  Integer getAddr();

  /**
   * Sets the value of the '{@link org.chabu.hwmap.hwMapDsl.Instantiation#getAddr <em>Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr</em>' attribute.
   * @see #getAddr()
   * @generated
   */
  void setAddr(Integer value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getInstantiation_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.chabu.hwmap.hwMapDsl.Instantiation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getInstantiation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.chabu.hwmap.hwMapDsl.Instantiation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Instantiation
