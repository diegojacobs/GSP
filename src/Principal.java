import java.io.File;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.tree.ParseTree;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("Input.txt");
		MyFile file = new MyFile(f);
		file.readFile();
		
		CharStream cs =  new ANTLRInputStream(file.getInput());

        GSPLexer lexer = new GSPLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GSPParser  parser = new GSPParser(tokens);
        GSPParser.ProgramContext context = parser.program();
        
        ParseTree tree = context;

        int errorsCount = parser.getNumberOfSyntaxErrors();
        
        if (errorsCount == 0) {
            VisitorGSP gsp = new VisitorGSP();
            gsp.visit(tree);
            
            GSP gspAlgorithim = new GSP(gsp.getInitialState(), gsp.getGoalState(), gsp.getActions());
            gspAlgorithim.Solve();
        }
	}

}
