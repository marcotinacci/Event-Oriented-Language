/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getName <em>Name</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getVariableAssign()
 * @model
 * @generated
 */
public interface VariableAssign extends Command
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getVariableAssign_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getVariableAssign_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // VariableAssign
