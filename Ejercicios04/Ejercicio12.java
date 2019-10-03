public class Ejercicio12{
	public static void main( String [] args){
		int nota = 0;
		System.out.println("Examen tipo tex: ");
		System.out.println("---------------------------");
		
		System.out.println("* ¿ Cómo se crea una variable entera ?");
		System.out.println("  a) double  b) String c) int");
		String respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("c") ){
			nota++;
		}
		
		System.out.println("* ¿ Qué tipo de leguaje es Java ?");
		System.out.println("  a) Interpretado  b) Compilado c) Agua");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("b") ){
			nota++;
		}
		
		System.out.println("* ¿ Cuántas estrellas tiene la bandera de EEUU ?");
		System.out.println("  a) 50  b) 25 c) 10");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("a") ){
			nota++;
		}
		
		System.out.println("* ¿ Cuántas vidas tiene un gato ?");
		System.out.println("  a) 7  b) 1 c) 4");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("a") ){
			nota++;
		}
		
		System.out.println("* ¿ Qué leguaje de programación es mas famoso ?");
		System.out.println("  a) C++  b) Python c) Java");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("c") ){
			nota++;
		}
		
		System.out.println("* ¿ En qué asignatura mandan mas ejercicios ?");
		System.out.println("  a) Programación  b) Lenguaje de Marcas c) Base de Datos");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("a") ){
			nota++;
		}
		
		System.out.println("* ¿ Quién ha hecho este fantastico test ?");
		System.out.println("  a) Juan  b) Ismael c) Diego");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("c") ){
			nota++;
		}
		
		System.out.println("* ¿ Qué color tiene la bandera de España ?");
		System.out.println("  a) Rojo  b) Morado c) Azul");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("a") ){
			nota++;
		}
		
		System.out.println("* ¿ Cuántas preguntas tiene este examen tipo test ?");
		System.out.println("  a) 120  b) 1 c) 10");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("c") ){
			nota++;
		}
		
		System.out.println("* ¿ Con qué utensilio te tomas la sopa ?");
		System.out.println("  a) Cuchillo  b) Tenedor c) Cucharón");
		respuestas = System.console().readLine();
		
		if ( respuestas.equalsIgnoreCase("c") ){
			nota++;
		}
		
		System.out.println("La nota es: " + nota);
	}
}
