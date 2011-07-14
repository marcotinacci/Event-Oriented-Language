/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage;
import org.mt.lic.eol.eventOrientedLanguage.Expression;
import org.mt.lic.eol.eventOrientedLanguage.IfThenElse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.IfThenElseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.IfThenElseImpl#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.IfThenElseImpl#isBalanced <em>Balanced</em>}</li>
 *   <li>{@link org.mt.lic.eol.eventOrientedLanguage.impl.IfThenElseImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenElseImpl extends CommandImpl implements IfThenElse
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getThenBlock() <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenBlock()
   * @generated
   * @ordered
   */
  protected AbstractBlock thenBlock;

  /**
   * The default value of the '{@link #isBalanced() <em>Balanced</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBalanced()
   * @generated
   * @ordered
   */
  protected static final boolean BALANCED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBalanced() <em>Balanced</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBalanced()
   * @generated
   * @ordered
   */
  protected boolean balanced = BALANCED_EDEFAULT;

  /**
   * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBlock()
   * @generated
   * @ordered
   */
  protected AbstractBlock elseBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfThenElseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EventOrientedLanguagePackage.Literals.IF_THEN_ELSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractBlock getThenBlock()
  {
    return thenBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenBlock(AbstractBlock newThenBlock, NotificationChain msgs)
  {
    AbstractBlock oldThenBlock = thenBlock;
    thenBlock = newThenBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK, oldThenBlock, newThenBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenBlock(AbstractBlock newThenBlock)
  {
    if (newThenBlock != thenBlock)
    {
      NotificationChain msgs = null;
      if (thenBlock != null)
        msgs = ((InternalEObject)thenBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK, null, msgs);
      if (newThenBlock != null)
        msgs = ((InternalEObject)newThenBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK, null, msgs);
      msgs = basicSetThenBlock(newThenBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK, newThenBlock, newThenBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBalanced()
  {
    return balanced;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBalanced(boolean newBalanced)
  {
    boolean oldBalanced = balanced;
    balanced = newBalanced;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.IF_THEN_ELSE__BALANCED, oldBalanced, balanced));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractBlock getElseBlock()
  {
    return elseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBlock(AbstractBlock newElseBlock, NotificationChain msgs)
  {
    AbstractBlock oldElseBlock = elseBlock;
    elseBlock = newElseBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK, oldElseBlock, newElseBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBlock(AbstractBlock newElseBlock)
  {
    if (newElseBlock != elseBlock)
    {
      NotificationChain msgs = null;
      if (elseBlock != null)
        msgs = ((InternalEObject)elseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK, null, msgs);
      if (newElseBlock != null)
        msgs = ((InternalEObject)newElseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK, null, msgs);
      msgs = basicSetElseBlock(newElseBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK, newElseBlock, newElseBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION:
        return basicSetCondition(null, msgs);
      case EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK:
        return basicSetThenBlock(null, msgs);
      case EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK:
        return basicSetElseBlock(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION:
        return getCondition();
      case EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK:
        return getThenBlock();
      case EventOrientedLanguagePackage.IF_THEN_ELSE__BALANCED:
        return isBalanced();
      case EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK:
        return getElseBlock();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION:
        setCondition((Expression)newValue);
        return;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK:
        setThenBlock((AbstractBlock)newValue);
        return;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__BALANCED:
        setBalanced((Boolean)newValue);
        return;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK:
        setElseBlock((AbstractBlock)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION:
        setCondition((Expression)null);
        return;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK:
        setThenBlock((AbstractBlock)null);
        return;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__BALANCED:
        setBalanced(BALANCED_EDEFAULT);
        return;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK:
        setElseBlock((AbstractBlock)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EventOrientedLanguagePackage.IF_THEN_ELSE__CONDITION:
        return condition != null;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__THEN_BLOCK:
        return thenBlock != null;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__BALANCED:
        return balanced != BALANCED_EDEFAULT;
      case EventOrientedLanguagePackage.IF_THEN_ELSE__ELSE_BLOCK:
        return elseBlock != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (balanced: ");
    result.append(balanced);
    result.append(')');
    return result.toString();
  }

} //IfThenElseImpl
