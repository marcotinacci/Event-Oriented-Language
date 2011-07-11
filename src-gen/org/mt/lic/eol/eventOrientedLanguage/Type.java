/**
 * <copyright>
 * </copyright>
 *
 */
package org.mt.lic.eol.eventOrientedLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mt.lic.eol.eventOrientedLanguage.EventOrientedLanguagePackage#getType()
 * @model
 * @generated
 */
public enum Type implements Enumerator
{
  /**
   * The '<em><b>TINT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TINT_VALUE
   * @generated
   * @ordered
   */
  TINT(0, "T_INT", "int"),

  /**
   * The '<em><b>TREAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TREAL_VALUE
   * @generated
   * @ordered
   */
  TREAL(1, "T_REAL", "real"),

  /**
   * The '<em><b>TBOOL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TBOOL_VALUE
   * @generated
   * @ordered
   */
  TBOOL(2, "T_BOOL", "bool"),

  /**
   * The '<em><b>TSTRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TSTRING_VALUE
   * @generated
   * @ordered
   */
  TSTRING(3, "T_STRING", "string");

  /**
   * The '<em><b>TINT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TINT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TINT
   * @model name="T_INT" literal="int"
   * @generated
   * @ordered
   */
  public static final int TINT_VALUE = 0;

  /**
   * The '<em><b>TREAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TREAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TREAL
   * @model name="T_REAL" literal="real"
   * @generated
   * @ordered
   */
  public static final int TREAL_VALUE = 1;

  /**
   * The '<em><b>TBOOL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TBOOL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TBOOL
   * @model name="T_BOOL" literal="bool"
   * @generated
   * @ordered
   */
  public static final int TBOOL_VALUE = 2;

  /**
   * The '<em><b>TSTRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TSTRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TSTRING
   * @model name="T_STRING" literal="string"
   * @generated
   * @ordered
   */
  public static final int TSTRING_VALUE = 3;

  /**
   * An array of all the '<em><b>Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Type[] VALUES_ARRAY =
    new Type[]
    {
      TINT,
      TREAL,
      TBOOL,
      TSTRING,
    };

  /**
   * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Type result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Type result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type get(int value)
  {
    switch (value)
    {
      case TINT_VALUE: return TINT;
      case TREAL_VALUE: return TREAL;
      case TBOOL_VALUE: return TBOOL;
      case TSTRING_VALUE: return TSTRING;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Type(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Type
