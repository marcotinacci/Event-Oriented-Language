/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bind Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#getHandlerName <em>Handler Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getBindHandler()
 * @model
 * @generated
 */
public interface BindHandler extends Command
{
  /**
   * Returns the value of the '<em><b>Event Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Name</em>' attribute.
   * @see #setEventName(String)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getBindHandler_EventName()
   * @model
   * @generated
   */
  String getEventName();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#getEventName <em>Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Name</em>' attribute.
   * @see #getEventName()
   * @generated
   */
  void setEventName(String value);

  /**
   * Returns the value of the '<em><b>Handler Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handler Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handler Name</em>' attribute.
   * @see #setHandlerName(String)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getBindHandler_HandlerName()
   * @model
   * @generated
   */
  String getHandlerName();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#getHandlerName <em>Handler Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handler Name</em>' attribute.
   * @see #getHandlerName()
   * @generated
   */
  void setHandlerName(String value);

} // BindHandler
