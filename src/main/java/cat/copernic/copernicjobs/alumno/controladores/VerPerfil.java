/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.copernicjobs.alumno.controladores;

import cat.copernic.copernicjobs.DAO.AlumnoDAO;
import cat.copernic.copernicjobs.general.utils.CargarPantallaPrincipal;
import cat.copernic.copernicjobs.general.utils.NavBarType;
import cat.copernic.copernicjobs.model.Alumno;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

/**
 *
 * @author Cole
 */
@Controller
public class VerPerfil {

    @Autowired //Anotació que injecta tots els mètodes i possibles dependències de UsuarioDAO
    private AlumnoDAO alumndoDAO; //Atribut per poder utilitzar les funcions CRUD de la interfície UsuarioDAO

    @GetMapping("/veurePerfilAlumne")
    public String inicio(Model model) {
        //Ruta donde está el archivo html 
        String ruta = "alumno/";
        //nombre del archivo html
        String archivo = "verPerfilAlumno";

        Alumno alumno = (Alumno)alumndoDAO.findById(1).get();

        HashMap<String, Object> datos = new HashMap<>() {
            {
                put("nombrePerfil", alumno.getNombre());
                put("correoPerfil", alumno.getCorreo());
                put("direccionPerfil", alumno.getDireccion());
                put("movilPerfil", alumno.getMovil());
                put("generoPerfil", alumno.getSexoDesc());
                put("dni", alumno.getDni());
                put("tarjSanitaria", alumno.getTarjetaSanitaria());
                put("numSegSocial", alumno.getSegSocial());

            }
        };
        model.addAllAttributes(datos);
        return CargarPantallaPrincipal.cargar(model, NavBarType.ALUMNO, ruta, archivo);
    }

}
