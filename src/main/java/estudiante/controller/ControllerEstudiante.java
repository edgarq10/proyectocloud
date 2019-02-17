/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante.controller;

import estudiante.manager.EstudiantesModel;
import estudiantes.entities.Estudiantes;
import java.util.List;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Bryan Lennin
 */
@ManagedBean
@SessionScoped
public class ControllerEstudiante {

    private String codigo;
    private String cedula;
    private String nombres;
    private String edad;
    private String direccion;
    private String telefono;
    private List<Estudiantes> listaEstudiantes;

    @EJB
    private EstudiantesModel modelEstudiantes;

    public void actionListenerListar() {
        listaEstudiantes = modelEstudiantes.listarEstudiantes();
    }

    public void actionListenerInsertar() {
        modelEstudiantes.insertarEstudiantes(codigo, cedula, nombres, edad, direccion, telefono);
    }

    public void actionListenerActualizar() {
        modelEstudiantes.editarEstudiante(codigo, cedula, nombres, edad, direccion, telefono);
    }

    public void actionListenerBorrar() {
        modelEstudiantes.borrarEstudiante(codigo, cedula, nombres, edad, direccion, telefono);
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

    public List<Estudiantes> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiantes> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    

}
