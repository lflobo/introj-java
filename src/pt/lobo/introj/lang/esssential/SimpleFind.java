package pt.lobo.introj.lang.esssential;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SimpleFind implements FileFilter {

	private String expression;
	private Pattern compiledExpression;
	private String dirname;

	public SimpleFind(String dirname, String expression) {
		this.dirname = dirname;
		this.expression = expression;
	}

	private void execute() {
		try {
			// Try to compile the expression and check for errors before going on
			compiledExpression = Pattern.compile(expression);
			
			// Create the java.io.File object and check it exists
			File dir = new File(dirname);
			if(!dir.isDirectory())
				throw new IllegalArgumentException("The dirname '" + dirname + "' is invalid.");
			
			// Search for the files using ourselves as a filter (--> this)
			File[] matched = dir.listFiles(this);
			for(File match : matched)
				System.out.println(match.getAbsolutePath());
			
		} catch (PatternSyntaxException e) {
			// Output an error if the expression is invalid
			System.out.println("The expression '" + expression + "' is invalid.");
		}
	}
	
	@Override
	public boolean accept(File pathname) {
		// Use the compiled expression to compare
		Matcher matcher = compiledExpression.matcher(pathname.getName());
		return matcher.matches();
	}
	
	// main(String[]) method makes the class executable
	public static void main(String[] args) throws IOException {
		// Start with invalid filenames
		String dirname = null;
		String expression = null;
		
		// Get the paths from the first and second arguments passed in the command line
		if(args.length > 1) {
			dirname = args[0];
			expression = args[1];
		} else
			throw new IllegalArgumentException("You need to provide a dirname and an expression");
		
		// This time we use an instance of the class instead of static executing
		SimpleFind find = new SimpleFind(dirname, expression);
		
		// Outputs the result to the console
		find.execute();
	}

}
