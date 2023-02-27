/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.copernicjobs.empresa;

import cat.copernic.copernicjobs.general.utils.CargarPantallaPrincipal;
import cat.copernic.copernicjobs.general.utils.NavBarType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
/**
 *
 * @author Albert
 */
@Controller
public class editarOferta{
    
    @GetMapping("/editarOferta")
    public String inicio(Model model){
        //Ruta donde está el archivo html 
        String ruta = "empresa/";
        //nombre del archivo html
        String archivo = "editarOferta";
        
        //Cargamos el archivo y lo añadimos a la plantilla de la página principal
        return CargarPantallaPrincipal.cargar(model, NavBarType.EMPRESA, ruta, archivo);
    }
    
}