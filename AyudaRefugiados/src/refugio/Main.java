/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author The_A
 */
public class Main {
    
    public static Refugiados refugiados = new Refugiados();
    public static Voluntarios voluntarios= new Voluntarios();
    public static Refugio refugio= new Refugio();

    public static ArrayList<Refugio> refugios =new ArrayList<Refugio>();
    
    public static Refugiados refugiado1=new Refugiados ("1","Susana Castro Gonzalez","27","M","España","Heridas leves en el cuerpo");
    public static Refugiados refugiado2=new Refugiados ("2","Cristian Vazquez Diaz","56","H","Chile","Sin heridas");
    public static Refugiados refugiado3=new Refugiados ("3","Lionel Messi Sanchez","36","H","Argentina","Contusiones leves");

    
    public static Refugio refugio1=new Refugio("Jardines de la Paz","Avenida Brasil Nro 58",8,67,82);
    public static Refugio refugio2=new Refugio("Iglesia San Juan","Calle Mata Nro 27",4,36,60);
    public static Refugio refugio3=new Refugio("Colegio Central de Santiago","Gran Avenida 178",18,89,140);
    
    
    public static void main(String[] args)throws ParseException, IOException{
        refugios.add(refugio1);
        refugios.add(refugio2);
        refugios.add(refugio3);
        
        refugio.AgregarRefugiado(refugiado1);
        refugio.AgregarRefugiado(refugiado2);
        refugio.AgregarRefugiado(refugiado3);
        
        Menu();
        
    }
    
    public static void Menu() throws IOException{
    BufferedReader lector = new BufferedReader (new InputStreamReader(System.in));
    System.out.println("\n\n\n------------------------------------------------------------------------");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("******************Iniciando Aplicacion Refugiados**********************");
    System.out.println("------------------------------------------------------------------------");
    System.out.print("------------------------------------------------------------------------\n");

    Scanner Entrada;
    int opcion,opcionRefugio;
    do{
        System.out.println("*************Refugiados*************");
        System.out.println("1. Crear Refugiado");
        System.out.println("2. Imprimir Refugiados");
        System.out.println("3. Eliminar Refugiados");
        System.out.println("4. Modificar Refugiados");
        System.out.println("*************Voluntarios*************");
        System.out.println("5. Crear Voluntario");
        System.out.println("6. Imprimir Voluntarios");
        System.out.println("7. Eliminar Voluntarios");
        System.out.println("8. Modificar Voluntarios");
        System.out.println("*************Refugios*************");
        System.out.println("9. Crear Refugio");
        System.out.println("10. Imprimir Refugios");
        System.out.println("11. Eliminar Refugio");
        System.out.println("12. Modificar Refugio");
        System.out.println("13. Salir");

        System.out.println("Elija una opción: ");
        Entrada=new Scanner(System.in);
        opcion=Entrada.nextInt();
        opcionRefugio=Entrada.nextInt();

        switch(opcion){
            //Crear Refugiado
            case 1:
                System.out.println("Seleccione el refugio donde ingresará el refugiado");
                System.out.println("1. "+ refugio1.getNombre());
                System.out.println("2. "+ refugio2.getNombre());
                System.out.println("3. "+ refugio3.getNombre());
                do{
                switch(opcionRefugio){
                    
                    case 1:
                        refugio.AgregarRefugiado(InsertarRefugiado(refugio1));                 
                        /*---------------------------Retorno-----------------------*/
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("¿Desea realizar otra operación? : \n1. SI, VOLVER AL MENÚ PRINCIPAL. \n2. NO, CERRAR PROGRAMA.");
                        int opcionRetornoCrearRefugiado;
                        opcionRetornoCrearRefugiado = Integer.parseInt(lector.readLine());

                        if(opcionRetornoCrearRefugiado == 1 ){
                            Menu();
                        }

                    break;
                    case 2:
                        refugio.AgregarRefugiado(InsertarRefugiado(refugio2));                 
                        /*---------------------------Retorno-----------------------*/
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("¿Desea realizar otra operación? : \n1. SI, VOLVER AL MENÚ PRINCIPAL. \n2. NO, CERRAR PROGRAMA.");
                        int opcionRetornoCrearRefugiado2;
                        opcionRetornoCrearRefugiado2 = Integer.parseInt(lector.readLine());

                        if(opcionRetornoCrearRefugiado2 == 1 ){
                            Menu();
                        }
                    break;   
                    case 3:
                        refugio.AgregarRefugiado(InsertarRefugiado(refugio3));                 
                        /*---------------------------Retorno-----------------------*/
                        System.out.println("------------------------------------------------------------------------");
                        System.out.println("¿Desea realizar otra operación? : \n1. SI, VOLVER AL MENÚ PRINCIPAL. \n2. NO, CERRAR PROGRAMA.");
                        int opcionRetornoCrearRefugiado3;
                        opcionRetornoCrearRefugiado3 = Integer.parseInt(lector.readLine());

                        if(opcionRetornoCrearRefugiado3 == 1 ){
                            Menu();
                        }

                        
                    break;
                }    
                }while(opcion!=4); 
            break;

            //Imprimir Refugiado
            case 2:
               refugio.imprimirRefugiados();
            break;
            //Eliminar refugiado
            case 3:
               System.out.println("Digite el id del refugiado a eliminar.");
               String oldId=lector.readLine();
               refugio.eliminarRefugiado(oldId);
            break;
            //Modificar Refugiado
            case 4:
                System.out.println("Digite el id del refugiado a modificar.");
                String IdModificar=lector.readLine();
                refugio.modificarRefugiados(IdModificar,InsertarRefugiado(refugio1) );
            break;
            //Crear Voluntario
            case 5:
                voluntarios.InsertarDatos();
            break;
            //Imprimir Voluntario
            case 6:
                voluntarios.ImprimirDatos();
            break; 
            //Eliminar Voluntario
            case 7:
            
            break;
            //Modificar Voluntario
            case 8:
            
            break;
            //Crear Refugio
            case 9:
                refugios.add(InsertarRefugio());
            break;   
            //Imprimir Refugio
            case 10:
                ImprimirRefugios(refugios);
                //RefugioTxt();
            break;
            //Eliminar Refugio
            case 11:
                System.out.println("Digite el nombre del refugio a eliminar.");
                String oldnombre=lector.readLine();
                EliminarRefugio(oldnombre);
            break;
            //Modificar Refugio
            case 12:
                System.out.println("Digite el nombre del refugio a modificar.");
                String nombreMod=lector.readLine();            
                ModificarRefugio(nombreMod,InsertarRefugio());
            break;

        }

    }while(opcion!=13);

    }
    
