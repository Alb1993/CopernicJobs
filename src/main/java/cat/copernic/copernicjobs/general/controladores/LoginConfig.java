/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.copernicjobs.general.controladores;

import cat.copernic.copernicjobs.general.servicios.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Alex
 */
@Configuration //Indica al sistema que és una classe de configuració
@EnableWebSecurity //Habilita la seguretat web
public class LoginConfig {

    @Autowired
    private LoginService loginService; //Objecte per recuperar l'usuari

    /* AUTENTICACIÓ */
    /* ALEX */
    /**
     * Injectem mitjançant @Autowired, els mètodes de la classe
     * AuthenticationManagerBuilder. Mitjançant aquesta classe cridarem al
     * mètode userDetailsService de la classe AuthenticationManagerBuilder què
     * és el mètode que realitzarà l'autenticació. Per parm̀etre el sistema li
     * passa l'usuari introduit en el formulari d'autenticació. Aquest usuari
     * ens el retorna el mètode loadUserByUsername implementat en UsuariService.
     *
     * Cridem al mètode passwordEncoder passant-li com a paràmetre un objecte de
     * tipus BCryptPasswordEncoder() per encriptar el password introduït per
     * l'usuari en el moment d'autenticar-se i comparar-lo amb l'encriptació del
     * password guardat a la BBDD corresponent a l'username introduït també en
     * l'autenticació.
     */
    @Autowired
    public void autenticacio(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(loginService).passwordEncoder(new BCryptPasswordEncoder());
    }
    /*@GetMapping("/login")
    public String inicio(){
        return "login";
    }
    
    @PostMapping("/login")
    public String login(String correo, String contrasenya, Model model){
        boolean loginValido = false;
        
        loginValido = correo.equals("alex") && contrasenya.equals("1234");
        
        String redirect = "redirect:";
        
        if(loginValido) redirect += "/inici";
        else {
            model.addAttribute("loginIncorrecto",true);
            redirect += "/login";
        }
        
        return redirect;
        
    }*/
}