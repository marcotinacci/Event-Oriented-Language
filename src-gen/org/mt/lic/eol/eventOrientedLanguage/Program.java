/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.Program#getGlobals <em>Globals</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.Program#getEvents <em>Events</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.Program#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.Program#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Globals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Globals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Globals</em>' containment reference.
   * @see #setGlobals(GlobalSection)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getProgram_Globals()
   * @model containment="true"
   * @generated
   */
  GlobalSection getGlobals();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.Program#getGlobals <em>Globals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Globals</em>' containment reference.
   * @see #getGlobals()
   * @generated
   */
  void setGlobals(GlobalSection value);

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference.
   * @see #setEvents(EventSection)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getProgram_Events()
   * @model containment="true"
   * @generated
   */
  EventSection getEvents();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.Program#getEvents <em>Events</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Events</em>' containment reference.
   * @see #getEvents()
   * @generated
   */
  void setEvents(EventSection value);

  /**
   * Returns the value of the '<em><b>Handlers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handlers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handlers</em>' containment reference.
   * @see #setHandlers(HandlerSection)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getProgram_Handlers()
   * @model containment="true"
   * @generated
   */
  HandlerSection getHandlers();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.Program#getHandlers <em>Handlers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handlers</em>' containment reference.
   * @see #getHandlers()
   * @generated
   */
  void setHandlers(HandlerSection value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(AbstractBlock)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getProgram_Init()
   * @model containment="true"
   * @generated
   */
  AbstractBlock getInit();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.Program#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(AbstractBlock value);

} // Program
