/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartamon;


public class Entrenador {
   
    private String nombre;
    private int dinero;
    private Mascota[] mascotas;
    private String urlFoto;
    
    public Entrenador(String nombre,String url) {
        this.nombre = nombre;
        this.dinero = dinero = 1000;
        this.mascotas = new Mascota[3];
        this.mascotas[0] = new Mascota("Charmander", 1, EtapaMascota.MUERTO,"src\\cartamon\\images\\Charmander.png");
        this.mascotas[1] = new Mascota("Bulbasur", 1, EtapaMascota.MUERTO,"src\\cartamon\\images\\bulasur.png");
        this.mascotas[2] = new Mascota("Bulbasur", 1, EtapaMascota.MUERTO,"src\\cartamon\\images\\bulasur.png");
        this.urlFoto = url;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
    
    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", dinero=" + dinero + ", mascotas=" + mascotas + '}';
    }
    
    public boolean agregaMascota(Mascota mascotaSelected) {
        
        int sizeAnterior = this.mascotas.length;
        Mascota[] mascotasNew = new Mascota[sizeAnterior+1];
        for(int i = 0 ; i < sizeAnterior ; i++){
            mascotasNew[i] = mascotas[i];
        }
        mascotasNew[sizeAnterior] = mascotaSelected;
        
        mascotas = mascotasNew;
        
        return true;
    }
}
