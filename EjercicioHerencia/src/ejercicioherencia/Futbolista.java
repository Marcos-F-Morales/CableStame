package ejercicioherencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josueesteban
 */
public class Futbolista extends Seleccion {
    public int numerojugador;
    public String posicion;
    
    
    public Futbolista(){
        super();
        this.numerojugador=0;
        this.posicion=""; 
        
    }
     public Futbolista(int id, String nombre, String apellido, int Edad, int numero, String posicion){
        super(id, nombre, apellido,Edad);
        this.numerojugador=numero;
        this.posicion=posicion; 
        
    }
/**Metodos Get y Set*/
    /**
     * @return the numerojugador
     */
    private int getNumerojugador() {
        return numerojugador;
    }

    /**
     * @param numerojugador the numerojugador to set
     */
    private void setNumerojugador(int numerojugador) {
        this.numerojugador = numerojugador;
    }

    /**
     * @return the posicion
     */
    private String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    private void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
     
    public void JugarPartido(){
        System.out.println("El jugador " + this.nombre +" "+ this.apellidos +" esta jugando un partido");
    
    }
     
      public void Entrenar(){
        System.out.println("El jugador " + this.nombre +" "+ this.apellidos +" esta entrenando antes del partido");
    
    }
     
     
}
