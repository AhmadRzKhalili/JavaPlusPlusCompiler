grammar JavaPlusPlus;

s : CLASS {CompilerController.symbolTable.addSymbol($CLASS.getText(), $CLASS);}
	CLASS_ID {CompilerController.symbolTable.addSymbol($CLASS_ID.getText(), $CLASS_ID);}
	OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
	exp1
	CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);}
	SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);};

exp1 : (func)* MAIN_FUNC {CompilerController.symbolTable.addSymbol($MAIN_FUNC.getText(), $MAIN_FUNC);}
			   OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
			   CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);}
			   OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
			   (exp2)*
			   CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);};
exp2 : ioSt SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);}
	 | defSt SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);}
	 | assignmentSt SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);}
	 | ifElseSt
	 | switchSt
	 | loopSt
	 | funcCallSt SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);};
exp3 : exp4 {String e4Type1 = CompilerController.popTokenValue();}
     ((ADD {CompilerController.symbolTable.addSymbol($ADD.getText(), $ADD);
			CompilerController.pushTempValue("+");
		   }
	 | SUB {CompilerController.symbolTable.addSymbol($SUB.getText(), $SUB);
			CompilerController.pushTempValue("-");
		   } )
	 exp4 {	String e4Type2 = CompilerController.popTokenValue();
			if (!e4Type1.equals(e4Type2))
				CompilerController.showTypeMismatchError(e4Type1, e4Type2);
			else {
				String e4Val2 = CompilerController.popTempValue();
				String op = CompilerController.popTempValue();
				String e4Val1 = CompilerController.popTempValue();
				String e3Val = "";
				if(CompilerController.isTemp(e4Val1)){
					if(CompilerController.isTemp(e4Val2))
						CompilerController.removeTempVar();
						
					e3Val = e4Val1;
				}else if(CompilerController.isTemp(e4Val2)) {
					e3Val = e4Val2;
				} else {
					e3Val = CompilerController.getTempVar();
				}
				CompilerController.emitln(e3Val + "=" + e4Val1 + op + e4Val2);
				CompilerController.pushTempValue(e3Val);
			}
		  })* {CompilerController.pushTokenValue(e4Type1);};
exp4 : exp5 {String e5Type1 = CompilerController.popTokenValue();}
     ((MUL {CompilerController.symbolTable.addSymbol($MUL.getText(), $MUL);
			CompilerController.pushTempValue("*");
		   }
	 | DIV {CompilerController.symbolTable.addSymbol($DIV.getText(), $DIV);
			CompilerController.pushTempValue("/");
		   })
	 exp4 {String e5Type2 = CompilerController.popTokenValue();
		   if (!e5Type1.equals(e5Type2))
				CompilerController.showTypeMismatchError(e5Type1, e5Type2);
			else {
				String e5Val2 = CompilerController.popTempValue();
				String op = CompilerController.popTempValue();
				String e5Val1 = CompilerController.popTempValue();
				String e4Val = "";
				if(CompilerController.isTemp(e5Val1)){
					if(CompilerController.isTemp(e5Val2))
						CompilerController.removeTempVar();
						
					e4Val = e5Val1;
				}else if(CompilerController.isTemp(e5Val2)) {
					e4Val = e5Val2;
				} else {
					e4Val = CompilerController.getTempVar();
				}
				CompilerController.emitln(e4Val + "=" + e5Val1 + op + e5Val2);
				CompilerController.pushTempValue(e4Val);
			}
		  })* {CompilerController.pushTokenValue(e5Type1);};
exp5 : ID {
			if(CompilerController.containsSymbol($ID.getText())) {
				String type = CompilerController.symbolTable.getType($ID.getText());
				CompilerController.pushTokenValue(type);
				CompilerController.pushTempValue($ID.getText());
			} else {
				CompilerController.showVarNotDefinedError($ID.getText());
			}
		  }
	 | num 
	 | OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
	 exp3
	 CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);};

ioSt : INPUT {CompilerController.symbolTable.addSymbol($INPUT.getText(), $INPUT);}
	   OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
	   exp3
	   CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);}
	   | OUTPUT {CompilerController.symbolTable.addSymbol($OUTPUT.getText(), $OUTPUT);}
	   OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
	   exp3
	   CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);};
