package com.yepro12.compiler2017;
import com.yepro12.compiler2017.AST.Program;
import com.yepro12.compiler2017.Front.*;
import com.yepro12.compiler2017.Parser.*;
import com.yepro12.compiler2017.Table.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.InputStream;

/**
 * Created by yepro12 on 2017/4/5.
 */

public class MidTermTest {
    public static void main(String[] argv) {
        try {
            InputStream is = System.in;
            ANTLRInputStream input = new ANTLRInputStream(is);
            mxLexer lexer = new mxLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            mxParser parser = new mxParser(tokens);

            ParseTree tree = parser.code();
            ParseTreeWalker walker = new ParseTreeWalker();
            ASTGenerator astBuilder = new ASTGenerator();
            walker.walk(astBuilder, tree);
            Program program = astBuilder.program;
            GlobalTable sym = new GlobalTable();
            ClassScanner cs = new ClassScanner(sym);
            FunctionScanner fs = new FunctionScanner(sym);
            SemanticCheck sc = new SemanticCheck(sym);

            program.accept(cs);
            program.accept(fs);
            program.accept(sc);
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
