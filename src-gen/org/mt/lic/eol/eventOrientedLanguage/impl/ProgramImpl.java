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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.EventSection;
import org.mt.lic.eol.eventOrientedLanguage.GlobalSection;
import org.mt.lic.eol.eventOrientedLanguage.HandlerSection;
import org.mt.lic.eol.eventOrientedLanguage.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.ProgramImpl#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.ProgramImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.ProgramImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.ProgramImpl#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
{
  /**
   * The cached value of the '{@link #getGlobals() <em>Globals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobals()
   * @generated
   * @ordered
   */
  protected GlobalSection globals;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EventSection events;

  /**
   * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlers()
   * @generated
   * @ordered
   */
  protected HandlerSection handlers;

  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected AbstractBlock init;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
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
    return EventOrientedLanguagePackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalSection getGlobals()
  {
    return globals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGlobals(GlobalSection newGlobals, NotificationChain msgs)
  {
    GlobalSection oldGlobals = globals;
    globals = newGlobals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.PROGRAM__GLOBALS, oldGlobals, newGlobals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGlobals(GlobalSection newGlobals)
  {
    if (newGlobals != globals)
    {
      NotificationChain msgs = null;
      if (globals != null)
        msgs = ((InternalEObject)globals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.PROGRAM__GLOBALS, null, msgs);
      if (newGlobals != null)
        msgs = ((InternalEObject)newGlobals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.PROGRAM__GLOBALS, null, msgs);
      msgs = basicSetGlobals(newGlobals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.PROGRAM__GLOBALS, newGlobals, newGlobals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSection getEvents()
  {
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvents(EventSection newEvents, NotificationChain msgs)
  {
    EventSection oldEvents = events;
    events = newEvents;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.PROGRAM__EVENTS, oldEvents, newEvents);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvents(EventSection newEvents)
  {
    if (newEvents != events)
    {
      NotificationChain msgs = null;
      if (events != null)
        msgs = ((InternalEObject)events).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.PROGRAM__EVENTS, null, msgs);
      if (newEvents != null)
        msgs = ((InternalEObject)newEvents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.PROGRAM__EVENTS, null, msgs);
      msgs = basicSetEvents(newEvents, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.PROGRAM__EVENTS, newEvents, newEvents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandlerSection getHandlers()
  {
    return handlers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHandlers(HandlerSection newHandlers, NotificationChain msgs)
  {
    HandlerSection oldHandlers = handlers;
    handlers = newHandlers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.PROGRAM__HANDLERS, oldHandlers, newHandlers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandlers(HandlerSection newHandlers)
  {
    if (newHandlers != handlers)
    {
      NotificationChain msgs = null;
      if (handlers != null)
        msgs = ((InternalEObject)handlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.PROGRAM__HANDLERS, null, msgs);
      if (newHandlers != null)
        msgs = ((InternalEObject)newHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.PROGRAM__HANDLERS, null, msgs);
      msgs = basicSetHandlers(newHandlers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.PROGRAM__HANDLERS, newHandlers, newHandlers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractBlock getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(AbstractBlock newInit, NotificationChain msgs)
  {
    AbstractBlock oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.PROGRAM__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit(AbstractBlock newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.PROGRAM__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.PROGRAM__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.PROGRAM__INIT, newInit, newInit));
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
      case EventOrientedLanguagePackage.PROGRAM__GLOBALS:
        return basicSetGlobals(null, msgs);
      case EventOrientedLanguagePackage.PROGRAM__EVENTS:
        return basicSetEvents(null, msgs);
      case EventOrientedLanguagePackage.PROGRAM__HANDLERS:
        return basicSetHandlers(null, msgs);
      case EventOrientedLanguagePackage.PROGRAM__INIT:
        return basicSetInit(null, msgs);
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
      case EventOrientedLanguagePackage.PROGRAM__GLOBALS:
        return getGlobals();
      case EventOrientedLanguagePackage.PROGRAM__EVENTS:
        return getEvents();
      case EventOrientedLanguagePackage.PROGRAM__HANDLERS:
        return getHandlers();
      case EventOrientedLanguagePackage.PROGRAM__INIT:
        return getInit();
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
      case EventOrientedLanguagePackage.PROGRAM__GLOBALS:
        setGlobals((GlobalSection)newValue);
        return;
      case EventOrientedLanguagePackage.PROGRAM__EVENTS:
        setEvents((EventSection)newValue);
        return;
      case EventOrientedLanguagePackage.PROGRAM__HANDLERS:
        setHandlers((HandlerSection)newValue);
        return;
      case EventOrientedLanguagePackage.PROGRAM__INIT:
        setInit((AbstractBlock)newValue);
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
      case EventOrientedLanguagePackage.PROGRAM__GLOBALS:
        setGlobals((GlobalSection)null);
        return;
      case EventOrientedLanguagePackage.PROGRAM__EVENTS:
        setEvents((EventSection)null);
        return;
      case EventOrientedLanguagePackage.PROGRAM__HANDLERS:
        setHandlers((HandlerSection)null);
        return;
      case EventOrientedLanguagePackage.PROGRAM__INIT:
        setInit((AbstractBlock)null);
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
      case EventOrientedLanguagePackage.PROGRAM__GLOBALS:
        return globals != null;
      case EventOrientedLanguagePackage.PROGRAM__EVENTS:
        return events != null;
      case EventOrientedLanguagePackage.PROGRAM__HANDLERS:
        return handlers != null;
      case EventOrientedLanguagePackage.PROGRAM__INIT:
        return init != null;
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
