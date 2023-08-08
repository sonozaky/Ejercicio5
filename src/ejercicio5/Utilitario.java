
package ejercicio5;

public class Utilitario {
    public static void dibujaCuadrado(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i>1 && i<n && j>1 && j<n){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
    public static void elMayorEs(int uno, int dos, int tres){
        if (uno>dos && uno>tres){
            System.out.println("El numero "+uno+" es el mas grande");    
        } else if (dos>uno && dos>tres){
            System.out.println("El numero "+dos+" es el mas grande"); 
        }else if (tres>uno && tres>dos){
            System.out.println("El numero "+tres+" es el mas grande");
        }else if (uno==dos && uno==tres && dos==tres){
            System.out.println("Los tres numeros son iguales");
        }
    }
    
    public static void elDiaEs(int dia){
        if (dia==1){
            System.out.println("Lunes");
        }else if (dia==2){
            System.out.println("Martes");
        }else if (dia==3){
            System.out.println("Miercoles");
        }else if (dia==4){
            System.out.println("Jueves");
        }else if (dia==5){
            System.out.println("Viernes");
        }else if (dia==6){
            System.out.println("Sabado");
        }else if (dia==7){
            System.out.println("Domingo");
        }else if (dia<=0 || dia>7 ){
            System.out.println("Fuera de rango");
        }
    }
}
