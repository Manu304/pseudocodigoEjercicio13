import java.util.Scanner;

//202030799 Manuel Rojas
//Realice un men� que permita ejecutar operaciones b�sicas matem�ticas de dos n�meros.
//Este men� debe repetirse hasta que el usuario seleccione la opci�n de salir. Las operaciones a considerarse son:
//	a. Sumar dos n�meros
//	b. Dividir dos n�meros (no se puede dividir por cero)
//	c. Salir
public class Ejercicio13Parte2 {
    public static void main(String[] args) {
        char opcion = 'd';
        while (opcion != 'c') {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido, que es lo que desea hacer?");
            System.out.println("   a. Sumar dos numeros");
            System.out.println("   b. Dividir dos numeros");
            System.out.println("   c. Salir");
            opcion = scanner.next().toLowerCase().charAt(0);
            switch (opcion) {
                case 'a': 
                    System.out.print("Ingrese el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("El total de la suma es: " + suma);
                    break;
                
                case 'b':
                    System.out.print("Ingrese el primer numero: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int num4 = scanner.nextInt();
                    if (num4 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    }else{
                        float division = (float) num3/num4;
                        System.out.println("El resultado de la division es: " + division);
                    }
                    break;

                case 'c':
                    System.out.println("Vuelve pronto.");
                    break;
            }
        } 
    } 
}