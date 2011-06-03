/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mt.lic.eol.eventOrientedLanguage.BindHandler;
import org.mt.lic.eol.eventOrientedLanguage.Command;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguageFactory;
import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.EventSection;
import org.mt.lic.eol.eventOrientedLanguage.GlobalSection;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.HandlerSection;
import org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration;
import org.mt.lic.eol.eventOrientedLanguage.Program;
import org.mt.lic.eol.eventOrientedLanguage.Type;
import org.mt.lic.eol.eventOrientedLanguage.UnbindHandler;
import org.mt.lic.eol.eventOrientedLanguage.VariableAssign;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventOrientedLanguagePackageImpl extends EPackageImpl implements EventOrientedLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globalSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass handlerSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass handlerDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unbindHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableAssignEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EventOrientedLanguagePackageImpl()
  {
    super(eNS_URI, EventOrientedLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EventOrientedLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EventOrientedLanguagePackage init()
  {
    if (isInited) return (EventOrientedLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(EventOrientedLanguagePackage.eNS_URI);

    // Obtain or create and register package
    EventOrientedLanguagePackageImpl theEventOrientedLanguagePackage = (EventOrientedLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EventOrientedLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EventOrientedLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEventOrientedLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theEventOrientedLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEventOrientedLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EventOrientedLanguagePackage.eNS_URI, theEventOrientedLanguagePackage);
    return theEventOrientedLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Globals()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Events()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Handlers()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Init()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobalSection()
  {
    return globalSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobalSection_Globals()
  {
    return (EReference)globalSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventSection()
  {
    return eventSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventSection_Events()
  {
    return (EReference)eventSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHandlerSection()
  {
    return handlerSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHandlerSection_Handlers()
  {
    return (EReference)handlerSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamDeclaration()
  {
    return paramDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamDeclaration_Type()
  {
    return (EAttribute)paramDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamDeclaration_Name()
  {
    return (EAttribute)paramDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDecl()
  {
    return eventDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDecl_Name()
  {
    return (EAttribute)eventDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDecl_Params()
  {
    return (EReference)eventDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHandlerDecl()
  {
    return handlerDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHandlerDecl_Name()
  {
    return (EAttribute)handlerDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHandlerDecl_Params()
  {
    return (EReference)handlerDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHandlerDecl_Body()
  {
    return (EReference)handlerDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompound()
  {
    return compoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompound_Body()
  {
    return (EReference)compoundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Type()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindHandler()
  {
    return bindHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBindHandler_EventName()
  {
    return (EAttribute)bindHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBindHandler_HandlerName()
  {
    return (EAttribute)bindHandlerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnbindHandler()
  {
    return unbindHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnbindHandler_EventName()
  {
    return (EAttribute)unbindHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnbindHandler_HandlerName()
  {
    return (EAttribute)unbindHandlerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableAssign()
  {
    return variableAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableAssign_Name()
  {
    return (EAttribute)variableAssignEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableAssign_Value()
  {
    return (EAttribute)variableAssignEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getType()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventOrientedLanguageFactory getEventOrientedLanguageFactory()
  {
    return (EventOrientedLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__GLOBALS);
    createEReference(programEClass, PROGRAM__EVENTS);
    createEReference(programEClass, PROGRAM__HANDLERS);
    createEReference(programEClass, PROGRAM__INIT);

    globalSectionEClass = createEClass(GLOBAL_SECTION);
    createEReference(globalSectionEClass, GLOBAL_SECTION__GLOBALS);

    eventSectionEClass = createEClass(EVENT_SECTION);
    createEReference(eventSectionEClass, EVENT_SECTION__EVENTS);

    handlerSectionEClass = createEClass(HANDLER_SECTION);
    createEReference(handlerSectionEClass, HANDLER_SECTION__HANDLERS);

    paramDeclarationEClass = createEClass(PARAM_DECLARATION);
    createEAttribute(paramDeclarationEClass, PARAM_DECLARATION__TYPE);
    createEAttribute(paramDeclarationEClass, PARAM_DECLARATION__NAME);

    eventDeclEClass = createEClass(EVENT_DECL);
    createEAttribute(eventDeclEClass, EVENT_DECL__NAME);
    createEReference(eventDeclEClass, EVENT_DECL__PARAMS);

    handlerDeclEClass = createEClass(HANDLER_DECL);
    createEAttribute(handlerDeclEClass, HANDLER_DECL__NAME);
    createEReference(handlerDeclEClass, HANDLER_DECL__PARAMS);
    createEReference(handlerDeclEClass, HANDLER_DECL__BODY);

    compoundEClass = createEClass(COMPOUND);
    createEReference(compoundEClass, COMPOUND__BODY);

    commandEClass = createEClass(COMMAND);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);

    bindHandlerEClass = createEClass(BIND_HANDLER);
    createEAttribute(bindHandlerEClass, BIND_HANDLER__EVENT_NAME);
    createEAttribute(bindHandlerEClass, BIND_HANDLER__HANDLER_NAME);

    unbindHandlerEClass = createEClass(UNBIND_HANDLER);
    createEAttribute(unbindHandlerEClass, UNBIND_HANDLER__EVENT_NAME);
    createEAttribute(unbindHandlerEClass, UNBIND_HANDLER__HANDLER_NAME);

    variableAssignEClass = createEClass(VARIABLE_ASSIGN);
    createEAttribute(variableAssignEClass, VARIABLE_ASSIGN__NAME);
    createEAttribute(variableAssignEClass, VARIABLE_ASSIGN__VALUE);

    // Create enums
    typeEEnum = createEEnum(TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    variableDeclarationEClass.getESuperTypes().add(this.getCommand());
    bindHandlerEClass.getESuperTypes().add(this.getCommand());
    unbindHandlerEClass.getESuperTypes().add(this.getCommand());
    variableAssignEClass.getESuperTypes().add(this.getCommand());

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Globals(), this.getGlobalSection(), null, "globals", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Events(), this.getEventSection(), null, "events", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Handlers(), this.getHandlerSection(), null, "handlers", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Init(), this.getCompound(), null, "init", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globalSectionEClass, GlobalSection.class, "GlobalSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGlobalSection_Globals(), this.getVariableDeclaration(), null, "globals", null, 0, -1, GlobalSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventSectionEClass, EventSection.class, "EventSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventSection_Events(), this.getEventDecl(), null, "events", null, 0, -1, EventSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(handlerSectionEClass, HandlerSection.class, "HandlerSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHandlerSection_Handlers(), this.getHandlerDecl(), null, "handlers", null, 0, -1, HandlerSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramDeclarationEClass, ParamDeclaration.class, "ParamDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParamDeclaration_Type(), this.getType(), "type", null, 0, 1, ParamDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParamDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParamDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventDeclEClass, EventDecl.class, "EventDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDecl_Params(), this.getParamDeclaration(), null, "params", null, 0, -1, EventDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(handlerDeclEClass, HandlerDecl.class, "HandlerDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHandlerDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, HandlerDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerDecl_Params(), this.getParamDeclaration(), null, "params", null, 0, -1, HandlerDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHandlerDecl_Body(), this.getCompound(), null, "body", null, 0, 1, HandlerDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundEClass, Compound.class, "Compound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompound_Body(), ecorePackage.getEObject(), null, "body", null, 0, -1, Compound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Type(), this.getType(), "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindHandlerEClass, BindHandler.class, "BindHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBindHandler_EventName(), ecorePackage.getEString(), "eventName", null, 0, 1, BindHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBindHandler_HandlerName(), ecorePackage.getEString(), "handlerName", null, 0, 1, BindHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unbindHandlerEClass, UnbindHandler.class, "UnbindHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnbindHandler_EventName(), ecorePackage.getEString(), "eventName", null, 0, 1, UnbindHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnbindHandler_HandlerName(), ecorePackage.getEString(), "handlerName", null, 0, 1, UnbindHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableAssignEClass, VariableAssign.class, "VariableAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableAssign_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableAssign_Value(), ecorePackage.getEInt(), "value", null, 0, 1, VariableAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeEEnum, Type.class, "Type");
    addEEnumLiteral(typeEEnum, Type.INT);
    addEEnumLiteral(typeEEnum, Type.REAL);
    addEEnumLiteral(typeEEnum, Type.BOOL);

    // Create resource
    createResource(eNS_URI);
  }

} //EventOrientedLanguagePackageImpl
