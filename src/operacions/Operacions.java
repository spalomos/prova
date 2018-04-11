package operacions;

public class Operacions {

	public static long iterativo (int numero){
		if (numero < 0){
			throw new IllegalArgumentException("El numero no ha de ser nergatiu");
		}
		long f = 1;
		for (int i = 1; i < numero + 1; i++) {
			f = f * i;
		}
		return f;
	}

}
