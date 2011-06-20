/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mt.lic.eol.eventOrientedLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventOrientedLanguageFactoryImpl extends EFactoryImpl implements EventOrientedLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EventOrientedLanguageFactory init()
  {
    try
    {
      EventOrientedLanguageFactory theEventOrientedLanguageFactory = (EventOrientedLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mt.org/lic/eol/EventOrientedLanguage"); 
      if (theEventOrientedLanguageFactory != null)
      {
        return theEventOrientedLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EventOrientedLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventOrientedLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EventOrientedLanguagePackage.PROGRAM: return createProgram();
      case EventOrientedLanguagePackage.GLOBAL_SECTION: return createGlobalSection();
      case EventOrientedLanguagePackage.EVENT_SECTION: return createEventSection();
      case EventOrientedLanguagePackage.HANDLER_SECTION: return createHandlerSection();
      case EventOrientedLanguagePackage.EVENT_DECL: return createEventDecl();
      case EventOrientedLanguagePackage.HANDLER_DECL: return createHandlerDecl();
      case EventOrientedLanguagePackage.ABSTRACT_BLOCK: return createAbstractBlock();
      case EventOrientedLanguagePackage.COMMAND: return createCommand();
      case EventOrientedLanguagePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case EventOrientedLanguagePackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case EventOrientedLanguagePackage.EXPRESSION: return createExpression();
      case EventOrientedLanguagePackage.COMPOUND: return createCompound();
      case EventOrientedLanguagePackage.VARIABLE_ASSIGN: return createVariableAssign();
      case EventOrientedLanguagePackage.BIND_HANDLER: return createBindHandler();
      case EventOrientedLanguagePackage.UNBIND_HANDLER: return createUnbindHandler();
      case EventOrientedLanguagePackage.RAISE_EVENT: return createRaiseEvent();
      case EventOrientedLanguagePackage.PRINT_OUTPUT: return createPrintOutput();
      case EventOrientedLanguagePackage.READ_INPUT: return createReadInput();
      case EventOrientedLanguagePackage.PLUS: return createPlus();
      case EventOrientedLanguagePackage.MINUS: return createMinus();
      case EventOrientedLanguagePackage.MULTI: return createMulti();
      case EventOrientedLanguagePackage.DIV: return createDiv();
      case EventOrientedLanguagePackage.NUMBER_LITERAL: return createNumberLiteral();
      case EventOrientedLanguagePackage.VARIABLE_REFERENCE: return createVariableReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EventOrientedLanguagePackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EventOrientedLanguagePackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalSection createGlobalSection()
  {
    GlobalSectionImpl globalSection = new GlobalSectionImpl();
    return globalSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSection createEventSection()
  {
    EventSectionImpl eventSection = new EventSectionImpl();
    return eventSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandlerSection createHandlerSection()
  {
    HandlerSectionImpl handlerSection = new HandlerSectionImpl();
    return handlerSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventDecl createEventDecl()
  {
    EventDeclImpl eventDecl = new EventDeclImpl();
    return eventDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HandlerDecl createHandlerDecl()
  {
    HandlerDeclImpl handlerDecl = new HandlerDeclImpl();
    return handlerDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractBlock createAbstractBlock()
  {
    AbstractBlockImpl abstractBlock = new AbstractBlockImpl();
    return abstractBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDeclaration createParameterDeclaration()
  {
    ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compound createCompound()
  {
    CompoundImpl compound = new CompoundImpl();
    return compound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAssign createVariableAssign()
  {
    VariableAssignImpl variableAssign = new VariableAssignImpl();
    return variableAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindHandler createBindHandler()
  {
    BindHandlerImpl bindHandler = new BindHandlerImpl();
    return bindHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnbindHandler createUnbindHandler()
  {
    UnbindHandlerImpl unbindHandler = new UnbindHandlerImpl();
    return unbindHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaiseEvent createRaiseEvent()
  {
    RaiseEventImpl raiseEvent = new RaiseEventImpl();
    return raiseEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintOutput createPrintOutput()
  {
    PrintOutputImpl printOutput = new PrintOutputImpl();
    return printOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReadInput createReadInput()
  {
    ReadInputImpl readInput = new ReadInputImpl();
    return readInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventOrientedLanguagePackage getEventOrientedLanguagePackage()
  {
    return (EventOrientedLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EventOrientedLanguagePackage getPackage()
  {
    return EventOrientedLanguagePackage.eINSTANCE;
  }

} //EventOrientedLanguageFactoryImpl
