/**
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.hwMapDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.Range#getLeft <em>Left</em>}</li>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.Range#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' attribute.
   * @see #setLeft(int)
   * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getRange_Left()
   * @model
   * @generated
   */
  int getLeft();

  /**
   * Sets the value of the '{@link org.chabu.hwmap.hwMapDsl.Range#getLeft <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' attribute.
   * @see #getLeft()
   * @generated
   */
  void setLeft(int value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(int)
   * @see org.chabu.hwmap.hwMapDsl.HwMapDslPackage#getRange_Right()
   * @model
   * @generated
   */
  int getRight();

  /**
   * Sets the value of the '{@link org.chabu.hwmap.hwMapDsl.Range#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(int value);

} // Range
