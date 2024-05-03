import java.io.IOException;
import java.util.Scanner;


//import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion=0;
        while (opcion != 7) {
        System.out.println ("""
                           ******************************
                           Bienvenido al conversor de monedas!
                           Opciones de conversión:
                           1)Peso Argentino<->Dólar
                           2)Bolivar Boliviano <-> Dólar
                           3)Real Brasileño <-> Dólar
                           4)Peso Chileno <-> Dólar
                           5)Peso Colombiano <-> Dólar
                           6)Dólar Estadounidense <-> Peso Mexicano
                           7)salir
                           *******************************
                           """);

        System.out.println("Elija una opción valida de la lista: ");
        Scanner teclado= new Scanner(System.in);
            try{


                opcion = teclado.nextInt(); //enviamos opcion

                if (opcion == 7) {
                    break;
                }


                MonedaElegida nuevaM = new MonedaElegida(opcion);
            String monedaB = nuevaM.getMonedaBase();
            String monedaConv = nuevaM.getMonedaConver();

            ConsultaDatosApi consulta = new ConsultaDatosApi(monedaB);


           // try {

                DatosApi datos = consulta.buscaDatos(monedaConv);
                // System.out.println(consulta.encuentra(datos,monedaConv));
                System.out.println("\n Indique la cantidad que desea convertir:");
                double convertir = Double.parseDouble(teclado.next());
                // los parametros que vamos a usar aqui son (monedaBase=getElige(),monedaCambio=faltaChecar,Usuario=convertir,conversion_rates=API)
                CalculaCambio nuevaConversion = new CalculaCambio(monedaB, monedaConv, convertir, consulta.encuentra(datos, monedaConv));
                String respuesta = nuevaConversion.operacion();
                System.out.println(respuesta);
                System.out.println("\n Si desea continuar, pulse cualquier tecla, si prefiere salir pulse 7: ");
                opcion= Integer.parseInt(teclado.next());
                if(opcion==7) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Numero no encontrado " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());//Con e.getMessage muestra con texto lo que no se pudo convertir a entero
                System.out.println("Finalizando la conversion.");
            }

        }

    }
}