defSt : type ID {if(!CompilerController.symbolTable.containsSymbol($ID.getText()))
					CompilerController.symbolTable.addSymbol($ID.getText(), CompilerController.peekTokenValue(), $ID);
				else
					CompilerController.showVarAlreadyDefinedError($ID.getText());};
assignmentSt : {String idType = "";} ID {
					
					if (!CompilerController.containsSymbol($ID.getText()))
						CompilerController.showVarNotDefinedError($ID.getText());
					else {
						idType = CompilerController.symbolTable.getType($ID.getText());
						CompilerController.pushTokenValue(idType);
					}
				  }
			   AS {CompilerController.symbolTable.addSymbol($AS.getText(), $AS);}
			   exp3 {
						String e3Type = CompilerController.popTokenValue();
						if(!idType.equals(e3Type))
							CompilerController.showTypeMismatchError(idType, e3Type);
						else{
							String e3Val = CompilerController.popTempValue();
							CompilerController.emitln($ID.getText() + "=" + e3Val);
							if(CompilerController.isTemp(e3Val))
								CompilerController.removeTempVar();
						}
					};
ifElseSt : IF {CompilerController.symbolTable.addSymbol($IF.getText(), $IF);}
		   OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
		   exp3 relop exp3  {
								String e3Val2 = CompilerController.popTempValue();
								String relop = CompilerController.popTempValue();
								String e3Val1 = CompilerController.popTempValue();
								String elseLbl = CompilerController.getTempLbl();
								CompilerController.emitln("if not " + e3Val1 + " " + relop + " " + e3Val2 +  " goto " + elseLbl + ";");
							}
		   CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);}
		   OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
		   exp2 {
					String endLbl = CompilerController.getTempLbl();
					CompilerController.emitln("goto " + endLbl); 
					CompilerController.emitln(elseLbl + ":"); 
				}
		   CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);}
		   (elseSt)* {CompilerController.emitln(endLbl + ":");};
compareSt : exp3 relop exp3;
elseSt : ELSE {CompilerController.symbolTable.addSymbol($ELSE.getText(), $ELSE);}
		 OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
		 exp2
		 CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);}
		 |
		 ELSE {CompilerController.symbolTable.addSymbol($ELSE.getText(), $ELSE);}
		 ifElseSt;
switchSt : SWITCH {CompilerController.symbolTable.addSymbol($SWITCH.getText(), $SWITCH);}
		   OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
		   exp3
		   CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);}
		   OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
		   caseSt
		   CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);};
caseSt : CASE {CompilerController.symbolTable.addSymbol($CASE.getText(), $CASE);}
		 INT_NO {CompilerController.symbolTable.addSymbol($INT_NO.getText(), $INT_NO);}
		 ':'
		 exp2
		 BREAK {CompilerController.symbolTable.addSymbol($BREAK.getText(), $BREAK);}
		 SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);}
		 (caseSt)*;
loopSt : whileSt | forSt | doWhileSt;
whileSt : WHILE {CompilerController.symbolTable.addSymbol($WHILE.getText(), $WHILE);}
		  OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
		  compareSt
		  CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);}
		  OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
		  exp2
		  CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);};
forSt : FOR {CompilerController.symbolTable.addSymbol($FOR.getText(), $FOR);}
		OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
		assignmentSt
		SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);}
		compareSt
		SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);}
		exp3
		CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);}
		OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
		exp2
		CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);};
doWhileSt : DO {CompilerController.symbolTable.addSymbol($DO.getText(), $DO);}
			OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
			exp2
			CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);}
			WHILE {CompilerController.symbolTable.addSymbol($WHILE.getText(), $WHILE);}
			OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
			compareSt
			CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);}
			SEMICOLON {CompilerController.symbolTable.addSymbol($SEMICOLON.getText(), $SEMICOLON);};
funcCallSt : (defSt AS {CompilerController.symbolTable.addSymbol($AS.getText(), $AS);})?
			 ID {if(CompilerController.symbolTable.containsSymbol($ID.getText()) == false)
					CompilerController.symbolTable.addSymbol($ID.getText(), $ID);}
			 OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
			 exp3
			 (COMMA {CompilerController.symbolTable.addSymbol($COMMA.getText(), $COMMA);} exp3)*
			 CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);};
