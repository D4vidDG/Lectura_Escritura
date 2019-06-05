/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura_archivos;

import java.util.*;
public class Liga {
    private String nombre;
    private ArrayList <Equipo> equipos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }
   public boolean addEquipo(String nombre){
       Equipo equipo=new Equipo(nombre);
       return this.equipos.add(equipo);
   }

    public Liga(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList <>();
    }
    
    
    
}
