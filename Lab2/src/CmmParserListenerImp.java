import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CmmParserListenerImp extends CmmParserBaseListener {
    public static String space = "";
    public static Vocabulary VOCABULARY = null;


    @Override public void enterProgram(CmmParser.ProgramContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "Program (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitProgram(CmmParser.ProgramContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = "";
    }

    @Override public void enterExtDef(CmmParser.ExtDefContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "ExtDef (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitExtDef(CmmParser.ExtDefContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterExtDecList(CmmParser.ExtDecListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "ExtDecList (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitExtDecList(CmmParser.ExtDecListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterSpecifier(CmmParser.SpecifierContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "Specifier (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitSpecifier(CmmParser.SpecifierContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterStructSpecifier(CmmParser.StructSpecifierContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "StructSpecifier (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitStructSpecifier(CmmParser.StructSpecifierContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterVarDec(CmmParser.VarDecContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "VarDec (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitVarDec(CmmParser.VarDecContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterFunDec(CmmParser.FunDecContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "FunDec (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitFunDec(CmmParser.FunDecContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterVarList(CmmParser.VarListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "VarList (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitVarList(CmmParser.VarListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterParamDec(CmmParser.ParamDecContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "ParamDec (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitParamDec(CmmParser.ParamDecContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterCompSt(CmmParser.CompStContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "CompSt (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitCompSt(CmmParser.CompStContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterStmtList(CmmParser.StmtListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "StmtList (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitStmtList(CmmParser.StmtListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterStmt(CmmParser.StmtContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "Stmt (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitStmt(CmmParser.StmtContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterDefList(CmmParser.DefListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "DefList (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitDefList(CmmParser.DefListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterDef(CmmParser.DefContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "Def (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitDef(CmmParser.DefContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterDecList(CmmParser.DecListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "DecList (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitDecList(CmmParser.DecListContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterDec(CmmParser.DecContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "Dec (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitDec(CmmParser.DecContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterExp(CmmParser.ExpContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "Exp (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitExp(CmmParser.ExpContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterArgs(CmmParser.ArgsContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "Args (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitArgs(CmmParser.ArgsContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterOptTag(CmmParser.OptTagContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "OptTag (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitOptTag(CmmParser.OptTagContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void enterTag(CmmParser.TagContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        System.err.println(space + "Tag (" + ctx.getStart().getLine() + ")");
        space += "  ";
    }

    @Override public void exitTag(CmmParser.TagContext ctx) {
        if(ctx.getChild(0)==null){
            return;
        }
        space = space.substring(0,space.length() - 2);
    }

    @Override public void visitTerminal(TerminalNode node) {
        Token token = node.getSymbol();
        if(token.getType() == 1){
            int dec;
            if(token.getText().charAt(0)!='0'|| token.getText().equals("0")){
                dec = Integer.parseInt(token.getText(),10);
            }
            else{
                if(token.getText().charAt(1)!='x' && token.getText().charAt(1)!='X'){
                    dec = Integer.parseInt(token.getText(),8);
                }
                else{
                    String text = token.getText().substring(2);
                    dec = Integer.parseInt(text,16);
                }
            }
            System.err.println(space + "INT: " + dec);
        }
        else if(token.getType()==5){
            double f = Double.parseDouble(token.getText());
            System.err.println(space + "FLOAT: " + String.format("%.6f",f));
        }
        else if(token.getType()==6){
            System.err.println(space + "TYPE: " + token.getText());
        }
        else if(token.getType()==12){
            System.err.println(space + "ID: " + token.getText());
        }
        else{
            if(!"EOF".equals(VOCABULARY.getSymbolicName(token.getType()))) {
                System.err.println(space + VOCABULARY.getSymbolicName(token.getType()));
            }
        }
    }

    @Override public void visitErrorNode(ErrorNode node) { }
}
