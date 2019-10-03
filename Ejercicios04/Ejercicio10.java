public class Ejercicio10{
	public static void main( String [] args){
		System.out.println("Descubre tu horoscopo ;)");
		System.out.println("Introduce el mes en el que nacistes en números: ");
		int mes = Integer.parseInt(System.console().readLine());
		System.out.println("Introduce el día en el que nacistes en números: ");
		int dia = Integer.parseInt(System.console().readLine());
		
		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)){
			System.out.println("...Aries...");
		}else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)){
			System.out.println("...Tauro...");
		}else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)){
			System.out.println("...Géminis...");
		}else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)){
			System.out.println("...Cáncer...");
		}else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)){
			System.out.println("...Leo...");
		}else if ((mes == 8 && dia >= 22) || (mes == 9 && dia <= 24)){
			System.out.println("...Virgo...");
		}else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 22)){
			System.out.println("...Libra...");
		}else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 22)){
			System.out.println("...Escorpio...");
		}else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)){
			System.out.println("...Sagitario...");
		}else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)){
			System.out.println("...Capricornio...");
		}else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)){
			System.out.println("...Acuario...");
		}else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)){
			System.out.println("...Piscis...");
		}	
	}
}
