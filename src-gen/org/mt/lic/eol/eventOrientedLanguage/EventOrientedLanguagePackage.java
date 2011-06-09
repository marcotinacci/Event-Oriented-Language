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
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.ParamDeclarationImpl <em>Param Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.ParamDeclarationImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getParamDeclaration()
   * @generated
   */
  int PARAM_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Param Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.EventDeclImpl <em>Event Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventDeclImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getEventDecl()
   * @generated
   */
  int EVENT_DECL = 5;

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
  int HANDLER_DECL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL__BODY = 2;

  /**
   * The number of structural features of the '<em>Handler Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.AbstractBlockImpl <em>Abstract Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.AbstractBlockImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getAbstractBlock()
   * @generated
   */
  int ABSTRACT_BLOCK = 7;

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
  int COMMAND = 8;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = ABSTRACT_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.PrintOutputImpl <em>Print Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.PrintOutputImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getPrintOutput()
   * @generated
   */
  int PRINT_OUTPUT = 9;

  /**
   * The feature id for the '<em><b>Output</b></em>' attribute.
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
  int READ_INPUT = 10;

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
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.VariableDeclarationImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 11;

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
   * The number of structural features of the '<em>Bind Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_HANDLER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.UnbindHandlerImpl <em>Unbind Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.UnbindHandlerImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getUnbindHandler()
   * @generated
   */
  int UNBIND_HANDLER = 13;

  /**
   * The feature id for the '<em><b>Event Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBIND_HANDLER__EVENT_NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Handler Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBIND_HANDLER__HANDLER_NAME = COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unbind Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNBIND_HANDLER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.VariableAssignImpl <em>Variable Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.VariableAssignImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getVariableAssign()
   * @generated
   */
  int VARIABLE_ASSIGN = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGN__NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
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
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.RaiseEventImpl <em>Raise Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.RaiseEventImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getRaiseEvent()
   * @generated
   */
  int RAISE_EVENT = 15;

  /**
   * The feature id for the '<em><b>Event Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAISE_EVENT__EVENT_NAME = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
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
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.CompoundImpl <em>Compound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.CompoundImpl
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getCompound()
   * @generated
   */
  int COMPOUND = 16;

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
   * The meta object id for the '{@link org.mt.lic.eol.eventOrientedLanguage.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mt.lic.eol.eventOrientedLanguage.Type
   * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 17;


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
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration <em>Param Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Declaration</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration
   * @generated
   */
  EClass getParamDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration#getType()
   * @see #getParamDeclaration()
   * @generated
   */
  EAttribute getParamDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration#getName()
   * @see #getParamDeclaration()
   * @generated
   */
  EAttribute getParamDeclaration_Name();

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
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.PrintOutput <em>Print Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Output</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.PrintOutput
   * @generated
   */
  EClass getPrintOutput();

  /**
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.PrintOutput#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.PrintOutput#getOutput()
   * @see #getPrintOutput()
   * @generated
   */
  EAttribute getPrintOutput_Output();

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
   * Returns the meta object for class '{@link org.mt.lic.eol.eventOrientedLanguage.UnbindHandler <em>Unbind Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unbind Handler</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.UnbindHandler
   * @generated
   */
  EClass getUnbindHandler();

  /**
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.UnbindHandler#getEventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.UnbindHandler#getEventName()
   * @see #getUnbindHandler()
   * @generated
   */
  EReference getUnbindHandler_EventName();

  /**
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.UnbindHandler#getHandlerName <em>Handler Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Handler Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.UnbindHandler#getHandlerName()
   * @see #getUnbindHandler()
   * @generated
   */
  EReference getUnbindHandler_HandlerName();

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
   * Returns the meta object for the attribute '{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableAssign#getValue()
   * @see #getVariableAssign()
   * @generated
   */
  EAttribute getVariableAssign_Value();

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
   * Returns the meta object for the reference '{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getEventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event Name</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getEventName()
   * @see #getRaiseEvent()
   * @generated
   */
  EReference getRaiseEvent_EventName();

  /**
   * Returns the meta object for the attribute list '{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see org.mt.lic.eol.eventOrientedLanguage.RaiseEvent#getParams()
   * @see #getRaiseEvent()
   * @generated
   */
  EAttribute getRaiseEvent_Params();

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
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.ParamDeclarationImpl <em>Param Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.ParamDeclarationImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getParamDeclaration()
     * @generated
     */
    EClass PARAM_DECLARATION = eINSTANCE.getParamDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_DECLARATION__TYPE = eINSTANCE.getParamDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_DECLARATION__NAME = eINSTANCE.getParamDeclaration_Name();

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
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.PrintOutputImpl <em>Print Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.PrintOutputImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getPrintOutput()
     * @generated
     */
    EClass PRINT_OUTPUT = eINSTANCE.getPrintOutput();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRINT_OUTPUT__OUTPUT = eINSTANCE.getPrintOutput_Output();

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
     * The meta object literal for the '{@link org.mt.lic.eol.eventOrientedLanguage.impl.UnbindHandlerImpl <em>Unbind Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.UnbindHandlerImpl
     * @see org.mt.lic.eol.eventOrientedLanguage.impl.EventOrientedLanguagePackageImpl#getUnbindHandler()
     * @generated
     */
    EClass UNBIND_HANDLER = eINSTANCE.getUnbindHandler();

    /**
     * The meta object literal for the '<em><b>Event Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNBIND_HANDLER__EVENT_NAME = eINSTANCE.getUnbindHandler_EventName();

    /**
     * The meta object literal for the '<em><b>Handler Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNBIND_HANDLER__HANDLER_NAME = eINSTANCE.getUnbindHandler_HandlerName();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ASSIGN__VALUE = eINSTANCE.getVariableAssign_Value();

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
     * The meta object literal for the '<em><b>Event Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RAISE_EVENT__EVENT_NAME = eINSTANCE.getRaiseEvent_EventName();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RAISE_EVENT__PARAMS = eINSTANCE.getRaiseEvent_Params();

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
