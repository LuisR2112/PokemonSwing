/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import cartamon.EtapaMascota;
import cartamon.Mascota;


public class PokemonesController {
    private static Mascota[] lstPokemones = {new Mascota("bulasur", 1, EtapaMascota.NACIMIENTO,"src\\cartamon\\images\\bulasur.png"),
        new Mascota("Charmander", 1, EtapaMascota.NACIMIENTO,"src\\cartamon\\images\\Charmander.png")};
    
    public static Mascota[] dameListaPokemones(){    
        return lstPokemones;
    }
}
