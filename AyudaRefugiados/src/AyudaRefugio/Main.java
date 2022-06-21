/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AyudaRefugio;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Scanner;

import Interface.Menu;      

/**
 *
 * @author The_A
 */
public class Main  {
     
    public static Menu menu=new Menu();
    public static Voluntario voluntarios= new Voluntario("1","Susana Castro Gonzalez",27,"M","España","Heridas leves en el cuerpo");
    public static Refugio refugio= new Refugio();
    public static Refugiado refugiado= new Refugiado("1","Susana Castro Gonzalez",27,"M","España","Heridas leves en el cuerpo");


    
    public static Refugiado refugiado1=new Refugiado ("1","Susana Castro Gonzalez",27,"M","España","Heridas leves en el cuerpo");
    public static Refugiado refugiado2=new Refugiado ("2","Cristian Vazquez Diaz",56,"H","Chile","Sin heridas");
    public static Refugiado refugiado3=new Refugiado ("3","Lionel Messi Sanchez",36,"H","Chile","Contusiones leves");

    
    public static Refugio refugio1=new Refugio("Jardines de la Paz","Avenida Brasil Nro 58",8,67,82);
    public static Refugio refugio2=new Refugio("Iglesia San Juan","Calle Mata Nro 27",4,36,60);
    public static Refugio refugio3=new Refugio("Colegio Central de Santiago","Gran Avenida 178",18,89,140);
   
    
    public static void main(String[] args)throws ParseException, IOException{
 
        menu.setVisible(true);
        
        
        //Menu();
        
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
        System.out.println("*************Opciones Negocio*************");
        System.out.println("13. Imprimir todos los refugiados de una misma nacionalidad");
        System.out.println("14. Imprimir el refugiado con mas años");
        System.out.println("15. Salir");

        System.out.println("Elija una opción: ");
        Entrada=new Scanner(System.in);
        opcion=Entrada.nextInt();
        opcionRefugio=Entrada.nextInt();

        switch(opcion){
            //Crear Refugiado
            case 1:
                System.out.println("1. "+ refugio1.getNombre());
                System.out.println("2. "+ refugio2.getNombre());
                System.out.println("3. "+ refugio3.getNombre());
                System.out.println("Digite el nombre del refugio donde se quedara el refugiado");
                String nombreRefugio=lector.readLine();
                refugiado.AgregarRefugio(refugiado.InsertarRefugiado(refugio1),refugio.BuscarPorNombre(nombreRefugio));                 
            break;

            //Imprimir Refugiado
            case 2:
               refugiado.Imprimir();
            break;
            //Eliminar refugiado
            case 3:
               System.out.println("Digite el id del refugiado a eliminar.");
               String oldId=lector.readLine();
               refugiado.eliminarRefugiado(oldId);
            break;


            //Modificar Refugiado
            case 4:
                System.out.println("Digite el id del refugiado a modificar.");
                String IdModificar=lector.readLine();
                refugiado.modificarRefugiados(IdModificar,refugiado.InsertarRefugiado(refugio1) );
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
                refugio.agregar(refugio.InsertarRefugio());
            break;   
            //Imprimir Refugio
            case 10:
                refugio.Imprimir();
               // RefugioTxt();
            break;
            //Eliminar Refugio
            case 11:
                System.out.println("Digite el nombre del refugio a eliminar.");
                String oldnombre=lector.readLine();
                refugio.EliminarRefugio(oldnombre);
            break;
            //Modificar Refugio
            case 12:
                System.out.println("Digite el nombre del refugio a modificar.");
                String nombreMod=lector.readLine();            
                refugio.ModificarRefugio(nombreMod,refugio.InsertarRefugio());
            break;
            case 13:
                System.out.println("Digite el pais de los refugiados a mostrar.");
                String pais=lector.readLine();
                refugiado.imprimirRefugiadosMismoPais(pais);
            break;    
            case 14:
                System.out.println("El refugiado con mas años es "+refugiado.refugiadoMasAños().getNombre()+" tiene "+refugiado.refugiadoMasAños().getEdad()+" años.");
            break;

        }

    }while(opcion!=13);

    }
  
 
    

}