    public static Refugiados InsertarRefugiado(Refugio refugio)throws IOException{
        
        String IdRefugiado,  Nombre,  Edad,  Sexo,  Nacionalidad, Estado;
        Scanner Entrada=new Scanner(System.in);
        System.out.println("Digite el ID del refugiado.");
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
        System.out.println("Refugiado registrado.");  
        Refugiados refugiado=new Refugiados(IdRefugiado,Nombre,Edad,Sexo,Nacionalidad,Estado);
        return refugiado;
    }   
     
    public static Refugio InsertarRefugio()throws IOException {
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
     
    public static void ImprimirRefugios(ArrayList<Refugio> refugios)throws IOException {
        //Imprimir refugiados - HashMap
        System.out.println("IMPRIMIENDO REFUGIOS:");  
        refugios.forEach((k) -> System.out.println(k.getNombre()));
    }    
    
    public static boolean EliminarRefugio(String nombre)throws IOException{
        Refugio refugio=BuscarPorNombre(nombre);
        if(refugio!=null){
            refugios.remove(refugio);
            return true;
        }
        return false;
    }
    
    public static Refugio BuscarPorNombre(String nombre)throws IOException{
        for (int i=0;i<refugios.size();i++) {
            if(refugios.get(i).getNombre().equals(nombre))
                return refugios.get(i);
       }
       return null;
    }
    
    public static void RefugioTxt()throws IOException{
        FileWriter fichero=new FileWriter("C:\\Users\\thtom\\OneDrive\\Documentos\\Poo 2\\EPA");
            fichero.write("IMPRIMIENDO REFUGIOS:");  
            for(int i=0;i<refugios.size();i++){
               fichero.write(refugios.get(i).getNombre());
            }
            fichero.close();
    }
    
    public static boolean ModificarRefugio(String nombre, Refugio refugio) throws IOException{
        EliminarRefugio(nombre);
        if(EliminarRefugio(nombre)==true){
            refugios.add(refugio);
            return true;
        }
        return false;
    }
}

