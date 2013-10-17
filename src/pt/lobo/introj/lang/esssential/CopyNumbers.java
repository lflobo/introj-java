package pt.lobo.introj.lang.esssential;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyNumbers {

	public static void main(String[] args) throws IOException {
		// Start with invalid filenames
		String src = null;
		String dst = null;
		
		// Get the paths from the first and second arguments passed in the command line
		if(args.length > 1) {
			src = args[0];
			dst = args[1];
		} else
			throw new IllegalArgumentException("You need to provide at least 2 filenames");
		
		// Create the java.io.File instances for the path's
		File srcFile = new File(src);
		File dstFile = new File(dst);
		
		// Check the source path exists and is a file
		if(!srcFile.isFile()) throw new IllegalArgumentException("'" + src + "' is not a valid filename");
		
		// Use a BufferedReader/BufferedWriter to read/write the lines from/to the files
		BufferedReader srcReader = new BufferedReader(new FileReader(srcFile));
		BufferedWriter dstWriter = new BufferedWriter(new FileWriter(dstFile));
		
		// Start with an invalid line
		String srcLine = null;
		
		// While there is a valid line
		while((srcLine = srcReader.readLine()) != null) {
			
			// Split the line by spaces
			String[] words = srcLine.split("[ ]+");
			
			// Iterate over the word list
			for(String word : words) {
				try {
					// Try to convert the word to a number - will throw NumberFormatException if failed
					int number = Integer.parseInt(word);
					
					// Append the number and a space to the dstFile
					dstWriter.append(Integer.toString(number)).append(" ");
				} catch (NumberFormatException e) {
					// When the word is not a number this block will be called
					System.out.println("'" + word + "' is not a valid number (ignoring)");
				}
			}
		}
		
		// Finally close the opened resources - very important
		srcReader.close();
		dstWriter.close();
		
 	}

}
