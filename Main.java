import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENÚ DE EJERCICIOS ===");
        System.out.println("1. Calcular promedio de calificaciones");
        System.out.println("2. Crear perfil de usuario y calcular año de nacimiento");
        System.out.print("Elige una opción (1 o 2): ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la primera calificación: ");
            int nota1 = scanner.nextInt();

            System.out.print("Ingrese la segunda calificación: ");
            int nota2 = scanner.nextInt();

            System.out.print("Ingrese la tercera calificación: ");
            int nota3 = scanner.nextInt();

            double promedio = (nota1 + nota2 + nota3) / 3.0;

            System.out.println("\nNombre: " + nombre);
            System.out.println("Promedio: " + promedio);

        } else if (opcion == 2) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Ingrese su nacionalidad: ");
            String nacionalidad = scanner.nextLine();

            System.out.print("Ingrese su ocupación: ");
            String ocupacion = scanner.nextLine();

            System.out.print("Ingrese su salario mensual: ");
            double salarioMensual = scanner.nextDouble();

            int anioActual = 2025;
            int anioNacimiento = anioActual - edad;

            System.out.println("\n--- Perfil de Usuario ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Año de nacimiento: " + anioNacimiento);
            System.out.println("Nacionalidad: " + nacionalidad);
            System.out.println("Ocupación: " + ocupacion);
            System.out.println("Salario mensual: $" + salarioMensual);

        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

