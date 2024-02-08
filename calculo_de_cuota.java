import java.util.Scanner;
public class calculo_de_cuota {
    public static void main(String[] args) {

        final double TASA = 0.2135;
        Scanner escaner = new Scanner(System.in);
        //Pantalla de inicio
        System.out.println("Bienvenido al Banco Atlántico Financiero");

        //Ingresar nombre y apellido
        System.out.println("Ingrese su nombre y su apellido");
        String nombre_apellido = escaner.nextLine();

        //Ingreso monto del prestamo, no puede ser negativo
        System.out.println("Ingrese el monto del préstamo: ");
        double Capital = escaner.nextDouble();
        if (Capital < 0){
            System.out.println("Ha ocurrido un error, el capital no puede ser menor a 0 ");
            return;
        }

        //Ingresar la cantidad de cuotas
        System.out.println("Ingrese la cantidad de cuotas:");
        int cuotas = escaner.nextInt();
        if (cuotas >= 60 || cuotas < 0){
            System.out.println("Ha ocurrido un error, sobre pasa el limite de cuotas establecido. ");
            return;
        }
        //Calculo
        double factor = Math.pow(1 + TASA, cuotas);
        double factor2 = Math.pow(1 + TASA, cuotas-1);
        double pagoMensual = Capital * (TASA * factor)/(factor2);

        //Impresion en pantalla
        System.out.println("----------------------------");
        System.out.println("Bienvenido "+nombre_apellido);
        System.out.println("----------------------------");
        System.out.println("El monto de su prestamo es $"+Capital);
        System.out.println("----------------------------");
        System.out.println("Cuotas a pagar: "+cuotas+ " cuotas");
        System.out.println("----------------------------");
        System.out.println("Su pago mensual seria $"+Math.round(pagoMensual));
        System.out.println("----------------------------");

    }
}
