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
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    public HashMap<String,ArrayList<Refugiado>> getRefugiados() {
        return Refugiados;
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
        refugio.SumarCantidadRefugiados(refugio.getNombre());
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
        refugio.SumarCantidadRefugiados(refugio.getNombre());
    }
    
     public void AgregarRefugiado (String refugio, Refugiado refugiado){
        Refugio refugio1=new Refugio();
        ArrayList<Refugiado> lista;
        lista = Refugiados.get(refugio);
        boolean flag = Refugiados.containsKey(refugio);
        if (flag == false){   
            //creo
            ArrayList<Refugiado> lista1=new ArrayList<Refugiado>();
            //agrego
            lista1.add(refugiado);
            //añado al mapa
            Refugiados.put(refugio, lista1);
            return ;
        }        
        lista.add(refugiado);
        refugio1.SumarCantidadRefugiados(refugio);
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
    
    public Object[][] getTablaRefugiados(){
        Object[][] tabla=new Object[Refugiados.size()][7];
        Refugiados.entrySet().forEach((Map.Entry<String, ArrayList<Refugiado>> entry)->{
            for (int i=0;i<entry.getValue().size();i++){
                System.out.print(Refugiados.size()); 
                System.out.print(entry.getValue().size());
                    tabla[i][0]= entry.getKey();
                    tabla[i][1]= entry.getValue().get(i).getRut();
                    tabla[i][2]= entry.getValue().get(i).getNombre();
                    tabla[i][3]= entry.getValue().get(i).getEdad();
                    tabla[i][4]= entry.getValue().get(i).getSexo();
                    tabla[i][5]= entry.getValue().get(i).getNacionalidad();
                    tabla[i][6]= entry.getValue().get(i).getEstado();
            }
        });
    return tabla;
    }
       
    public void eliminarRefugiado(String id){
        Refugio refugio=new Refugio();
        Refugiados.entrySet().forEach((Map.Entry<String, ArrayList<Refugiado>> entry)->{
            for (int i=0;i<entry.getValue().size();i++){
                if(entry.getValue().get(i).getRut().equals(id)){
                   entry.getValue().remove(i);
                   refugio.RestarCantidadRefugiados(entry.getValue().get(i).getNombre());
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
    
    public  void RefugiadoTxt()throws IOException{
        try (FileWriter fichero = new FileWriter("C:\\Users\\thtom\\OneDrive\\Documentos\\Poo 2\\Refugiados.txt")) {
            ImprimirFichero(fichero);
        }catch(IOException io){
            JOptionPane.showMessageDialog(null,"No se ha encontrado el archivo, porfavor verifique la ruta");
        }
    }

    private void ImprimirFichero(FileWriter fichero) {
        Refugiados.entrySet().forEach(entry->{
            try {  
                fichero.write("Refugio: "+entry.getKey());
                fichero.write("// Refugiados: ");
                entry.getValue().forEach((k) -> {
                    try {
                        fichero.write(k.getNombre()+", ");
                    } catch (IOException ex) {
                        Logger.getLogger(Refugiado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                fichero.write(" ");
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null,"No se ha podido imprimir Mapa Refugiados, verifique la funcion ImprimirFichero() ");
            }
        });
    }
    
}
