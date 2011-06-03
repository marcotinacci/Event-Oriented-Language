/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage
 * @generated
 */
public interface EventOrientedLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EventOrientedLanguageFactory eINSTANCE = org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Global Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Section</em>'.
   * @generated
   */
  GlobalSection createGlobalSection();

  /**
   * Returns a new object of class '<em>Event Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Section</em>'.
   * @generated
   */
  EventSection createEventSection();

  /**
   * Returns a new object of class '<em>Handler Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Handler Section</em>'.
   * @generated
   */
  HandlerSection createHandlerSection();

  /**
   * Returns a new object of class '<em>Param Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Declaration</em>'.
   * @generated
   */
  ParamDeclaration createParamDeclaration();

  /**
   * Returns a new object of class '<em>Event Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Decl</em>'.
   * @generated
   */
  EventDecl createEventDecl();

  /**
   * Returns a new object of class '<em>Handler Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Handler Decl</em>'.
   * @generated
   */
  HandlerDecl createHandlerDecl();

  /**
   * Returns a new object of class '<em>Compound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound</em>'.
   * @generated
   */
  Compound createCompound();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Bind Handler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bind Handler</em>'.
   * @generated
   */
  BindHandler createBindHandler();

  /**
   * Returns a new object of class '<em>Unbind Handler</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unbind Handler</em>'.
   * @generated
   */
  UnbindHandler createUnbindHandler();

  /**
   * Returns a new object of class '<em>Variable Assign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Assign</em>'.
   * @generated
   */
  VariableAssign createVariableAssign();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EventOrientedLanguagePackage getEventOrientedLanguagePackage();

} //EventOrientedLanguageFactory
