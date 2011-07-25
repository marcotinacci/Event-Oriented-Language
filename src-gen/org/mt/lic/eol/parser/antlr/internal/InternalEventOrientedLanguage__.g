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
T28 : '<' ;
T29 : '>' ;
T30 : 'raise' ;
T31 : 'out' ;
T32 : 'in' ;
T33 : 'if' ;
T34 : 'else' ;
T35 : 'while' ;
T36 : 'AND' ;
T37 : 'OR' ;
T38 : '<=' ;
T39 : '==' ;
T40 : '>=' ;
T41 : '+' ;
T42 : '-' ;
T43 : '*' ;
T44 : '/' ;
T45 : 'NOT' ;
T46 : 'int' ;
T47 : 'real' ;
T48 : 'bool' ;
T49 : 'string' ;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2295
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2297
RULE_REAL : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2299
RULE_BOOL : ('true'|'false');

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2301
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2303
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2305
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2307
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2309
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 2311
RULE_ANY_OTHER : .;


