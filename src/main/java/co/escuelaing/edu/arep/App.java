package co.escuelaing.edu.arep;
import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
        get("/in", (request, response) -> {
            Calculadora calculadora =  new Calculadora(Double.parseDouble(request.queryParams("value")),"in");
            ConvertidorJSON convertir = new ConvertidorJSON();
            return convertir.stringToJSON("in",Double.parseDouble(request.queryParams("value")), calculadora.getRespuesta());
    });
        get("/Sqrt", (request, response) -> {
            Calculadora calculadora =  new Calculadora(Double.parseDouble(request.queryParams("value")),"Sqrt");
            ConvertidorJSON convertir = new ConvertidorJSON();
            return convertir.stringToJSON("Sqrt",Double.parseDouble(request.queryParams("value")), calculadora.getRespuesta());
        });
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 6789;
    }
}
