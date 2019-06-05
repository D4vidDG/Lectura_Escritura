/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_archivos;
 import java.util.*;
import java.io.*;
/**
 *
 * @author jdiazga
 */
public class Lectura_Archivos {

  
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input=new Scanner (new File ("Archivo.txt"));
        int count=0;
        while(input.hasNext()){
            String word=input.next();
            count++;
        }
        System.out.println(count);
    }
}
