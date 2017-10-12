/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jrodriguez.a12;

/**
 *
 * @author Salvador
 */
public class EDJRodriguezA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue fila = new Queue();
        fila.enqueue(" esta");
        fila.enqueue(" es");
        fila.enqueue(" una");
        fila.enqueue(" fila");
        fila.showQueue();
        fila.dequeue();
        fila.showQueue();
        fila.clearQueue();
        fila.showQueue();
    }
    
}
