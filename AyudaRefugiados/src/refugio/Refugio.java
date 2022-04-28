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
 */
public class Refugio {
    
    private String Nombre;
    private String Direccion;
    private int CantidadVoluntarios;
    private int CantidadRefugiados;
    private int CantidadMaxRefugiados;
    private HashMap<String,Refugiados> Refugios;
    
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
    public void AgregarRefugiado (Refugiados refugiado){
        Refugios.put(refugiado.getIdRefugiado(),refugiado);
    }
    
    public void imprimirRefugiados(){
        Refugios.forEach(((k, v) -> {
            System.out.println(k + " : "+v.toString());
        }));
    
    }
    
}
