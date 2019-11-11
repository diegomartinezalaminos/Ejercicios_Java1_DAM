
package ejercicios6;
public class Ejercicio15 {
    public static void main(String[] args) {
        int random = 0;
        boolean rompe = true;
        while (rompe){
            random = (int)(Math.random() * 25 + 4);
            if ((random % 4) == 0){
                rompe = false;
            }
        }
        int random2 = 0;
        String primera = "";
        for (int i = 1; i < random; i++){
            random2 = (int)(Math.random() * 8);
            switch (random2){
                case 0:
                    if (i == 1){
                        primera = "do ";
                        System.out.print("do ");
                    }else if ((i % 4) == 0){
                        System.out.print("do | ");
                    }else{
                        System.out.print("do ");
                    }
                    break;
                    
                case 1:
                    if (i == 1){
                        primera = "re ";
                        System.out.print("re ");
                    }else if ((i % 4) == 0){
                        System.out.print("re | ");
                    }else{
                        System.out.print("re ");
                    }
                    break;
                    
                case 2:
                    if (i == 1){
                        primera = "mi ";
                        System.out.print("mi ");
                    }else if ((i % 4) == 0){
                        System.out.print("mi | ");
                    }else{
                        System.out.print("mi ");
                    }
                    break;
                    
                case 3:
                    if (i == 1){
                        primera = "fa ";
                        System.out.print("fa ");
                    }else if ((i % 4) == 0){
                        System.out.print("fa | ");
                    }else{
                        System.out.print("fa ");
                    }
                    break;
                    
                case 4:
                    if (i == 1){
                        primera = "fa ";
                        System.out.print("fa ");
                    }else if ((i % 4) == 0){
                        System.out.print("fa | ");
                    }else{
                        System.out.print("fa ");
                    }
                    break;
                    
                case 5:
                    if (i == 1){
                        primera = "sol ";
                        System.out.print("sol ");
                    }else if ((i % 4) == 0){
                        System.out.print("sol | ");
                    }else{
                        System.out.print("sol ");
                    }
                    break;
                    
                case 6:
                    if (i == 1){
                        primera = "la ";
                        System.out.print("la ");
                    }else if ((i % 4) == 0){
                        System.out.print("la | ");
                    }else{
                        System.out.print("la ");
                    }
                    break;
                    
                case 7:
                    if (i == 1){
                        primera = "si ";
                        System.out.print("si ");
                    }else if ((i % 4) == 0){
                        System.out.print("si | ");
                    }else{
                        System.out.print("si ");
                    }
                    break;
            }
        }
        System.out.print(primera +"||");
        System.out.println("");
        System.out.println("La primera nota es: " + primera);
    }
        
    
}
