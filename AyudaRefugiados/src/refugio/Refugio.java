/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

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
    private HashMap<String,Refugiados> Refugios=new HashMap<String,Refugiados>();
    
    
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
    

    
/*   
    public void AgregarRefugio (Refugio refugio, Refugiados refugiado){
        ArrayList<Refugiados> lista;
        lista = new ArrayList<Refugiados>();
        lista.add(refugiado);
        Refugios.put(refugio.getNombre(),lista);

    }
    public void AgregarRefugio (Refugiados refugiado,Refugio refugio){
        ArrayList<Refugiados> lista;
        lista = new ArrayList<Refugiados>();
        lista.add(refugiado);
        Refugios.put(refugio.getNombre(),lista);

    }    
   
*/ 
    
    
    public boolean AgregarRefugiado (Refugiados refugiado){
        if(Refugios.containsKey(refugiado.getIdRefugiado())==false){
            Refugios.put(refugiado.getIdRefugiado(),refugiado);
            return true;
        }
        return false;
    }
    
    public void imprimirRefugiados(){
        Refugios.entrySet().forEach(entry->{
            System.out.println("ID:"+entry.getKey() + " Nombre: " + entry.getValue().getNombre());  
        }); 
    }
    
    public Boolean eliminarRefugiado(String oldId){
        if(Refugios.containsKey(oldId)==true){
            Refugios.remove(oldId);
            return true;
        }
        return false;
    }
    
    public void modificarRefugiados(String id,Refugiados refugiado){
        Refugiados replace = Refugios.replace(id, refugiado);
    }
    
    
}
