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
T22 : '{' ;
T23 : '}' ;
T24 : '=' ;
T25 : '+=' ;
T26 : '-=' ;
T27 : 'raise' ;
T28 : 'out' ;
T29 : 'in' ;
T30 : '+' ;
T31 : '-' ;
T32 : '*' ;
T33 : '/' ;
T34 : 'int' ;
T35 : 'real' ;
T36 : 'bool' ;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1541
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1543
RULE_REAL : ('0'..'9')* ('.' ('0'..'9')+)?;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1545
RULE_BOOL : ('true'|'false');

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1547
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1549
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1551
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1553
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1555
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1557
RULE_ANY_OTHER : .;


