/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author The_A
 */
public class Voluntario extends Persona {

    private String Profesion;

    public Voluntario(String Rut, String Nombre, int Edad, String Sexo, String Nacionalidad,String Profesion) {
        super(Rut, Nombre, Edad, Sexo, Nacionalidad);
        this.Profesion = Profesion;
    }
    
    

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
    
    
    public void InsertarDatos() throws IOException{
        
        String IdRefugiado, Nombre, Sexo, Nacionalidad, Profesion;
        int Edad;
        BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));

        Scanner Entrada=new Scanner(System.in);
        System.out.println("Digite el ID del voluntario.");
        IdRefugiado=Entrada.next();
        
        System.out.println("Digite el nombre.");
        Nombre=Entrada.next();
        
        System.out.println("Digite el sexo.");
        Sexo=Entrada.next();
        
        System.out.println("Digite la edad.");
        Edad=Integer.parseInt(lector.readLine());
        
        System.out.println("Digite la nacionalidad.");
        Nacionalidad=Entrada.next();
        
        System.out.println("Digite el estado del refugiado.");
        Profesion=Entrada.next();
        
        Voluntario Voluntario=new Voluntario(IdRefugiado, Nombre, Edad, Sexo, Nacionalidad, Profesion);
        
        System.out.println("Refugiado registrado.");          
    }

    void ImprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getVoluntario(){
        return Rut+ Nombre+ Sexo+Edad+Nacionalidad+Profesion;
    }  
    
}
