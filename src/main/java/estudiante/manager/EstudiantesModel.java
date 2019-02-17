/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante.manager;

import estudiantes.entities.Estudiantes;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author Bryan Lennin
 */
@Stateless
public class EstudiantesModel {
    private EntityManager em;
    
 
   List<Estudiantes> listaEstudiantes=new ArrayList<Estudiantes>();
    
    public Estudiantes insertarEstudiantes(String codigo,String cedula,String nombres,String edad,String direccion,String telefono){
        Estudiantes e= new Estudiantes(codigo,cedula,nombres,edad,direccion,telefono);
        listaEstudiantes.add(e);
        return e;
    }
    public List<Estudiantes> listarEstudiantes(){
        if(listaEstudiantes.isEmpty()){
            listaEstudiantes.add(new Estudiantes("1","1003759634","Bryan Cachimuel","24","Ibarra","0967927800"));
            listaEstudiantes.add(new Estudiantes("2","1005007602","Fernando Lopez","19","Quito","0985749631"));
            listaEstudiantes.add(new Estudiantes("3","1008529638","Jenny Mena","20","Ibarra","0974963215"));
            listaEstudiantes.add(new Estudiantes("4","0451287496","Karen Mendez","22","Tulcan","0960859631"));
            return listaEstudiantes;
        }else{
            return listaEstudiantes;
        }
    }
    
    public int buscarEstudiante(String codigo){
        return -1;
    }
    
    public boolean editarEstudiante(String codigo,String cedula,String nombres,String edad,String direccion,String telefono){
        if(buscarEstudiante(codigo)!=-1){
            Estudiantes e=new Estudiantes(codigo,cedula,nombres,edad,direccion,telefono);
            listaEstudiantes.add(buscarEstudiante(codigo), e);
            return true;
        }else{
        return false;
    }
       
    }
    public boolean borrarEstudiante(String codigo,String cedula,String nombres,String edad,String direccion,String telefono){
        if(buscarEstudiante(codigo)!=-1){
            return true;
        }else{
            return false;
        }
    }
   
    
    
}
