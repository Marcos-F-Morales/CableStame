/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherencia;

/**
 *
 * @author josueesteban
 */
public class EjercicioHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Futbolista jugador1 = new Futbolista ();
        jugador1.nombre="Leonel";
        jugador1.apellidos="Messi";
        jugador1.Edad=30;
        jugador1.Concentrarse();
        
        System.out.println(" La edad del jugador es de: "  +jugador1.Edad);
        
        
        Futbolista jugador2 =new Futbolista(505, "Cristiano", "Ronaldo", 36, 7, " Lateral");
        
          jugador2.Concentrarse();
        
        System.out.println(" La edad del jugador es de: "  +jugador2.Edad);
    }
    
}
