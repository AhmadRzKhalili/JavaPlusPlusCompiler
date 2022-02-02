// Generated from JavaPlusPlus.g4 by ANTLR 4.9.2
package ir.ac.kntu.khalili.javapluspluscompiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaPlusPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT_NO=2, INT=3, FLT_NO=4, FLT=5, AS=6, MUL=7, DIV=8, ADD=9, SUB=10, 
		IF=11, ELSE=12, SWITCH=13, CASE=14, BREAK=15, EQ=16, NEQ=17, GTE=18, LTE=19, 
		GT=20, LT=21, WHILE=22, FOR=23, DO=24, WS=25, OPEN_PAR=26, CLOSE_PAR=27, 
		OPEN_CUR_BRA=28, CLOSE_CUR_BRA=29, CLASS=30, MAIN_FUNC=31, INPUT=32, OUTPUT=33, 
		FUNC=34, RET=35, SEMICOLON=36, COMMA=37, CLASS_ID=38, ID=39, COMMENT=40;
	public static final int
		RULE_s = 0, RULE_exp1 = 1, RULE_exp2 = 2, RULE_exp3 = 3, RULE_exp4 = 4, 
		RULE_exp5 = 5, RULE_ioSt = 6, RULE_defSt = 7, RULE_assignmentSt = 8, RULE_ifElseSt = 9, 
		RULE_compareSt = 10, RULE_elseSt = 11, RULE_switchSt = 12, RULE_caseSt = 13, 
		RULE_loopSt = 14, RULE_whileSt = 15, RULE_forSt = 16, RULE_doWhileSt = 17, 
		RULE_funcCallSt = 18, RULE_retSt = 19, RULE_num = 20, RULE_relop = 21, 
		RULE_func = 22, RULE_type = 23, RULE_arg = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "exp1", "exp2", "exp3", "exp4", "exp5", "ioSt", "defSt", "assignmentSt", 
			"ifElseSt", "compareSt", "elseSt", "switchSt", "caseSt", "loopSt", "whileSt", 
			"forSt", "doWhileSt", "funcCallSt", "retSt", "num", "relop", "func", 
			"type", "arg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", null, "'int'", null, "'float'", "'='", "'*'", "'/'", "'+'", 
			"'-'", "'if'", "'else'", "'switch'", "'case'", "'break'", "'=='", "'!='", 
			"'>='", "'<='", "'>'", "'<'", "'while'", "'for'", "'do'", null, "'('", 
			"')'", "'{'", "'}'", "'class'", "'main'", "'input'", "'output'", null, 
			"'return'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT_NO", "INT", "FLT_NO", "FLT", "AS", "MUL", "DIV", "ADD", 
			"SUB", "IF", "ELSE", "SWITCH", "CASE", "BREAK", "EQ", "NEQ", "GTE", "LTE", 
			"GT", "LT", "WHILE", "FOR", "DO", "WS", "OPEN_PAR", "CLOSE_PAR", "OPEN_CUR_BRA", 
			"CLOSE_CUR_BRA", "CLASS", "MAIN_FUNC", "INPUT", "OUTPUT", "FUNC", "RET", 
			"SEMICOLON", "COMMA", "CLASS_ID", "ID", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaPlusPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaPlusPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Token CLASS;
		public Token CLASS_ID;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public Token SEMICOLON;
		public TerminalNode CLASS() { return getToken(JavaPlusPlusParser.CLASS, 0); }
		public TerminalNode CLASS_ID() { return getToken(JavaPlusPlusParser.CLASS_ID, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaPlusPlusParser.SEMICOLON, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((SContext)_localctx).CLASS = match(CLASS);
			CompilerController.symbolTable.addSymbol(((SContext)_localctx).CLASS.getText(), ((SContext)_localctx).CLASS);
			setState(52);
			((SContext)_localctx).CLASS_ID = match(CLASS_ID);
			CompilerController.symbolTable.addSymbol(((SContext)_localctx).CLASS_ID.getText(), ((SContext)_localctx).CLASS_ID);
			setState(54);
			((SContext)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((SContext)_localctx).OPEN_CUR_BRA.getText(), ((SContext)_localctx).OPEN_CUR_BRA);
			setState(56);
			exp1();
			setState(57);
			((SContext)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((SContext)_localctx).CLOSE_CUR_BRA.getText(), ((SContext)_localctx).CLOSE_CUR_BRA);
			setState(59);
			((SContext)_localctx).SEMICOLON = match(SEMICOLON);
			CompilerController.symbolTable.addSymbol(((SContext)_localctx).SEMICOLON.getText(), ((SContext)_localctx).SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp1Context extends ParserRuleContext {
		public Token MAIN_FUNC;
		public Token OPEN_PAR;
		public Token CLOSE_PAR;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public TerminalNode MAIN_FUNC() { return getToken(JavaPlusPlusParser.MAIN_FUNC, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<Exp2Context> exp2() {
			return getRuleContexts(Exp2Context.class);
		}
		public Exp2Context exp2(int i) {
			return getRuleContext(Exp2Context.class,i);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(62);
				func();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			((Exp1Context)_localctx).MAIN_FUNC = match(MAIN_FUNC);
			CompilerController.symbolTable.addSymbol(((Exp1Context)_localctx).MAIN_FUNC.getText(), ((Exp1Context)_localctx).MAIN_FUNC);
			setState(70);
			((Exp1Context)_localctx).OPEN_PAR = match(OPEN_PAR);
			CompilerController.symbolTable.addSymbol(((Exp1Context)_localctx).OPEN_PAR.getText(), ((Exp1Context)_localctx).OPEN_PAR);
			setState(72);
			((Exp1Context)_localctx).CLOSE_PAR = match(CLOSE_PAR);
			CompilerController.symbolTable.addSymbol(((Exp1Context)_localctx).CLOSE_PAR.getText(), ((Exp1Context)_localctx).CLOSE_PAR);
			setState(74);
			((Exp1Context)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((Exp1Context)_localctx).OPEN_CUR_BRA.getText(), ((Exp1Context)_localctx).OPEN_CUR_BRA);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLT) | (1L << IF) | (1L << SWITCH) | (1L << WHILE) | (1L << FOR) | (1L << DO) | (1L << INPUT) | (1L << OUTPUT) | (1L << ID))) != 0)) {
				{
				{
				setState(76);
				exp2();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			((Exp1Context)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((Exp1Context)_localctx).CLOSE_CUR_BRA.getText(), ((Exp1Context)_localctx).CLOSE_CUR_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp2Context extends ParserRuleContext {
		public Token SEMICOLON;
		public IoStContext ioSt() {
			return getRuleContext(IoStContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaPlusPlusParser.SEMICOLON, 0); }
		public DefStContext defSt() {
			return getRuleContext(DefStContext.class,0);
		}
		public AssignmentStContext assignmentSt() {
			return getRuleContext(AssignmentStContext.class,0);
		}
		public IfElseStContext ifElseSt() {
			return getRuleContext(IfElseStContext.class,0);
		}
		public SwitchStContext switchSt() {
			return getRuleContext(SwitchStContext.class,0);
		}
		public LoopStContext loopSt() {
			return getRuleContext(LoopStContext.class,0);
		}
		public FuncCallStContext funcCallSt() {
			return getRuleContext(FuncCallStContext.class,0);
		}
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp2);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				ioSt();
				setState(86);
				((Exp2Context)_localctx).SEMICOLON = match(SEMICOLON);
				CompilerController.symbolTable.addSymbol(((Exp2Context)_localctx).SEMICOLON.getText(), ((Exp2Context)_localctx).SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				defSt();
				setState(90);
				((Exp2Context)_localctx).SEMICOLON = match(SEMICOLON);
				CompilerController.symbolTable.addSymbol(((Exp2Context)_localctx).SEMICOLON.getText(), ((Exp2Context)_localctx).SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				assignmentSt();
				setState(94);
				((Exp2Context)_localctx).SEMICOLON = match(SEMICOLON);
				CompilerController.symbolTable.addSymbol(((Exp2Context)_localctx).SEMICOLON.getText(), ((Exp2Context)_localctx).SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				ifElseSt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				switchSt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				loopSt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				funcCallSt();
				setState(101);
				((Exp2Context)_localctx).SEMICOLON = match(SEMICOLON);
				CompilerController.symbolTable.addSymbol(((Exp2Context)_localctx).SEMICOLON.getText(), ((Exp2Context)_localctx).SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp3Context extends ParserRuleContext {
		public Token ADD;
		public Token SUB;
		public List<Exp4Context> exp4() {
			return getRuleContexts(Exp4Context.class);
		}
		public Exp4Context exp4(int i) {
			return getRuleContext(Exp4Context.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JavaPlusPlusParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JavaPlusPlusParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(JavaPlusPlusParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(JavaPlusPlusParser.SUB, i);
		}
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitExp3(this);
		}
	}

	public final Exp3Context exp3() throws RecognitionException {
		Exp3Context _localctx = new Exp3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			exp4();
			String e4Type1 = CompilerController.popTokenValue();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(108);
					((Exp3Context)_localctx).ADD = match(ADD);
					CompilerController.symbolTable.addSymbol(((Exp3Context)_localctx).ADD.getText(), ((Exp3Context)_localctx).ADD);
								CompilerController.pushTempValue("+");
							   
					}
					break;
				case SUB:
					{
					setState(110);
					((Exp3Context)_localctx).SUB = match(SUB);
					CompilerController.symbolTable.addSymbol(((Exp3Context)_localctx).SUB.getText(), ((Exp3Context)_localctx).SUB);
								CompilerController.pushTempValue("-");
							   
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114);
				exp4();
					String e4Type2 = CompilerController.popTokenValue();
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
						  
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			CompilerController.pushTokenValue(e4Type1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp4Context extends ParserRuleContext {
		public Token MUL;
		public Token DIV;
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public List<Exp4Context> exp4() {
			return getRuleContexts(Exp4Context.class);
		}
		public Exp4Context exp4(int i) {
			return getRuleContext(Exp4Context.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(JavaPlusPlusParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(JavaPlusPlusParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JavaPlusPlusParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JavaPlusPlusParser.DIV, i);
		}
		public Exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterExp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitExp4(this);
		}
	}

	public final Exp4Context exp4() throws RecognitionException {
		Exp4Context _localctx = new Exp4Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp4);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			exp5();
			String e5Type1 = CompilerController.popTokenValue();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(126);
						((Exp4Context)_localctx).MUL = match(MUL);
						CompilerController.symbolTable.addSymbol(((Exp4Context)_localctx).MUL.getText(), ((Exp4Context)_localctx).MUL);
									CompilerController.pushTempValue("*");
								   
						}
						break;
					case DIV:
						{
						setState(128);
						((Exp4Context)_localctx).DIV = match(DIV);
						CompilerController.symbolTable.addSymbol(((Exp4Context)_localctx).DIV.getText(), ((Exp4Context)_localctx).DIV);
									CompilerController.pushTempValue("/");
								   
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(132);
					exp4();
					String e5Type2 = CompilerController.popTokenValue();
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
							  
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			CompilerController.pushTokenValue(e5Type1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp5Context extends ParserRuleContext {
		public Token ID;
		public Token OPEN_PAR;
		public Token CLOSE_PAR;
		public TerminalNode ID() { return getToken(JavaPlusPlusParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public Exp5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterExp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitExp5(this);
		}
	}

	public final Exp5Context exp5() throws RecognitionException {
		Exp5Context _localctx = new Exp5Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_exp5);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((Exp5Context)_localctx).ID = match(ID);

							if(CompilerController.containsSymbol(((Exp5Context)_localctx).ID.getText())) {
								String type = CompilerController.symbolTable.getType(((Exp5Context)_localctx).ID.getText());
								CompilerController.pushTokenValue(type);
								CompilerController.pushTempValue(((Exp5Context)_localctx).ID.getText());
							} else {
								CompilerController.showVarNotDefinedError(((Exp5Context)_localctx).ID.getText());
							}
						  
				}
				break;
			case INT_NO:
			case FLT_NO:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				num();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				((Exp5Context)_localctx).OPEN_PAR = match(OPEN_PAR);
				CompilerController.symbolTable.addSymbol(((Exp5Context)_localctx).OPEN_PAR.getText(), ((Exp5Context)_localctx).OPEN_PAR);
				setState(147);
				exp3();
				setState(148);
				((Exp5Context)_localctx).CLOSE_PAR = match(CLOSE_PAR);
				CompilerController.symbolTable.addSymbol(((Exp5Context)_localctx).CLOSE_PAR.getText(), ((Exp5Context)_localctx).CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoStContext extends ParserRuleContext {
		public Token INPUT;
		public Token OPEN_PAR;
		public Token CLOSE_PAR;
		public Token OUTPUT;
		public TerminalNode INPUT() { return getToken(JavaPlusPlusParser.INPUT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public TerminalNode OUTPUT() { return getToken(JavaPlusPlusParser.OUTPUT, 0); }
		public IoStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterIoSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitIoSt(this);
		}
	}

	public final IoStContext ioSt() throws RecognitionException {
		IoStContext _localctx = new IoStContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ioSt);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((IoStContext)_localctx).INPUT = match(INPUT);
				CompilerController.symbolTable.addSymbol(((IoStContext)_localctx).INPUT.getText(), ((IoStContext)_localctx).INPUT);
				setState(155);
				((IoStContext)_localctx).OPEN_PAR = match(OPEN_PAR);
				CompilerController.symbolTable.addSymbol(((IoStContext)_localctx).OPEN_PAR.getText(), ((IoStContext)_localctx).OPEN_PAR);
				setState(157);
				exp3();
				setState(158);
				((IoStContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
				CompilerController.symbolTable.addSymbol(((IoStContext)_localctx).CLOSE_PAR.getText(), ((IoStContext)_localctx).CLOSE_PAR);
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				((IoStContext)_localctx).OUTPUT = match(OUTPUT);
				CompilerController.symbolTable.addSymbol(((IoStContext)_localctx).OUTPUT.getText(), ((IoStContext)_localctx).OUTPUT);
				setState(163);
				((IoStContext)_localctx).OPEN_PAR = match(OPEN_PAR);
				CompilerController.symbolTable.addSymbol(((IoStContext)_localctx).OPEN_PAR.getText(), ((IoStContext)_localctx).OPEN_PAR);
				setState(165);
				exp3();
				setState(166);
				((IoStContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
				CompilerController.symbolTable.addSymbol(((IoStContext)_localctx).CLOSE_PAR.getText(), ((IoStContext)_localctx).CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefStContext extends ParserRuleContext {
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaPlusPlusParser.ID, 0); }
		public DefStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterDefSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitDefSt(this);
		}
	}

	public final DefStContext defSt() throws RecognitionException {
		DefStContext _localctx = new DefStContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();
			setState(172);
			((DefStContext)_localctx).ID = match(ID);
			if(!CompilerController.symbolTable.containsSymbol(((DefStContext)_localctx).ID.getText()))
								CompilerController.symbolTable.addSymbol(((DefStContext)_localctx).ID.getText(), CompilerController.peekTokenValue(), ((DefStContext)_localctx).ID);
							else
								CompilerController.showVarAlreadyDefinedError(((DefStContext)_localctx).ID.getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStContext extends ParserRuleContext {
		public Token ID;
		public Token AS;
		public TerminalNode ID() { return getToken(JavaPlusPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(JavaPlusPlusParser.AS, 0); }
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public AssignmentStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterAssignmentSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitAssignmentSt(this);
		}
	}

	public final AssignmentStContext assignmentSt() throws RecognitionException {
		AssignmentStContext _localctx = new AssignmentStContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			String idType = "";
			setState(176);
			((AssignmentStContext)_localctx).ID = match(ID);

								
								if (!CompilerController.containsSymbol(((AssignmentStContext)_localctx).ID.getText()))
									CompilerController.showVarNotDefinedError(((AssignmentStContext)_localctx).ID.getText());
								else {
									idType = CompilerController.symbolTable.getType(((AssignmentStContext)_localctx).ID.getText());
									CompilerController.pushTokenValue(idType);
								}
							  
			setState(178);
			((AssignmentStContext)_localctx).AS = match(AS);
			CompilerController.symbolTable.addSymbol(((AssignmentStContext)_localctx).AS.getText(), ((AssignmentStContext)_localctx).AS);
			setState(180);
			exp3();

									String e3Type = CompilerController.popTokenValue();
									if(!idType.equals(e3Type))
										CompilerController.showTypeMismatchError(idType, e3Type);
									else{
										String e3Val = CompilerController.popTempValue();
										CompilerController.emitln(((AssignmentStContext)_localctx).ID.getText() + "=" + e3Val);
										if(CompilerController.isTemp(e3Val))
											CompilerController.removeTempVar();
									}
								
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseStContext extends ParserRuleContext {
		public Token IF;
		public Token OPEN_PAR;
		public Token CLOSE_PAR;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public TerminalNode IF() { return getToken(JavaPlusPlusParser.IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public List<Exp3Context> exp3() {
			return getRuleContexts(Exp3Context.class);
		}
		public Exp3Context exp3(int i) {
			return getRuleContext(Exp3Context.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public List<ElseStContext> elseSt() {
			return getRuleContexts(ElseStContext.class);
		}
		public ElseStContext elseSt(int i) {
			return getRuleContext(ElseStContext.class,i);
		}
		public IfElseStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterIfElseSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitIfElseSt(this);
		}
	}

	public final IfElseStContext ifElseSt() throws RecognitionException {
		IfElseStContext _localctx = new IfElseStContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifElseSt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((IfElseStContext)_localctx).IF = match(IF);
			CompilerController.symbolTable.addSymbol(((IfElseStContext)_localctx).IF.getText(), ((IfElseStContext)_localctx).IF);
			setState(185);
			((IfElseStContext)_localctx).OPEN_PAR = match(OPEN_PAR);
			CompilerController.symbolTable.addSymbol(((IfElseStContext)_localctx).OPEN_PAR.getText(), ((IfElseStContext)_localctx).OPEN_PAR);
			setState(187);
			exp3();
			setState(188);
			relop();
			setState(189);
			exp3();

											String e3Val2 = CompilerController.popTempValue();
											String relop = CompilerController.popTempValue();
											String e3Val1 = CompilerController.popTempValue();
											String elseLbl = CompilerController.getTempLbl();
											CompilerController.emitln("if not " + e3Val1 + " " + relop + " " + e3Val2 +  " goto " + elseLbl + ";");
										
			setState(191);
			((IfElseStContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
			CompilerController.symbolTable.addSymbol(((IfElseStContext)_localctx).CLOSE_PAR.getText(), ((IfElseStContext)_localctx).CLOSE_PAR);
			setState(193);
			((IfElseStContext)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((IfElseStContext)_localctx).OPEN_CUR_BRA.getText(), ((IfElseStContext)_localctx).OPEN_CUR_BRA);
			setState(195);
			exp2();

								String endLbl = CompilerController.getTempLbl();
								CompilerController.emitln("goto " + endLbl); 
								CompilerController.emitln(elseLbl + ":"); 
							
			setState(197);
			((IfElseStContext)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((IfElseStContext)_localctx).CLOSE_CUR_BRA.getText(), ((IfElseStContext)_localctx).CLOSE_CUR_BRA);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					elseSt();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			CompilerController.emitln(endLbl + ":");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareStContext extends ParserRuleContext {
		public List<Exp3Context> exp3() {
			return getRuleContexts(Exp3Context.class);
		}
		public Exp3Context exp3(int i) {
			return getRuleContext(Exp3Context.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CompareStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterCompareSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitCompareSt(this);
		}
	}

	public final CompareStContext compareSt() throws RecognitionException {
		CompareStContext _localctx = new CompareStContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compareSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			exp3();
			setState(208);
			relop();
			setState(209);
			exp3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStContext extends ParserRuleContext {
		public Token ELSE;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public TerminalNode ELSE() { return getToken(JavaPlusPlusParser.ELSE, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public IfElseStContext ifElseSt() {
			return getRuleContext(IfElseStContext.class,0);
		}
		public ElseStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterElseSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitElseSt(this);
		}
	}

	public final ElseStContext elseSt() throws RecognitionException {
		ElseStContext _localctx = new ElseStContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseSt);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((ElseStContext)_localctx).ELSE = match(ELSE);
				CompilerController.symbolTable.addSymbol(((ElseStContext)_localctx).ELSE.getText(), ((ElseStContext)_localctx).ELSE);
				setState(213);
				((ElseStContext)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
				CompilerController.symbolTable.addSymbol(((ElseStContext)_localctx).OPEN_CUR_BRA.getText(), ((ElseStContext)_localctx).OPEN_CUR_BRA);
				setState(215);
				exp2();
				setState(216);
				((ElseStContext)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
				CompilerController.symbolTable.addSymbol(((ElseStContext)_localctx).CLOSE_CUR_BRA.getText(), ((ElseStContext)_localctx).CLOSE_CUR_BRA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((ElseStContext)_localctx).ELSE = match(ELSE);
				CompilerController.symbolTable.addSymbol(((ElseStContext)_localctx).ELSE.getText(), ((ElseStContext)_localctx).ELSE);
				setState(221);
				ifElseSt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStContext extends ParserRuleContext {
		public Token SWITCH;
		public Token OPEN_PAR;
		public Token CLOSE_PAR;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public TerminalNode SWITCH() { return getToken(JavaPlusPlusParser.SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public CaseStContext caseSt() {
			return getRuleContext(CaseStContext.class,0);
		}
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public SwitchStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterSwitchSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitSwitchSt(this);
		}
	}

	public final SwitchStContext switchSt() throws RecognitionException {
		SwitchStContext _localctx = new SwitchStContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((SwitchStContext)_localctx).SWITCH = match(SWITCH);
			CompilerController.symbolTable.addSymbol(((SwitchStContext)_localctx).SWITCH.getText(), ((SwitchStContext)_localctx).SWITCH);
			setState(226);
			((SwitchStContext)_localctx).OPEN_PAR = match(OPEN_PAR);
			CompilerController.symbolTable.addSymbol(((SwitchStContext)_localctx).OPEN_PAR.getText(), ((SwitchStContext)_localctx).OPEN_PAR);
			setState(228);
			exp3();
			setState(229);
			((SwitchStContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
			CompilerController.symbolTable.addSymbol(((SwitchStContext)_localctx).CLOSE_PAR.getText(), ((SwitchStContext)_localctx).CLOSE_PAR);
			setState(231);
			((SwitchStContext)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((SwitchStContext)_localctx).OPEN_CUR_BRA.getText(), ((SwitchStContext)_localctx).OPEN_CUR_BRA);
			setState(233);
			caseSt();
			setState(234);
			((SwitchStContext)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((SwitchStContext)_localctx).CLOSE_CUR_BRA.getText(), ((SwitchStContext)_localctx).CLOSE_CUR_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStContext extends ParserRuleContext {
		public Token CASE;
		public Token INT_NO;
		public Token BREAK;
		public Token SEMICOLON;
		public TerminalNode CASE() { return getToken(JavaPlusPlusParser.CASE, 0); }
		public TerminalNode INT_NO() { return getToken(JavaPlusPlusParser.INT_NO, 0); }
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode BREAK() { return getToken(JavaPlusPlusParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaPlusPlusParser.SEMICOLON, 0); }
		public List<CaseStContext> caseSt() {
			return getRuleContexts(CaseStContext.class);
		}
		public CaseStContext caseSt(int i) {
			return getRuleContext(CaseStContext.class,i);
		}
		public CaseStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterCaseSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitCaseSt(this);
		}
	}

	public final CaseStContext caseSt() throws RecognitionException {
		CaseStContext _localctx = new CaseStContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseSt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			((CaseStContext)_localctx).CASE = match(CASE);
			CompilerController.symbolTable.addSymbol(((CaseStContext)_localctx).CASE.getText(), ((CaseStContext)_localctx).CASE);
			setState(239);
			((CaseStContext)_localctx).INT_NO = match(INT_NO);
			CompilerController.symbolTable.addSymbol(((CaseStContext)_localctx).INT_NO.getText(), ((CaseStContext)_localctx).INT_NO);
			setState(241);
			match(T__0);
			setState(242);
			exp2();
			setState(243);
			((CaseStContext)_localctx).BREAK = match(BREAK);
			CompilerController.symbolTable.addSymbol(((CaseStContext)_localctx).BREAK.getText(), ((CaseStContext)_localctx).BREAK);
			setState(245);
			((CaseStContext)_localctx).SEMICOLON = match(SEMICOLON);
			CompilerController.symbolTable.addSymbol(((CaseStContext)_localctx).SEMICOLON.getText(), ((CaseStContext)_localctx).SEMICOLON);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					caseSt();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStContext extends ParserRuleContext {
		public WhileStContext whileSt() {
			return getRuleContext(WhileStContext.class,0);
		}
		public ForStContext forSt() {
			return getRuleContext(ForStContext.class,0);
		}
		public DoWhileStContext doWhileSt() {
			return getRuleContext(DoWhileStContext.class,0);
		}
		public LoopStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterLoopSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitLoopSt(this);
		}
	}

	public final LoopStContext loopSt() throws RecognitionException {
		LoopStContext _localctx = new LoopStContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loopSt);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				whileSt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				forSt();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				doWhileSt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStContext extends ParserRuleContext {
		public Token WHILE;
		public Token OPEN_PAR;
		public Token CLOSE_PAR;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public TerminalNode WHILE() { return getToken(JavaPlusPlusParser.WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public CompareStContext compareSt() {
			return getRuleContext(CompareStContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public WhileStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterWhileSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitWhileSt(this);
		}
	}

	public final WhileStContext whileSt() throws RecognitionException {
		WhileStContext _localctx = new WhileStContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((WhileStContext)_localctx).WHILE = match(WHILE);
			CompilerController.symbolTable.addSymbol(((WhileStContext)_localctx).WHILE.getText(), ((WhileStContext)_localctx).WHILE);
			setState(260);
			((WhileStContext)_localctx).OPEN_PAR = match(OPEN_PAR);
			CompilerController.symbolTable.addSymbol(((WhileStContext)_localctx).OPEN_PAR.getText(), ((WhileStContext)_localctx).OPEN_PAR);
			setState(262);
			compareSt();
			setState(263);
			((WhileStContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
			CompilerController.symbolTable.addSymbol(((WhileStContext)_localctx).CLOSE_PAR.getText(), ((WhileStContext)_localctx).CLOSE_PAR);
			setState(265);
			((WhileStContext)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((WhileStContext)_localctx).OPEN_CUR_BRA.getText(), ((WhileStContext)_localctx).OPEN_CUR_BRA);
			setState(267);
			exp2();
			setState(268);
			((WhileStContext)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((WhileStContext)_localctx).CLOSE_CUR_BRA.getText(), ((WhileStContext)_localctx).CLOSE_CUR_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStContext extends ParserRuleContext {
		public Token FOR;
		public Token OPEN_PAR;
		public Token SEMICOLON;
		public Token CLOSE_PAR;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public TerminalNode FOR() { return getToken(JavaPlusPlusParser.FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public AssignmentStContext assignmentSt() {
			return getRuleContext(AssignmentStContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(JavaPlusPlusParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(JavaPlusPlusParser.SEMICOLON, i);
		}
		public CompareStContext compareSt() {
			return getRuleContext(CompareStContext.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public ForStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterForSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitForSt(this);
		}
	}

	public final ForStContext forSt() throws RecognitionException {
		ForStContext _localctx = new ForStContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((ForStContext)_localctx).FOR = match(FOR);
			CompilerController.symbolTable.addSymbol(((ForStContext)_localctx).FOR.getText(), ((ForStContext)_localctx).FOR);
			setState(273);
			((ForStContext)_localctx).OPEN_PAR = match(OPEN_PAR);
			CompilerController.symbolTable.addSymbol(((ForStContext)_localctx).OPEN_PAR.getText(), ((ForStContext)_localctx).OPEN_PAR);
			setState(275);
			assignmentSt();
			setState(276);
			((ForStContext)_localctx).SEMICOLON = match(SEMICOLON);
			CompilerController.symbolTable.addSymbol(((ForStContext)_localctx).SEMICOLON.getText(), ((ForStContext)_localctx).SEMICOLON);
			setState(278);
			compareSt();
			setState(279);
			((ForStContext)_localctx).SEMICOLON = match(SEMICOLON);
			CompilerController.symbolTable.addSymbol(((ForStContext)_localctx).SEMICOLON.getText(), ((ForStContext)_localctx).SEMICOLON);
			setState(281);
			exp3();
			setState(282);
			((ForStContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
			CompilerController.symbolTable.addSymbol(((ForStContext)_localctx).CLOSE_PAR.getText(), ((ForStContext)_localctx).CLOSE_PAR);
			setState(284);
			((ForStContext)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((ForStContext)_localctx).OPEN_CUR_BRA.getText(), ((ForStContext)_localctx).OPEN_CUR_BRA);
			setState(286);
			exp2();
			setState(287);
			((ForStContext)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((ForStContext)_localctx).CLOSE_CUR_BRA.getText(), ((ForStContext)_localctx).CLOSE_CUR_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStContext extends ParserRuleContext {
		public Token DO;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public Token WHILE;
		public Token OPEN_PAR;
		public Token CLOSE_PAR;
		public Token SEMICOLON;
		public TerminalNode DO() { return getToken(JavaPlusPlusParser.DO, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public TerminalNode WHILE() { return getToken(JavaPlusPlusParser.WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public CompareStContext compareSt() {
			return getRuleContext(CompareStContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaPlusPlusParser.SEMICOLON, 0); }
		public DoWhileStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterDoWhileSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitDoWhileSt(this);
		}
	}

	public final DoWhileStContext doWhileSt() throws RecognitionException {
		DoWhileStContext _localctx = new DoWhileStContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			((DoWhileStContext)_localctx).DO = match(DO);
			CompilerController.symbolTable.addSymbol(((DoWhileStContext)_localctx).DO.getText(), ((DoWhileStContext)_localctx).DO);
			setState(292);
			((DoWhileStContext)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((DoWhileStContext)_localctx).OPEN_CUR_BRA.getText(), ((DoWhileStContext)_localctx).OPEN_CUR_BRA);
			setState(294);
			exp2();
			setState(295);
			((DoWhileStContext)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((DoWhileStContext)_localctx).CLOSE_CUR_BRA.getText(), ((DoWhileStContext)_localctx).CLOSE_CUR_BRA);
			setState(297);
			((DoWhileStContext)_localctx).WHILE = match(WHILE);
			CompilerController.symbolTable.addSymbol(((DoWhileStContext)_localctx).WHILE.getText(), ((DoWhileStContext)_localctx).WHILE);
			setState(299);
			((DoWhileStContext)_localctx).OPEN_PAR = match(OPEN_PAR);
			CompilerController.symbolTable.addSymbol(((DoWhileStContext)_localctx).OPEN_PAR.getText(), ((DoWhileStContext)_localctx).OPEN_PAR);
			setState(301);
			compareSt();
			setState(302);
			((DoWhileStContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
			CompilerController.symbolTable.addSymbol(((DoWhileStContext)_localctx).CLOSE_PAR.getText(), ((DoWhileStContext)_localctx).CLOSE_PAR);
			setState(304);
			((DoWhileStContext)_localctx).SEMICOLON = match(SEMICOLON);
			CompilerController.symbolTable.addSymbol(((DoWhileStContext)_localctx).SEMICOLON.getText(), ((DoWhileStContext)_localctx).SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallStContext extends ParserRuleContext {
		public Token AS;
		public Token ID;
		public Token OPEN_PAR;
		public Token COMMA;
		public Token CLOSE_PAR;
		public TerminalNode ID() { return getToken(JavaPlusPlusParser.ID, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public List<Exp3Context> exp3() {
			return getRuleContexts(Exp3Context.class);
		}
		public Exp3Context exp3(int i) {
			return getRuleContext(Exp3Context.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public DefStContext defSt() {
			return getRuleContext(DefStContext.class,0);
		}
		public TerminalNode AS() { return getToken(JavaPlusPlusParser.AS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaPlusPlusParser.COMMA, i);
		}
		public FuncCallStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterFuncCallSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitFuncCallSt(this);
		}
	}

	public final FuncCallStContext funcCallSt() throws RecognitionException {
		FuncCallStContext _localctx = new FuncCallStContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcCallSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==FLT) {
				{
				setState(307);
				defSt();
				setState(308);
				((FuncCallStContext)_localctx).AS = match(AS);
				CompilerController.symbolTable.addSymbol(((FuncCallStContext)_localctx).AS.getText(), ((FuncCallStContext)_localctx).AS);
				}
			}

			setState(313);
			((FuncCallStContext)_localctx).ID = match(ID);
			if(CompilerController.symbolTable.containsSymbol(((FuncCallStContext)_localctx).ID.getText()) == false)
								CompilerController.symbolTable.addSymbol(((FuncCallStContext)_localctx).ID.getText(), ((FuncCallStContext)_localctx).ID);
			setState(315);
			((FuncCallStContext)_localctx).OPEN_PAR = match(OPEN_PAR);
			CompilerController.symbolTable.addSymbol(((FuncCallStContext)_localctx).OPEN_PAR.getText(), ((FuncCallStContext)_localctx).OPEN_PAR);
			setState(317);
			exp3();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(318);
				((FuncCallStContext)_localctx).COMMA = match(COMMA);
				CompilerController.symbolTable.addSymbol(((FuncCallStContext)_localctx).COMMA.getText(), ((FuncCallStContext)_localctx).COMMA);
				setState(320);
				exp3();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			((FuncCallStContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
			CompilerController.symbolTable.addSymbol(((FuncCallStContext)_localctx).CLOSE_PAR.getText(), ((FuncCallStContext)_localctx).CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetStContext extends ParserRuleContext {
		public Token RET;
		public TerminalNode RET() { return getToken(JavaPlusPlusParser.RET, 0); }
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public RetStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterRetSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitRetSt(this);
		}
	}

	public final RetStContext retSt() throws RecognitionException {
		RetStContext _localctx = new RetStContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((RetStContext)_localctx).RET = match(RET);
			CompilerController.symbolTable.addSymbol(((RetStContext)_localctx).RET.getText(), ((RetStContext)_localctx).RET);
			setState(331);
			exp3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public Token INT_NO;
		public Token FLT_NO;
		public TerminalNode INT_NO() { return getToken(JavaPlusPlusParser.INT_NO, 0); }
		public TerminalNode FLT_NO() { return getToken(JavaPlusPlusParser.FLT_NO, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_num);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				((NumContext)_localctx).INT_NO = match(INT_NO);
				CompilerController.symbolTable.addSymbol(((NumContext)_localctx).INT_NO.getText(), ((NumContext)_localctx).INT_NO);
							  CompilerController.pushTempValue(((NumContext)_localctx).INT_NO.getText());
							 
				}
				break;
			case FLT_NO:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				((NumContext)_localctx).FLT_NO = match(FLT_NO);
				CompilerController.symbolTable.addSymbol(((NumContext)_localctx).FLT_NO.getText(), ((NumContext)_localctx).FLT_NO);
							  CompilerController.pushTempValue(((NumContext)_localctx).FLT_NO.getText());
							 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public Token EQ;
		public Token NEQ;
		public Token GTE;
		public Token LTE;
		public Token GT;
		public Token LT;
		public TerminalNode EQ() { return getToken(JavaPlusPlusParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(JavaPlusPlusParser.NEQ, 0); }
		public TerminalNode GTE() { return getToken(JavaPlusPlusParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(JavaPlusPlusParser.LTE, 0); }
		public TerminalNode GT() { return getToken(JavaPlusPlusParser.GT, 0); }
		public TerminalNode LT() { return getToken(JavaPlusPlusParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relop);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				((RelopContext)_localctx).EQ = match(EQ);
				CompilerController.symbolTable.addSymbol(((RelopContext)_localctx).EQ.getText(), ((RelopContext)_localctx).EQ);CompilerController.pushTempValue("==");
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				((RelopContext)_localctx).NEQ = match(NEQ);
				CompilerController.symbolTable.addSymbol(((RelopContext)_localctx).NEQ.getText(), ((RelopContext)_localctx).NEQ);CompilerController.pushTempValue("!=");
				}
				break;
			case GTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				((RelopContext)_localctx).GTE = match(GTE);
				CompilerController.symbolTable.addSymbol(((RelopContext)_localctx).GTE.getText(), ((RelopContext)_localctx).GTE);CompilerController.pushTempValue(">=");
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				((RelopContext)_localctx).LTE = match(LTE);
				CompilerController.symbolTable.addSymbol(((RelopContext)_localctx).LTE.getText(), ((RelopContext)_localctx).LTE);CompilerController.pushTempValue("<=");
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				((RelopContext)_localctx).GT = match(GT);
				CompilerController.symbolTable.addSymbol(((RelopContext)_localctx).GT.getText(), ((RelopContext)_localctx).GT);CompilerController.pushTempValue(">");
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				((RelopContext)_localctx).LT = match(LT);
				CompilerController.symbolTable.addSymbol(((RelopContext)_localctx).LT.getText(), ((RelopContext)_localctx).LT);CompilerController.pushTempValue("<");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public Token FUNC;
		public Token ID;
		public Token OPEN_PAR;
		public Token CLOSE_PAR;
		public Token OPEN_CUR_BRA;
		public Token CLOSE_CUR_BRA;
		public TerminalNode FUNC() { return getToken(JavaPlusPlusParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(JavaPlusPlusParser.ID, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JavaPlusPlusParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JavaPlusPlusParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CUR_BRA() { return getToken(JavaPlusPlusParser.OPEN_CUR_BRA, 0); }
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode CLOSE_CUR_BRA() { return getToken(JavaPlusPlusParser.CLOSE_CUR_BRA, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public RetStContext retSt() {
			return getRuleContext(RetStContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			((FuncContext)_localctx).FUNC = match(FUNC);
			CompilerController.symbolTable.addSymbol(((FuncContext)_localctx).FUNC.getText(), ((FuncContext)_localctx).FUNC);
			setState(355);
			((FuncContext)_localctx).ID = match(ID);
			if(CompilerController.symbolTable.containsSymbol(((FuncContext)_localctx).ID.getText()) == false)
						CompilerController.symbolTable.addSymbol(((FuncContext)_localctx).ID.getText(), ((FuncContext)_localctx).ID);
			setState(357);
			((FuncContext)_localctx).OPEN_PAR = match(OPEN_PAR);
			CompilerController.symbolTable.addSymbol(((FuncContext)_localctx).OPEN_PAR.getText(), ((FuncContext)_localctx).OPEN_PAR);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==FLT) {
				{
				{
				setState(359);
				arg();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			((FuncContext)_localctx).CLOSE_PAR = match(CLOSE_PAR);
			CompilerController.symbolTable.addSymbol(((FuncContext)_localctx).CLOSE_PAR.getText(), ((FuncContext)_localctx).CLOSE_PAR);
			setState(367);
			((FuncContext)_localctx).OPEN_CUR_BRA = match(OPEN_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((FuncContext)_localctx).OPEN_CUR_BRA.getText(), ((FuncContext)_localctx).OPEN_CUR_BRA);
			setState(369);
			exp2();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RET) {
				{
				setState(370);
				retSt();
				}
			}

			setState(373);
			((FuncContext)_localctx).CLOSE_CUR_BRA = match(CLOSE_CUR_BRA);
			CompilerController.symbolTable.addSymbol(((FuncContext)_localctx).CLOSE_CUR_BRA.getText(), ((FuncContext)_localctx).CLOSE_CUR_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Token INT;
		public Token FLT;
		public TerminalNode INT() { return getToken(JavaPlusPlusParser.INT, 0); }
		public TerminalNode FLT() { return getToken(JavaPlusPlusParser.FLT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				((TypeContext)_localctx).INT = match(INT);
				CompilerController.pushTokenValue(((TypeContext)_localctx).INT.getText());
							CompilerController.symbolTable.addSymbol(((TypeContext)_localctx).INT.getText(), ((TypeContext)_localctx).INT);
				}
				break;
			case FLT:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				((TypeContext)_localctx).FLT = match(FLT);
				CompilerController.pushTokenValue(((TypeContext)_localctx).FLT.getText());
							CompilerController.symbolTable.addSymbol(((TypeContext)_localctx).FLT.getText(), ((TypeContext)_localctx).FLT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public Token ID;
		public Token COMMA;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaPlusPlusParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaPlusPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaPlusPlusParser.COMMA, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaPlusPlusListener ) ((JavaPlusPlusListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			type();
			setState(383);
			((ArgContext)_localctx).ID = match(ID);
			if(CompilerController.symbolTable.containsSymbol(((ArgContext)_localctx).ID.getText()) == false)
							CompilerController.symbolTable.addSymbol(((ArgContext)_localctx).ID.getText(), ((ArgContext)_localctx).ID);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					((ArgContext)_localctx).COMMA = match(COMMA);
					CompilerController.symbolTable.addSymbol(((ArgContext)_localctx).COMMA.getText(), ((ArgContext)_localctx).COMMA);
					setState(387);
					arg();
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u018c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3B\n"+
		"\3\f\3\16\3E\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16"+
		"\3S\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3"+
		"\5\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0085\n\6\3\6\3\6\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ac\n\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cb\n\13\f\13\16"+
		"\13\u00ce\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00e1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00fb\n\17\f\17\16\17\u00fe\13\17\3\20\3\20\3\20\5\20"+
		"\u0103\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u013a\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0144\n\24\f"+
		"\24\16\24\u0147\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\5\26\u0154\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0162\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u016b"+
		"\n\30\f\30\16\30\u016e\13\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0176"+
		"\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u017f\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0187\n\32\f\32\16\32\u018a\13\32\3\32\2\2\33\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\2\u0192\2\64\3"+
		"\2\2\2\4C\3\2\2\2\6j\3\2\2\2\bl\3\2\2\2\n~\3\2\2\2\f\u0099\3\2\2\2\16"+
		"\u00ab\3\2\2\2\20\u00ad\3\2\2\2\22\u00b1\3\2\2\2\24\u00b9\3\2\2\2\26\u00d1"+
		"\3\2\2\2\30\u00e0\3\2\2\2\32\u00e2\3\2\2\2\34\u00ef\3\2\2\2\36\u0102\3"+
		"\2\2\2 \u0104\3\2\2\2\"\u0111\3\2\2\2$\u0124\3\2\2\2&\u0139\3\2\2\2(\u014b"+
		"\3\2\2\2*\u0153\3\2\2\2,\u0161\3\2\2\2.\u0163\3\2\2\2\60\u017e\3\2\2\2"+
		"\62\u0180\3\2\2\2\64\65\7 \2\2\65\66\b\2\1\2\66\67\7(\2\2\678\b\2\1\2"+
		"89\7\36\2\29:\b\2\1\2:;\5\4\3\2;<\7\37\2\2<=\b\2\1\2=>\7&\2\2>?\b\2\1"+
		"\2?\3\3\2\2\2@B\5.\30\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FG\7!\2\2GH\b\3\1\2HI\7\34\2\2IJ\b\3\1\2JK\7\35\2\2KL\b"+
		"\3\1\2LM\7\36\2\2MQ\b\3\1\2NP\5\6\4\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR"+
		"\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\37\2\2UV\b\3\1\2V\5\3\2\2\2WX\5\16\b"+
		"\2XY\7&\2\2YZ\b\4\1\2Zk\3\2\2\2[\\\5\20\t\2\\]\7&\2\2]^\b\4\1\2^k\3\2"+
		"\2\2_`\5\22\n\2`a\7&\2\2ab\b\4\1\2bk\3\2\2\2ck\5\24\13\2dk\5\32\16\2e"+
		"k\5\36\20\2fg\5&\24\2gh\7&\2\2hi\b\4\1\2ik\3\2\2\2jW\3\2\2\2j[\3\2\2\2"+
		"j_\3\2\2\2jc\3\2\2\2jd\3\2\2\2je\3\2\2\2jf\3\2\2\2k\7\3\2\2\2lm\5\n\6"+
		"\2my\b\5\1\2no\7\13\2\2os\b\5\1\2pq\7\f\2\2qs\b\5\1\2rn\3\2\2\2rp\3\2"+
		"\2\2st\3\2\2\2tu\5\n\6\2uv\b\5\1\2vx\3\2\2\2wr\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\b\5\1\2}\t\3\2\2\2~\177\5\f\7\2\177"+
		"\u008b\b\6\1\2\u0080\u0081\7\t\2\2\u0081\u0085\b\6\1\2\u0082\u0083\7\n"+
		"\2\2\u0083\u0085\b\6\1\2\u0084\u0080\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\5\n\6\2\u0087\u0088\b\6\1\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\6"+
		"\1\2\u008f\13\3\2\2\2\u0090\u0091\7)\2\2\u0091\u009a\b\7\1\2\u0092\u009a"+
		"\5*\26\2\u0093\u0094\7\34\2\2\u0094\u0095\b\7\1\2\u0095\u0096\5\b\5\2"+
		"\u0096\u0097\7\35\2\2\u0097\u0098\b\7\1\2\u0098\u009a\3\2\2\2\u0099\u0090"+
		"\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0093\3\2\2\2\u009a\r\3\2\2\2\u009b"+
		"\u009c\7\"\2\2\u009c\u009d\b\b\1\2\u009d\u009e\7\34\2\2\u009e\u009f\b"+
		"\b\1\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2\b\b\1\2\u00a2"+
		"\u00ac\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5\b\b\1\2\u00a5\u00a6\7\34"+
		"\2\2\u00a6\u00a7\b\b\1\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\7\35\2\2\u00a9"+
		"\u00aa\b\b\1\2\u00aa\u00ac\3\2\2\2\u00ab\u009b\3\2\2\2\u00ab\u00a3\3\2"+
		"\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\5\60\31\2\u00ae\u00af\7)\2\2\u00af\u00b0"+
		"\b\t\1\2\u00b0\21\3\2\2\2\u00b1\u00b2\b\n\1\2\u00b2\u00b3\7)\2\2\u00b3"+
		"\u00b4\b\n\1\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\b\n\1\2\u00b6\u00b7\5\b"+
		"\5\2\u00b7\u00b8\b\n\1\2\u00b8\23\3\2\2\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb"+
		"\b\13\1\2\u00bb\u00bc\7\34\2\2\u00bc\u00bd\b\13\1\2\u00bd\u00be\5\b\5"+
		"\2\u00be\u00bf\5,\27\2\u00bf\u00c0\5\b\5\2\u00c0\u00c1\b\13\1\2\u00c1"+
		"\u00c2\7\35\2\2\u00c2\u00c3\b\13\1\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5"+
		"\b\13\1\2\u00c5\u00c6\5\6\4\2\u00c6\u00c7\b\13\1\2\u00c7\u00c8\7\37\2"+
		"\2\u00c8\u00cc\b\13\1\2\u00c9\u00cb\5\30\r\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\13\1\2\u00d0\25\3\2\2\2\u00d1\u00d2"+
		"\5\b\5\2\u00d2\u00d3\5,\27\2\u00d3\u00d4\5\b\5\2\u00d4\27\3\2\2\2\u00d5"+
		"\u00d6\7\16\2\2\u00d6\u00d7\b\r\1\2\u00d7\u00d8\7\36\2\2\u00d8\u00d9\b"+
		"\r\1\2\u00d9\u00da\5\6\4\2\u00da\u00db\7\37\2\2\u00db\u00dc\b\r\1\2\u00dc"+
		"\u00e1\3\2\2\2\u00dd\u00de\7\16\2\2\u00de\u00df\b\r\1\2\u00df\u00e1\5"+
		"\24\13\2\u00e0\u00d5\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1\31\3\2\2\2\u00e2"+
		"\u00e3\7\17\2\2\u00e3\u00e4\b\16\1\2\u00e4\u00e5\7\34\2\2\u00e5\u00e6"+
		"\b\16\1\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\7\35\2\2\u00e8\u00e9\b\16\1"+
		"\2\u00e9\u00ea\7\36\2\2\u00ea\u00eb\b\16\1\2\u00eb\u00ec\5\34\17\2\u00ec"+
		"\u00ed\7\37\2\2\u00ed\u00ee\b\16\1\2\u00ee\33\3\2\2\2\u00ef\u00f0\7\20"+
		"\2\2\u00f0\u00f1\b\17\1\2\u00f1\u00f2\7\4\2\2\u00f2\u00f3\b\17\1\2\u00f3"+
		"\u00f4\7\3\2\2\u00f4\u00f5\5\6\4\2\u00f5\u00f6\7\21\2\2\u00f6\u00f7\b"+
		"\17\1\2\u00f7\u00f8\7&\2\2\u00f8\u00fc\b\17\1\2\u00f9\u00fb\5\34\17\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\35\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0103\5 \21\2\u0100"+
		"\u0103\5\"\22\2\u0101\u0103\5$\23\2\u0102\u00ff\3\2\2\2\u0102\u0100\3"+
		"\2\2\2\u0102\u0101\3\2\2\2\u0103\37\3\2\2\2\u0104\u0105\7\30\2\2\u0105"+
		"\u0106\b\21\1\2\u0106\u0107\7\34\2\2\u0107\u0108\b\21\1\2\u0108\u0109"+
		"\5\26\f\2\u0109\u010a\7\35\2\2\u010a\u010b\b\21\1\2\u010b\u010c\7\36\2"+
		"\2\u010c\u010d\b\21\1\2\u010d\u010e\5\6\4\2\u010e\u010f\7\37\2\2\u010f"+
		"\u0110\b\21\1\2\u0110!\3\2\2\2\u0111\u0112\7\31\2\2\u0112\u0113\b\22\1"+
		"\2\u0113\u0114\7\34\2\2\u0114\u0115\b\22\1\2\u0115\u0116\5\22\n\2\u0116"+
		"\u0117\7&\2\2\u0117\u0118\b\22\1\2\u0118\u0119\5\26\f\2\u0119\u011a\7"+
		"&\2\2\u011a\u011b\b\22\1\2\u011b\u011c\5\b\5\2\u011c\u011d\7\35\2\2\u011d"+
		"\u011e\b\22\1\2\u011e\u011f\7\36\2\2\u011f\u0120\b\22\1\2\u0120\u0121"+
		"\5\6\4\2\u0121\u0122\7\37\2\2\u0122\u0123\b\22\1\2\u0123#\3\2\2\2\u0124"+
		"\u0125\7\32\2\2\u0125\u0126\b\23\1\2\u0126\u0127\7\36\2\2\u0127\u0128"+
		"\b\23\1\2\u0128\u0129\5\6\4\2\u0129\u012a\7\37\2\2\u012a\u012b\b\23\1"+
		"\2\u012b\u012c\7\30\2\2\u012c\u012d\b\23\1\2\u012d\u012e\7\34\2\2\u012e"+
		"\u012f\b\23\1\2\u012f\u0130\5\26\f\2\u0130\u0131\7\35\2\2\u0131\u0132"+
		"\b\23\1\2\u0132\u0133\7&\2\2\u0133\u0134\b\23\1\2\u0134%\3\2\2\2\u0135"+
		"\u0136\5\20\t\2\u0136\u0137\7\b\2\2\u0137\u0138\b\24\1\2\u0138\u013a\3"+
		"\2\2\2\u0139\u0135\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\7)\2\2\u013c\u013d\b\24\1\2\u013d\u013e\7\34\2\2\u013e\u013f\b"+
		"\24\1\2\u013f\u0145\5\b\5\2\u0140\u0141\7\'\2\2\u0141\u0142\b\24\1\2\u0142"+
		"\u0144\5\b\5\2\u0143\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0149\7\35\2\2\u0149\u014a\b\24\1\2\u014a\'\3\2\2\2\u014b\u014c\7%\2"+
		"\2\u014c\u014d\b\25\1\2\u014d\u014e\5\b\5\2\u014e)\3\2\2\2\u014f\u0150"+
		"\7\4\2\2\u0150\u0154\b\26\1\2\u0151\u0152\7\6\2\2\u0152\u0154\b\26\1\2"+
		"\u0153\u014f\3\2\2\2\u0153\u0151\3\2\2\2\u0154+\3\2\2\2\u0155\u0156\7"+
		"\22\2\2\u0156\u0162\b\27\1\2\u0157\u0158\7\23\2\2\u0158\u0162\b\27\1\2"+
		"\u0159\u015a\7\24\2\2\u015a\u0162\b\27\1\2\u015b\u015c\7\25\2\2\u015c"+
		"\u0162\b\27\1\2\u015d\u015e\7\26\2\2\u015e\u0162\b\27\1\2\u015f\u0160"+
		"\7\27\2\2\u0160\u0162\b\27\1\2\u0161\u0155\3\2\2\2\u0161\u0157\3\2\2\2"+
		"\u0161\u0159\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0162-\3\2\2\2\u0163\u0164\7$\2\2\u0164\u0165\b\30\1\2\u0165"+
		"\u0166\7)\2\2\u0166\u0167\b\30\1\2\u0167\u0168\7\34\2\2\u0168\u016c\b"+
		"\30\1\2\u0169\u016b\5\62\32\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016f\u0170\7\35\2\2\u0170\u0171\b\30\1\2\u0171\u0172\7\36\2"+
		"\2\u0172\u0173\b\30\1\2\u0173\u0175\5\6\4\2\u0174\u0176\5(\25\2\u0175"+
		"\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\37"+
		"\2\2\u0178\u0179\b\30\1\2\u0179/\3\2\2\2\u017a\u017b\7\5\2\2\u017b\u017f"+
		"\b\31\1\2\u017c\u017d\7\7\2\2\u017d\u017f\b\31\1\2\u017e\u017a\3\2\2\2"+
		"\u017e\u017c\3\2\2\2\u017f\61\3\2\2\2\u0180\u0181\5\60\31\2\u0181\u0182"+
		"\7)\2\2\u0182\u0188\b\32\1\2\u0183\u0184\7\'\2\2\u0184\u0185\b\32\1\2"+
		"\u0185\u0187\5\62\32\2\u0186\u0183\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\63\3\2\2\2\u018a\u0188\3\2\2\2\27C"+
		"Qjry\u0084\u008b\u0099\u00ab\u00cc\u00e0\u00fc\u0102\u0139\u0145\u0153"+
		"\u0161\u016c\u0175\u017e\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}