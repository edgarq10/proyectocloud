/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes.entities;

import java.util.List;



/**
 *
 * @author Bryan Lennin
 */
public class Estudiantes {
    private String codigo;
    private String cedula;
    private String nombres;
    private String edad;
    private String direccion;
    private String telefono;
    private List <Estudiantes> listaEstudiantes;

    public Estudiantes(String codigo, String cedula, String nombres, String edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private List ArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
