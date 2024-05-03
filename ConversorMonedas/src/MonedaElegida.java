import java.util.Scanner;

public class MonedaElegida {

    private String MonedaBase;



    private String MonedaConver;

    public MonedaElegida(int opcion) {

        Scanner teclado= new Scanner(System.in);

        switch (opcion) {
            case 1 -> {
                System.out.println("Conversiones admitidas:\n 1) [Dólar => Peso Argentino]\n 2) [Peso Argentino => Dólar]");
                System.out.println("\nElija la opción que prefiera: ");
                int dlrARS = teclado.nextInt();
                if (dlrARS == 2) {
                    System.out.println("(2) [Peso Argentino =>Dólar]");
                    MonedaBase = "ARS";
                    this.MonedaConver = "USD";
                } else {
                    System.out.println("Aunque la opción 2 es perfectamente valida, esta es la opción por defecto\n");
                    System.out.println("(1) [Dólar =>Peso Argentino]");
                    MonedaBase = "USD";
                    this.MonedaConver = "ARS";
                }
            }
            case 2 -> {
                System.out.println("Conversiones admitidas:\n 1) [Dólar => Bolivar]\n 2) [Bolivar => Dólar]");
                System.out.println("\nElija la opción que prefiera: ");
                int dlrBOB = teclado.nextInt();
                if (dlrBOB == 2) {
                    System.out.println("(2) [Bolivar =>Dólar]");
                    MonedaBase = "BOB";
                    this.MonedaConver = "USD";
                } else {
                    System.out.println("Aunque la opción 2 es perfectamente valida, esta es la opción por defecto\n");
                    System.out.println("(1) [Dólar =>Bolivar]");
                    MonedaBase = "USD";
                    this.MonedaConver = "BOB";
                }
            }
            case 3 -> {
                System.out.println("Conversiones admitidas:\n 1) [Dólar => Real Brasileño]\n 2) [Real Brasileño => Dólar]");
                System.out.println("\nElija la opción que prefiera: ");
                int dlrBRL = teclado.nextInt();
                if (dlrBRL == 2) {
                    System.out.println("(2) [Real Brasileño =>Dólar]");
                    MonedaBase = "BRL";
                    this.MonedaConver = "USD";
                } else {
                    System.out.println("Aunque la opción 2 es perfectamente valida, esta es la opción por defecto\n");
                    System.out.println("(1) [Dólar =>Real Brasileño]");
                    MonedaBase = "USD";
                    this.MonedaConver = "BRL";
                }
            }
            case 4 -> {
                System.out.println("Conversiones admitidas:\n 1) [Dólar => Peso Chileno]\n 2) [Peso Chileno => Dólar]");
                System.out.println("\nElija la opción que prefiera: ");
                int dlrCLP = teclado.nextInt();
                if (dlrCLP == 2) {
                    System.out.println("(2) [Peso Chileno =>Dólar]");
                    MonedaBase = "CLP";
                    this.MonedaConver = "USD";
                } else {
                    System.out.println("Aunque la opción 2 es perfectamente valida, esta es la opción por defecto\n");
                    System.out.println("(1) [Dólar =>Peso Chileno]");
                    MonedaBase = "USD";
                    this.MonedaConver = "CLP";
                }
            }
            case 5 -> {
                System.out.println("Conversiones admitidas:\n 1) [Dólar => Peso Colombiano]\n 2) [Peso Colombiano => Dólar]");
                System.out.println("\nElija la opción que prefiera: ");
                int dlrCOP = teclado.nextInt();
                if (dlrCOP == 2) {
                    System.out.println("(2) [Peso Colombiano =>Dólar]");
                    MonedaBase = "COP";
                    this.MonedaConver = "USD";
                } else {
                    System.out.println("Aunque la opción 2 es perfectamente valida, esta es la opción por defecto\n");
                    System.out.println("(1) [Dólar =>Peso Colombiano]");
                    MonedaBase = "USD";
                    this.MonedaConver = "COP";
                }
            }
            case 6 -> {
                System.out.println("Conversiones admitidas:\n 1) [Dólar => Peso Mexicano]\n 2) [Peso Mexicano => Dólar]");
                System.out.println("\nElija la opción que prefiera: ");
                int dlrMXN = teclado.nextInt();
                if (dlrMXN == 2) {
                    System.out.println("(2) [Peso Mexicano =>Dólar]");
                    MonedaBase = "MXN";
                    this.MonedaConver = "USD";
                } else {
                    System.out.println("Aunque la opción 2 es perfectamente valida, esta es la opción por defecto\n");
                    System.out.println("(1) [Dólar =>Peso Mexicano]");
                    MonedaBase = "USD";
                    this.MonedaConver = "MXN";
                }
            }
            default -> {
                System.out.println("No existe este número de opción.\n");
                System.out.println("Datos erroreos que prosigan, son a causa de esta mala elección.");
            }
        }

    }

    public String getMonedaConver() {
        return MonedaConver;
    }

    public String getMonedaBase() {
        return MonedaBase;
    }

}
