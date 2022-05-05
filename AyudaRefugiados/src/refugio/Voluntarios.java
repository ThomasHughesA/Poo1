/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

import java.util.Scanner;
/**
 *
 * @author The_A
 */
public class Voluntarios {
    
    private String IdVoluntarios;
    private String Nombre;
    private String Edad;
    private String Sexo;
    private String Nacionalidad;
    private String Profesion;

    public Voluntarios() {
    }

    public String getIdVoluntarios() {
        return IdVoluntarios;
    }

    public void setIdVoluntarios(String IdVoluntarios) {
        this.IdVoluntarios = IdVoluntarios;
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

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
    public Voluntarios(String IdVoluntarios, String Nombre, String Edad, String Sexo, String Nacionalidad, String Profesion) {
        this.IdVoluntarios = IdVoluntarios;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Nacionalidad = Nacionalidad;
        this.Profesion = Profesion;
    }
    
    public void InsertarDatos(){
        
        String IdRefugiado, Nombre, Sexo, Edad, Nacionalidad, Estado;
        
        
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Digite el ID del voluntario.");
        IdRefugiado=Entrada.next();
        
        System.out.println("Digite el nombre.");
        Nombre=Entrada.next();
        
        System.out.println("Digite el sexo.");
        Sexo=Entrada.next();
        
        System.out.println("Digite la edad.");
        Edad=Entrada.next();
        
        System.out.println("Digite la nacionalidad.");
        Nacionalidad=Entrada.next();
        
        System.out.println("Digite el estado del refugiado.");
        Estado=Entrada.next();
        
        Refugiado refugiados=new Refugiado(IdRefugiado, Nombre, Sexo, Edad, Nacionalidad, Estado);
        
        System.out.println("Refugiado registrado.");          
    }

    void ImprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
