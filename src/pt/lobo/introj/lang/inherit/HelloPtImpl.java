package pt.lobo.introj.lang.inherit;

public class HelloPtImpl implements Hello {

	@Override
	public void sayHello(String name) {
		System.out.println("Olá " + name + "!");
	}

}
