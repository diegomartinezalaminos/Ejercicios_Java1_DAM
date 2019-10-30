import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Introduce 10 numeros separados por un espacio: ");
        String [] numeros = n.nextLine().split(" ");
        for (String num: numeros){
            if (Integer.parseInt(num) > 0){
                System.out.println("El número " + Integer.parseInt(num) + " es positivo");
            }else if (Integer.parseInt(num) == 0){
                System.out.println("El número " + Integer.parseInt(num) + " es 0");
            }else{
                 System.out.println("El número " + Integer.parseInt(num) + " es negativo");
            }
        }
        
        
    }
    
}
