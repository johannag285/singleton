/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;

/**
 *
 * @author Johannna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //obtine un objeto de tipo log
        Log log = Log.getInstacia();
        Log log1 = Log.getInstacia();
        Log log2 = Log.getInstacia();
        
        
        log.imprimeLog("Usuario: Johanna  Codigo: 5067777");
        log1.imprimeLog("Usuario: Felipe Codigo: 55555");
        log2.imprimeLog("Usuario: Mario Codigo: 8888888");
        log2.imprimeLog("Usuario: Prueba Codigo: 99999");
       
        log.setValorMensaje("Usuario: Juan Código: 4444444 ");
        System.out.println(log1.getValorMensaje());
    }
    
}
