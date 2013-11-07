package pt.lobo.introj.lang.exceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class CatchOrSpecify {

	public static void main(String[] args) {
		CatchOrSpecify cos = new CatchOrSpecify();
		cos.test();
	}

	public void test() {
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
			pum();
		} catch (IOException e) {
			// Handle 1
		} catch (SQLException e) {
			// Handle 2
		} finally {
			// executado independentemente dos error
		}
	}
	
	public void pum() throws IOException, SQLException {
		
	}
	
}
