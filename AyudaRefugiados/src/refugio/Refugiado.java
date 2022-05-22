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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author The_A
 */
public class Refugiado extends Persona implements InterfaceMetodos{
    
    //Globales
    
//Privadas
    private String Estado;
    private HashMap<String,ArrayList<Refugiado>> Refugiados=new HashMap<String,ArrayList<Refugiado>>();
/*  
    Constructor 
    */
    

    public Refugiado(String Rut, String Nombre, int Edad, String Sexo, String Nacionalidad,String Estado) {
        super(Rut, Nombre, Edad, Sexo, Nacionalidad);
        this.Estado=Estado; 
    }   

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Refugiado getRefugiado(){
        Refugiado refugiado=new Refugiado(getRut(),getNombre(),getEdad(),getSexo(),getNacionalidad(),Estado);
        return refugiado;
    }   
/*
    Metodo Insertar
    */             
        
    public Refugiado InsertarRefugiado(Refugio refugio)throws IOException{       
        String IdRefugiado,  Nombre,  Sexo,  Nacionalidad, Estado;
        int Edad;
        BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Digite el ID del refugiado.");
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
        Estado=Entrada.next();
        System.out.println("Refugiado registrado."); 
        Persona persona =new Persona(IdRefugiado,Nombre,Edad,Sexo,Nacionalidad);
        Refugiado refugiado=new Refugiado(IdRefugiado,Nombre,Edad,Sexo,Nacionalidad,Estado);
        return refugiado;
    }   
     
    public void AgregarRefugio (Refugio refugio, Refugiado refugiado){
        ArrayList<Refugiado> lista;
        lista = Refugiados.get(refugio.getNombre());
        boolean flag = Refugiados.containsKey(refugio.getNombre());
        if (flag == false){   
            //creo
            ArrayList<Refugiado> lista1=new ArrayList<Refugiado>();
            //agrego
            lista1.add(refugiado);
            //añado al mapa
            Refugiados.put(refugio.getNombre(), lista1);
            return ;
        }        
        lista.add(refugiado);
    }
    
    public void AgregarRefugio (Refugiado refugiado,Refugio refugio){
        ArrayList<Refugiado> lista;
        lista = Refugiados.get(refugio.getNombre());
        boolean flag = Refugiados.containsKey(refugio.getNombre());
        if (flag == false){   
            //creo
            ArrayList<Refugiado> lista1=new ArrayList<Refugiado>();
            //agrego
            lista1.add(refugiado);
            //añado al mapa
            Refugiados.put(refugio.getNombre(), lista1);
            return ;
        }        
        lista.add(refugiado);
    }
   
    @Override
    public void Imprimir()throws IOException{
        Refugiados.entrySet().forEach(entry->{
            System.out.print("Refugio: "+entry.getKey());  
            System.out.print(" Refugiados: ");
            entry.getValue().forEach((k) -> System.out.print(k.getNombre()+", "));
            System.out.println(" ");
        }); 
    }
    public void eliminarRefugiado(String id){
        Refugiados.entrySet().forEach((Map.Entry<String, ArrayList<Refugiado>> entry)->{
            for (int i=0;i<entry.getValue().size();i++){
                    if(entry.getValue().get(i).getRut().equals(id)){
                       entry.getValue().remove(i);
                    }
            }                  
        });
    }

    public void modificarRefugiados(String id,Refugiado refugiado){
        ArrayList<Refugiado> lista;
        lista = new ArrayList<Refugiado>();
        ArrayList<Refugiado> replace = Refugiados.replace(id, lista);
    }
    
    public void modificarRefugiados(Refugiado refugiado,String id){
        ArrayList<Refugiado> lista;
        lista = new ArrayList<Refugiado>();
        ArrayList<Refugiado> replace = Refugiados.replace(id, lista);
    }
    
   
    public Refugiado refugiadoMasAños(){
        int edadMayor=0;
        Refugiado refugiadoMayor=null;   
        for (Map.Entry<String, ArrayList<Refugiado>> entry: Refugiados.entrySet()) {
            for (int i=0;i<entry.getValue().size();i++){
                    if(entry.getValue().get(i).getEdad()>edadMayor){
                        refugiadoMayor = entry.getValue().get(i);
                        edadMayor=refugiadoMayor.getEdad(); 
                    }
            }
        }
        return refugiadoMayor;     
    }
    
    public void imprimirRefugiadosMismoPais(String nacionalidad){
        System.out.println("Refugiados de la nación "+nacionalidad+": Rut         Nombre ");
        Refugiados.entrySet().forEach((Map.Entry<String, ArrayList<Refugiado>> entry)->{
           for (int i=0;i<entry.getValue().size();i++){
                   if(entry.getValue().get(i).getNacionalidad().equals(nacionalidad)){                     
                       System.out.println("                                 "+entry.getValue().get(i).getRut()+"         "+entry.getValue().get(i).getNombre());
                       
                   }
           }
        }); 
    }
}
