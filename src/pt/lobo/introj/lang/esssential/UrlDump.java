package pt.lobo.introj.lang.esssential;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDump {

	public static void main(String[] args) throws IOException {
		// Criar uma URL
		URL url = new URL("http://www.ipb.pt/");
		
		// Obter a stream de dados da URL
		InputStream urlStream = url.openStream();
		
		// Criar um buffered reader para podermos ler linha-a-linha
		BufferedReader urlReader = new BufferedReader(new InputStreamReader(urlStream));
		
		// Começar com uma linha inválida
		String line = null;
		
		// Ler as linhas e enviar para a consola
		while((line = urlReader.readLine()) != null)
			System.out.println(line);
	}
	
}
