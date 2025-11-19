package gameoflife.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import gameoflife.dsl.services.GameOfLifeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameOfLifeDSLParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(GameOfLifeDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalGameOfLifeDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:54:1: ( ruleModel EOF )
            // InternalGameOfLifeDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGameOfLifeDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalGameOfLifeDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalGameOfLifeDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGrid"
    // InternalGameOfLifeDSL.g:78:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:79:1: ( ruleGrid EOF )
            // InternalGameOfLifeDSL.g:80:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGameOfLifeDSL.g:87:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:91:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:92:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:92:2: ( ( rule__Grid__Group__0 ) )
            // InternalGameOfLifeDSL.g:93:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:94:3: ( rule__Grid__Group__0 )
            // InternalGameOfLifeDSL.g:94:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCell"
    // InternalGameOfLifeDSL.g:103:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:104:1: ( ruleCell EOF )
            // InternalGameOfLifeDSL.g:105:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalGameOfLifeDSL.g:112:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:116:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:117:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:117:2: ( ( rule__Cell__Group__0 ) )
            // InternalGameOfLifeDSL.g:118:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:119:3: ( rule__Cell__Group__0 )
            // InternalGameOfLifeDSL.g:119:4: rule__Cell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleRules"
    // InternalGameOfLifeDSL.g:128:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:129:1: ( ruleRules EOF )
            // InternalGameOfLifeDSL.g:130:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalGameOfLifeDSL.g:137:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:141:2: ( ( ( rule__Rules__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:142:2: ( ( rule__Rules__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:142:2: ( ( rule__Rules__Group__0 ) )
            // InternalGameOfLifeDSL.g:143:3: ( rule__Rules__Group__0 )
            {
             before(grammarAccess.getRulesAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:144:3: ( rule__Rules__Group__0 )
            // InternalGameOfLifeDSL.g:144:4: rule__Rules__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleSurviveRule"
    // InternalGameOfLifeDSL.g:153:1: entryRuleSurviveRule : ruleSurviveRule EOF ;
    public final void entryRuleSurviveRule() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:154:1: ( ruleSurviveRule EOF )
            // InternalGameOfLifeDSL.g:155:1: ruleSurviveRule EOF
            {
             before(grammarAccess.getSurviveRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSurviveRule();

            state._fsp--;

             after(grammarAccess.getSurviveRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSurviveRule"


    // $ANTLR start "ruleSurviveRule"
    // InternalGameOfLifeDSL.g:162:1: ruleSurviveRule : ( ( rule__SurviveRule__Group__0 ) ) ;
    public final void ruleSurviveRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:166:2: ( ( ( rule__SurviveRule__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:167:2: ( ( rule__SurviveRule__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:167:2: ( ( rule__SurviveRule__Group__0 ) )
            // InternalGameOfLifeDSL.g:168:3: ( rule__SurviveRule__Group__0 )
            {
             before(grammarAccess.getSurviveRuleAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:169:3: ( rule__SurviveRule__Group__0 )
            // InternalGameOfLifeDSL.g:169:4: rule__SurviveRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SurviveRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurviveRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurviveRule"


    // $ANTLR start "entryRuleBirthRule"
    // InternalGameOfLifeDSL.g:178:1: entryRuleBirthRule : ruleBirthRule EOF ;
    public final void entryRuleBirthRule() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:179:1: ( ruleBirthRule EOF )
            // InternalGameOfLifeDSL.g:180:1: ruleBirthRule EOF
            {
             before(grammarAccess.getBirthRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleBirthRule();

            state._fsp--;

             after(grammarAccess.getBirthRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBirthRule"


    // $ANTLR start "ruleBirthRule"
    // InternalGameOfLifeDSL.g:187:1: ruleBirthRule : ( ( rule__BirthRule__Group__0 ) ) ;
    public final void ruleBirthRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:191:2: ( ( ( rule__BirthRule__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:192:2: ( ( rule__BirthRule__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:192:2: ( ( rule__BirthRule__Group__0 ) )
            // InternalGameOfLifeDSL.g:193:3: ( rule__BirthRule__Group__0 )
            {
             before(grammarAccess.getBirthRuleAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:194:3: ( rule__BirthRule__Group__0 )
            // InternalGameOfLifeDSL.g:194:4: rule__BirthRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BirthRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBirthRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBirthRule"


    // $ANTLR start "entryRuleNeighborCondition"
    // InternalGameOfLifeDSL.g:203:1: entryRuleNeighborCondition : ruleNeighborCondition EOF ;
    public final void entryRuleNeighborCondition() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:204:1: ( ruleNeighborCondition EOF )
            // InternalGameOfLifeDSL.g:205:1: ruleNeighborCondition EOF
            {
             before(grammarAccess.getNeighborConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleNeighborCondition();

            state._fsp--;

             after(grammarAccess.getNeighborConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNeighborCondition"


    // $ANTLR start "ruleNeighborCondition"
    // InternalGameOfLifeDSL.g:212:1: ruleNeighborCondition : ( ( rule__NeighborCondition__Alternatives ) ) ;
    public final void ruleNeighborCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:216:2: ( ( ( rule__NeighborCondition__Alternatives ) ) )
            // InternalGameOfLifeDSL.g:217:2: ( ( rule__NeighborCondition__Alternatives ) )
            {
            // InternalGameOfLifeDSL.g:217:2: ( ( rule__NeighborCondition__Alternatives ) )
            // InternalGameOfLifeDSL.g:218:3: ( rule__NeighborCondition__Alternatives )
            {
             before(grammarAccess.getNeighborConditionAccess().getAlternatives()); 
            // InternalGameOfLifeDSL.g:219:3: ( rule__NeighborCondition__Alternatives )
            // InternalGameOfLifeDSL.g:219:4: rule__NeighborCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NeighborCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNeighborConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeighborCondition"


    // $ANTLR start "entryRuleRange"
    // InternalGameOfLifeDSL.g:228:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalGameOfLifeDSL.g:229:1: ( ruleRange EOF )
            // InternalGameOfLifeDSL.g:230:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalGameOfLifeDSL.g:237:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:241:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalGameOfLifeDSL.g:242:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalGameOfLifeDSL.g:242:2: ( ( rule__Range__Group__0 ) )
            // InternalGameOfLifeDSL.g:243:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalGameOfLifeDSL.g:244:3: ( rule__Range__Group__0 )
            // InternalGameOfLifeDSL.g:244:4: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "rule__NeighborCondition__Alternatives"
    // InternalGameOfLifeDSL.g:252:1: rule__NeighborCondition__Alternatives : ( ( ( rule__NeighborCondition__CountAssignment_0 ) ) | ( ( rule__NeighborCondition__RangeAssignment_1 ) ) );
    public final void rule__NeighborCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:256:1: ( ( ( rule__NeighborCondition__CountAssignment_0 ) ) | ( ( rule__NeighborCondition__RangeAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGameOfLifeDSL.g:257:2: ( ( rule__NeighborCondition__CountAssignment_0 ) )
                    {
                    // InternalGameOfLifeDSL.g:257:2: ( ( rule__NeighborCondition__CountAssignment_0 ) )
                    // InternalGameOfLifeDSL.g:258:3: ( rule__NeighborCondition__CountAssignment_0 )
                    {
                     before(grammarAccess.getNeighborConditionAccess().getCountAssignment_0()); 
                    // InternalGameOfLifeDSL.g:259:3: ( rule__NeighborCondition__CountAssignment_0 )
                    // InternalGameOfLifeDSL.g:259:4: rule__NeighborCondition__CountAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NeighborCondition__CountAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNeighborConditionAccess().getCountAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGameOfLifeDSL.g:263:2: ( ( rule__NeighborCondition__RangeAssignment_1 ) )
                    {
                    // InternalGameOfLifeDSL.g:263:2: ( ( rule__NeighborCondition__RangeAssignment_1 ) )
                    // InternalGameOfLifeDSL.g:264:3: ( rule__NeighborCondition__RangeAssignment_1 )
                    {
                     before(grammarAccess.getNeighborConditionAccess().getRangeAssignment_1()); 
                    // InternalGameOfLifeDSL.g:265:3: ( rule__NeighborCondition__RangeAssignment_1 )
                    // InternalGameOfLifeDSL.g:265:4: rule__NeighborCondition__RangeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NeighborCondition__RangeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNeighborConditionAccess().getRangeAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeighborCondition__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalGameOfLifeDSL.g:273:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:277:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGameOfLifeDSL.g:278:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalGameOfLifeDSL.g:285:1: rule__Model__Group__0__Impl : ( ( rule__Model__GridsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:289:1: ( ( ( rule__Model__GridsAssignment_0 )* ) )
            // InternalGameOfLifeDSL.g:290:1: ( ( rule__Model__GridsAssignment_0 )* )
            {
            // InternalGameOfLifeDSL.g:290:1: ( ( rule__Model__GridsAssignment_0 )* )
            // InternalGameOfLifeDSL.g:291:2: ( rule__Model__GridsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getGridsAssignment_0()); 
            // InternalGameOfLifeDSL.g:292:2: ( rule__Model__GridsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:292:3: rule__Model__GridsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__GridsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGridsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalGameOfLifeDSL.g:300:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:304:1: ( rule__Model__Group__1__Impl )
            // InternalGameOfLifeDSL.g:305:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalGameOfLifeDSL.g:311:1: rule__Model__Group__1__Impl : ( ( rule__Model__RulesAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:315:1: ( ( ( rule__Model__RulesAssignment_1 )? ) )
            // InternalGameOfLifeDSL.g:316:1: ( ( rule__Model__RulesAssignment_1 )? )
            {
            // InternalGameOfLifeDSL.g:316:1: ( ( rule__Model__RulesAssignment_1 )? )
            // InternalGameOfLifeDSL.g:317:2: ( rule__Model__RulesAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getRulesAssignment_1()); 
            // InternalGameOfLifeDSL.g:318:2: ( rule__Model__RulesAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGameOfLifeDSL.g:318:3: rule__Model__RulesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__RulesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalGameOfLifeDSL.g:327:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:331:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGameOfLifeDSL.g:332:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalGameOfLifeDSL.g:339:1: rule__Grid__Group__0__Impl : ( 'grid' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:343:1: ( ( 'grid' ) )
            // InternalGameOfLifeDSL.g:344:1: ( 'grid' )
            {
            // InternalGameOfLifeDSL.g:344:1: ( 'grid' )
            // InternalGameOfLifeDSL.g:345:2: 'grid'
            {
             before(grammarAccess.getGridAccess().getGridKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getGridKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalGameOfLifeDSL.g:354:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:358:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGameOfLifeDSL.g:359:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalGameOfLifeDSL.g:366:1: rule__Grid__Group__1__Impl : ( ( rule__Grid__NameAssignment_1 ) ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:370:1: ( ( ( rule__Grid__NameAssignment_1 ) ) )
            // InternalGameOfLifeDSL.g:371:1: ( ( rule__Grid__NameAssignment_1 ) )
            {
            // InternalGameOfLifeDSL.g:371:1: ( ( rule__Grid__NameAssignment_1 ) )
            // InternalGameOfLifeDSL.g:372:2: ( rule__Grid__NameAssignment_1 )
            {
             before(grammarAccess.getGridAccess().getNameAssignment_1()); 
            // InternalGameOfLifeDSL.g:373:2: ( rule__Grid__NameAssignment_1 )
            // InternalGameOfLifeDSL.g:373:3: rule__Grid__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Grid__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalGameOfLifeDSL.g:381:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:385:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalGameOfLifeDSL.g:386:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Grid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalGameOfLifeDSL.g:393:1: rule__Grid__Group__2__Impl : ( '{' ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:397:1: ( ( '{' ) )
            // InternalGameOfLifeDSL.g:398:1: ( '{' )
            {
            // InternalGameOfLifeDSL.g:398:1: ( '{' )
            // InternalGameOfLifeDSL.g:399:2: '{'
            {
             before(grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Grid__Group__3"
    // InternalGameOfLifeDSL.g:408:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl rule__Grid__Group__4 ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:412:1: ( rule__Grid__Group__3__Impl rule__Grid__Group__4 )
            // InternalGameOfLifeDSL.g:413:2: rule__Grid__Group__3__Impl rule__Grid__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Grid__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3"


    // $ANTLR start "rule__Grid__Group__3__Impl"
    // InternalGameOfLifeDSL.g:420:1: rule__Grid__Group__3__Impl : ( ( rule__Grid__LiveCellsAssignment_3 )* ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:424:1: ( ( ( rule__Grid__LiveCellsAssignment_3 )* ) )
            // InternalGameOfLifeDSL.g:425:1: ( ( rule__Grid__LiveCellsAssignment_3 )* )
            {
            // InternalGameOfLifeDSL.g:425:1: ( ( rule__Grid__LiveCellsAssignment_3 )* )
            // InternalGameOfLifeDSL.g:426:2: ( rule__Grid__LiveCellsAssignment_3 )*
            {
             before(grammarAccess.getGridAccess().getLiveCellsAssignment_3()); 
            // InternalGameOfLifeDSL.g:427:2: ( rule__Grid__LiveCellsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:427:3: rule__Grid__LiveCellsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Grid__LiveCellsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getLiveCellsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__3__Impl"


    // $ANTLR start "rule__Grid__Group__4"
    // InternalGameOfLifeDSL.g:435:1: rule__Grid__Group__4 : rule__Grid__Group__4__Impl ;
    public final void rule__Grid__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:439:1: ( rule__Grid__Group__4__Impl )
            // InternalGameOfLifeDSL.g:440:2: rule__Grid__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4"


    // $ANTLR start "rule__Grid__Group__4__Impl"
    // InternalGameOfLifeDSL.g:446:1: rule__Grid__Group__4__Impl : ( '}' ) ;
    public final void rule__Grid__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:450:1: ( ( '}' ) )
            // InternalGameOfLifeDSL.g:451:1: ( '}' )
            {
            // InternalGameOfLifeDSL.g:451:1: ( '}' )
            // InternalGameOfLifeDSL.g:452:2: '}'
            {
             before(grammarAccess.getGridAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__Group__4__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalGameOfLifeDSL.g:462:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:466:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalGameOfLifeDSL.g:467:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Cell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0"


    // $ANTLR start "rule__Cell__Group__0__Impl"
    // InternalGameOfLifeDSL.g:474:1: rule__Cell__Group__0__Impl : ( 'cell' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:478:1: ( ( 'cell' ) )
            // InternalGameOfLifeDSL.g:479:1: ( 'cell' )
            {
            // InternalGameOfLifeDSL.g:479:1: ( 'cell' )
            // InternalGameOfLifeDSL.g:480:2: 'cell'
            {
             before(grammarAccess.getCellAccess().getCellKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getCellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0__Impl"


    // $ANTLR start "rule__Cell__Group__1"
    // InternalGameOfLifeDSL.g:489:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl rule__Cell__Group__2 ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:493:1: ( rule__Cell__Group__1__Impl rule__Cell__Group__2 )
            // InternalGameOfLifeDSL.g:494:2: rule__Cell__Group__1__Impl rule__Cell__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Cell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1"


    // $ANTLR start "rule__Cell__Group__1__Impl"
    // InternalGameOfLifeDSL.g:501:1: rule__Cell__Group__1__Impl : ( '(' ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:505:1: ( ( '(' ) )
            // InternalGameOfLifeDSL.g:506:1: ( '(' )
            {
            // InternalGameOfLifeDSL.g:506:1: ( '(' )
            // InternalGameOfLifeDSL.g:507:2: '('
            {
             before(grammarAccess.getCellAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1__Impl"


    // $ANTLR start "rule__Cell__Group__2"
    // InternalGameOfLifeDSL.g:516:1: rule__Cell__Group__2 : rule__Cell__Group__2__Impl rule__Cell__Group__3 ;
    public final void rule__Cell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:520:1: ( rule__Cell__Group__2__Impl rule__Cell__Group__3 )
            // InternalGameOfLifeDSL.g:521:2: rule__Cell__Group__2__Impl rule__Cell__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Cell__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__2"


    // $ANTLR start "rule__Cell__Group__2__Impl"
    // InternalGameOfLifeDSL.g:528:1: rule__Cell__Group__2__Impl : ( ( rule__Cell__XAssignment_2 ) ) ;
    public final void rule__Cell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:532:1: ( ( ( rule__Cell__XAssignment_2 ) ) )
            // InternalGameOfLifeDSL.g:533:1: ( ( rule__Cell__XAssignment_2 ) )
            {
            // InternalGameOfLifeDSL.g:533:1: ( ( rule__Cell__XAssignment_2 ) )
            // InternalGameOfLifeDSL.g:534:2: ( rule__Cell__XAssignment_2 )
            {
             before(grammarAccess.getCellAccess().getXAssignment_2()); 
            // InternalGameOfLifeDSL.g:535:2: ( rule__Cell__XAssignment_2 )
            // InternalGameOfLifeDSL.g:535:3: rule__Cell__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cell__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__2__Impl"


    // $ANTLR start "rule__Cell__Group__3"
    // InternalGameOfLifeDSL.g:543:1: rule__Cell__Group__3 : rule__Cell__Group__3__Impl rule__Cell__Group__4 ;
    public final void rule__Cell__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:547:1: ( rule__Cell__Group__3__Impl rule__Cell__Group__4 )
            // InternalGameOfLifeDSL.g:548:2: rule__Cell__Group__3__Impl rule__Cell__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Cell__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__3"


    // $ANTLR start "rule__Cell__Group__3__Impl"
    // InternalGameOfLifeDSL.g:555:1: rule__Cell__Group__3__Impl : ( ',' ) ;
    public final void rule__Cell__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:559:1: ( ( ',' ) )
            // InternalGameOfLifeDSL.g:560:1: ( ',' )
            {
            // InternalGameOfLifeDSL.g:560:1: ( ',' )
            // InternalGameOfLifeDSL.g:561:2: ','
            {
             before(grammarAccess.getCellAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__3__Impl"


    // $ANTLR start "rule__Cell__Group__4"
    // InternalGameOfLifeDSL.g:570:1: rule__Cell__Group__4 : rule__Cell__Group__4__Impl rule__Cell__Group__5 ;
    public final void rule__Cell__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:574:1: ( rule__Cell__Group__4__Impl rule__Cell__Group__5 )
            // InternalGameOfLifeDSL.g:575:2: rule__Cell__Group__4__Impl rule__Cell__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Cell__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__4"


    // $ANTLR start "rule__Cell__Group__4__Impl"
    // InternalGameOfLifeDSL.g:582:1: rule__Cell__Group__4__Impl : ( ( rule__Cell__YAssignment_4 ) ) ;
    public final void rule__Cell__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:586:1: ( ( ( rule__Cell__YAssignment_4 ) ) )
            // InternalGameOfLifeDSL.g:587:1: ( ( rule__Cell__YAssignment_4 ) )
            {
            // InternalGameOfLifeDSL.g:587:1: ( ( rule__Cell__YAssignment_4 ) )
            // InternalGameOfLifeDSL.g:588:2: ( rule__Cell__YAssignment_4 )
            {
             before(grammarAccess.getCellAccess().getYAssignment_4()); 
            // InternalGameOfLifeDSL.g:589:2: ( rule__Cell__YAssignment_4 )
            // InternalGameOfLifeDSL.g:589:3: rule__Cell__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Cell__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getYAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__4__Impl"


    // $ANTLR start "rule__Cell__Group__5"
    // InternalGameOfLifeDSL.g:597:1: rule__Cell__Group__5 : rule__Cell__Group__5__Impl ;
    public final void rule__Cell__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:601:1: ( rule__Cell__Group__5__Impl )
            // InternalGameOfLifeDSL.g:602:2: rule__Cell__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__5"


    // $ANTLR start "rule__Cell__Group__5__Impl"
    // InternalGameOfLifeDSL.g:608:1: rule__Cell__Group__5__Impl : ( ')' ) ;
    public final void rule__Cell__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:612:1: ( ( ')' ) )
            // InternalGameOfLifeDSL.g:613:1: ( ')' )
            {
            // InternalGameOfLifeDSL.g:613:1: ( ')' )
            // InternalGameOfLifeDSL.g:614:2: ')'
            {
             before(grammarAccess.getCellAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__5__Impl"


    // $ANTLR start "rule__Rules__Group__0"
    // InternalGameOfLifeDSL.g:624:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:628:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // InternalGameOfLifeDSL.g:629:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Rules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0"


    // $ANTLR start "rule__Rules__Group__0__Impl"
    // InternalGameOfLifeDSL.g:636:1: rule__Rules__Group__0__Impl : ( 'rules' ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:640:1: ( ( 'rules' ) )
            // InternalGameOfLifeDSL.g:641:1: ( 'rules' )
            {
            // InternalGameOfLifeDSL.g:641:1: ( 'rules' )
            // InternalGameOfLifeDSL.g:642:2: 'rules'
            {
             before(grammarAccess.getRulesAccess().getRulesKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRulesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0__Impl"


    // $ANTLR start "rule__Rules__Group__1"
    // InternalGameOfLifeDSL.g:651:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl rule__Rules__Group__2 ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:655:1: ( rule__Rules__Group__1__Impl rule__Rules__Group__2 )
            // InternalGameOfLifeDSL.g:656:2: rule__Rules__Group__1__Impl rule__Rules__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Rules__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1"


    // $ANTLR start "rule__Rules__Group__1__Impl"
    // InternalGameOfLifeDSL.g:663:1: rule__Rules__Group__1__Impl : ( '{' ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:667:1: ( ( '{' ) )
            // InternalGameOfLifeDSL.g:668:1: ( '{' )
            {
            // InternalGameOfLifeDSL.g:668:1: ( '{' )
            // InternalGameOfLifeDSL.g:669:2: '{'
            {
             before(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1__Impl"


    // $ANTLR start "rule__Rules__Group__2"
    // InternalGameOfLifeDSL.g:678:1: rule__Rules__Group__2 : rule__Rules__Group__2__Impl rule__Rules__Group__3 ;
    public final void rule__Rules__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:682:1: ( rule__Rules__Group__2__Impl rule__Rules__Group__3 )
            // InternalGameOfLifeDSL.g:683:2: rule__Rules__Group__2__Impl rule__Rules__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Rules__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2"


    // $ANTLR start "rule__Rules__Group__2__Impl"
    // InternalGameOfLifeDSL.g:690:1: rule__Rules__Group__2__Impl : ( ( rule__Rules__SurviveRulesAssignment_2 )* ) ;
    public final void rule__Rules__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:694:1: ( ( ( rule__Rules__SurviveRulesAssignment_2 )* ) )
            // InternalGameOfLifeDSL.g:695:1: ( ( rule__Rules__SurviveRulesAssignment_2 )* )
            {
            // InternalGameOfLifeDSL.g:695:1: ( ( rule__Rules__SurviveRulesAssignment_2 )* )
            // InternalGameOfLifeDSL.g:696:2: ( rule__Rules__SurviveRulesAssignment_2 )*
            {
             before(grammarAccess.getRulesAccess().getSurviveRulesAssignment_2()); 
            // InternalGameOfLifeDSL.g:697:2: ( rule__Rules__SurviveRulesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:697:3: rule__Rules__SurviveRulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Rules__SurviveRulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getSurviveRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__2__Impl"


    // $ANTLR start "rule__Rules__Group__3"
    // InternalGameOfLifeDSL.g:705:1: rule__Rules__Group__3 : rule__Rules__Group__3__Impl rule__Rules__Group__4 ;
    public final void rule__Rules__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:709:1: ( rule__Rules__Group__3__Impl rule__Rules__Group__4 )
            // InternalGameOfLifeDSL.g:710:2: rule__Rules__Group__3__Impl rule__Rules__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Rules__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rules__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3"


    // $ANTLR start "rule__Rules__Group__3__Impl"
    // InternalGameOfLifeDSL.g:717:1: rule__Rules__Group__3__Impl : ( ( rule__Rules__BirthRulesAssignment_3 )* ) ;
    public final void rule__Rules__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:721:1: ( ( ( rule__Rules__BirthRulesAssignment_3 )* ) )
            // InternalGameOfLifeDSL.g:722:1: ( ( rule__Rules__BirthRulesAssignment_3 )* )
            {
            // InternalGameOfLifeDSL.g:722:1: ( ( rule__Rules__BirthRulesAssignment_3 )* )
            // InternalGameOfLifeDSL.g:723:2: ( rule__Rules__BirthRulesAssignment_3 )*
            {
             before(grammarAccess.getRulesAccess().getBirthRulesAssignment_3()); 
            // InternalGameOfLifeDSL.g:724:2: ( rule__Rules__BirthRulesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGameOfLifeDSL.g:724:3: rule__Rules__BirthRulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Rules__BirthRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getBirthRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__3__Impl"


    // $ANTLR start "rule__Rules__Group__4"
    // InternalGameOfLifeDSL.g:732:1: rule__Rules__Group__4 : rule__Rules__Group__4__Impl ;
    public final void rule__Rules__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:736:1: ( rule__Rules__Group__4__Impl )
            // InternalGameOfLifeDSL.g:737:2: rule__Rules__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rules__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__4"


    // $ANTLR start "rule__Rules__Group__4__Impl"
    // InternalGameOfLifeDSL.g:743:1: rule__Rules__Group__4__Impl : ( '}' ) ;
    public final void rule__Rules__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:747:1: ( ( '}' ) )
            // InternalGameOfLifeDSL.g:748:1: ( '}' )
            {
            // InternalGameOfLifeDSL.g:748:1: ( '}' )
            // InternalGameOfLifeDSL.g:749:2: '}'
            {
             before(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRulesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__4__Impl"


    // $ANTLR start "rule__SurviveRule__Group__0"
    // InternalGameOfLifeDSL.g:759:1: rule__SurviveRule__Group__0 : rule__SurviveRule__Group__0__Impl rule__SurviveRule__Group__1 ;
    public final void rule__SurviveRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:763:1: ( rule__SurviveRule__Group__0__Impl rule__SurviveRule__Group__1 )
            // InternalGameOfLifeDSL.g:764:2: rule__SurviveRule__Group__0__Impl rule__SurviveRule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SurviveRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SurviveRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurviveRule__Group__0"


    // $ANTLR start "rule__SurviveRule__Group__0__Impl"
    // InternalGameOfLifeDSL.g:771:1: rule__SurviveRule__Group__0__Impl : ( 'survive' ) ;
    public final void rule__SurviveRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:775:1: ( ( 'survive' ) )
            // InternalGameOfLifeDSL.g:776:1: ( 'survive' )
            {
            // InternalGameOfLifeDSL.g:776:1: ( 'survive' )
            // InternalGameOfLifeDSL.g:777:2: 'survive'
            {
             before(grammarAccess.getSurviveRuleAccess().getSurviveKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSurviveRuleAccess().getSurviveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurviveRule__Group__0__Impl"


    // $ANTLR start "rule__SurviveRule__Group__1"
    // InternalGameOfLifeDSL.g:786:1: rule__SurviveRule__Group__1 : rule__SurviveRule__Group__1__Impl rule__SurviveRule__Group__2 ;
    public final void rule__SurviveRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:790:1: ( rule__SurviveRule__Group__1__Impl rule__SurviveRule__Group__2 )
            // InternalGameOfLifeDSL.g:791:2: rule__SurviveRule__Group__1__Impl rule__SurviveRule__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__SurviveRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SurviveRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurviveRule__Group__1"


    // $ANTLR start "rule__SurviveRule__Group__1__Impl"
    // InternalGameOfLifeDSL.g:798:1: rule__SurviveRule__Group__1__Impl : ( 'when' ) ;
    public final void rule__SurviveRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:802:1: ( ( 'when' ) )
            // InternalGameOfLifeDSL.g:803:1: ( 'when' )
            {
            // InternalGameOfLifeDSL.g:803:1: ( 'when' )
            // InternalGameOfLifeDSL.g:804:2: 'when'
            {
             before(grammarAccess.getSurviveRuleAccess().getWhenKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSurviveRuleAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurviveRule__Group__1__Impl"


    // $ANTLR start "rule__SurviveRule__Group__2"
    // InternalGameOfLifeDSL.g:813:1: rule__SurviveRule__Group__2 : rule__SurviveRule__Group__2__Impl ;
    public final void rule__SurviveRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:817:1: ( rule__SurviveRule__Group__2__Impl )
            // InternalGameOfLifeDSL.g:818:2: rule__SurviveRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SurviveRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurviveRule__Group__2"


    // $ANTLR start "rule__SurviveRule__Group__2__Impl"
    // InternalGameOfLifeDSL.g:824:1: rule__SurviveRule__Group__2__Impl : ( ( rule__SurviveRule__NeighborsAssignment_2 ) ) ;
    public final void rule__SurviveRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:828:1: ( ( ( rule__SurviveRule__NeighborsAssignment_2 ) ) )
            // InternalGameOfLifeDSL.g:829:1: ( ( rule__SurviveRule__NeighborsAssignment_2 ) )
            {
            // InternalGameOfLifeDSL.g:829:1: ( ( rule__SurviveRule__NeighborsAssignment_2 ) )
            // InternalGameOfLifeDSL.g:830:2: ( rule__SurviveRule__NeighborsAssignment_2 )
            {
             before(grammarAccess.getSurviveRuleAccess().getNeighborsAssignment_2()); 
            // InternalGameOfLifeDSL.g:831:2: ( rule__SurviveRule__NeighborsAssignment_2 )
            // InternalGameOfLifeDSL.g:831:3: rule__SurviveRule__NeighborsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SurviveRule__NeighborsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSurviveRuleAccess().getNeighborsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurviveRule__Group__2__Impl"


    // $ANTLR start "rule__BirthRule__Group__0"
    // InternalGameOfLifeDSL.g:840:1: rule__BirthRule__Group__0 : rule__BirthRule__Group__0__Impl rule__BirthRule__Group__1 ;
    public final void rule__BirthRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:844:1: ( rule__BirthRule__Group__0__Impl rule__BirthRule__Group__1 )
            // InternalGameOfLifeDSL.g:845:2: rule__BirthRule__Group__0__Impl rule__BirthRule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BirthRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BirthRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BirthRule__Group__0"


    // $ANTLR start "rule__BirthRule__Group__0__Impl"
    // InternalGameOfLifeDSL.g:852:1: rule__BirthRule__Group__0__Impl : ( 'birth' ) ;
    public final void rule__BirthRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:856:1: ( ( 'birth' ) )
            // InternalGameOfLifeDSL.g:857:1: ( 'birth' )
            {
            // InternalGameOfLifeDSL.g:857:1: ( 'birth' )
            // InternalGameOfLifeDSL.g:858:2: 'birth'
            {
             before(grammarAccess.getBirthRuleAccess().getBirthKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBirthRuleAccess().getBirthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BirthRule__Group__0__Impl"


    // $ANTLR start "rule__BirthRule__Group__1"
    // InternalGameOfLifeDSL.g:867:1: rule__BirthRule__Group__1 : rule__BirthRule__Group__1__Impl rule__BirthRule__Group__2 ;
    public final void rule__BirthRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:871:1: ( rule__BirthRule__Group__1__Impl rule__BirthRule__Group__2 )
            // InternalGameOfLifeDSL.g:872:2: rule__BirthRule__Group__1__Impl rule__BirthRule__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__BirthRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BirthRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BirthRule__Group__1"


    // $ANTLR start "rule__BirthRule__Group__1__Impl"
    // InternalGameOfLifeDSL.g:879:1: rule__BirthRule__Group__1__Impl : ( 'when' ) ;
    public final void rule__BirthRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:883:1: ( ( 'when' ) )
            // InternalGameOfLifeDSL.g:884:1: ( 'when' )
            {
            // InternalGameOfLifeDSL.g:884:1: ( 'when' )
            // InternalGameOfLifeDSL.g:885:2: 'when'
            {
             before(grammarAccess.getBirthRuleAccess().getWhenKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBirthRuleAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BirthRule__Group__1__Impl"


    // $ANTLR start "rule__BirthRule__Group__2"
    // InternalGameOfLifeDSL.g:894:1: rule__BirthRule__Group__2 : rule__BirthRule__Group__2__Impl ;
    public final void rule__BirthRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:898:1: ( rule__BirthRule__Group__2__Impl )
            // InternalGameOfLifeDSL.g:899:2: rule__BirthRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BirthRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BirthRule__Group__2"


    // $ANTLR start "rule__BirthRule__Group__2__Impl"
    // InternalGameOfLifeDSL.g:905:1: rule__BirthRule__Group__2__Impl : ( ( rule__BirthRule__NeighborsAssignment_2 ) ) ;
    public final void rule__BirthRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:909:1: ( ( ( rule__BirthRule__NeighborsAssignment_2 ) ) )
            // InternalGameOfLifeDSL.g:910:1: ( ( rule__BirthRule__NeighborsAssignment_2 ) )
            {
            // InternalGameOfLifeDSL.g:910:1: ( ( rule__BirthRule__NeighborsAssignment_2 ) )
            // InternalGameOfLifeDSL.g:911:2: ( rule__BirthRule__NeighborsAssignment_2 )
            {
             before(grammarAccess.getBirthRuleAccess().getNeighborsAssignment_2()); 
            // InternalGameOfLifeDSL.g:912:2: ( rule__BirthRule__NeighborsAssignment_2 )
            // InternalGameOfLifeDSL.g:912:3: rule__BirthRule__NeighborsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BirthRule__NeighborsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBirthRuleAccess().getNeighborsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BirthRule__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalGameOfLifeDSL.g:921:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:925:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalGameOfLifeDSL.g:926:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalGameOfLifeDSL.g:933:1: rule__Range__Group__0__Impl : ( '[' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:937:1: ( ( '[' ) )
            // InternalGameOfLifeDSL.g:938:1: ( '[' )
            {
            // InternalGameOfLifeDSL.g:938:1: ( '[' )
            // InternalGameOfLifeDSL.g:939:2: '['
            {
             before(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalGameOfLifeDSL.g:948:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:952:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalGameOfLifeDSL.g:953:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalGameOfLifeDSL.g:960:1: rule__Range__Group__1__Impl : ( ( rule__Range__MinAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:964:1: ( ( ( rule__Range__MinAssignment_1 ) ) )
            // InternalGameOfLifeDSL.g:965:1: ( ( rule__Range__MinAssignment_1 ) )
            {
            // InternalGameOfLifeDSL.g:965:1: ( ( rule__Range__MinAssignment_1 ) )
            // InternalGameOfLifeDSL.g:966:2: ( rule__Range__MinAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getMinAssignment_1()); 
            // InternalGameOfLifeDSL.g:967:2: ( rule__Range__MinAssignment_1 )
            // InternalGameOfLifeDSL.g:967:3: rule__Range__MinAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__MinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getMinAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalGameOfLifeDSL.g:975:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:979:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalGameOfLifeDSL.g:980:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalGameOfLifeDSL.g:987:1: rule__Range__Group__2__Impl : ( '..' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:991:1: ( ( '..' ) )
            // InternalGameOfLifeDSL.g:992:1: ( '..' )
            {
            // InternalGameOfLifeDSL.g:992:1: ( '..' )
            // InternalGameOfLifeDSL.g:993:2: '..'
            {
             before(grammarAccess.getRangeAccess().getFullStopFullStopKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getFullStopFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // InternalGameOfLifeDSL.g:1002:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1006:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalGameOfLifeDSL.g:1007:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Range__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // InternalGameOfLifeDSL.g:1014:1: rule__Range__Group__3__Impl : ( ( rule__Range__MaxAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1018:1: ( ( ( rule__Range__MaxAssignment_3 ) ) )
            // InternalGameOfLifeDSL.g:1019:1: ( ( rule__Range__MaxAssignment_3 ) )
            {
            // InternalGameOfLifeDSL.g:1019:1: ( ( rule__Range__MaxAssignment_3 ) )
            // InternalGameOfLifeDSL.g:1020:2: ( rule__Range__MaxAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getMaxAssignment_3()); 
            // InternalGameOfLifeDSL.g:1021:2: ( rule__Range__MaxAssignment_3 )
            // InternalGameOfLifeDSL.g:1021:3: rule__Range__MaxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Range__MaxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getMaxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__4"
    // InternalGameOfLifeDSL.g:1029:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1033:1: ( rule__Range__Group__4__Impl )
            // InternalGameOfLifeDSL.g:1034:2: rule__Range__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4"


    // $ANTLR start "rule__Range__Group__4__Impl"
    // InternalGameOfLifeDSL.g:1040:1: rule__Range__Group__4__Impl : ( ']' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1044:1: ( ( ']' ) )
            // InternalGameOfLifeDSL.g:1045:1: ( ']' )
            {
            // InternalGameOfLifeDSL.g:1045:1: ( ']' )
            // InternalGameOfLifeDSL.g:1046:2: ']'
            {
             before(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4__Impl"


    // $ANTLR start "rule__Model__GridsAssignment_0"
    // InternalGameOfLifeDSL.g:1056:1: rule__Model__GridsAssignment_0 : ( ruleGrid ) ;
    public final void rule__Model__GridsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1060:1: ( ( ruleGrid ) )
            // InternalGameOfLifeDSL.g:1061:2: ( ruleGrid )
            {
            // InternalGameOfLifeDSL.g:1061:2: ( ruleGrid )
            // InternalGameOfLifeDSL.g:1062:3: ruleGrid
            {
             before(grammarAccess.getModelAccess().getGridsGridParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGridsGridParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GridsAssignment_0"


    // $ANTLR start "rule__Model__RulesAssignment_1"
    // InternalGameOfLifeDSL.g:1071:1: rule__Model__RulesAssignment_1 : ( ruleRules ) ;
    public final void rule__Model__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1075:1: ( ( ruleRules ) )
            // InternalGameOfLifeDSL.g:1076:2: ( ruleRules )
            {
            // InternalGameOfLifeDSL.g:1076:2: ( ruleRules )
            // InternalGameOfLifeDSL.g:1077:3: ruleRules
            {
             before(grammarAccess.getModelAccess().getRulesRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesRulesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RulesAssignment_1"


    // $ANTLR start "rule__Grid__NameAssignment_1"
    // InternalGameOfLifeDSL.g:1086:1: rule__Grid__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Grid__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1090:1: ( ( RULE_ID ) )
            // InternalGameOfLifeDSL.g:1091:2: ( RULE_ID )
            {
            // InternalGameOfLifeDSL.g:1091:2: ( RULE_ID )
            // InternalGameOfLifeDSL.g:1092:3: RULE_ID
            {
             before(grammarAccess.getGridAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__NameAssignment_1"


    // $ANTLR start "rule__Grid__LiveCellsAssignment_3"
    // InternalGameOfLifeDSL.g:1101:1: rule__Grid__LiveCellsAssignment_3 : ( ruleCell ) ;
    public final void rule__Grid__LiveCellsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1105:1: ( ( ruleCell ) )
            // InternalGameOfLifeDSL.g:1106:2: ( ruleCell )
            {
            // InternalGameOfLifeDSL.g:1106:2: ( ruleCell )
            // InternalGameOfLifeDSL.g:1107:3: ruleCell
            {
             before(grammarAccess.getGridAccess().getLiveCellsCellParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getGridAccess().getLiveCellsCellParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grid__LiveCellsAssignment_3"


    // $ANTLR start "rule__Cell__XAssignment_2"
    // InternalGameOfLifeDSL.g:1116:1: rule__Cell__XAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cell__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1120:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:1121:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:1121:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:1122:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getXINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__XAssignment_2"


    // $ANTLR start "rule__Cell__YAssignment_4"
    // InternalGameOfLifeDSL.g:1131:1: rule__Cell__YAssignment_4 : ( RULE_INT ) ;
    public final void rule__Cell__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1135:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:1136:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:1136:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:1137:3: RULE_INT
            {
             before(grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getYINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__YAssignment_4"


    // $ANTLR start "rule__Rules__SurviveRulesAssignment_2"
    // InternalGameOfLifeDSL.g:1146:1: rule__Rules__SurviveRulesAssignment_2 : ( ruleSurviveRule ) ;
    public final void rule__Rules__SurviveRulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1150:1: ( ( ruleSurviveRule ) )
            // InternalGameOfLifeDSL.g:1151:2: ( ruleSurviveRule )
            {
            // InternalGameOfLifeDSL.g:1151:2: ( ruleSurviveRule )
            // InternalGameOfLifeDSL.g:1152:3: ruleSurviveRule
            {
             before(grammarAccess.getRulesAccess().getSurviveRulesSurviveRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSurviveRule();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getSurviveRulesSurviveRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__SurviveRulesAssignment_2"


    // $ANTLR start "rule__Rules__BirthRulesAssignment_3"
    // InternalGameOfLifeDSL.g:1161:1: rule__Rules__BirthRulesAssignment_3 : ( ruleBirthRule ) ;
    public final void rule__Rules__BirthRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1165:1: ( ( ruleBirthRule ) )
            // InternalGameOfLifeDSL.g:1166:2: ( ruleBirthRule )
            {
            // InternalGameOfLifeDSL.g:1166:2: ( ruleBirthRule )
            // InternalGameOfLifeDSL.g:1167:3: ruleBirthRule
            {
             before(grammarAccess.getRulesAccess().getBirthRulesBirthRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBirthRule();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getBirthRulesBirthRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__BirthRulesAssignment_3"


    // $ANTLR start "rule__SurviveRule__NeighborsAssignment_2"
    // InternalGameOfLifeDSL.g:1176:1: rule__SurviveRule__NeighborsAssignment_2 : ( ruleNeighborCondition ) ;
    public final void rule__SurviveRule__NeighborsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1180:1: ( ( ruleNeighborCondition ) )
            // InternalGameOfLifeDSL.g:1181:2: ( ruleNeighborCondition )
            {
            // InternalGameOfLifeDSL.g:1181:2: ( ruleNeighborCondition )
            // InternalGameOfLifeDSL.g:1182:3: ruleNeighborCondition
            {
             before(grammarAccess.getSurviveRuleAccess().getNeighborsNeighborConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNeighborCondition();

            state._fsp--;

             after(grammarAccess.getSurviveRuleAccess().getNeighborsNeighborConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SurviveRule__NeighborsAssignment_2"


    // $ANTLR start "rule__BirthRule__NeighborsAssignment_2"
    // InternalGameOfLifeDSL.g:1191:1: rule__BirthRule__NeighborsAssignment_2 : ( ruleNeighborCondition ) ;
    public final void rule__BirthRule__NeighborsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1195:1: ( ( ruleNeighborCondition ) )
            // InternalGameOfLifeDSL.g:1196:2: ( ruleNeighborCondition )
            {
            // InternalGameOfLifeDSL.g:1196:2: ( ruleNeighborCondition )
            // InternalGameOfLifeDSL.g:1197:3: ruleNeighborCondition
            {
             before(grammarAccess.getBirthRuleAccess().getNeighborsNeighborConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNeighborCondition();

            state._fsp--;

             after(grammarAccess.getBirthRuleAccess().getNeighborsNeighborConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BirthRule__NeighborsAssignment_2"


    // $ANTLR start "rule__NeighborCondition__CountAssignment_0"
    // InternalGameOfLifeDSL.g:1206:1: rule__NeighborCondition__CountAssignment_0 : ( RULE_INT ) ;
    public final void rule__NeighborCondition__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1210:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:1211:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:1211:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:1212:3: RULE_INT
            {
             before(grammarAccess.getNeighborConditionAccess().getCountINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNeighborConditionAccess().getCountINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeighborCondition__CountAssignment_0"


    // $ANTLR start "rule__NeighborCondition__RangeAssignment_1"
    // InternalGameOfLifeDSL.g:1221:1: rule__NeighborCondition__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__NeighborCondition__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1225:1: ( ( ruleRange ) )
            // InternalGameOfLifeDSL.g:1226:2: ( ruleRange )
            {
            // InternalGameOfLifeDSL.g:1226:2: ( ruleRange )
            // InternalGameOfLifeDSL.g:1227:3: ruleRange
            {
             before(grammarAccess.getNeighborConditionAccess().getRangeRangeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getNeighborConditionAccess().getRangeRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NeighborCondition__RangeAssignment_1"


    // $ANTLR start "rule__Range__MinAssignment_1"
    // InternalGameOfLifeDSL.g:1236:1: rule__Range__MinAssignment_1 : ( RULE_INT ) ;
    public final void rule__Range__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1240:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:1241:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:1241:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:1242:3: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMinINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__MinAssignment_1"


    // $ANTLR start "rule__Range__MaxAssignment_3"
    // InternalGameOfLifeDSL.g:1251:1: rule__Range__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__Range__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGameOfLifeDSL.g:1255:1: ( ( RULE_INT ) )
            // InternalGameOfLifeDSL.g:1256:2: ( RULE_INT )
            {
            // InternalGameOfLifeDSL.g:1256:2: ( RULE_INT )
            // InternalGameOfLifeDSL.g:1257:3: RULE_INT
            {
             before(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getMaxINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__MaxAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000282000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});

}