/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends Command
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.mt.lic.eol.eventOrientedLanguage.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.mt.lic.eol.eventOrientedLanguage.Type
   * @see #setType(Type)
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getVariableDeclaration_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.mt.lic.eol.eventOrientedLanguage.Type
   * @see #getType()
   * @generated
   */
  void setType(Type value);

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
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getVariableDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // VariableDeclaration
