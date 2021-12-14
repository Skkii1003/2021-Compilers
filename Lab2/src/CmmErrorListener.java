import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CmmErrorListener extends BaseErrorListener {

    public static final CmmErrorListener INSTANCE = new CmmErrorListener();

    public CmmErrorListener() {
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.err.println("Error type B at Line " + line + ":" + " " + msg);
    }
}
