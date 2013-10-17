package pt.lobo.introj.lang.inherit;

public class HelloEnImpl implements Hello {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name + "!");
	}

}
