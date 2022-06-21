/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AyudaRefugio;

/**
 *
 * @author The_A
 */
public class Ciudad {
    
    private String IdCiudad;
    private String Nombre;

    public String getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(String IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    

    public Ciudad(String IdCiudad, String Nombre) {
        this.IdCiudad = IdCiudad;
        this.Nombre = Nombre;
    }

}
