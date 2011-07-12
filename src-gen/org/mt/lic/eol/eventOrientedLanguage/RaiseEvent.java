/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getRaiseEvent()
 * @model
 * @generated
 */
public interface RaiseEvent extends Command
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(EventDecl)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getRaiseEvent_Event()
   * @model
   * @generated
   */
  EventDecl getEvent();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(EventDecl value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.mt.lic.eol.eventOrientedLanguage.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getRaiseEvent_Params()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParams();

} // RaiseEvent
