package co.escuelaing.edu.arep;

public class Calculadora {
    public double numero;
    public String operacion;

    public Calculadora(double numero, String operacion) {
        this.numero = numero;
        this.operacion = operacion;
    }

    public double getRespuesta(){
        double respuesta=0;
        if(operacion.equals("in")){
            respuesta = Math.log(numero);
        }else if (operacion.equals("Sqrt")){
            respuesta = Math.sqrt(numero);
        }
        return respuesta;

    }
}
