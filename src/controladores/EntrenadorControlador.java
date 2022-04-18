/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import cartamon.Entrenador;
import cartamon.Mascota;

public class EntrenadorControlador {
    
    static Entrenador entrenadorActual; 
    
    public static void creaEntrenador(String nombre,String urlFoto){
        entrenadorActual = new Entrenador(nombre,urlFoto);
    }
    
    public static Entrenador dameEntrenadorActual() throws Exception{
        if (entrenadorActual!=null){
            return entrenadorActual;
        }else{
            throw new Exception("No se ha creado Entrenador");
        }
    }

    public static Mascota[] dameMascotasActuales() {
        if(entrenadorActual.getMascotas().length>=0){
            return entrenadorActual.getMascotas();
        }else{
            return null;
        }
    }
}
