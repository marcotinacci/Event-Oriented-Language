/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.EventSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.EventSectionImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventSectionImpl extends MinimalEObjectImpl.Container implements EventSection
{
  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<EventDecl> events;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventSectionImpl()
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
    return EventOrientedLanguagePackage.Literals.EVENT_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventDecl> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<EventDecl>(EventDecl.class, this, EventOrientedLanguagePackage.EVENT_SECTION__EVENTS);
    }
    return events;
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
      case EventOrientedLanguagePackage.EVENT_SECTION__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
      case EventOrientedLanguagePackage.EVENT_SECTION__EVENTS:
        return getEvents();
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
      case EventOrientedLanguagePackage.EVENT_SECTION__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends EventDecl>)newValue);
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
      case EventOrientedLanguagePackage.EVENT_SECTION__EVENTS:
        getEvents().clear();
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
      case EventOrientedLanguagePackage.EVENT_SECTION__EVENTS:
        return events != null && !events.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EventSectionImpl
