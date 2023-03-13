/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.copernicjobs.dao;

import cat.copernic.copernicjobs.model.Empresa;
import cat.copernic.copernicjobs.model.Usuario;
import java.security.spec.ECField;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Cole
 */
/**
 * DAO para la integración de la entidad Usuario con la base de datos.
 */
public interface EmpresaDAO extends JpaRepository<Empresa,Integer>{ 
    
    /**
     * Obtener los usuarios basandonos en su rol
     * 1 --> alumne
     * 2 --> administrador
     * 3 --> empresa
     * @param baja ID del rol.
     * @return Lista de usuarios.
     */
    List<Empresa> findAllByBaja(boolean baja);
}
