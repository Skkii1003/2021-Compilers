import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import java.io.*;
import java.util.*;


public class Main
{
    static Boolean err = false;

    public static void main(String[] args) throws IOException{
        String path = args[0];

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


        for (Token token : tokenList) {
            if(err) {
                break;
            }
            if(token.getType() == 1){
                int dec = Integer.parseInt(token.getText(),10);
                System.err.println("INT " + dec + " at Line " + token.getLine() + ".");
            }
            else if(token.getType() == 2){
                int dec = Integer.parseInt(token.getText(),8);
                System.err.println("INT " + dec + " at Line " + token.getLine() + ".");
            }
            else if(token.getType() == 3){
                String text = token.getText().substring(2);
                int dec = Integer.parseInt(text,16);
                System.err.println("INT " + dec + " at Line " + token.getLine() + ".");
            }
            else if(token.getType()==4){
                double f = Double.parseDouble(token.getText());
                System.err.println("FLOAT " + String.format("%.6f",f) + " at Line " + token.getLine() + ".");
            }
            else{
                System.err.println(lexer.getVocabulary().getSymbolicName(token.getType()) + " " + token.getText() + " at Line " + token.getLine() + ".");
            }
        }
    }
}