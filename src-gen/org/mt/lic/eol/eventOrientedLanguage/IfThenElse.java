/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#isBalanced <em>Balanced</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends Construct
{
  /**
   * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Block</em>' containment reference.
   * @see #setThenBlock(AbstractBlock)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getIfThenElse_ThenBlock()
   * @model containment="true"
   * @generated
   */
  AbstractBlock getThenBlock();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getThenBlock <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Block</em>' containment reference.
   * @see #getThenBlock()
   * @generated
   */
  void setThenBlock(AbstractBlock value);

  /**
   * Returns the value of the '<em><b>Balanced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Balanced</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Balanced</em>' attribute.
   * @see #setBalanced(boolean)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getIfThenElse_Balanced()
   * @model
   * @generated
   */
  boolean isBalanced();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#isBalanced <em>Balanced</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Balanced</em>' attribute.
   * @see #isBalanced()
   * @generated
   */
  void setBalanced(boolean value);

  /**
   * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Block</em>' containment reference.
   * @see #setElseBlock(AbstractBlock)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getIfThenElse_ElseBlock()
   * @model containment="true"
   * @generated
   */
  AbstractBlock getElseBlock();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getElseBlock <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Block</em>' containment reference.
   * @see #getElseBlock()
   * @generated
   */
  void setElseBlock(AbstractBlock value);

} // IfThenElse
