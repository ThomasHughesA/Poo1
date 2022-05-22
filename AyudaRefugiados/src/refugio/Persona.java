/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

/**
 *
 * @author User
 */
public class Persona {
    public String Rut;
    public String Nombre;
    public int Edad;
    public String Sexo;
    public String Nacionalidad;

    public Persona(String Rut, String Nombre, int Edad, String Sexo, String Nacionalidad) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Nacionalidad = Nacionalidad;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    
    
    
    
}
