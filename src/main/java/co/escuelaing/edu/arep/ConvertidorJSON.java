package co.escuelaing.edu.arep;

import org.json.JSONObject;

public class ConvertidorJSON {

    JSONObject ObjectJson ;

    public ConvertidorJSON(){
        ObjectJson= new JSONObject();
    }

    public JSONObject stringToJSON(String operacion,double input,double numero){
        ObjectJson.put("operation", operacion);
        ObjectJson.put("input", input);
        ObjectJson.put("output", numero);
        System.out.println(ObjectJson);
        return ObjectJson;

    }

}