retSt : RET {CompilerController.symbolTable.addSymbol($RET.getText(), $RET);} exp3;

num : INT_NO {CompilerController.symbolTable.addSymbol($INT_NO.getText(), $INT_NO);
			  CompilerController.pushTempValue($INT_NO.getText());
			 }
	  |
	  FLT_NO {CompilerController.symbolTable.addSymbol($FLT_NO.getText(), $FLT_NO);
			  CompilerController.pushTempValue($FLT_NO.getText());
			 };
relop : EQ {CompilerController.symbolTable.addSymbol($EQ.getText(), $EQ);CompilerController.pushTempValue("==");}
		|
		NEQ {CompilerController.symbolTable.addSymbol($NEQ.getText(), $NEQ);CompilerController.pushTempValue("!=");}
		|
		GTE {CompilerController.symbolTable.addSymbol($GTE.getText(), $GTE);CompilerController.pushTempValue(">=");}
		|
		LTE {CompilerController.symbolTable.addSymbol($LTE.getText(), $LTE);CompilerController.pushTempValue("<=");}
		|
		GT {CompilerController.symbolTable.addSymbol($GT.getText(), $GT);CompilerController.pushTempValue(">");}
		|
		LT {CompilerController.symbolTable.addSymbol($LT.getText(), $LT);CompilerController.pushTempValue("<");};
func : FUNC {CompilerController.symbolTable.addSymbol($FUNC.getText(), $FUNC);}
	   ID {if(CompilerController.symbolTable.containsSymbol($ID.getText()) == false)
			CompilerController.symbolTable.addSymbol($ID.getText(), $ID);}
	   OPEN_PAR {CompilerController.symbolTable.addSymbol($OPEN_PAR.getText(), $OPEN_PAR);}
	   (arg)*
	   CLOSE_PAR {CompilerController.symbolTable.addSymbol($CLOSE_PAR.getText(), $CLOSE_PAR);}
	   OPEN_CUR_BRA {CompilerController.symbolTable.addSymbol($OPEN_CUR_BRA.getText(), $OPEN_CUR_BRA);}
	   exp2
	   (retSt)?
	   CLOSE_CUR_BRA {CompilerController.symbolTable.addSymbol($CLOSE_CUR_BRA.getText(), $CLOSE_CUR_BRA);};
type : INT {CompilerController.pushTokenValue($INT.getText());
			CompilerController.symbolTable.addSymbol($INT.getText(), $INT);}
	   |
	   FLT {CompilerController.pushTokenValue($FLT.getText());
			CompilerController.symbolTable.addSymbol($FLT.getText(), $FLT);};
arg : type ID {if(CompilerController.symbolTable.containsSymbol($ID.getText()) == false)
				CompilerController.symbolTable.addSymbol($ID.getText(), $ID);}
	  (COMMA {CompilerController.symbolTable.addSymbol($COMMA.getText(), $COMMA);} arg)*;

INT_NO : [ +-][0-9]+ ;
INT : 'int' ;

FLT_NO : [ +-][0-9]*'.'[0-9]+'f' ;
FLT : 'float' ;

AS : '=' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;

IF : 'if' ;
ELSE : 'else' ;
SWITCH : 'switch' ;
CASE : 'case' ;
BREAK : 'break' ;

EQ : '==' ;
NEQ : '!=' ;
GTE : '>=' ;
LTE : '<=' ;
GT : '>' ;
LT : '<' ;

WHILE : 'while' ;
FOR : 'for' ;
DO : 'do' ;

WS : [ \t\r\n]+ -> skip ;

OPEN_PAR : '(' ;
CLOSE_PAR : ')' ;
OPEN_CUR_BRA : '{' ;
CLOSE_CUR_BRA : '}' ;

CLASS : 'class' ;
MAIN_FUNC : 'main' ;

INPUT : 'input' ;
OUTPUT : 'output' ;

FUNC : 'void_func' | 'int_func' | 'float_func' ;
RET : 'return' ;

SEMICOLON : ';' ;
COMMA: ',';

CLASS_ID : [A-Z]('a'..'z'|'A'..'Z'|'0'..'9')* ;

ID : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

COMMENT : ('//'[ \ta-zA-Z0-9]*) ->  skip;
