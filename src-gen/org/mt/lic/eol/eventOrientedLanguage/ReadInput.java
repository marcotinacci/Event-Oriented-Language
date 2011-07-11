/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.ReadInput#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getReadInput()
 * @model
 * @generated
 */
public interface ReadInput extends Command
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' reference.
   * @see #setInput(VariableDeclaration)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getReadInput_Input()
   * @model
   * @generated
   */
  VariableDeclaration getInput();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.ReadInput#getInput <em>Input</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' reference.
   * @see #getInput()
   * @generated
   */
  void setInput(VariableDeclaration value);

} // ReadInput
