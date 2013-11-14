package pt.lobo.introj.lang.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class CatchOrSpecify {

	public static void main(String[] args) {
		CatchOrSpecify cos = new CatchOrSpecify();
		try {
			cos.test();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void test() throws FileNotFoundException {
		// PROBLEMA: Catch or specify <- obrigatorio handle da exception
		PrintWriter writer = new PrintWriter(new File("/tmp/output.txt"));
		
		for(int i=0; i<10; i++) {
			// PROBLEMA: Apesar de nao fazermos handle a exception vai ocorrer
			int value = Integer.parseInt("123a");
			writer.println(value);
		}
		
		writer.close();
	}
	
	public void test2() {
		try {
			// Alocar 1G RAM
			pum();
		} catch (SQLException e) {
			// Handle 1
		} catch (IOException e) {
			// Handle 2
		} finally {
			// libertar
		}
	}
	
	public void pum() throws IOException, SQLException {
		
	}
	
}
