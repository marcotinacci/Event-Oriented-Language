/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.Leq#getLeft <em>Left</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.Leq#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getLeq()
 * @model
 * @generated
 */
public interface Leq extends Condition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(MathExpression)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getLeq_Left()
   * @model containment="true"
   * @generated
   */
  MathExpression getLeft();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.Leq#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(MathExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(MathExpression)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getLeq_Right()
   * @model containment="true"
   * @generated
   */
  MathExpression getRight();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.Leq#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(MathExpression value);

} // Leq
