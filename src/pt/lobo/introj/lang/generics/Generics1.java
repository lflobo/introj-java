package pt.lobo.introj.lang.generics;

public class Generics1<T> {

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Generics1<Integer> ga = new Generics1<Integer>();
		ga.setValue(10);

		Generics1<String> gb = new Generics1<String>();
		gb.setValue("test");
		
		int value = ga.getValue();

		System.out.println(ga.getValue());
		System.out.println(gb.getValue());
	}

}
