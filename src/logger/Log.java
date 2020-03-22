/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

/**
 *
 * @author Johanna
 */

/* La clase permite qque se cree solo una instncia del objeto*/

public class Log {
    /**Variable de tipo static Log*/
    private static Log instancia;
    
    private String valorMensaje;
    /**Constructor privado*/
    private Log(){}
    /**método de tipo estatico retorna una objeto de tipo log si ya se ha creado
    sino crea una nueva instacia */
    public static synchronized Log getInstacia(){
        /** Si el log es nulo crea una nueva instancia de tipo log*/
       if(instancia == null){
          instancia = new Log();
       }
       return instancia;
    }
    
    /**método de tipo void, imprime un cadena de caracteres*/
    public void imprimeLog(String msj){
        System.out.println(msj);
    }

    /**Getters and setters*/
    public static Log getInstancia() {
        return instancia;
    }

    public static void setInstancia(Log instancia) {
        Log.instancia = instancia;
    }

    public String getValorMensaje() {
        return valorMensaje;
    }

    public void setValorMensaje(String valorMensaje) {
        this.valorMensaje = valorMensaje;
    }
    
    
    
}
