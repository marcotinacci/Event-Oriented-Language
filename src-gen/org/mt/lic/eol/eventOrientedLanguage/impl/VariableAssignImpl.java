/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.Expression;
import org.mt.lic.eol.eventOrientedLanguage.VariableAssign;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Assign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableAssignImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableAssignImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableAssignImpl extends CommandImpl implements VariableAssign
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected VariableDeclaration name;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableAssignImpl()
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
    return EventOrientedLanguagePackage.Literals.VARIABLE_ASSIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (VariableDeclaration)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventOrientedLanguagePackage.VARIABLE_ASSIGN__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(VariableDeclaration newName)
  {
    VariableDeclaration oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.VARIABLE_ASSIGN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE, newValue, newValue));
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
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE:
        return basicSetValue(null, msgs);
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
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__NAME:
        if (resolve) return getName();
        return basicGetName();
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__NAME:
        setName((VariableDeclaration)newValue);
        return;
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE:
        setValue((Expression)newValue);
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
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__NAME:
        setName((VariableDeclaration)null);
        return;
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE:
        setValue((Expression)null);
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
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__NAME:
        return name != null;
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableAssignImpl
