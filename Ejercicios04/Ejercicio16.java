public class Ejercicio16{
	public static void main(String [] args){
		int contador = 0;
		System.out.println("@ Test para saber si tu pareja es infiel. \nResponde las siguientes preguntas con T si es verdadero o F si es falso: ");
		System.out.println("_______________________________________________________________________________");
		System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
		String respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("Ha aumentado sus gastos de vestuario");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("No te deja que mires la agenda de su teléfono móvil");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("Has notado que últimamente se perfuma más");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		respuesta = System.console().readLine();
		if (respuesta.equalsIgnoreCase("t")){
			contador = contador + 3;
		}
		
		if (contador <= 10){
			System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		}else if (contador > 10 && contador <= 22){
			System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		}else if (contador > 22 && contador <= 30){
			System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}
	}
}
