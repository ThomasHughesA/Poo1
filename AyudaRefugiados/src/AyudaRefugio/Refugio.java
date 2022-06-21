/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AyudaRefugio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author The_A
 *
 * 
 */
public class Refugio implements InterfaceMetodos{
    
    private String Nombre;
    private String Direccion;
    private int CantidadVoluntarios;
    private int CantidadRefugiados;
    private int CantidadMaxRefugiados;
   
    
    public ArrayList<Refugio> refugios =new ArrayList<Refugio>();
    
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

    public Refugio() {
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
    public ArrayList<Refugio> getRefugio(){
        return refugios;
    }
    
    
    public  Refugio InsertarRefugio()throws IOException {
        String Nombre,Direccion;
        int CantidadVoluntarios, CantidadRefugiados,CantidadMaxRefugiados;
        Scanner Entrada=new Scanner(System.in);
        BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Digite el nombre.");
        Nombre=Entrada.next();
        
        System.out.println("Digite el direccion.");
        Direccion=Entrada.next();
        
        System.out.println("Digite la Cantidad de Voluntarios que hayen el refugio.");
        CantidadVoluntarios=Integer.parseInt(lector.readLine());
                
        System.out.println("Digite la Cantidad de refugiados que hay en el refugio.");
        CantidadRefugiados=Integer.parseInt(lector.readLine());
        
        System.out.println("Digite el cupo Maximo de Refugiados que tiene el refugio.");
        CantidadMaxRefugiados=Integer.parseInt(lector.readLine());
        
        System.out.println("Refugio registrado.");  
        Refugio refugio=new Refugio(Nombre,Direccion,CantidadVoluntarios,CantidadRefugiados,CantidadMaxRefugiados);
        return refugio;       
    } 
    
    public void agregar(Refugio refugio1){
        refugios.add(refugio1);
    }
    
    @Override
    public void Imprimir()throws IOException {
        //Imprimir refugiados - HashMap
        System.out.println("IMPRIMIENDO REFUGIOS:");  
        refugios.forEach((k) -> System.out.println(k.getNombre()));
    }    
    
    public Object[][] getTablaRefugio()
    {
        Object tabla[][] =new Object[refugios.size()][5];

        for (int i = 0; i < refugios.size(); i++) 
        {
            tabla[i][0]= refugios.get(i).getNombre();
            tabla[i][1]= refugios.get(i).getDireccion();
            tabla[i][2]= refugios.get(i).getCantidadRefugiados();
            tabla[i][3]= refugios.get(i).getCantidadVoluntarios();
            tabla[i][4]= refugios.get(i).getCantidadVoluntarios();          
            
        }
        return tabla;
    }
    
    public boolean EliminarRefugio(String nombre)throws IOException{
        Refugio refugio=BuscarPorNombre(nombre);
        if(refugio!=null){
            refugios.remove(refugio);
            return true;
        }
        return false;
    }
    
    public Refugio BuscarPorNombre(String nombre)throws IOException{
        for (int i=0;i<refugios.size();i++) {
            if(refugios.get(i).getNombre().equals(nombre))
                return refugios.get(i);
       }
       return null;
    }
    
    public  void RefugioTxt()throws IOException{
        try (FileWriter fichero = new FileWriter("C:\\Users\\thtom\\OneDrive\\Documentos\\Poo 2\\EPA")) {
            fichero.write("IMPRIMIENDO REFUGIOS:");  
            for(int i=0;i<refugios.size();i++){
                fichero.write(refugios.get(i).getNombre());
            }
        }
    }
    
    public boolean ModificarRefugio(String nombre,Refugio refugio) throws IOException{
        EliminarRefugio(nombre);
        if(EliminarRefugio(nombre)==true){
            refugios.add(refugio);
            return true;
        }
        return false;
    }
    
    
}
