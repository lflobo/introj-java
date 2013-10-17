package pt.lobo.introj.lang.inherit;

public interface Car {

	// constantes, se houver
	public static final String COMPANY_NAME = "Ferrari";

	public enum Direction {
		LEFT, RIGHT
	};

	// Assintaturas de métodos
	int turn(Direction direction, double radius, double startSpeed, double endSpeed);
   int accelerate(double amount);
   int stop();
   int start();

   // ...
}
