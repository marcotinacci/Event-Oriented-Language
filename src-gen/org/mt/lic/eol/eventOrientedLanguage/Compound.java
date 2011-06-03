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
 * A representation of the model object '<em><b>Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.Compound#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getCompound()
 * @model
 * @generated
 */
public interface Compound extends EObject
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getCompound_Body()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getBody();

} // Compound
