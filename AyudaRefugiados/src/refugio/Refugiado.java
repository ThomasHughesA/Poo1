/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author The_A
 */
public class Refugiado {
    
    //Globales
    
//Privadas
    private String IdRefugiado;
    private String Nombre;
    private String Edad;
    private String Sexo;
    private String Nacionalidad;
    private String Estado;
/*
    Constructor 
    */
    public Refugiado() {
        
    }
    
    public Refugiado(String IdRefugiado, String Nombre, String Edad, String Sexo, String Nacionalidad, String Estado) {
        this.IdRefugiado = IdRefugiado;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Nacionalidad = Nacionalidad;
        this.Estado = Estado;
    }

    public String getIdRefugiado() {
        return IdRefugiado;
    }

    public void setIdRefugiado(String IdRefugiado) {
        this.IdRefugiado = IdRefugiado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
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

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

/*
    Metodo Insertar
    */             
    
    public  void ImprimirDatos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
