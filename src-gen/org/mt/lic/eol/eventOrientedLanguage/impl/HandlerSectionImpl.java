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

import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.HandlerSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerSectionImpl#getHandlers <em>Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandlerSectionImpl extends MinimalEObjectImpl.Container implements HandlerSection
{
  /**
   * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandlers()
   * @generated
   * @ordered
   */
  protected EList<HandlerDecl> handlers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HandlerSectionImpl()
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
    return EventOrientedLanguagePackage.Literals.HANDLER_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HandlerDecl> getHandlers()
  {
    if (handlers == null)
    {
      handlers = new EObjectContainmentEList<HandlerDecl>(HandlerDecl.class, this, EventOrientedLanguagePackage.HANDLER_SECTION__HANDLERS);
    }
    return handlers;
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
      case EventOrientedLanguagePackage.HANDLER_SECTION__HANDLERS:
        return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
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
      case EventOrientedLanguagePackage.HANDLER_SECTION__HANDLERS:
        return getHandlers();
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
      case EventOrientedLanguagePackage.HANDLER_SECTION__HANDLERS:
        getHandlers().clear();
        getHandlers().addAll((Collection<? extends HandlerDecl>)newValue);
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
      case EventOrientedLanguagePackage.HANDLER_SECTION__HANDLERS:
        getHandlers().clear();
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
      case EventOrientedLanguagePackage.HANDLER_SECTION__HANDLERS:
        return handlers != null && !handlers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //HandlerSectionImpl
