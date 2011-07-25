/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface EventOrientedLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eventOrientedLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mt.org/lic/eol/EventOrientedLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eventOrientedLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EventOrientedLanguagePackage eINSTANCE = org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.ProgramImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Globals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__GLOBALS = 0;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__EVENTS = 1;

  /**
   * The feature id for the '<em><b>Handlers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__HANDLERS = 2;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__INIT = 3;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.GlobalSectionImpl <em>Global Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.GlobalSectionImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getGlobalSection()
   * @generated
   */
  int GLOBAL_SECTION = 1;

  /**
   * The feature id for the '<em><b>Globals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_SECTION__GLOBALS = 0;

  /**
   * The number of structural features of the '<em>Global Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.EventSectionImpl <em>Event Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventSectionImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getEventSection()
   * @generated
   */
  int EVENT_SECTION = 2;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SECTION__EVENTS = 0;

  /**
   * The number of structural features of the '<em>Event Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerSectionImpl <em>Handler Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.HandlerSectionImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getHandlerSection()
   * @generated
   */
  int HANDLER_SECTION = 3;

  /**
   * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_SECTION__HANDLERS = 0;

  /**
   * The number of structural features of the '<em>Handler Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_SECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.EventDeclImpl <em>Event Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventDeclImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getEventDecl()
   * @generated
   */
  int EVENT_DECL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECL__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Event Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl <em>Handler Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getHandlerDecl()
   * @generated
   */
  int HANDLER_DECL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Bind Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL__BIND_PARAMS = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL__BODY = 3;

  /**
   * The number of structural features of the '<em>Handler Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.AbstractBlockImpl <em>Abstract Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.AbstractBlockImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getAbstractBlock()
   * @generated
   */
  int ABSTRACT_BLOCK = 6;

  /**
   * The number of structural features of the '<em>Abstract Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.CommandImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 7;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = ABSTRACT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.VariableDeclarationImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.ExpressionImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.CompoundImpl <em>Compound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.CompoundImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getCompound()
   * @generated
   */
  int COMPOUND = 10;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND__BODY = ABSTRACT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_FEATURE_COUNT = ABSTRACT_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableAssignImpl <em>Variable Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.VariableAssignImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getVariableAssign()
   * @generated
   */
  int VARIABLE_ASSIGN = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN__NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN__VALUE = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.BindHandlerImpl <em>Bind Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.BindHandlerImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getBindHandler()
   * @generated
   */
  int BIND_HANDLER = 12;

  /**
   * The feature id for the '<em><b>Event Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_HANDLER__EVENT_NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Handler Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_HANDLER__HANDLER_NAME = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Consumable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_HANDLER__CONSUMABLE = COMMAND_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Consumability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_HANDLER__CONSUMABILITY = COMMAND_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Bind Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_HANDLER__BIND_PARAMS = COMMAND_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Bind Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_HANDLER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.RaiseEventImpl <em>Raise Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.RaiseEventImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getRaiseEvent()
   * @generated
   */
  int RAISE_EVENT = 13;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_EVENT__EVENT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_EVENT__PARAMS = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Raise Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_EVENT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.PrintOutputImpl <em>Print Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.PrintOutputImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getPrintOutput()
   * @generated
   */
  int PRINT_OUTPUT = 14;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_OUTPUT__OUTPUT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Print Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_OUTPUT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.ReadInputImpl <em>Read Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.ReadInputImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getReadInput()
   * @generated
   */
  int READ_INPUT = 15;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_INPUT__INPUT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Read Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_INPUT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.IfThenElseImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 16;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__CONDITION = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THEN_BLOCK = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Balanced</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__BALANCED = COMMAND_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE_BLOCK = COMMAND_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.WhileImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getWhile()
   * @generated
   */
  int WHILE = 17;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__CONDITION = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__BLOCK = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.AndImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getAnd()
   * @generated
   */
  int AND = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.OrImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getOr()
   * @generated
   */
  int OR = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.LeqImpl <em>Leq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.LeqImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getLeq()
   * @generated
   */
  int LEQ = 20;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Leq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.LessImpl <em>Less</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.LessImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getLess()
   * @generated
   */
  int LESS = 21;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Less</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.EqImpl <em>Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EqImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getEq()
   * @generated
   */
  int EQ = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.GeqImpl <em>Geq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.GeqImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getGeq()
   * @generated
   */
  int GEQ = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEQ__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEQ__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEQ_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.GtrImpl <em>Gtr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.GtrImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getGtr()
   * @generated
   */
  int GTR = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Gtr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GTR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.PlusImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getPlus()
   * @generated
   */
  int PLUS = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.MinusImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getMinus()
   * @generated
   */
  int MINUS = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.MultiImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getMulti()
   * @generated
   */
  int MULTI = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.DivImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getDiv()
   * @generated
   */
  int DIV = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.NotImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getNot()
   * @generated
   */
  int NOT = 29;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__COND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.LiteralImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.VariableReferenceImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 31;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__VAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.Type
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 32;


  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Program#getGlobals <em>Globals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Globals</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Program#getGlobals()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Globals();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Program#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Events</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Program#getEvents()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Events();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Program#getHandlers <em>Handlers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Handlers</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Program#getHandlers()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Handlers();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Program#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Program#getInit()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Init();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.GlobalSection <em>Global Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Section</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.GlobalSection
   * @generated
   */
  EClass getGlobalSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.GlobalSection#getGlobals <em>Globals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Globals</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.GlobalSection#getGlobals()
   * @see #getGlobalSection()
   * @generated
   */
  EReference getGlobalSection_Globals();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.EventSection <em>Event Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Section</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventSection
   * @generated
   */
  EClass getEventSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.EventSection#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventSection#getEvents()
   * @see #getEventSection()
   * @generated
   */
  EReference getEventSection_Events();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerSection <em>Handler Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handler Section</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerSection
   * @generated
   */
  EClass getHandlerSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerSection#getHandlers <em>Handlers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Handlers</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerSection#getHandlers()
   * @see #getHandlerSection()
   * @generated
   */
  EReference getHandlerSection_Handlers();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.EventDecl <em>Event Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Decl</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventDecl
   * @generated
   */
  EClass getEventDecl();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.EventDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventDecl#getName()
   * @see #getEventDecl()
   * @generated
   */
  EAttribute getEventDecl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.EventDecl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventDecl#getParams()
   * @see #getEventDecl()
   * @generated
   */
  EReference getEventDecl_Params();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerDecl <em>Handler Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handler Decl</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerDecl
   * @generated
   */
  EClass getHandlerDecl();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerDecl#getName()
   * @see #getHandlerDecl()
   * @generated
   */
  EAttribute getHandlerDecl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerDecl#getBindParams <em>Bind Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bind Params</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerDecl#getBindParams()
   * @see #getHandlerDecl()
   * @generated
   */
  EReference getHandlerDecl_BindParams();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerDecl#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerDecl#getParams()
   * @see #getHandlerDecl()
   * @generated
   */
  EReference getHandlerDecl_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerDecl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerDecl#getBody()
   * @see #getHandlerDecl()
   * @generated
   */
  EReference getHandlerDecl_Body();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.AbstractBlock <em>Abstract Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Block</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.AbstractBlock
   * @generated
   */
  EClass getAbstractBlock();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Compound <em>Compound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Compound
   * @generated
   */
  EClass getCompound();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.Compound#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Compound#getBody()
   * @see #getCompound()
   * @generated
   */
  EReference getCompound_Body();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign <em>Variable Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assign</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableAssign
   * @generated
   */
  EClass getVariableAssign();

  /**
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getName()
   * @see #getVariableAssign()
   * @generated
   */
  EReference getVariableAssign_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getValue()
   * @see #getVariableAssign()
   * @generated
   */
  EReference getVariableAssign_Value();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler <em>Bind Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind Handler</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.BindHandler
   * @generated
   */
  EClass getBindHandler();

  /**
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#getEventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.BindHandler#getEventName()
   * @see #getBindHandler()
   * @generated
   */
  EReference getBindHandler_EventName();

  /**
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#getHandlerName <em>Handler Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Handler Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.BindHandler#getHandlerName()
   * @see #getBindHandler()
   * @generated
   */
  EReference getBindHandler_HandlerName();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#isConsumable <em>Consumable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Consumable</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.BindHandler#isConsumable()
   * @see #getBindHandler()
   * @generated
   */
  EAttribute getBindHandler_Consumable();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#getConsumability <em>Consumability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Consumability</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.BindHandler#getConsumability()
   * @see #getBindHandler()
   * @generated
   */
  EReference getBindHandler_Consumability();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler#getBindParams <em>Bind Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bind Params</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.BindHandler#getBindParams()
   * @see #getBindHandler()
   * @generated
   */
  EReference getBindHandler_BindParams();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent <em>Raise Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Raise Event</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.RaiseEvent
   * @generated
   */
  EClass getRaiseEvent();

  /**
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getEvent()
   * @see #getRaiseEvent()
   * @generated
   */
  EReference getRaiseEvent_Event();

  /**
   * Returns the meta object for the containment reference list '{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getParams()
   * @see #getRaiseEvent()
   * @generated
   */
  EReference getRaiseEvent_Params();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.PrintOutput <em>Print Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Output</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.PrintOutput
   * @generated
   */
  EClass getPrintOutput();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.PrintOutput#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.PrintOutput#getOutput()
   * @see #getPrintOutput()
   * @generated
   */
  EReference getPrintOutput_Output();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.ReadInput <em>Read Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Input</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.ReadInput
   * @generated
   */
  EClass getReadInput();

  /**
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.ReadInput#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.ReadInput#getInput()
   * @see #getReadInput()
   * @generated
   */
  EReference getReadInput_Input();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.IfThenElse
   * @generated
   */
  EClass getIfThenElse();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getCondition()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getThenBlock <em>Then Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Block</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getThenBlock()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_ThenBlock();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#isBalanced <em>Balanced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Balanced</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.IfThenElse#isBalanced()
   * @see #getIfThenElse()
   * @generated
   */
  EAttribute getIfThenElse_Balanced();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.IfThenElse#getElseBlock()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_ElseBlock();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.While#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.While#getCondition()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.While#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.While#getBlock()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Block();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Leq <em>Leq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leq</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Leq
   * @generated
   */
  EClass getLeq();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Leq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Leq#getLeft()
   * @see #getLeq()
   * @generated
   */
  EReference getLeq_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Leq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Leq#getRight()
   * @see #getLeq()
   * @generated
   */
  EReference getLeq_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Less
   * @generated
   */
  EClass getLess();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Less#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Less#getLeft()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Less#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Less#getRight()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Eq <em>Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Eq</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Eq
   * @generated
   */
  EClass getEq();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Eq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Eq#getLeft()
   * @see #getEq()
   * @generated
   */
  EReference getEq_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Eq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Eq#getRight()
   * @see #getEq()
   * @generated
   */
  EReference getEq_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Geq <em>Geq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geq</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Geq
   * @generated
   */
  EClass getGeq();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Geq#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Geq#getLeft()
   * @see #getGeq()
   * @generated
   */
  EReference getGeq_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Geq#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Geq#getRight()
   * @see #getGeq()
   * @generated
   */
  EReference getGeq_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Gtr <em>Gtr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gtr</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Gtr
   * @generated
   */
  EClass getGtr();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Gtr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Gtr#getLeft()
   * @see #getGtr()
   * @generated
   */
  EReference getGtr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Gtr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Gtr#getRight()
   * @see #getGtr()
   * @generated
   */
  EReference getGtr_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for the containment reference '{@link org.mt.lic.eol.eventOrientedLanguage.Not#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Not#getCond()
   * @see #getNot()
   * @generated
   */
  EReference getNot_Cond();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.Literal#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Literal#getValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.VariableReference#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableReference#getVar()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Var();

  /**
   * Returns the meta object for enum '{@link org.mt.lic.eol.eventOrientedLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.Type
   * @generated
   */
  EEnum getType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EventOrientedLanguageFactory getEventOrientedLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.ProgramImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Globals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__GLOBALS = eINSTANCE.getProgram_Globals();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__EVENTS = eINSTANCE.getProgram_Events();

    /**
     * The meta object literal for the '<em><b>Handlers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__HANDLERS = eINSTANCE.getProgram_Handlers();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__INIT = eINSTANCE.getProgram_Init();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.GlobalSectionImpl <em>Global Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.GlobalSectionImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getGlobalSection()
     * @generated
     */
    EClass GLOBAL_SECTION = eINSTANCE.getGlobalSection();

    /**
     * The meta object literal for the '<em><b>Globals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_SECTION__GLOBALS = eINSTANCE.getGlobalSection_Globals();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.EventSectionImpl <em>Event Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventSectionImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getEventSection()
     * @generated
     */
    EClass EVENT_SECTION = eINSTANCE.getEventSection();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_SECTION__EVENTS = eINSTANCE.getEventSection_Events();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerSectionImpl <em>Handler Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.HandlerSectionImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getHandlerSection()
     * @generated
     */
    EClass HANDLER_SECTION = eINSTANCE.getHandlerSection();

    /**
     * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_SECTION__HANDLERS = eINSTANCE.getHandlerSection_Handlers();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.EventDeclImpl <em>Event Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventDeclImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getEventDecl()
     * @generated
     */
    EClass EVENT_DECL = eINSTANCE.getEventDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_DECL__NAME = eINSTANCE.getEventDecl_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_DECL__PARAMS = eINSTANCE.getEventDecl_Params();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl <em>Handler Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getHandlerDecl()
     * @generated
     */
    EClass HANDLER_DECL = eINSTANCE.getHandlerDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HANDLER_DECL__NAME = eINSTANCE.getHandlerDecl_Name();

    /**
     * The meta object literal for the '<em><b>Bind Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_DECL__BIND_PARAMS = eINSTANCE.getHandlerDecl_BindParams();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_DECL__PARAMS = eINSTANCE.getHandlerDecl_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER_DECL__BODY = eINSTANCE.getHandlerDecl_Body();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.AbstractBlockImpl <em>Abstract Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.AbstractBlockImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getAbstractBlock()
     * @generated
     */
    EClass ABSTRACT_BLOCK = eINSTANCE.getAbstractBlock();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.CommandImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.VariableDeclarationImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.ExpressionImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.CompoundImpl <em>Compound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.CompoundImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getCompound()
     * @generated
     */
    EClass COMPOUND = eINSTANCE.getCompound();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND__BODY = eINSTANCE.getCompound_Body();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableAssignImpl <em>Variable Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.VariableAssignImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getVariableAssign()
     * @generated
     */
    EClass VARIABLE_ASSIGN = eINSTANCE.getVariableAssign();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGN__NAME = eINSTANCE.getVariableAssign_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGN__VALUE = eINSTANCE.getVariableAssign_Value();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.BindHandlerImpl <em>Bind Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.BindHandlerImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getBindHandler()
     * @generated
     */
    EClass BIND_HANDLER = eINSTANCE.getBindHandler();

    /**
     * The meta object literal for the '<em><b>Event Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_HANDLER__EVENT_NAME = eINSTANCE.getBindHandler_EventName();

    /**
     * The meta object literal for the '<em><b>Handler Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_HANDLER__HANDLER_NAME = eINSTANCE.getBindHandler_HandlerName();

    /**
     * The meta object literal for the '<em><b>Consumable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIND_HANDLER__CONSUMABLE = eINSTANCE.getBindHandler_Consumable();

    /**
     * The meta object literal for the '<em><b>Consumability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_HANDLER__CONSUMABILITY = eINSTANCE.getBindHandler_Consumability();

    /**
     * The meta object literal for the '<em><b>Bind Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_HANDLER__BIND_PARAMS = eINSTANCE.getBindHandler_BindParams();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.RaiseEventImpl <em>Raise Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.RaiseEventImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getRaiseEvent()
     * @generated
     */
    EClass RAISE_EVENT = eINSTANCE.getRaiseEvent();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RAISE_EVENT__EVENT = eINSTANCE.getRaiseEvent_Event();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RAISE_EVENT__PARAMS = eINSTANCE.getRaiseEvent_Params();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.PrintOutputImpl <em>Print Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.PrintOutputImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getPrintOutput()
     * @generated
     */
    EClass PRINT_OUTPUT = eINSTANCE.getPrintOutput();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINT_OUTPUT__OUTPUT = eINSTANCE.getPrintOutput_Output();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.ReadInputImpl <em>Read Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.ReadInputImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getReadInput()
     * @generated
     */
    EClass READ_INPUT = eINSTANCE.getReadInput();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference READ_INPUT__INPUT = eINSTANCE.getReadInput_Input();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.IfThenElseImpl <em>If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.IfThenElseImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getIfThenElse()
     * @generated
     */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();

    /**
     * The meta object literal for the '<em><b>Then Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__THEN_BLOCK = eINSTANCE.getIfThenElse_ThenBlock();

    /**
     * The meta object literal for the '<em><b>Balanced</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_THEN_ELSE__BALANCED = eINSTANCE.getIfThenElse_Balanced();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSE_BLOCK = eINSTANCE.getIfThenElse_ElseBlock();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.WhileImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__BLOCK = eINSTANCE.getWhile_Block();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.AndImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.OrImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.LeqImpl <em>Leq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.LeqImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getLeq()
     * @generated
     */
    EClass LEQ = eINSTANCE.getLeq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEQ__LEFT = eINSTANCE.getLeq_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEQ__RIGHT = eINSTANCE.getLeq_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.LessImpl <em>Less</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.LessImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getLess()
     * @generated
     */
    EClass LESS = eINSTANCE.getLess();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__LEFT = eINSTANCE.getLess_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__RIGHT = eINSTANCE.getLess_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.EqImpl <em>Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EqImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getEq()
     * @generated
     */
    EClass EQ = eINSTANCE.getEq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQ__LEFT = eINSTANCE.getEq_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQ__RIGHT = eINSTANCE.getEq_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.GeqImpl <em>Geq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.GeqImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getGeq()
     * @generated
     */
    EClass GEQ = eINSTANCE.getGeq();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEQ__LEFT = eINSTANCE.getGeq_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEQ__RIGHT = eINSTANCE.getGeq_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.GtrImpl <em>Gtr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.GtrImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getGtr()
     * @generated
     */
    EClass GTR = eINSTANCE.getGtr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GTR__LEFT = eINSTANCE.getGtr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GTR__RIGHT = eINSTANCE.getGtr_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.PlusImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.MinusImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.MultiImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.DivImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.NotImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT__COND = eINSTANCE.getNot_Cond();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.LiteralImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.VariableReferenceImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__VAR = eINSTANCE.getVariableReference_Var();

    /**
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.Type
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

  }

} //EventOrientedLanguagePackage
