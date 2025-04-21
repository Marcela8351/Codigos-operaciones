import java.util.Scanner;

public class operaciones{  //clase "una platilla para guardar codigo"
    public static void main(String[] args) { //metodo principal
        Scanner leer= new Scanner(System.in); //Guarda la información en la libreria 
        int n1=0, resp=0;
        double raiz, factorial;
        System.out.println("Ingrese un número:");
        n1 = leer.nextInt();



        if (n1>=2){
            System.out.println("Menu operaciones");
            System.out.println("1. Imprimir la raíz cuadrada: ");
            System.out.println("2. Imprimir el factorial: ");
            System.out.println("3. Imprimir las tablas de multiplicar desde 2 hasta N: ");
            System.out.println("4. Imprimir un mensaje informando si es primo o no: ");
            System.out.println("5. Salir   Haz este ejercicio en java sin estructura y con muchos: ");
            resp = leer.nextInt();


            switch (resp) {
                case 1:
                    //Espacio para imprimir la raiz cuadrada
                    raiz = Math.sqrt(n1); 
                    System.out.println("La raíz cuadrada de " + n1 + " es: " + raiz);
                    break;
                    case 2:
                    // Espacio para imprimir el factorial
                    factorial = 1; 
                    for (int i = 1; i <= n1; i++) {
                        //factorial *= i;
                        factorial = factorial * i;
                    }
                    System.out.println("El factorial de " + n1 + " es: " + factorial);
                     break;
                default:
                    break;
            }




        }
    }
}