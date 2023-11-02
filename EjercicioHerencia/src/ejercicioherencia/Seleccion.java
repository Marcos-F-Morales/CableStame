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
public class Seleccion {
    public int id;
    public String nombre;
    public String apellidos;
    public int Edad;
    /*Constructor sin parametros*/
    public Seleccion(){
    this.id = 0;
    this.nombre="";
    this.apellidos="";
    this.Edad=0;
          
    }
    /*Constructor con parametors*/
    public Seleccion(int id, String nombre, String apellido, int Edad){
        this.id=id;
        this.nombre=nombre;
        this.apellidos= apellido;
        this.Edad=Edad;
        
    }
    
    /*Metodos Set y GEt*/

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    public void Concentrarse(){
         System.out.println(this.nombre + " " + this.apellidos + " en este momento esta realizando su concentración");
    }
    
    public void Viajar(){
     System.out.println(this.nombre + " " + this.apellidos + " en este momento esta viajando");
     
     }
    
    public void CalculoSalarioLiquido(int Salario){
         double igss=0.0483;
         double resultado;
         
         resultado = Salario - (Salario*igss);
         System.out.println("El salario liquido despues de impuestos es de : "  + resultado );
        
    }

    /**
     * @return the Edad
     */
    private int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    private void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    
}
