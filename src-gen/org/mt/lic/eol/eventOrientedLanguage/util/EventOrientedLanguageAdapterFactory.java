/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mt.lic.eol.eventOrientedLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage
 * @generated
 */
public class EventOrientedLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EventOrientedLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventOrientedLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EventOrientedLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventOrientedLanguageSwitch<Adapter> modelSwitch =
    new EventOrientedLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseGlobalSection(GlobalSection object)
      {
        return createGlobalSectionAdapter();
      }
      @Override
      public Adapter caseEventSection(EventSection object)
      {
        return createEventSectionAdapter();
      }
      @Override
      public Adapter caseHandlerSection(HandlerSection object)
      {
        return createHandlerSectionAdapter();
      }
      @Override
      public Adapter caseEventDecl(EventDecl object)
      {
        return createEventDeclAdapter();
      }
      @Override
      public Adapter caseHandlerDecl(HandlerDecl object)
      {
        return createHandlerDeclAdapter();
      }
      @Override
      public Adapter caseAbstractBlock(AbstractBlock object)
      {
        return createAbstractBlockAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseConstruct(Construct object)
      {
        return createConstructAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseMathExpression(MathExpression object)
      {
        return createMathExpressionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseCompound(Compound object)
      {
        return createCompoundAdapter();
      }
      @Override
      public Adapter caseVariableAssign(VariableAssign object)
      {
        return createVariableAssignAdapter();
      }
      @Override
      public Adapter caseBindHandler(BindHandler object)
      {
        return createBindHandlerAdapter();
      }
      @Override
      public Adapter caseUnbindHandler(UnbindHandler object)
      {
        return createUnbindHandlerAdapter();
      }
      @Override
      public Adapter caseRaiseEvent(RaiseEvent object)
      {
        return createRaiseEventAdapter();
      }
      @Override
      public Adapter casePrintOutput(PrintOutput object)
      {
        return createPrintOutputAdapter();
      }
      @Override
      public Adapter caseReadInput(ReadInput object)
      {
        return createReadInputAdapter();
      }
      @Override
      public Adapter caseIfThenElse(IfThenElse object)
      {
        return createIfThenElseAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseVariableReference(VariableReference object)
      {
        return createVariableReferenceAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseBooleanReference(BooleanReference object)
      {
        return createBooleanReferenceAdapter();
      }
      @Override
      public Adapter caseLeq(Leq object)
      {
        return createLeqAdapter();
      }
      @Override
      public Adapter caseLess(Less object)
      {
        return createLessAdapter();
      }
      @Override
      public Adapter caseEq(Eq object)
      {
        return createEqAdapter();
      }
      @Override
      public Adapter caseGeq(Geq object)
      {
        return createGeqAdapter();
      }
      @Override
      public Adapter caseGtr(Gtr object)
      {
        return createGtrAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.GlobalSection <em>Global Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.GlobalSection
   * @generated
   */
  public Adapter createGlobalSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.EventSection <em>Event Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventSection
   * @generated
   */
  public Adapter createEventSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerSection <em>Handler Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerSection
   * @generated
   */
  public Adapter createHandlerSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.EventDecl <em>Event Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.EventDecl
   * @generated
   */
  public Adapter createEventDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.HandlerDecl <em>Handler Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.HandlerDecl
   * @generated
   */
  public Adapter createHandlerDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.AbstractBlock <em>Abstract Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.AbstractBlock
   * @generated
   */
  public Adapter createAbstractBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Construct <em>Construct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Construct
   * @generated
   */
  public Adapter createConstructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.MathExpression <em>Math Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.MathExpression
   * @generated
   */
  public Adapter createMathExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Compound <em>Compound</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Compound
   * @generated
   */
  public Adapter createCompoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.VariableAssign <em>Variable Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableAssign
   * @generated
   */
  public Adapter createVariableAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.BindHandler <em>Bind Handler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.BindHandler
   * @generated
   */
  public Adapter createBindHandlerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.UnbindHandler <em>Unbind Handler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.UnbindHandler
   * @generated
   */
  public Adapter createUnbindHandlerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.RaiseEvent <em>Raise Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.RaiseEvent
   * @generated
   */
  public Adapter createRaiseEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.PrintOutput <em>Print Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.PrintOutput
   * @generated
   */
  public Adapter createPrintOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.ReadInput <em>Read Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.ReadInput
   * @generated
   */
  public Adapter createReadInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.IfThenElse
   * @generated
   */
  public Adapter createIfThenElseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.VariableReference
   * @generated
   */
  public Adapter createVariableReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.BooleanReference <em>Boolean Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.BooleanReference
   * @generated
   */
  public Adapter createBooleanReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Leq <em>Leq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Leq
   * @generated
   */
  public Adapter createLeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Less
   * @generated
   */
  public Adapter createLessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Eq <em>Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Eq
   * @generated
   */
  public Adapter createEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Geq <em>Geq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Geq
   * @generated
   */
  public Adapter createGeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.Gtr <em>Gtr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.Gtr
   * @generated
   */
  public Adapter createGtrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EventOrientedLanguageAdapterFactory
