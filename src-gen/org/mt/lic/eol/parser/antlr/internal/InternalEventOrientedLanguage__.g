lexer grammar InternalEventOrientedLanguage;
@header {
package org.mt.lic.eol.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'init:' ;
T14 : 'end' ;
T15 : 'globals:' ;
T16 : ';' ;
T17 : 'events:' ;
T18 : 'handlers:' ;
T19 : '(' ;
T20 : ',' ;
T21 : ')' ;
T22 : '[' ;
T23 : ']' ;
T24 : '{' ;
T25 : '}' ;
T26 : '=' ;
T27 : '+=' ;
T28 : '-=' ;
T29 : 'raise' ;
T30 : 'out' ;
T31 : 'in' ;
T32 : 'if' ;
T33 : 'else' ;
T34 : 'while' ;
T35 : '+' ;
T36 : '-' ;
T37 : '*' ;
T38 : '/' ;
T39 : 'AND' ;
T40 : 'OR' ;
T41 : 'NOT' ;
T42 : '<=' ;
T43 : '<' ;
T44 : '==' ;
T45 : '>=' ;
T46 : '>' ;
T47 : 'int' ;
T48 : 'real' ;
T49 : 'bool' ;
T50 : 'string' ;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2495
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2497
RULE_REAL : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2499
RULE_BOOL : ('true'|'false');

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2501
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2503
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2505
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2507
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2509
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2511
RULE_ANY_OTHER : .;


