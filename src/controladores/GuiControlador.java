/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import cartamon.GUI.frmAvatar;
import cartamon.GUI.frmInicio;
import cartamon.GUI.frmListPokemon;
import cartamon.GUI.frmPerfil;



public class GuiControlador {
    static frmInicio frmInicio = new frmInicio();
    static frmAvatar frmAvatar;
    static frmPerfil frmPerfil;
    static frmListPokemon frmPokemones;
    
    public static frmInicio dameInicio(){
        frmInicio.setLocationRelativeTo(null);
        return frmInicio;
    }
    
    public static frmAvatar damaAvatar(String nombre){
        frmAvatar = new frmAvatar(nombre);
        frmAvatar.setLocationRelativeTo(null);
        return frmAvatar;
    }

    public static frmPerfil damePerfil() {
        frmPerfil = new frmPerfil();
        frmPerfil.setLocationRelativeTo(null);
        return frmPerfil;
    }

    public static frmAvatar damaAvatarActual() {
        return frmAvatar;
    }
    
    public static frmListPokemon dameTiendaMascotas(){
        frmPokemones = new frmListPokemon();
        frmPokemones.setLocationRelativeTo(null);
        return frmPokemones;
    }

}
