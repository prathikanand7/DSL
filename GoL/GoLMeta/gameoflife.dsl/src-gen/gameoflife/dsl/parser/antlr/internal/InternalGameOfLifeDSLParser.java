package gameoflife.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gameoflife.dsl.services.GameOfLifeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameOfLifeDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grid'", "'{'", "'}'", "'cell'", "'('", "','", "')'", "'rules'", "'survive'", "'when'", "'birth'", "'['", "'..'", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameOfLifeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameOfLifeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameOfLifeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGameOfLifeDSL.g"; }



     	private GameOfLifeDSLGrammarAccess grammarAccess;

        public InternalGameOfLifeDSLParser(TokenStream input, GameOfLifeDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GameOfLifeDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGameOfLifeDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGameOfLifeDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGameOfLifeDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGameOfLifeDSL.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_grids_0_0= ruleGrid ) )* ( (lv_rules_1_0= ruleRules ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_grids_0_0 = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:77:2: ( ( ( (lv_grids_0_0= ruleGrid ) )* ( (lv_rules_1_0= ruleRules ) )? ) )
            // InternalGameOfLifeDSL.g:78:2: ( ( (lv_grids_0_0= ruleGrid ) )* ( (lv_rules_1_0= ruleRules ) )? )
            {
            // InternalGameOfLifeDSL.g:78:2: ( ( (lv_grids_0_0= ruleGrid ) )* ( (lv_rules_1_0= ruleRules ) )? )
            // InternalGameOfLifeDSL.g:79:3: ( (lv_grids_0_0= ruleGrid ) )* ( (lv_rules_1_0= ruleRules ) )?
            {
            // InternalGameOfLifeDSL.g:79:3: ( (lv_grids_0_0= ruleGrid ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:80:4: (lv_grids_0_0= ruleGrid )
            	    {
            	    // InternalGameOfLifeDSL.g:80:4: (lv_grids_0_0= ruleGrid )
            	    // InternalGameOfLifeDSL.g:81:5: lv_grids_0_0= ruleGrid
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getGridsGridParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_grids_0_0=ruleGrid();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"grids",
            	    						lv_grids_0_0,
            	    						"gameoflife.dsl.GameOfLifeDSL.Grid");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGameOfLifeDSL.g:98:3: ( (lv_rules_1_0= ruleRules ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGameOfLifeDSL.g:99:4: (lv_rules_1_0= ruleRules )
                    {
                    // InternalGameOfLifeDSL.g:99:4: (lv_rules_1_0= ruleRules )
                    // InternalGameOfLifeDSL.g:100:5: lv_rules_1_0= ruleRules
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getRulesRulesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rules_1_0=ruleRules();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					add(
                    						current,
                    						"rules",
                    						lv_rules_1_0,
                    						"gameoflife.dsl.GameOfLifeDSL.Rules");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGrid"
    // InternalGameOfLifeDSL.g:121:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalGameOfLifeDSL.g:121:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalGameOfLifeDSL.g:122:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGameOfLifeDSL.g:128:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'grid' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_liveCells_3_0= ruleCell ) )* otherlv_4= '}' ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_liveCells_3_0 = null;



        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:134:2: ( (otherlv_0= 'grid' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_liveCells_3_0= ruleCell ) )* otherlv_4= '}' ) )
            // InternalGameOfLifeDSL.g:135:2: (otherlv_0= 'grid' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_liveCells_3_0= ruleCell ) )* otherlv_4= '}' )
            {
            // InternalGameOfLifeDSL.g:135:2: (otherlv_0= 'grid' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_liveCells_3_0= ruleCell ) )* otherlv_4= '}' )
            // InternalGameOfLifeDSL.g:136:3: otherlv_0= 'grid' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_liveCells_3_0= ruleCell ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getGridKeyword_0());
            		
            // InternalGameOfLifeDSL.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGameOfLifeDSL.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGameOfLifeDSL.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalGameOfLifeDSL.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGridAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGridRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGameOfLifeDSL.g:162:3: ( (lv_liveCells_3_0= ruleCell ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:163:4: (lv_liveCells_3_0= ruleCell )
            	    {
            	    // InternalGameOfLifeDSL.g:163:4: (lv_liveCells_3_0= ruleCell )
            	    // InternalGameOfLifeDSL.g:164:5: lv_liveCells_3_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getGridAccess().getLiveCellsCellParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_liveCells_3_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGridRule());
            	    					}
            	    					add(
            	    						current,
            	    						"liveCells",
            	    						lv_liveCells_3_0,
            	    						"gameoflife.dsl.GameOfLifeDSL.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGridAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCell"
    // InternalGameOfLifeDSL.g:189:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalGameOfLifeDSL.g:189:45: (iv_ruleCell= ruleCell EOF )
            // InternalGameOfLifeDSL.g:190:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGameOfLifeDSL.g:196:1: ruleCell returns [EObject current=null] : (otherlv_0= 'cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:202:2: ( (otherlv_0= 'cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalGameOfLifeDSL.g:203:2: (otherlv_0= 'cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalGameOfLifeDSL.g:203:2: (otherlv_0= 'cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalGameOfLifeDSL.g:204:3: otherlv_0= 'cell' otherlv_1= '(' ( (lv_x_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_y_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getCellKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCellAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGameOfLifeDSL.g:212:3: ( (lv_x_2_0= RULE_INT ) )
            // InternalGameOfLifeDSL.g:213:4: (lv_x_2_0= RULE_INT )
            {
            // InternalGameOfLifeDSL.g:213:4: (lv_x_2_0= RULE_INT )
            // InternalGameOfLifeDSL.g:214:5: lv_x_2_0= RULE_INT
            {
            lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_x_2_0, grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCellAccess().getCommaKeyword_3());
            		
            // InternalGameOfLifeDSL.g:234:3: ( (lv_y_4_0= RULE_INT ) )
            // InternalGameOfLifeDSL.g:235:4: (lv_y_4_0= RULE_INT )
            {
            // InternalGameOfLifeDSL.g:235:4: (lv_y_4_0= RULE_INT )
            // InternalGameOfLifeDSL.g:236:5: lv_y_4_0= RULE_INT
            {
            lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_y_4_0, grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCellAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleRules"
    // InternalGameOfLifeDSL.g:260:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalGameOfLifeDSL.g:260:46: (iv_ruleRules= ruleRules EOF )
            // InternalGameOfLifeDSL.g:261:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalGameOfLifeDSL.g:267:1: ruleRules returns [EObject current=null] : (otherlv_0= 'rules' otherlv_1= '{' ( (lv_surviveRules_2_0= ruleSurviveRule ) )* ( (lv_birthRules_3_0= ruleBirthRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_surviveRules_2_0 = null;

        EObject lv_birthRules_3_0 = null;



        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:273:2: ( (otherlv_0= 'rules' otherlv_1= '{' ( (lv_surviveRules_2_0= ruleSurviveRule ) )* ( (lv_birthRules_3_0= ruleBirthRule ) )* otherlv_4= '}' ) )
            // InternalGameOfLifeDSL.g:274:2: (otherlv_0= 'rules' otherlv_1= '{' ( (lv_surviveRules_2_0= ruleSurviveRule ) )* ( (lv_birthRules_3_0= ruleBirthRule ) )* otherlv_4= '}' )
            {
            // InternalGameOfLifeDSL.g:274:2: (otherlv_0= 'rules' otherlv_1= '{' ( (lv_surviveRules_2_0= ruleSurviveRule ) )* ( (lv_birthRules_3_0= ruleBirthRule ) )* otherlv_4= '}' )
            // InternalGameOfLifeDSL.g:275:3: otherlv_0= 'rules' otherlv_1= '{' ( (lv_surviveRules_2_0= ruleSurviveRule ) )* ( (lv_birthRules_3_0= ruleBirthRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRulesAccess().getRulesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGameOfLifeDSL.g:283:3: ( (lv_surviveRules_2_0= ruleSurviveRule ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:284:4: (lv_surviveRules_2_0= ruleSurviveRule )
            	    {
            	    // InternalGameOfLifeDSL.g:284:4: (lv_surviveRules_2_0= ruleSurviveRule )
            	    // InternalGameOfLifeDSL.g:285:5: lv_surviveRules_2_0= ruleSurviveRule
            	    {

            	    					newCompositeNode(grammarAccess.getRulesAccess().getSurviveRulesSurviveRuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_surviveRules_2_0=ruleSurviveRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"surviveRules",
            	    						lv_surviveRules_2_0,
            	    						"gameoflife.dsl.GameOfLifeDSL.SurviveRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGameOfLifeDSL.g:302:3: ( (lv_birthRules_3_0= ruleBirthRule ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:303:4: (lv_birthRules_3_0= ruleBirthRule )
            	    {
            	    // InternalGameOfLifeDSL.g:303:4: (lv_birthRules_3_0= ruleBirthRule )
            	    // InternalGameOfLifeDSL.g:304:5: lv_birthRules_3_0= ruleBirthRule
            	    {

            	    					newCompositeNode(grammarAccess.getRulesAccess().getBirthRulesBirthRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_birthRules_3_0=ruleBirthRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRulesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"birthRules",
            	    						lv_birthRules_3_0,
            	    						"gameoflife.dsl.GameOfLifeDSL.BirthRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleSurviveRule"
    // InternalGameOfLifeDSL.g:329:1: entryRuleSurviveRule returns [EObject current=null] : iv_ruleSurviveRule= ruleSurviveRule EOF ;
    public final EObject entryRuleSurviveRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurviveRule = null;


        try {
            // InternalGameOfLifeDSL.g:329:52: (iv_ruleSurviveRule= ruleSurviveRule EOF )
            // InternalGameOfLifeDSL.g:330:2: iv_ruleSurviveRule= ruleSurviveRule EOF
            {
             newCompositeNode(grammarAccess.getSurviveRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSurviveRule=ruleSurviveRule();

            state._fsp--;

             current =iv_ruleSurviveRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurviveRule"


    // $ANTLR start "ruleSurviveRule"
    // InternalGameOfLifeDSL.g:336:1: ruleSurviveRule returns [EObject current=null] : (otherlv_0= 'survive' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) ) ) ;
    public final EObject ruleSurviveRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_neighbors_2_0 = null;



        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:342:2: ( (otherlv_0= 'survive' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) ) ) )
            // InternalGameOfLifeDSL.g:343:2: (otherlv_0= 'survive' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) ) )
            {
            // InternalGameOfLifeDSL.g:343:2: (otherlv_0= 'survive' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) ) )
            // InternalGameOfLifeDSL.g:344:3: otherlv_0= 'survive' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSurviveRuleAccess().getSurviveKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSurviveRuleAccess().getWhenKeyword_1());
            		
            // InternalGameOfLifeDSL.g:352:3: ( (lv_neighbors_2_0= ruleNeighborCondition ) )
            // InternalGameOfLifeDSL.g:353:4: (lv_neighbors_2_0= ruleNeighborCondition )
            {
            // InternalGameOfLifeDSL.g:353:4: (lv_neighbors_2_0= ruleNeighborCondition )
            // InternalGameOfLifeDSL.g:354:5: lv_neighbors_2_0= ruleNeighborCondition
            {

            					newCompositeNode(grammarAccess.getSurviveRuleAccess().getNeighborsNeighborConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_neighbors_2_0=ruleNeighborCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSurviveRuleRule());
            					}
            					set(
            						current,
            						"neighbors",
            						lv_neighbors_2_0,
            						"gameoflife.dsl.GameOfLifeDSL.NeighborCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurviveRule"


    // $ANTLR start "entryRuleBirthRule"
    // InternalGameOfLifeDSL.g:375:1: entryRuleBirthRule returns [EObject current=null] : iv_ruleBirthRule= ruleBirthRule EOF ;
    public final EObject entryRuleBirthRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBirthRule = null;


        try {
            // InternalGameOfLifeDSL.g:375:50: (iv_ruleBirthRule= ruleBirthRule EOF )
            // InternalGameOfLifeDSL.g:376:2: iv_ruleBirthRule= ruleBirthRule EOF
            {
             newCompositeNode(grammarAccess.getBirthRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBirthRule=ruleBirthRule();

            state._fsp--;

             current =iv_ruleBirthRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBirthRule"


    // $ANTLR start "ruleBirthRule"
    // InternalGameOfLifeDSL.g:382:1: ruleBirthRule returns [EObject current=null] : (otherlv_0= 'birth' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) ) ) ;
    public final EObject ruleBirthRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_neighbors_2_0 = null;



        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:388:2: ( (otherlv_0= 'birth' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) ) ) )
            // InternalGameOfLifeDSL.g:389:2: (otherlv_0= 'birth' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) ) )
            {
            // InternalGameOfLifeDSL.g:389:2: (otherlv_0= 'birth' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) ) )
            // InternalGameOfLifeDSL.g:390:3: otherlv_0= 'birth' otherlv_1= 'when' ( (lv_neighbors_2_0= ruleNeighborCondition ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBirthRuleAccess().getBirthKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getBirthRuleAccess().getWhenKeyword_1());
            		
            // InternalGameOfLifeDSL.g:398:3: ( (lv_neighbors_2_0= ruleNeighborCondition ) )
            // InternalGameOfLifeDSL.g:399:4: (lv_neighbors_2_0= ruleNeighborCondition )
            {
            // InternalGameOfLifeDSL.g:399:4: (lv_neighbors_2_0= ruleNeighborCondition )
            // InternalGameOfLifeDSL.g:400:5: lv_neighbors_2_0= ruleNeighborCondition
            {

            					newCompositeNode(grammarAccess.getBirthRuleAccess().getNeighborsNeighborConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_neighbors_2_0=ruleNeighborCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBirthRuleRule());
            					}
            					set(
            						current,
            						"neighbors",
            						lv_neighbors_2_0,
            						"gameoflife.dsl.GameOfLifeDSL.NeighborCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBirthRule"


    // $ANTLR start "entryRuleNeighborCondition"
    // InternalGameOfLifeDSL.g:421:1: entryRuleNeighborCondition returns [EObject current=null] : iv_ruleNeighborCondition= ruleNeighborCondition EOF ;
    public final EObject entryRuleNeighborCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeighborCondition = null;


        try {
            // InternalGameOfLifeDSL.g:421:58: (iv_ruleNeighborCondition= ruleNeighborCondition EOF )
            // InternalGameOfLifeDSL.g:422:2: iv_ruleNeighborCondition= ruleNeighborCondition EOF
            {
             newCompositeNode(grammarAccess.getNeighborConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNeighborCondition=ruleNeighborCondition();

            state._fsp--;

             current =iv_ruleNeighborCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeighborCondition"


    // $ANTLR start "ruleNeighborCondition"
    // InternalGameOfLifeDSL.g:428:1: ruleNeighborCondition returns [EObject current=null] : ( ( (lv_count_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) ) ;
    public final EObject ruleNeighborCondition() throws RecognitionException {
        EObject current = null;

        Token lv_count_0_0=null;
        EObject lv_range_1_0 = null;



        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:434:2: ( ( ( (lv_count_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) ) )
            // InternalGameOfLifeDSL.g:435:2: ( ( (lv_count_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) )
            {
            // InternalGameOfLifeDSL.g:435:2: ( ( (lv_count_0_0= RULE_INT ) ) | ( (lv_range_1_0= ruleRange ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGameOfLifeDSL.g:436:3: ( (lv_count_0_0= RULE_INT ) )
                    {
                    // InternalGameOfLifeDSL.g:436:3: ( (lv_count_0_0= RULE_INT ) )
                    // InternalGameOfLifeDSL.g:437:4: (lv_count_0_0= RULE_INT )
                    {
                    // InternalGameOfLifeDSL.g:437:4: (lv_count_0_0= RULE_INT )
                    // InternalGameOfLifeDSL.g:438:5: lv_count_0_0= RULE_INT
                    {
                    lv_count_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_count_0_0, grammarAccess.getNeighborConditionAccess().getCountINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNeighborConditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"count",
                    						lv_count_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGameOfLifeDSL.g:455:3: ( (lv_range_1_0= ruleRange ) )
                    {
                    // InternalGameOfLifeDSL.g:455:3: ( (lv_range_1_0= ruleRange ) )
                    // InternalGameOfLifeDSL.g:456:4: (lv_range_1_0= ruleRange )
                    {
                    // InternalGameOfLifeDSL.g:456:4: (lv_range_1_0= ruleRange )
                    // InternalGameOfLifeDSL.g:457:5: lv_range_1_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getNeighborConditionAccess().getRangeRangeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_range_1_0=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNeighborConditionRule());
                    					}
                    					set(
                    						current,
                    						"range",
                    						lv_range_1_0,
                    						"gameoflife.dsl.GameOfLifeDSL.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeighborCondition"


    // $ANTLR start "entryRuleRange"
    // InternalGameOfLifeDSL.g:478:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalGameOfLifeDSL.g:478:46: (iv_ruleRange= ruleRange EOF )
            // InternalGameOfLifeDSL.g:479:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalGameOfLifeDSL.g:485:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGameOfLifeDSL.g:491:2: ( (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // InternalGameOfLifeDSL.g:492:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // InternalGameOfLifeDSL.g:492:2: (otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']' )
            // InternalGameOfLifeDSL.g:493:3: otherlv_0= '[' ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalGameOfLifeDSL.g:497:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalGameOfLifeDSL.g:498:4: (lv_min_1_0= RULE_INT )
            {
            // InternalGameOfLifeDSL.g:498:4: (lv_min_1_0= RULE_INT )
            // InternalGameOfLifeDSL.g:499:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_min_1_0, grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getFullStopFullStopKeyword_2());
            		
            // InternalGameOfLifeDSL.g:519:3: ( (lv_max_3_0= RULE_INT ) )
            // InternalGameOfLifeDSL.g:520:4: (lv_max_3_0= RULE_INT )
            {
            // InternalGameOfLifeDSL.g:520:4: (lv_max_3_0= RULE_INT )
            // InternalGameOfLifeDSL.g:521:5: lv_max_3_0= RULE_INT
            {
            lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_max_3_0, grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000282000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}