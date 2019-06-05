/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_archivos;

import java.util.*;
import java.io.*;
public class Lectura_Archivos_2 {

    public static void main (String[] args)  throws FileNotFoundException  {
    
    File info_ligas =new File ("Info_Ligas.txt");
    File equipos =new File("equipos.txt");
    ArrayList <Liga >ligas =new ArrayList <>();
    //Lectura
    int numligas;
    String nombreLiga;
    int numequipos;
    String nombre_equipo;
    
    if(info_ligas.exists()){
    try{
    Scanner input=new Scanner(info_ligas);
    if(input.hasNextInt()){
        numligas=input.nextInt();
        for(int i=0;i<numligas;i++){
         nombreLiga=input.next();
         numequipos=input.nextInt();
         Liga liga=new Liga (nombreLiga);
        for(int j=0;j<numequipos;j++){
            nombre_equipo=input.next();
          liga.addEquipo(nombre_equipo);
        }
        ligas.add(liga);
        }
    }    
    }catch(InputMismatchException ex){
        System.out.println("Error en el archivo"); 
    }
    }
    for(int k=0;k<ligas.size();k++){
        System.out.println(ligas.get(k).getNombre());
    }
    //Escritura
    PrintStream salida=null;
    if(!equipos.exists()){
        try{
        equipos.createNewFile();
        salida=new PrintStream (equipos);
        for(Liga liga:ligas){
            for(Equipo equipo:liga.getEquipos()){
                salida.println(equipo.getNombre());
            }
        }
        salida.flush();
        salida.close();
        }catch(IOException ex){
            System.out.println("No se pudo crear el archivo equipos");
        }
    }
    }
}
