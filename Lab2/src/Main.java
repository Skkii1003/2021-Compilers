import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.*;


public class Main
{
    static Boolean err = false;
    static int[] outLine = new int[500];


    public static void main(String[] args) throws IOException{
        String path = args[0];
        //lexer
        CmmLexer lexer = new CmmLexer(CharStreams.fromFileName(path)){
            @Override
            public void notifyListeners(LexerNoViableAltException e){
                String text = this._input.getText(Interval.of(this._tokenStartCharIndex, this._input.index()));
                String msg = "Error type A at Line " + this._tokenStartLine + ": Mysterious character '" + this.getErrorDisplay(text) + "'.";
                System.err.println(msg);
                err = true;
            }
        };
        List<? extends Token> tokenList = lexer.getAllTokens();
        /*for (Token token : tokenList) {
            if(err) {
                break;
            }
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
                //System.err.println("INT " + dec + " at Line " + token.getLine() + ".");
            }
            else if(token.getType()==5){
                double f = Double.parseDouble(token.getText());
                //System.err.println("FLOAT " + String.format("%.6f",f) + " at Line " + token.getLine() + ".");
            }
            else{
                //System.err.println(lexer.getVocabulary().getSymbolicName(token.getType()) + " " + token.getText() + " at Line " + token.getLine() + ".");
            }
        }
        */

        //parser
        lexer.reset();
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmmParser parser = new CmmParser(tokens){
            @Override
            public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e) {
                err = true;
                ++this._syntaxErrors;
                int line = offendingToken.getLine();

                if(outLine[line]==0) {
                    outLine[line] = 1;
                    int charPositionInLine = offendingToken.getCharPositionInLine();
                    ANTLRErrorListener listener = this.getErrorListenerDispatch();
                    listener.syntaxError(this, offendingToken, line, charPositionInLine, msg, e);
                }
            }
        };
        parser.removeErrorListeners();
        parser.addErrorListener(CmmErrorListener.INSTANCE);

        ParseTree tree = parser.program();
        if(!err) {
            ParseTreeWalker walker = new ParseTreeWalker();
            CmmParserListenerImp listener = new CmmParserListenerImp();
            CmmParserListenerImp.VOCABULARY = lexer.getVocabulary();
            walker.walk(listener, tree);
        }
    }
}