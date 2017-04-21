
package clases;


public class Preguntas {
    
    String[] preguntas = {
        "¿COLOR DEL CIELO?", "¿COLOR DEL MAR?", "¿PASARE EL EXAMEN?",
        "¿POR QUE HASTA APENAS?", "¿TU NOMBRE EMPIEZA CON W?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
