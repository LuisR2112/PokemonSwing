/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartamon;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mascota {
    
    private String nombre;
    private int nivel;
    private EtapaMascota etapa;
    private int precio;
    private int sigNivel;
    private String fechaNacimiento;
    private String urlFoto;
    
    public Mascota(String nombre, int nivel, EtapaMascota etapa,String url) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.etapa = etapa;
        this.precio = asignaPrecio();
        this.sigNivel = calcularNivelSig();
        this.fechaNacimiento = new SimpleDateFormat("yyyy MM dd HH:mm:ss").format(Calendar.getInstance().getTime());
        this.urlFoto = url;
    }

    private int calcularNivelSig() {
       return 10+(20*this.nivel)+(int)Math.floor(Math.random()*(15-1+1)+1);
    }
    
    private int asignaPrecio(){
        return (20*this.nivel) + 80;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public EtapaMascota getEtapa() {
        return etapa;
    }

    public void setEtapa(EtapaMascota etapa) {
        this.etapa = etapa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSigNivel() {
        return sigNivel;
    }

    public void setSigNivel(int sigNivel) {
        this.sigNivel = sigNivel;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", nivel=" + nivel + ", etapa=" + etapa + ", precio=" + precio + ", sigNivel=" + sigNivel + ", fechaNacimiento=" + fechaNacimiento + ", urlFoto=" + urlFoto + '}';
    }
        
    public int getPrecioRevivir() {
        return (20*this.nivel)+30;
    }
    
    
    
}
