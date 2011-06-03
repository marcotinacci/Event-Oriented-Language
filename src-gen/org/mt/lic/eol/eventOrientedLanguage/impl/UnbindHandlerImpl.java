/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.UnbindHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unbind Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.UnbindHandlerImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.UnbindHandlerImpl#getHandlerName <em>Handler Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnbindHandlerImpl extends CommandImpl implements UnbindHandler
{
  /**
   * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventName()
   * @generated
   * @ordered
   */
  protected static final String EVENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventName()
   * @generated
   * @ordered
   */
  protected String eventName = EVENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHandlerName() <em>Handler Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlerName()
   * @generated
   * @ordered
   */
  protected static final String HANDLER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHandlerName() <em>Handler Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlerName()
   * @generated
   * @ordered
   */
  protected String handlerName = HANDLER_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnbindHandlerImpl()
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
    return EventOrientedLanguagePackage.Literals.UNBIND_HANDLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEventName()
  {
    return eventName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventName(String newEventName)
  {
    String oldEventName = eventName;
    eventName = newEventName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.UNBIND_HANDLER__EVENT_NAME, oldEventName, eventName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHandlerName()
  {
    return handlerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandlerName(String newHandlerName)
  {
    String oldHandlerName = handlerName;
    handlerName = newHandlerName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.UNBIND_HANDLER__HANDLER_NAME, oldHandlerName, handlerName));
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
      case EventOrientedLanguagePackage.UNBIND_HANDLER__EVENT_NAME:
        return getEventName();
      case EventOrientedLanguagePackage.UNBIND_HANDLER__HANDLER_NAME:
        return getHandlerName();
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
      case EventOrientedLanguagePackage.UNBIND_HANDLER__EVENT_NAME:
        setEventName((String)newValue);
        return;
      case EventOrientedLanguagePackage.UNBIND_HANDLER__HANDLER_NAME:
        setHandlerName((String)newValue);
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
      case EventOrientedLanguagePackage.UNBIND_HANDLER__EVENT_NAME:
        setEventName(EVENT_NAME_EDEFAULT);
        return;
      case EventOrientedLanguagePackage.UNBIND_HANDLER__HANDLER_NAME:
        setHandlerName(HANDLER_NAME_EDEFAULT);
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
      case EventOrientedLanguagePackage.UNBIND_HANDLER__EVENT_NAME:
        return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
      case EventOrientedLanguagePackage.UNBIND_HANDLER__HANDLER_NAME:
        return HANDLER_NAME_EDEFAULT == null ? handlerName != null : !HANDLER_NAME_EDEFAULT.equals(handlerName);
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
    result.append(" (eventName: ");
    result.append(eventName);
    result.append(", handlerName: ");
    result.append(handlerName);
    result.append(')');
    return result.toString();
  }

} //UnbindHandlerImpl
