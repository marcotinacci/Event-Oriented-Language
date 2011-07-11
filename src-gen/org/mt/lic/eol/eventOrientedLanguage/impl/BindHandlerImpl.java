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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mt.lic.eol.eventOrientedLanguage.BindHandler;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.Expression;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.BindHandlerImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.BindHandlerImpl#getHandlerName <em>Handler Name</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.BindHandlerImpl#getBindParams <em>Bind Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindHandlerImpl extends CommandImpl implements BindHandler
{
  /**
   * The cached value of the '{@link #getEventName() <em>Event Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventName()
   * @generated
   * @ordered
   */
  protected EventDecl eventName;

  /**
   * The cached value of the '{@link #getHandlerName() <em>Handler Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlerName()
   * @generated
   * @ordered
   */
  protected HandlerDecl handlerName;

  /**
   * The cached value of the '{@link #getBindParams() <em>Bind Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindParams()
   * @generated
   * @ordered
   */
  protected EList<Expression> bindParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindHandlerImpl()
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
    return EventOrientedLanguagePackage.Literals.BIND_HANDLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDecl getEventName()
  {
    if (eventName != null && eventName.eIsProxy())
    {
      InternalEObject oldEventName = (InternalEObject)eventName;
      eventName = (EventDecl)eResolveProxy(oldEventName);
      if (eventName != oldEventName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventOrientedLanguagePackage.BIND_HANDLER__EVENT_NAME, oldEventName, eventName));
      }
    }
    return eventName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDecl basicGetEventName()
  {
    return eventName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventName(EventDecl newEventName)
  {
    EventDecl oldEventName = eventName;
    eventName = newEventName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.BIND_HANDLER__EVENT_NAME, oldEventName, eventName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandlerDecl getHandlerName()
  {
    if (handlerName != null && handlerName.eIsProxy())
    {
      InternalEObject oldHandlerName = (InternalEObject)handlerName;
      handlerName = (HandlerDecl)eResolveProxy(oldHandlerName);
      if (handlerName != oldHandlerName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EventOrientedLanguagePackage.BIND_HANDLER__HANDLER_NAME, oldHandlerName, handlerName));
      }
    }
    return handlerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandlerDecl basicGetHandlerName()
  {
    return handlerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandlerName(HandlerDecl newHandlerName)
  {
    HandlerDecl oldHandlerName = handlerName;
    handlerName = newHandlerName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.BIND_HANDLER__HANDLER_NAME, oldHandlerName, handlerName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getBindParams()
  {
    if (bindParams == null)
    {
      bindParams = new EObjectContainmentEList<Expression>(Expression.class, this, EventOrientedLanguagePackage.BIND_HANDLER__BIND_PARAMS);
    }
    return bindParams;
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
      case EventOrientedLanguagePackage.BIND_HANDLER__BIND_PARAMS:
        return ((InternalEList<?>)getBindParams()).basicRemove(otherEnd, msgs);
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
      case EventOrientedLanguagePackage.BIND_HANDLER__EVENT_NAME:
        if (resolve) return getEventName();
        return basicGetEventName();
      case EventOrientedLanguagePackage.BIND_HANDLER__HANDLER_NAME:
        if (resolve) return getHandlerName();
        return basicGetHandlerName();
      case EventOrientedLanguagePackage.BIND_HANDLER__BIND_PARAMS:
        return getBindParams();
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
      case EventOrientedLanguagePackage.BIND_HANDLER__EVENT_NAME:
        setEventName((EventDecl)newValue);
        return;
      case EventOrientedLanguagePackage.BIND_HANDLER__HANDLER_NAME:
        setHandlerName((HandlerDecl)newValue);
        return;
      case EventOrientedLanguagePackage.BIND_HANDLER__BIND_PARAMS:
        getBindParams().clear();
        getBindParams().addAll((Collection<? extends Expression>)newValue);
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
      case EventOrientedLanguagePackage.BIND_HANDLER__EVENT_NAME:
        setEventName((EventDecl)null);
        return;
      case EventOrientedLanguagePackage.BIND_HANDLER__HANDLER_NAME:
        setHandlerName((HandlerDecl)null);
        return;
      case EventOrientedLanguagePackage.BIND_HANDLER__BIND_PARAMS:
        getBindParams().clear();
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
      case EventOrientedLanguagePackage.BIND_HANDLER__EVENT_NAME:
        return eventName != null;
      case EventOrientedLanguagePackage.BIND_HANDLER__HANDLER_NAME:
        return handlerName != null;
      case EventOrientedLanguagePackage.BIND_HANDLER__BIND_PARAMS:
        return bindParams != null && !bindParams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BindHandlerImpl
