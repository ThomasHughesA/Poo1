/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author The_A
 *
 * 
 */
public class Refugio {
    
    private String Nombre;
    private String Direccion;
    private int CantidadVoluntarios;
    private int CantidadRefugiados;
    private int CantidadMaxRefugiados;
    private HashMap<String,ArrayList<Refugiado>> Refugiados=new HashMap<String,ArrayList<Refugiado>>();
    
    
    /**
     * 
     * @param Nombre
     * @param Direccion
     * @param CantidadVoluntarios
     * @param CantidadRefugiados
     * @param CantidadMaxRefugiados 
     */
    public Refugio(String Nombre, String Direccion, int CantidadVoluntarios, int CantidadRefugiados, int CantidadMaxRefugiados) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.CantidadVoluntarios = CantidadVoluntarios;
        this.CantidadRefugiados = CantidadRefugiados;
        this.CantidadMaxRefugiados = CantidadMaxRefugiados;
    }

    Refugio() {
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getCantidadVoluntarios() {
        return CantidadVoluntarios;
    }

    public void setCantidadVoluntarios(int CantidadVoluntarios) {
        this.CantidadVoluntarios = CantidadVoluntarios;
    }

    public int getCantidadRefugiados() {
        return CantidadRefugiados;
    }

    public void setCantidadRefugiados(int CantidadRefugiados) {
        this.CantidadRefugiados = CantidadRefugiados;
    }

    public int getCantidadMaxRefugiados() {
        return CantidadMaxRefugiados;
    }

    public void setCantidadMaxRefugiados(int CantidadMaxRefugiados) {
        this.CantidadMaxRefugiados = CantidadMaxRefugiados;
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
   
    
    
   /* public boolean AgregarRefugiado (Refugiados refugiado){
        if(Refugiados.containsKey(refugiado.getIdRefugiado())==false){
            Refugiados.put(refugiado.getIdRefugiado(),refugiado);
            return true;
        }
        return false;
    }*/
    
    public void imprimirRefugiados(){
        Refugiados.entrySet().forEach(entry->{
            System.out.print("Refugio: "+entry.getKey());  
            System.out.print(" Refugiados: ");
            entry.getValue().forEach((k) -> System.out.print(k.getNombre()+", "));
            System.out.println(" ");
        }); 
    }
    
    public Boolean eliminarRefugiado(String oldId){
        if(Refugiados.containsKey(oldId)==true){
            Refugiados.remove(oldId);
            return true;
        }
        return false;
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
    
    
}
