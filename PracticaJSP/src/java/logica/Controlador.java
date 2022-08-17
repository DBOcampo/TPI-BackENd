
package logica;

import java.util.List;
import persistencia.ControladorPersistencia;

public class Controlador {
    ControladorPersistencia contro = new ControladorPersistencia();
    
    public void crearPersona(Persona pers){
        contro.crearPersona(pers);
    }
    
    public void eliminarPersona(int id){
        contro.eliminarPersona(id);
    }
    
    public void eliminarPersona(Persona pers){
        contro.eliminarPersona(pers);
    }
    
    public List<Persona> traerPersonas(){
        return contro.traerPersonas();
    }
    
    public void editarPersona(Persona pers){
        contro.editarPersona(pers);
    }
    
}
