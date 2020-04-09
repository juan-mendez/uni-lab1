/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

/**
 *
 * @author ADMIN
 */
public class NameHandler {
    private String nombre;
    private String fechaNacimiento;
    private String fechaIngreso;
    private String semestreIngreso;
    private String semestresCursados;
    
    public NameHandler(){
        nombre = null;
        fechaNacimiento = null;
        fechaIngreso = null;
        semestreIngreso = null;
        semestresCursados = null;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return String.valueOf(2020-Integer.parseInt(fechaNacimiento));
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the semestreIngreso
     */
    public String getSemestreIngreso() {
        return semestreIngreso;
    }

    /**
     * @param semestreIngreso the semestreIngreso to set
     */
    public void setSemestreIngreso(String semestreIngreso) {
        this.semestreIngreso = semestreIngreso;
    }
    
    /**
     * @return the semestresCursados
     */
    public String getSemestresCursados() {
        return calcularSemestre(fechaIngreso, semestreIngreso);
    }

    /**
     * @param semestresCursados the semestresCursados to set
     */
    public void setSemestresCursados(String semestresCursados) {
        this.semestresCursados = semestresCursados;
    }
    
    private String calcularSemestre(String fechaIngreso, String semestreIngreso){
        int añoIngreso = Integer.parseInt(fechaIngreso);
            
        if(semestreIngreso.equals("1")){
            return (2020-añoIngreso)*2+1+"";
        } else{
            return (2020-añoIngreso)*2+"";
        }
    }
 
}
