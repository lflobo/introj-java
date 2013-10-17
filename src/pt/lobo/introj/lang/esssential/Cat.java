package pt.lobo.introj.lang.esssential;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Cat {

	public static void main(String[] args) throws IOException {
		// Start with an invalid filename
		String filename = null;
		
		// Get the path from the first argument passed in the command line
		if(args.length > 0)
			filename = args[0];
		// If none passed throw an error
		else
			throw new IllegalArgumentException("You need to provide a filename");
		
		// Create a path object
		Path path = Paths.get(filename);
		
		// Check the file exists - throw an error if it doesn't exist
		if(!Files.exists(path))
			throw new NoSuchFileException("The file '" + filename + "' does not exist.");

		// Get all the lines in the file 
		List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
		
		// Line number
		int num = 1;
		
		// For each line output the line number and the line
		for(String line : lines) {
			System.out.println((num++) + " - " + line);
		}
			
	}

}
