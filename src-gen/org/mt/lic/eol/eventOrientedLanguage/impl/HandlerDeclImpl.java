/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl#getBindParams <em>Bind Params</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerDeclImpl extends MinimalEObjectImpl.Container implements HandlerDecl
{
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
   * The cached value of the '{@link #getBindParams() <em>Bind Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindParams()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> bindParams;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> params;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected AbstractBlock body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HandlerDeclImpl()
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
    return EventOrientedLanguagePackage.Literals.HANDLER_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.HANDLER_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getBindParams()
  {
    if (bindParams == null)
    {
      bindParams = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, EventOrientedLanguagePackage.HANDLER_DECL__BIND_PARAMS);
    }
    return bindParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, EventOrientedLanguagePackage.HANDLER_DECL__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractBlock getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(AbstractBlock newBody, NotificationChain msgs)
  {
    AbstractBlock oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.HANDLER_DECL__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(AbstractBlock newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.HANDLER_DECL__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.HANDLER_DECL__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.HANDLER_DECL__BODY, newBody, newBody));
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
      case EventOrientedLanguagePackage.HANDLER_DECL__BIND_PARAMS:
        return ((InternalEList<?>)getBindParams()).basicRemove(otherEnd, msgs);
      case EventOrientedLanguagePackage.HANDLER_DECL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case EventOrientedLanguagePackage.HANDLER_DECL__BODY:
        return basicSetBody(null, msgs);
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
      case EventOrientedLanguagePackage.HANDLER_DECL__NAME:
        return getName();
      case EventOrientedLanguagePackage.HANDLER_DECL__BIND_PARAMS:
        return getBindParams();
      case EventOrientedLanguagePackage.HANDLER_DECL__PARAMS:
        return getParams();
      case EventOrientedLanguagePackage.HANDLER_DECL__BODY:
        return getBody();
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
      case EventOrientedLanguagePackage.HANDLER_DECL__NAME:
        setName((String)newValue);
        return;
      case EventOrientedLanguagePackage.HANDLER_DECL__BIND_PARAMS:
        getBindParams().clear();
        getBindParams().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case EventOrientedLanguagePackage.HANDLER_DECL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends VariableDeclaration>)newValue);
        return;
      case EventOrientedLanguagePackage.HANDLER_DECL__BODY:
        setBody((AbstractBlock)newValue);
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
      case EventOrientedLanguagePackage.HANDLER_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EventOrientedLanguagePackage.HANDLER_DECL__BIND_PARAMS:
        getBindParams().clear();
        return;
      case EventOrientedLanguagePackage.HANDLER_DECL__PARAMS:
        getParams().clear();
        return;
      case EventOrientedLanguagePackage.HANDLER_DECL__BODY:
        setBody((AbstractBlock)null);
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
      case EventOrientedLanguagePackage.HANDLER_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EventOrientedLanguagePackage.HANDLER_DECL__BIND_PARAMS:
        return bindParams != null && !bindParams.isEmpty();
      case EventOrientedLanguagePackage.HANDLER_DECL__PARAMS:
        return params != null && !params.isEmpty();
      case EventOrientedLanguagePackage.HANDLER_DECL__BODY:
        return body != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //HandlerDeclImpl
