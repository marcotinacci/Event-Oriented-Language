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
import org.mt.lic.eol.eventOrientedLanguage.GlobalSection;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.GlobalSectionImpl#getGlobals <em>Globals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalSectionImpl extends MinimalEObjectImpl.Container implements GlobalSection
{
  /**
   * The cached value of the '{@link #getGlobals() <em>Globals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGlobals()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> globals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GlobalSectionImpl()
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
    return EventOrientedLanguagePackage.Literals.GLOBAL_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getGlobals()
  {
    if (globals == null)
    {
      globals = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, EventOrientedLanguagePackage.GLOBAL_SECTION__GLOBALS);
    }
    return globals;
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
      case EventOrientedLanguagePackage.GLOBAL_SECTION__GLOBALS:
        return ((InternalEList<?>)getGlobals()).basicRemove(otherEnd, msgs);
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
      case EventOrientedLanguagePackage.GLOBAL_SECTION__GLOBALS:
        return getGlobals();
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
      case EventOrientedLanguagePackage.GLOBAL_SECTION__GLOBALS:
        getGlobals().clear();
        getGlobals().addAll((Collection<? extends VariableDeclaration>)newValue);
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
      case EventOrientedLanguagePackage.GLOBAL_SECTION__GLOBALS:
        getGlobals().clear();
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
      case EventOrientedLanguagePackage.GLOBAL_SECTION__GLOBALS:
        return globals != null && !globals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GlobalSectionImpl
