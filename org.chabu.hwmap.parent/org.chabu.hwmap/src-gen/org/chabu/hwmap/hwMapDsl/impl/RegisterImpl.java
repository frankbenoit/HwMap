/**
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.hwMapDsl.impl;

import java.util.Collection;

import org.chabu.hwmap.hwMapDsl.Constant;
import org.chabu.hwmap.hwMapDsl.HwMapDslPackage;
import org.chabu.hwmap.hwMapDsl.Register;
import org.chabu.hwmap.hwMapDsl.RegisterBits;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.impl.RegisterImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.impl.RegisterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.impl.RegisterImpl#getConsts <em>Consts</em>}</li>
 *   <li>{@link org.chabu.hwmap.hwMapDsl.impl.RegisterImpl#getBits <em>Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterImpl extends MinimalEObjectImpl.Container implements Register
{
  /**
   * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddr()
   * @generated
   * @ordered
   */
  protected static final int ADDR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddr()
   * @generated
   * @ordered
   */
  protected int addr = ADDR_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getConsts() <em>Consts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsts()
   * @generated
   * @ordered
   */
  protected EList<Constant> consts;

  /**
   * The cached value of the '{@link #getBits() <em>Bits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBits()
   * @generated
   * @ordered
   */
  protected EList<RegisterBits> bits;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegisterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HwMapDslPackage.Literals.REGISTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getAddr()
  {
    return addr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAddr(int newAddr)
  {
    int oldAddr = addr;
    addr = newAddr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HwMapDslPackage.REGISTER__ADDR, oldAddr, addr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HwMapDslPackage.REGISTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Constant> getConsts()
  {
    if (consts == null)
    {
      consts = new EObjectContainmentEList<Constant>(Constant.class, this, HwMapDslPackage.REGISTER__CONSTS);
    }
    return consts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RegisterBits> getBits()
  {
    if (bits == null)
    {
      bits = new EObjectContainmentEList<RegisterBits>(RegisterBits.class, this, HwMapDslPackage.REGISTER__BITS);
    }
    return bits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HwMapDslPackage.REGISTER__CONSTS:
        return ((InternalEList<?>)getConsts()).basicRemove(otherEnd, msgs);
      case HwMapDslPackage.REGISTER__BITS:
        return ((InternalEList<?>)getBits()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HwMapDslPackage.REGISTER__ADDR:
        return getAddr();
      case HwMapDslPackage.REGISTER__NAME:
        return getName();
      case HwMapDslPackage.REGISTER__CONSTS:
        return getConsts();
      case HwMapDslPackage.REGISTER__BITS:
        return getBits();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HwMapDslPackage.REGISTER__ADDR:
        setAddr((Integer)newValue);
        return;
      case HwMapDslPackage.REGISTER__NAME:
        setName((String)newValue);
        return;
      case HwMapDslPackage.REGISTER__CONSTS:
        getConsts().clear();
        getConsts().addAll((Collection<? extends Constant>)newValue);
        return;
      case HwMapDslPackage.REGISTER__BITS:
        getBits().clear();
        getBits().addAll((Collection<? extends RegisterBits>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HwMapDslPackage.REGISTER__ADDR:
        setAddr(ADDR_EDEFAULT);
        return;
      case HwMapDslPackage.REGISTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HwMapDslPackage.REGISTER__CONSTS:
        getConsts().clear();
        return;
      case HwMapDslPackage.REGISTER__BITS:
        getBits().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HwMapDslPackage.REGISTER__ADDR:
        return addr != ADDR_EDEFAULT;
      case HwMapDslPackage.REGISTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HwMapDslPackage.REGISTER__CONSTS:
        return consts != null && !consts.isEmpty();
      case HwMapDslPackage.REGISTER__BITS:
        return bits != null && !bits.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (addr: ");
    result.append(addr);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RegisterImpl
