/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;
import ec.edu.intsuperior.vista.Loggin;
import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Docente;
import ec.edu.intsuperior.vista.EliminarDocente;
import ec.edu.intsuperior.vista.Estudiante;
import ec.edu.intsuperior.vista.Materia;
import ec.edu.intsuperior.vista.Curso;
import ec.edu.intsuperior.vista.EditarDocente;
import ec.edu.intsuperior.vista.EditarEstudiante;
import ec.edu.intsuperior.vista.EditarMateria;
import ec.edu.intsuperior.vista.EliminarCurso;
import ec.edu.intsuperior.vista.EliminarEstudiante;
import ec.edu.intsuperior.vista.EliminarMateria;
import javax.swing.JOptionPane;


/**
 *
 * @author SHIRLEY
 */
public class Controlador {
    Loggin loggin = new Loggin(this);
    Conexion conexion = new Conexion();
    Administrador administrador = new Administrador(this);
    Docente docente=new Docente(this);
    Estudiante estudiante=new Estudiante(this);
    EliminarDocente eliminardocente=new EliminarDocente(this);
    Materia materia=new Materia(this);
    Curso curso=new Curso(this);
    EditarDocente editardocente=new EditarDocente(this);
    EditarEstudiante editarestudiante=new EditarEstudiante(this);
    EditarMateria editarmateria=new EditarMateria(this);
    EliminarMateria eliminarmateria=new EliminarMateria(this);
    EliminarEstudiante eliminarestudiante=new EliminarEstudiante(this);
    EliminarCurso eliminarcurso=new EliminarCurso(this);
    String bdd="";
    public void showEliminarCurso(){
        
        eliminarcurso.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliminarcurso);
        eliminarcurso.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
    public void showEliminarEstudiante(){
        
        eliminarestudiante.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliminarestudiante);
        eliminarestudiante.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
    public void showEliminarMateria(){
        
        eliminarmateria.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliminarmateria);
        eliminarmateria.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
    public void showEditarMateria(){
        
        editarmateria.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(editarmateria);
        editarmateria.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
    public void showEditarEstudiante(){
        
        editarestudiante.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(editarestudiante);
        editarestudiante.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
    public void showEditarDocente(){
        
        editardocente.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(editardocente);
        editardocente.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
    public void showCurso(){
        
        curso.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(curso);
        curso.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
    
    public void showMateria(){
        
        materia.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(materia);
        materia.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
        
    public void showEliminarDocente(){
        
        eliminardocente.setSize(600,1200);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(eliminardocente);
        eliminardocente.setVisible(true);
        administrador.escritorio.revalidate();
        administrador.escritorio.repaint();
       
    }
    
public void showLoggin(){
    loggin.setVisible(true);
} 
public void probarConexion(){
    Conexion.getConnection();
    
}
public void showAdministrador(){
        administrador.setVisible(true);
    }
public void showDocente(){
        
        docente.setVisible(true);
        
        
    }
public void showEstudiante(){
    
    estudiante.setVisible(true);
}
    

}
