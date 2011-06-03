/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.GlobalSection#getGlobals <em>Globals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getGlobalSection()
 * @model
 * @generated
 */
public interface GlobalSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Globals</b></em>' containment reference list.
   * The list contents are of type {@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Globals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Globals</em>' containment reference list.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getGlobalSection_Globals()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getGlobals();

} // GlobalSection
