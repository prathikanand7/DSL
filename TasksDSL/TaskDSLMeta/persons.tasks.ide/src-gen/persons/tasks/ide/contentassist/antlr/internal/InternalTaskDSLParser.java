package persons.tasks.ide.contentassist.antlr.internal;

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
import persons.tasks.services.TaskDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'min'", "'hour'", "'day'", "'week'", "'Person'", "'Task'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTaskDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskDSL.g"; }


    	private TaskDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(TaskDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePlanning"
    // InternalTaskDSL.g:53:1: entryRulePlanning : rulePlanning EOF ;
    public final void entryRulePlanning() throws RecognitionException {
        try {
            // InternalTaskDSL.g:54:1: ( rulePlanning EOF )
            // InternalTaskDSL.g:55:1: rulePlanning EOF
            {
             before(grammarAccess.getPlanningRule()); 
            pushFollow(FOLLOW_1);
            rulePlanning();

            state._fsp--;

             after(grammarAccess.getPlanningRule()); 
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
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalTaskDSL.g:62:1: rulePlanning : ( ( rule__Planning__PersonlistAssignment )* ) ;
    public final void rulePlanning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:66:2: ( ( ( rule__Planning__PersonlistAssignment )* ) )
            // InternalTaskDSL.g:67:2: ( ( rule__Planning__PersonlistAssignment )* )
            {
            // InternalTaskDSL.g:67:2: ( ( rule__Planning__PersonlistAssignment )* )
            // InternalTaskDSL.g:68:3: ( rule__Planning__PersonlistAssignment )*
            {
             before(grammarAccess.getPlanningAccess().getPersonlistAssignment()); 
            // InternalTaskDSL.g:69:3: ( rule__Planning__PersonlistAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTaskDSL.g:69:4: rule__Planning__PersonlistAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Planning__PersonlistAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPlanningAccess().getPersonlistAssignment()); 

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
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePersonTasks"
    // InternalTaskDSL.g:78:1: entryRulePersonTasks : rulePersonTasks EOF ;
    public final void entryRulePersonTasks() throws RecognitionException {
        try {
            // InternalTaskDSL.g:79:1: ( rulePersonTasks EOF )
            // InternalTaskDSL.g:80:1: rulePersonTasks EOF
            {
             before(grammarAccess.getPersonTasksRule()); 
            pushFollow(FOLLOW_1);
            rulePersonTasks();

            state._fsp--;

             after(grammarAccess.getPersonTasksRule()); 
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
    // $ANTLR end "entryRulePersonTasks"


    // $ANTLR start "rulePersonTasks"
    // InternalTaskDSL.g:87:1: rulePersonTasks : ( ( rule__PersonTasks__Group__0 ) ) ;
    public final void rulePersonTasks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:91:2: ( ( ( rule__PersonTasks__Group__0 ) ) )
            // InternalTaskDSL.g:92:2: ( ( rule__PersonTasks__Group__0 ) )
            {
            // InternalTaskDSL.g:92:2: ( ( rule__PersonTasks__Group__0 ) )
            // InternalTaskDSL.g:93:3: ( rule__PersonTasks__Group__0 )
            {
             before(grammarAccess.getPersonTasksAccess().getGroup()); 
            // InternalTaskDSL.g:94:3: ( rule__PersonTasks__Group__0 )
            // InternalTaskDSL.g:94:4: rule__PersonTasks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PersonTasks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonTasksAccess().getGroup()); 

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
    // $ANTLR end "rulePersonTasks"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:103:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTaskDSL.g:104:1: ( ruleTask EOF )
            // InternalTaskDSL.g:105:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:112:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:116:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalTaskDSL.g:117:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalTaskDSL.g:117:2: ( ( rule__Task__Group__0 ) )
            // InternalTaskDSL.g:118:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalTaskDSL.g:119:3: ( rule__Task__Group__0 )
            // InternalTaskDSL.g:119:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:129:1: ( ruleAction EOF )
            // InternalTaskDSL.g:130:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTaskDSL.g:137:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:141:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalTaskDSL.g:142:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalTaskDSL.g:142:2: ( ( rule__Action__Alternatives ) )
            // InternalTaskDSL.g:143:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalTaskDSL.g:144:3: ( rule__Action__Alternatives )
            // InternalTaskDSL.g:144:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalTaskDSL.g:153:1: entryRuleLunchAction : ruleLunchAction EOF ;
    public final void entryRuleLunchAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:154:1: ( ruleLunchAction EOF )
            // InternalTaskDSL.g:155:1: ruleLunchAction EOF
            {
             before(grammarAccess.getLunchActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLunchAction();

            state._fsp--;

             after(grammarAccess.getLunchActionRule()); 
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
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalTaskDSL.g:162:1: ruleLunchAction : ( ( rule__LunchAction__Group__0 ) ) ;
    public final void ruleLunchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:166:2: ( ( ( rule__LunchAction__Group__0 ) ) )
            // InternalTaskDSL.g:167:2: ( ( rule__LunchAction__Group__0 ) )
            {
            // InternalTaskDSL.g:167:2: ( ( rule__LunchAction__Group__0 ) )
            // InternalTaskDSL.g:168:3: ( rule__LunchAction__Group__0 )
            {
             before(grammarAccess.getLunchActionAccess().getGroup()); 
            // InternalTaskDSL.g:169:3: ( rule__LunchAction__Group__0 )
            // InternalTaskDSL.g:169:4: rule__LunchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLunchActionAccess().getGroup()); 

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
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalTaskDSL.g:178:1: entryRuleMeetingAction : ruleMeetingAction EOF ;
    public final void entryRuleMeetingAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:179:1: ( ruleMeetingAction EOF )
            // InternalTaskDSL.g:180:1: ruleMeetingAction EOF
            {
             before(grammarAccess.getMeetingActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMeetingAction();

            state._fsp--;

             after(grammarAccess.getMeetingActionRule()); 
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
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalTaskDSL.g:187:1: ruleMeetingAction : ( ( rule__MeetingAction__Group__0 ) ) ;
    public final void ruleMeetingAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:191:2: ( ( ( rule__MeetingAction__Group__0 ) ) )
            // InternalTaskDSL.g:192:2: ( ( rule__MeetingAction__Group__0 ) )
            {
            // InternalTaskDSL.g:192:2: ( ( rule__MeetingAction__Group__0 ) )
            // InternalTaskDSL.g:193:3: ( rule__MeetingAction__Group__0 )
            {
             before(grammarAccess.getMeetingActionAccess().getGroup()); 
            // InternalTaskDSL.g:194:3: ( rule__MeetingAction__Group__0 )
            // InternalTaskDSL.g:194:4: rule__MeetingAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeetingActionAccess().getGroup()); 

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
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalTaskDSL.g:203:1: entryRulePaperAction : rulePaperAction EOF ;
    public final void entryRulePaperAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:204:1: ( rulePaperAction EOF )
            // InternalTaskDSL.g:205:1: rulePaperAction EOF
            {
             before(grammarAccess.getPaperActionRule()); 
            pushFollow(FOLLOW_1);
            rulePaperAction();

            state._fsp--;

             after(grammarAccess.getPaperActionRule()); 
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
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalTaskDSL.g:212:1: rulePaperAction : ( ( rule__PaperAction__Group__0 ) ) ;
    public final void rulePaperAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:216:2: ( ( ( rule__PaperAction__Group__0 ) ) )
            // InternalTaskDSL.g:217:2: ( ( rule__PaperAction__Group__0 ) )
            {
            // InternalTaskDSL.g:217:2: ( ( rule__PaperAction__Group__0 ) )
            // InternalTaskDSL.g:218:3: ( rule__PaperAction__Group__0 )
            {
             before(grammarAccess.getPaperActionAccess().getGroup()); 
            // InternalTaskDSL.g:219:3: ( rule__PaperAction__Group__0 )
            // InternalTaskDSL.g:219:4: rule__PaperAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaperActionAccess().getGroup()); 

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
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalTaskDSL.g:228:1: entryRulePaymentAction : rulePaymentAction EOF ;
    public final void entryRulePaymentAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:229:1: ( rulePaymentAction EOF )
            // InternalTaskDSL.g:230:1: rulePaymentAction EOF
            {
             before(grammarAccess.getPaymentActionRule()); 
            pushFollow(FOLLOW_1);
            rulePaymentAction();

            state._fsp--;

             after(grammarAccess.getPaymentActionRule()); 
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
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalTaskDSL.g:237:1: rulePaymentAction : ( ( rule__PaymentAction__Group__0 ) ) ;
    public final void rulePaymentAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:241:2: ( ( ( rule__PaymentAction__Group__0 ) ) )
            // InternalTaskDSL.g:242:2: ( ( rule__PaymentAction__Group__0 ) )
            {
            // InternalTaskDSL.g:242:2: ( ( rule__PaymentAction__Group__0 ) )
            // InternalTaskDSL.g:243:3: ( rule__PaymentAction__Group__0 )
            {
             before(grammarAccess.getPaymentActionAccess().getGroup()); 
            // InternalTaskDSL.g:244:3: ( rule__PaymentAction__Group__0 )
            // InternalTaskDSL.g:244:4: rule__PaymentAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaymentActionAccess().getGroup()); 

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
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:253:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:257:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalTaskDSL.g:258:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalTaskDSL.g:258:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalTaskDSL.g:259:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalTaskDSL.g:260:3: ( rule__TimeUnit__Alternatives )
            // InternalTaskDSL.g:260:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalTaskDSL.g:268:1: rule__Action__Alternatives : ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:272:1: ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:273:2: ( ruleLunchAction )
                    {
                    // InternalTaskDSL.g:273:2: ( ruleLunchAction )
                    // InternalTaskDSL.g:274:3: ruleLunchAction
                    {
                     before(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLunchAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:279:2: ( ruleMeetingAction )
                    {
                    // InternalTaskDSL.g:279:2: ( ruleMeetingAction )
                    // InternalTaskDSL.g:280:3: ruleMeetingAction
                    {
                     before(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMeetingAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:285:2: ( rulePaperAction )
                    {
                    // InternalTaskDSL.g:285:2: ( rulePaperAction )
                    // InternalTaskDSL.g:286:3: rulePaperAction
                    {
                     before(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePaperAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:291:2: ( rulePaymentAction )
                    {
                    // InternalTaskDSL.g:291:2: ( rulePaymentAction )
                    // InternalTaskDSL.g:292:3: rulePaymentAction
                    {
                     before(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePaymentAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalTaskDSL.g:301:1: rule__TimeUnit__Alternatives : ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:305:1: ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:306:2: ( ( 'min' ) )
                    {
                    // InternalTaskDSL.g:306:2: ( ( 'min' ) )
                    // InternalTaskDSL.g:307:3: ( 'min' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:308:3: ( 'min' )
                    // InternalTaskDSL.g:308:4: 'min'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:312:2: ( ( 'hour' ) )
                    {
                    // InternalTaskDSL.g:312:2: ( ( 'hour' ) )
                    // InternalTaskDSL.g:313:3: ( 'hour' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:314:3: ( 'hour' )
                    // InternalTaskDSL.g:314:4: 'hour'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:318:2: ( ( 'day' ) )
                    {
                    // InternalTaskDSL.g:318:2: ( ( 'day' ) )
                    // InternalTaskDSL.g:319:3: ( 'day' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    // InternalTaskDSL.g:320:3: ( 'day' )
                    // InternalTaskDSL.g:320:4: 'day'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:324:2: ( ( 'week' ) )
                    {
                    // InternalTaskDSL.g:324:2: ( ( 'week' ) )
                    // InternalTaskDSL.g:325:3: ( 'week' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    // InternalTaskDSL.g:326:3: ( 'week' )
                    // InternalTaskDSL.g:326:4: 'week'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__PersonTasks__Group__0"
    // InternalTaskDSL.g:334:1: rule__PersonTasks__Group__0 : rule__PersonTasks__Group__0__Impl rule__PersonTasks__Group__1 ;
    public final void rule__PersonTasks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:338:1: ( rule__PersonTasks__Group__0__Impl rule__PersonTasks__Group__1 )
            // InternalTaskDSL.g:339:2: rule__PersonTasks__Group__0__Impl rule__PersonTasks__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PersonTasks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonTasks__Group__1();

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
    // $ANTLR end "rule__PersonTasks__Group__0"


    // $ANTLR start "rule__PersonTasks__Group__0__Impl"
    // InternalTaskDSL.g:346:1: rule__PersonTasks__Group__0__Impl : ( 'Person' ) ;
    public final void rule__PersonTasks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:350:1: ( ( 'Person' ) )
            // InternalTaskDSL.g:351:1: ( 'Person' )
            {
            // InternalTaskDSL.g:351:1: ( 'Person' )
            // InternalTaskDSL.g:352:2: 'Person'
            {
             before(grammarAccess.getPersonTasksAccess().getPersonKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonTasksAccess().getPersonKeyword_0()); 

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
    // $ANTLR end "rule__PersonTasks__Group__0__Impl"


    // $ANTLR start "rule__PersonTasks__Group__1"
    // InternalTaskDSL.g:361:1: rule__PersonTasks__Group__1 : rule__PersonTasks__Group__1__Impl rule__PersonTasks__Group__2 ;
    public final void rule__PersonTasks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:365:1: ( rule__PersonTasks__Group__1__Impl rule__PersonTasks__Group__2 )
            // InternalTaskDSL.g:366:2: rule__PersonTasks__Group__1__Impl rule__PersonTasks__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PersonTasks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PersonTasks__Group__2();

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
    // $ANTLR end "rule__PersonTasks__Group__1"


    // $ANTLR start "rule__PersonTasks__Group__1__Impl"
    // InternalTaskDSL.g:373:1: rule__PersonTasks__Group__1__Impl : ( ( rule__PersonTasks__NameAssignment_1 ) ) ;
    public final void rule__PersonTasks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:377:1: ( ( ( rule__PersonTasks__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:378:1: ( ( rule__PersonTasks__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:378:1: ( ( rule__PersonTasks__NameAssignment_1 ) )
            // InternalTaskDSL.g:379:2: ( rule__PersonTasks__NameAssignment_1 )
            {
             before(grammarAccess.getPersonTasksAccess().getNameAssignment_1()); 
            // InternalTaskDSL.g:380:2: ( rule__PersonTasks__NameAssignment_1 )
            // InternalTaskDSL.g:380:3: rule__PersonTasks__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PersonTasks__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonTasksAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PersonTasks__Group__1__Impl"


    // $ANTLR start "rule__PersonTasks__Group__2"
    // InternalTaskDSL.g:388:1: rule__PersonTasks__Group__2 : rule__PersonTasks__Group__2__Impl ;
    public final void rule__PersonTasks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:392:1: ( rule__PersonTasks__Group__2__Impl )
            // InternalTaskDSL.g:393:2: rule__PersonTasks__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PersonTasks__Group__2__Impl();

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
    // $ANTLR end "rule__PersonTasks__Group__2"


    // $ANTLR start "rule__PersonTasks__Group__2__Impl"
    // InternalTaskDSL.g:399:1: rule__PersonTasks__Group__2__Impl : ( ( ( rule__PersonTasks__TasksAssignment_2 ) ) ( ( rule__PersonTasks__TasksAssignment_2 )* ) ) ;
    public final void rule__PersonTasks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:403:1: ( ( ( ( rule__PersonTasks__TasksAssignment_2 ) ) ( ( rule__PersonTasks__TasksAssignment_2 )* ) ) )
            // InternalTaskDSL.g:404:1: ( ( ( rule__PersonTasks__TasksAssignment_2 ) ) ( ( rule__PersonTasks__TasksAssignment_2 )* ) )
            {
            // InternalTaskDSL.g:404:1: ( ( ( rule__PersonTasks__TasksAssignment_2 ) ) ( ( rule__PersonTasks__TasksAssignment_2 )* ) )
            // InternalTaskDSL.g:405:2: ( ( rule__PersonTasks__TasksAssignment_2 ) ) ( ( rule__PersonTasks__TasksAssignment_2 )* )
            {
            // InternalTaskDSL.g:405:2: ( ( rule__PersonTasks__TasksAssignment_2 ) )
            // InternalTaskDSL.g:406:3: ( rule__PersonTasks__TasksAssignment_2 )
            {
             before(grammarAccess.getPersonTasksAccess().getTasksAssignment_2()); 
            // InternalTaskDSL.g:407:3: ( rule__PersonTasks__TasksAssignment_2 )
            // InternalTaskDSL.g:407:4: rule__PersonTasks__TasksAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__PersonTasks__TasksAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonTasksAccess().getTasksAssignment_2()); 

            }

            // InternalTaskDSL.g:410:2: ( ( rule__PersonTasks__TasksAssignment_2 )* )
            // InternalTaskDSL.g:411:3: ( rule__PersonTasks__TasksAssignment_2 )*
            {
             before(grammarAccess.getPersonTasksAccess().getTasksAssignment_2()); 
            // InternalTaskDSL.g:412:3: ( rule__PersonTasks__TasksAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTaskDSL.g:412:4: rule__PersonTasks__TasksAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__PersonTasks__TasksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPersonTasksAccess().getTasksAssignment_2()); 

            }


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
    // $ANTLR end "rule__PersonTasks__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalTaskDSL.g:422:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:426:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTaskDSL.g:427:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalTaskDSL.g:434:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:438:1: ( ( 'Task' ) )
            // InternalTaskDSL.g:439:1: ( 'Task' )
            {
            // InternalTaskDSL.g:439:1: ( 'Task' )
            // InternalTaskDSL.g:440:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalTaskDSL.g:449:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:453:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTaskDSL.g:454:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalTaskDSL.g:461:1: rule__Task__Group__1__Impl : ( ( rule__Task__ActionAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:465:1: ( ( ( rule__Task__ActionAssignment_1 ) ) )
            // InternalTaskDSL.g:466:1: ( ( rule__Task__ActionAssignment_1 ) )
            {
            // InternalTaskDSL.g:466:1: ( ( rule__Task__ActionAssignment_1 ) )
            // InternalTaskDSL.g:467:2: ( rule__Task__ActionAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_1()); 
            // InternalTaskDSL.g:468:2: ( rule__Task__ActionAssignment_1 )
            // InternalTaskDSL.g:468:3: rule__Task__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getActionAssignment_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalTaskDSL.g:476:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:480:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalTaskDSL.g:481:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalTaskDSL.g:488:1: rule__Task__Group__2__Impl : ( 'priority:' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:492:1: ( ( 'priority:' ) )
            // InternalTaskDSL.g:493:1: ( 'priority:' )
            {
            // InternalTaskDSL.g:493:1: ( 'priority:' )
            // InternalTaskDSL.g:494:2: 'priority:'
            {
             before(grammarAccess.getTaskAccess().getPriorityKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPriorityKeyword_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalTaskDSL.g:503:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:507:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalTaskDSL.g:508:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

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
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalTaskDSL.g:515:1: rule__Task__Group__3__Impl : ( ( rule__Task__PrioAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:519:1: ( ( ( rule__Task__PrioAssignment_3 ) ) )
            // InternalTaskDSL.g:520:1: ( ( rule__Task__PrioAssignment_3 ) )
            {
            // InternalTaskDSL.g:520:1: ( ( rule__Task__PrioAssignment_3 ) )
            // InternalTaskDSL.g:521:2: ( rule__Task__PrioAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getPrioAssignment_3()); 
            // InternalTaskDSL.g:522:2: ( rule__Task__PrioAssignment_3 )
            // InternalTaskDSL.g:522:3: rule__Task__PrioAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__PrioAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPrioAssignment_3()); 

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
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalTaskDSL.g:530:1: rule__Task__Group__4 : rule__Task__Group__4__Impl ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:534:1: ( rule__Task__Group__4__Impl )
            // InternalTaskDSL.g:535:2: rule__Task__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__4__Impl();

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
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalTaskDSL.g:541:1: rule__Task__Group__4__Impl : ( ( rule__Task__Group_4__0 )? ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:545:1: ( ( ( rule__Task__Group_4__0 )? ) )
            // InternalTaskDSL.g:546:1: ( ( rule__Task__Group_4__0 )? )
            {
            // InternalTaskDSL.g:546:1: ( ( rule__Task__Group_4__0 )? )
            // InternalTaskDSL.g:547:2: ( rule__Task__Group_4__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_4()); 
            // InternalTaskDSL.g:548:2: ( rule__Task__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:548:3: rule__Task__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group_4__0"
    // InternalTaskDSL.g:557:1: rule__Task__Group_4__0 : rule__Task__Group_4__0__Impl rule__Task__Group_4__1 ;
    public final void rule__Task__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:561:1: ( rule__Task__Group_4__0__Impl rule__Task__Group_4__1 )
            // InternalTaskDSL.g:562:2: rule__Task__Group_4__0__Impl rule__Task__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_4__1();

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
    // $ANTLR end "rule__Task__Group_4__0"


    // $ANTLR start "rule__Task__Group_4__0__Impl"
    // InternalTaskDSL.g:569:1: rule__Task__Group_4__0__Impl : ( 'duration:' ) ;
    public final void rule__Task__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:573:1: ( ( 'duration:' ) )
            // InternalTaskDSL.g:574:1: ( 'duration:' )
            {
            // InternalTaskDSL.g:574:1: ( 'duration:' )
            // InternalTaskDSL.g:575:2: 'duration:'
            {
             before(grammarAccess.getTaskAccess().getDurationKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDurationKeyword_4_0()); 

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
    // $ANTLR end "rule__Task__Group_4__0__Impl"


    // $ANTLR start "rule__Task__Group_4__1"
    // InternalTaskDSL.g:584:1: rule__Task__Group_4__1 : rule__Task__Group_4__1__Impl rule__Task__Group_4__2 ;
    public final void rule__Task__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:588:1: ( rule__Task__Group_4__1__Impl rule__Task__Group_4__2 )
            // InternalTaskDSL.g:589:2: rule__Task__Group_4__1__Impl rule__Task__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_4__2();

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
    // $ANTLR end "rule__Task__Group_4__1"


    // $ANTLR start "rule__Task__Group_4__1__Impl"
    // InternalTaskDSL.g:596:1: rule__Task__Group_4__1__Impl : ( ( rule__Task__DlAssignment_4_1 ) ) ;
    public final void rule__Task__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:600:1: ( ( ( rule__Task__DlAssignment_4_1 ) ) )
            // InternalTaskDSL.g:601:1: ( ( rule__Task__DlAssignment_4_1 ) )
            {
            // InternalTaskDSL.g:601:1: ( ( rule__Task__DlAssignment_4_1 ) )
            // InternalTaskDSL.g:602:2: ( rule__Task__DlAssignment_4_1 )
            {
             before(grammarAccess.getTaskAccess().getDlAssignment_4_1()); 
            // InternalTaskDSL.g:603:2: ( rule__Task__DlAssignment_4_1 )
            // InternalTaskDSL.g:603:3: rule__Task__DlAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DlAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDlAssignment_4_1()); 

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
    // $ANTLR end "rule__Task__Group_4__1__Impl"


    // $ANTLR start "rule__Task__Group_4__2"
    // InternalTaskDSL.g:611:1: rule__Task__Group_4__2 : rule__Task__Group_4__2__Impl ;
    public final void rule__Task__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:615:1: ( rule__Task__Group_4__2__Impl )
            // InternalTaskDSL.g:616:2: rule__Task__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_4__2__Impl();

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
    // $ANTLR end "rule__Task__Group_4__2"


    // $ANTLR start "rule__Task__Group_4__2__Impl"
    // InternalTaskDSL.g:622:1: rule__Task__Group_4__2__Impl : ( ( rule__Task__UnitAssignment_4_2 ) ) ;
    public final void rule__Task__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:626:1: ( ( ( rule__Task__UnitAssignment_4_2 ) ) )
            // InternalTaskDSL.g:627:1: ( ( rule__Task__UnitAssignment_4_2 ) )
            {
            // InternalTaskDSL.g:627:1: ( ( rule__Task__UnitAssignment_4_2 ) )
            // InternalTaskDSL.g:628:2: ( rule__Task__UnitAssignment_4_2 )
            {
             before(grammarAccess.getTaskAccess().getUnitAssignment_4_2()); 
            // InternalTaskDSL.g:629:2: ( rule__Task__UnitAssignment_4_2 )
            // InternalTaskDSL.g:629:3: rule__Task__UnitAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__UnitAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getUnitAssignment_4_2()); 

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
    // $ANTLR end "rule__Task__Group_4__2__Impl"


    // $ANTLR start "rule__LunchAction__Group__0"
    // InternalTaskDSL.g:638:1: rule__LunchAction__Group__0 : rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 ;
    public final void rule__LunchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:642:1: ( rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 )
            // InternalTaskDSL.g:643:2: rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LunchAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1();

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
    // $ANTLR end "rule__LunchAction__Group__0"


    // $ANTLR start "rule__LunchAction__Group__0__Impl"
    // InternalTaskDSL.g:650:1: rule__LunchAction__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__LunchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:654:1: ( ( 'Lunch' ) )
            // InternalTaskDSL.g:655:1: ( 'Lunch' )
            {
            // InternalTaskDSL.g:655:1: ( 'Lunch' )
            // InternalTaskDSL.g:656:2: 'Lunch'
            {
             before(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 

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
    // $ANTLR end "rule__LunchAction__Group__0__Impl"


    // $ANTLR start "rule__LunchAction__Group__1"
    // InternalTaskDSL.g:665:1: rule__LunchAction__Group__1 : rule__LunchAction__Group__1__Impl ;
    public final void rule__LunchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:669:1: ( rule__LunchAction__Group__1__Impl )
            // InternalTaskDSL.g:670:2: rule__LunchAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1__Impl();

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
    // $ANTLR end "rule__LunchAction__Group__1"


    // $ANTLR start "rule__LunchAction__Group__1__Impl"
    // InternalTaskDSL.g:676:1: rule__LunchAction__Group__1__Impl : ( ( rule__LunchAction__LocationAssignment_1 ) ) ;
    public final void rule__LunchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:680:1: ( ( ( rule__LunchAction__LocationAssignment_1 ) ) )
            // InternalTaskDSL.g:681:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            {
            // InternalTaskDSL.g:681:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            // InternalTaskDSL.g:682:2: ( rule__LunchAction__LocationAssignment_1 )
            {
             before(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            // InternalTaskDSL.g:683:2: ( rule__LunchAction__LocationAssignment_1 )
            // InternalTaskDSL.g:683:3: rule__LunchAction__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__LocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 

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
    // $ANTLR end "rule__LunchAction__Group__1__Impl"


    // $ANTLR start "rule__MeetingAction__Group__0"
    // InternalTaskDSL.g:692:1: rule__MeetingAction__Group__0 : rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 ;
    public final void rule__MeetingAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:696:1: ( rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 )
            // InternalTaskDSL.g:697:2: rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MeetingAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1();

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
    // $ANTLR end "rule__MeetingAction__Group__0"


    // $ANTLR start "rule__MeetingAction__Group__0__Impl"
    // InternalTaskDSL.g:704:1: rule__MeetingAction__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__MeetingAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:708:1: ( ( 'Meeting' ) )
            // InternalTaskDSL.g:709:1: ( 'Meeting' )
            {
            // InternalTaskDSL.g:709:1: ( 'Meeting' )
            // InternalTaskDSL.g:710:2: 'Meeting'
            {
             before(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 

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
    // $ANTLR end "rule__MeetingAction__Group__0__Impl"


    // $ANTLR start "rule__MeetingAction__Group__1"
    // InternalTaskDSL.g:719:1: rule__MeetingAction__Group__1 : rule__MeetingAction__Group__1__Impl ;
    public final void rule__MeetingAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:723:1: ( rule__MeetingAction__Group__1__Impl )
            // InternalTaskDSL.g:724:2: rule__MeetingAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1__Impl();

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
    // $ANTLR end "rule__MeetingAction__Group__1"


    // $ANTLR start "rule__MeetingAction__Group__1__Impl"
    // InternalTaskDSL.g:730:1: rule__MeetingAction__Group__1__Impl : ( ( rule__MeetingAction__TopicAssignment_1 ) ) ;
    public final void rule__MeetingAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:734:1: ( ( ( rule__MeetingAction__TopicAssignment_1 ) ) )
            // InternalTaskDSL.g:735:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            {
            // InternalTaskDSL.g:735:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            // InternalTaskDSL.g:736:2: ( rule__MeetingAction__TopicAssignment_1 )
            {
             before(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            // InternalTaskDSL.g:737:2: ( rule__MeetingAction__TopicAssignment_1 )
            // InternalTaskDSL.g:737:3: rule__MeetingAction__TopicAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__TopicAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 

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
    // $ANTLR end "rule__MeetingAction__Group__1__Impl"


    // $ANTLR start "rule__PaperAction__Group__0"
    // InternalTaskDSL.g:746:1: rule__PaperAction__Group__0 : rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 ;
    public final void rule__PaperAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:750:1: ( rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 )
            // InternalTaskDSL.g:751:2: rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PaperAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1();

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
    // $ANTLR end "rule__PaperAction__Group__0"


    // $ANTLR start "rule__PaperAction__Group__0__Impl"
    // InternalTaskDSL.g:758:1: rule__PaperAction__Group__0__Impl : ( 'Report' ) ;
    public final void rule__PaperAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:762:1: ( ( 'Report' ) )
            // InternalTaskDSL.g:763:1: ( 'Report' )
            {
            // InternalTaskDSL.g:763:1: ( 'Report' )
            // InternalTaskDSL.g:764:2: 'Report'
            {
             before(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 

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
    // $ANTLR end "rule__PaperAction__Group__0__Impl"


    // $ANTLR start "rule__PaperAction__Group__1"
    // InternalTaskDSL.g:773:1: rule__PaperAction__Group__1 : rule__PaperAction__Group__1__Impl ;
    public final void rule__PaperAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:777:1: ( rule__PaperAction__Group__1__Impl )
            // InternalTaskDSL.g:778:2: rule__PaperAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1__Impl();

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
    // $ANTLR end "rule__PaperAction__Group__1"


    // $ANTLR start "rule__PaperAction__Group__1__Impl"
    // InternalTaskDSL.g:784:1: rule__PaperAction__Group__1__Impl : ( ( rule__PaperAction__ReportAssignment_1 ) ) ;
    public final void rule__PaperAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:788:1: ( ( ( rule__PaperAction__ReportAssignment_1 ) ) )
            // InternalTaskDSL.g:789:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            {
            // InternalTaskDSL.g:789:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            // InternalTaskDSL.g:790:2: ( rule__PaperAction__ReportAssignment_1 )
            {
             before(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            // InternalTaskDSL.g:791:2: ( rule__PaperAction__ReportAssignment_1 )
            // InternalTaskDSL.g:791:3: rule__PaperAction__ReportAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__ReportAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 

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
    // $ANTLR end "rule__PaperAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__0"
    // InternalTaskDSL.g:800:1: rule__PaymentAction__Group__0 : rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 ;
    public final void rule__PaymentAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:804:1: ( rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 )
            // InternalTaskDSL.g:805:2: rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PaymentAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__1();

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
    // $ANTLR end "rule__PaymentAction__Group__0"


    // $ANTLR start "rule__PaymentAction__Group__0__Impl"
    // InternalTaskDSL.g:812:1: rule__PaymentAction__Group__0__Impl : ( 'Pay' ) ;
    public final void rule__PaymentAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:816:1: ( ( 'Pay' ) )
            // InternalTaskDSL.g:817:1: ( 'Pay' )
            {
            // InternalTaskDSL.g:817:1: ( 'Pay' )
            // InternalTaskDSL.g:818:2: 'Pay'
            {
             before(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); 

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
    // $ANTLR end "rule__PaymentAction__Group__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group__1"
    // InternalTaskDSL.g:827:1: rule__PaymentAction__Group__1 : rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 ;
    public final void rule__PaymentAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:831:1: ( rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 )
            // InternalTaskDSL.g:832:2: rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PaymentAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2();

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
    // $ANTLR end "rule__PaymentAction__Group__1"


    // $ANTLR start "rule__PaymentAction__Group__1__Impl"
    // InternalTaskDSL.g:839:1: rule__PaymentAction__Group__1__Impl : ( ( rule__PaymentAction__AmountAssignment_1 ) ) ;
    public final void rule__PaymentAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:843:1: ( ( ( rule__PaymentAction__AmountAssignment_1 ) ) )
            // InternalTaskDSL.g:844:1: ( ( rule__PaymentAction__AmountAssignment_1 ) )
            {
            // InternalTaskDSL.g:844:1: ( ( rule__PaymentAction__AmountAssignment_1 ) )
            // InternalTaskDSL.g:845:2: ( rule__PaymentAction__AmountAssignment_1 )
            {
             before(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); 
            // InternalTaskDSL.g:846:2: ( rule__PaymentAction__AmountAssignment_1 )
            // InternalTaskDSL.g:846:3: rule__PaymentAction__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); 

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
    // $ANTLR end "rule__PaymentAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__2"
    // InternalTaskDSL.g:854:1: rule__PaymentAction__Group__2 : rule__PaymentAction__Group__2__Impl ;
    public final void rule__PaymentAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:858:1: ( rule__PaymentAction__Group__2__Impl )
            // InternalTaskDSL.g:859:2: rule__PaymentAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2__Impl();

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
    // $ANTLR end "rule__PaymentAction__Group__2"


    // $ANTLR start "rule__PaymentAction__Group__2__Impl"
    // InternalTaskDSL.g:865:1: rule__PaymentAction__Group__2__Impl : ( 'euro' ) ;
    public final void rule__PaymentAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:869:1: ( ( 'euro' ) )
            // InternalTaskDSL.g:870:1: ( 'euro' )
            {
            // InternalTaskDSL.g:870:1: ( 'euro' )
            // InternalTaskDSL.g:871:2: 'euro'
            {
             before(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); 

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
    // $ANTLR end "rule__PaymentAction__Group__2__Impl"


    // $ANTLR start "rule__Planning__PersonlistAssignment"
    // InternalTaskDSL.g:881:1: rule__Planning__PersonlistAssignment : ( rulePersonTasks ) ;
    public final void rule__Planning__PersonlistAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:885:1: ( ( rulePersonTasks ) )
            // InternalTaskDSL.g:886:2: ( rulePersonTasks )
            {
            // InternalTaskDSL.g:886:2: ( rulePersonTasks )
            // InternalTaskDSL.g:887:3: rulePersonTasks
            {
             before(grammarAccess.getPlanningAccess().getPersonlistPersonTasksParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePersonTasks();

            state._fsp--;

             after(grammarAccess.getPlanningAccess().getPersonlistPersonTasksParserRuleCall_0()); 

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
    // $ANTLR end "rule__Planning__PersonlistAssignment"


    // $ANTLR start "rule__PersonTasks__NameAssignment_1"
    // InternalTaskDSL.g:896:1: rule__PersonTasks__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PersonTasks__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:900:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:901:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:901:2: ( RULE_ID )
            // InternalTaskDSL.g:902:3: RULE_ID
            {
             before(grammarAccess.getPersonTasksAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonTasksAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PersonTasks__NameAssignment_1"


    // $ANTLR start "rule__PersonTasks__TasksAssignment_2"
    // InternalTaskDSL.g:911:1: rule__PersonTasks__TasksAssignment_2 : ( ruleTask ) ;
    public final void rule__PersonTasks__TasksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:915:1: ( ( ruleTask ) )
            // InternalTaskDSL.g:916:2: ( ruleTask )
            {
            // InternalTaskDSL.g:916:2: ( ruleTask )
            // InternalTaskDSL.g:917:3: ruleTask
            {
             before(grammarAccess.getPersonTasksAccess().getTasksTaskParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getPersonTasksAccess().getTasksTaskParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PersonTasks__TasksAssignment_2"


    // $ANTLR start "rule__Task__ActionAssignment_1"
    // InternalTaskDSL.g:926:1: rule__Task__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:930:1: ( ( ruleAction ) )
            // InternalTaskDSL.g:931:2: ( ruleAction )
            {
            // InternalTaskDSL.g:931:2: ( ruleAction )
            // InternalTaskDSL.g:932:3: ruleAction
            {
             before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Task__ActionAssignment_1"


    // $ANTLR start "rule__Task__PrioAssignment_3"
    // InternalTaskDSL.g:941:1: rule__Task__PrioAssignment_3 : ( RULE_INT ) ;
    public final void rule__Task__PrioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:945:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:946:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:946:2: ( RULE_INT )
            // InternalTaskDSL.g:947:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Task__PrioAssignment_3"


    // $ANTLR start "rule__Task__DlAssignment_4_1"
    // InternalTaskDSL.g:956:1: rule__Task__DlAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Task__DlAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:960:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:961:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:961:2: ( RULE_INT )
            // InternalTaskDSL.g:962:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getDlINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDlINTTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Task__DlAssignment_4_1"


    // $ANTLR start "rule__Task__UnitAssignment_4_2"
    // InternalTaskDSL.g:971:1: rule__Task__UnitAssignment_4_2 : ( ruleTimeUnit ) ;
    public final void rule__Task__UnitAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:975:1: ( ( ruleTimeUnit ) )
            // InternalTaskDSL.g:976:2: ( ruleTimeUnit )
            {
            // InternalTaskDSL.g:976:2: ( ruleTimeUnit )
            // InternalTaskDSL.g:977:3: ruleTimeUnit
            {
             before(grammarAccess.getTaskAccess().getUnitTimeUnitEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getUnitTimeUnitEnumRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Task__UnitAssignment_4_2"


    // $ANTLR start "rule__LunchAction__LocationAssignment_1"
    // InternalTaskDSL.g:986:1: rule__LunchAction__LocationAssignment_1 : ( RULE_ID ) ;
    public final void rule__LunchAction__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:990:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:991:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:991:2: ( RULE_ID )
            // InternalTaskDSL.g:992:3: RULE_ID
            {
             before(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LunchAction__LocationAssignment_1"


    // $ANTLR start "rule__MeetingAction__TopicAssignment_1"
    // InternalTaskDSL.g:1001:1: rule__MeetingAction__TopicAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MeetingAction__TopicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1005:1: ( ( RULE_STRING ) )
            // InternalTaskDSL.g:1006:2: ( RULE_STRING )
            {
            // InternalTaskDSL.g:1006:2: ( RULE_STRING )
            // InternalTaskDSL.g:1007:3: RULE_STRING
            {
             before(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MeetingAction__TopicAssignment_1"


    // $ANTLR start "rule__PaperAction__ReportAssignment_1"
    // InternalTaskDSL.g:1016:1: rule__PaperAction__ReportAssignment_1 : ( RULE_ID ) ;
    public final void rule__PaperAction__ReportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1020:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1021:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:1021:2: ( RULE_ID )
            // InternalTaskDSL.g:1022:3: RULE_ID
            {
             before(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PaperAction__ReportAssignment_1"


    // $ANTLR start "rule__PaymentAction__AmountAssignment_1"
    // InternalTaskDSL.g:1031:1: rule__PaymentAction__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__PaymentAction__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1035:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:1036:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:1036:2: ( RULE_INT )
            // InternalTaskDSL.g:1037:3: RULE_INT
            {
             before(grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PaymentAction__AmountAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});

}