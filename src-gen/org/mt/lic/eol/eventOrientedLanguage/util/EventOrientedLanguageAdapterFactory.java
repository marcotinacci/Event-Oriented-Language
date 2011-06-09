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
      public Adapter caseParamDeclaration(ParamDeclaration object)
      {
        return createParamDeclarationAdapter();
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
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
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
      public Adapter caseVariableAssign(VariableAssign object)
      {
        return createVariableAssignAdapter();
      }
      @Override
      public Adapter caseRaiseEvent(RaiseEvent object)
      {
        return createRaiseEventAdapter();
      }
      @Override
      public Adapter caseCompound(Compound object)
      {
        return createCompoundAdapter();
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
   * Creates a new adapter for an object of class '{@link org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration <em>Param Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mt.lic.eol.eventOrientedLanguage.ParamDeclaration
   * @generated
   */
  public Adapter createParamDeclarationAdapter()
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
