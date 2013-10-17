package pt.lobo.introj.lang.inherit;

public class HelloDemo {
	
	public static void main(String[] args) {
		String name = "Luís";

		// Instanciar a implementação PT
		Hello pt = new HelloPtImpl();
		pt.sayHello(name);
		
		// Instanciar a implementação EN
		Hello en = new HelloEnImpl();
		en.sayHello(name);
		
		// A variável 'en' passa a ser uma referência para a implementação PT
		en = pt;
		en.sayHello(name);
	}

}
