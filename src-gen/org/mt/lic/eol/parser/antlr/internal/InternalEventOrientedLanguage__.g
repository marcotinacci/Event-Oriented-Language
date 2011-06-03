lexer grammar InternalEventOrientedLanguage;
@header {
package org.mt.lic.eol.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'init:' ;
T12 : 'end' ;
T13 : 'globals:' ;
T14 : ';' ;
T15 : 'events:' ;
T16 : 'handlers:' ;
T17 : '(' ;
T18 : ',' ;
T19 : ')' ;
T20 : '{' ;
T21 : '}' ;
T22 : '+=' ;
T23 : '-=' ;
T24 : '=' ;
T25 : 'int' ;
T26 : 'real' ;
T27 : 'bool' ;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1206
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1208
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1210
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1212
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1214
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1216
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g" 1218
RULE_ANY_OTHER : .;


