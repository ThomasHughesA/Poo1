/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
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
    System.out.println("------------------------------------------------------------------------\n");

    Scanner Entrada;
    int opcion,opcionRefugio;
    do{
        System.out.println("1. Crear Refugiado");
        System.out.println("2. Imprimir Refugiados");
        System.out.println("3. Crear Voluntario");
        System.out.println("4. Imprimir Voluntarios");
        System.out.println("5. Crear Refugio");
        System.out.println("6. Imprimir Refugios");
        
        System.out.println("7. Salir");

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
                        InsertarRefugiado(refugio1);                      
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
                        InsertarRefugiado(refugio2);
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
                        InsertarRefugiado(refugio3);
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

            //Crear Voluntario
            case 3:
                voluntarios.InsertarDatos();
            break;

            //Imprimir Voluntario
            case 4:
                voluntarios.ImprimirDatos();
                
            case 5:
                InsertarRefugio(refugios);
            case 6:
                ImprimirRefugios(refugios);
            break;

        }

    }while(opcion!=7);

    }
    
     public static void InsertarRefugiado(Refugio refugio)throws IOException{
        
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
        refugio.AgregarRefugiado(refugiado);
    }   
     
    public static void InsertarRefugio(ArrayList<Refugio> refugios)throws IOException {
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
        refugios.add(refugio);
        
    } 
     
    public static void ImprimirRefugios(ArrayList<Refugio> refugios)throws IOException {
        //Imprimir refugiados - HashMap
        System.out.println("IMPRIMIENDO REFUGIOS:");  
        refugios.forEach((k) -> System.out.println(k.getNombre()));
    }    
}

