/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unbind Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.UnbindHandler#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.UnbindHandler#getHandlerName <em>Handler Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getUnbindHandler()
 * @model
 * @generated
 */
public interface UnbindHandler extends Command
{
  /**
   * Returns the value of the '<em><b>Event Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Name</em>' reference.
   * @see #setEventName(EventDecl)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getUnbindHandler_EventName()
   * @model
   * @generated
   */
  EventDecl getEventName();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.UnbindHandler#getEventName <em>Event Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Name</em>' reference.
   * @see #getEventName()
   * @generated
   */
  void setEventName(EventDecl value);

  /**
   * Returns the value of the '<em><b>Handler Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handler Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handler Name</em>' reference.
   * @see #setHandlerName(HandlerDecl)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getUnbindHandler_HandlerName()
   * @model
   * @generated
   */
  HandlerDecl getHandlerName();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.UnbindHandler#getHandlerName <em>Handler Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handler Name</em>' reference.
   * @see #getHandlerName()
   * @generated
   */
  void setHandlerName(HandlerDecl value);

} // UnbindHandler
