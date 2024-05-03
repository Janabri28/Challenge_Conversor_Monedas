

public class CalculaCambio {

    private String monedaBase;
    private String monedaCambio;
    private double convertir;
    private double tasaConversion;


    public CalculaCambio(String monedaBase, String monedaCambio, double convertir, double tasaConversion) {
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
        this.convertir = convertir;
        this.tasaConversion = tasaConversion;
    }

    public String operacion(){
        double d;
        double tasaBase = 1;
        d=(convertir*tasaConversion)/ tasaBase;
            double resultado= Math.round(d*100.0)/100.0;
            return convertir+"["+monedaBase+"] equivale a: $"+resultado+"["+monedaCambio+"]";
    }


    //Getters

    /*
    public String getMonedaCambio() {
        return monedaCambio;
    } */

    /*
    public double getTasaBase() {
        return tasaBase;
    }  */

    /*
    public double getTasaConversion() {
        return tasaConversion;
    }  */
}
