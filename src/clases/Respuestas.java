
package clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "AZUL","NO TIENE COLOR ","SI POR SUPUESTO","SON TRAICIONERAS LA VACACIONES","NO SIGO "
    };
    
    String[] radioR = {
        "AZUL,NO TIENE COLOR,SI POR SUPUESTO,SON TRAICIONERAS LA VACACIONES",
        "NO TIENE COLOR,SI POR SUPUESTO,SON TRAICIONERAS LA VACACIONES,NO SIGO",
        "SI POR SUPUESTO,SON TRAICIONERAS LA VACACIONES,NO SIGO,SE AGOTARON OPCIONES",
        "SON TRAICIONERAS LA VACACIONES,NO SIGO,SE AGOTARON OPCIONES,SE AGOTARON OPCIONES",
        "NO SIGO, SE AGOTARON OPCIONES,SE AGOTARON OPCIONES,SE AGOTARON OPCIONES",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); 
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
