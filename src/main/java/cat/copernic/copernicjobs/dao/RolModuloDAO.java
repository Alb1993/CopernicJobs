/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.copernicjobs.dao;

import cat.copernic.copernicjobs.model.Modulo;
import cat.copernic.copernicjobs.model.Rol;
import cat.copernic.copernicjobs.model.RolModulo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author joang
 */
public interface RolModuloDAO extends JpaRepository<RolModulo,Integer>{
    @Query("SELECT rm.modulo FROM RolModulo rm WHERE rm.rol.nom = :nombreRol")
    List<Modulo> findModulosByNombreRol(@Param("nombreRol") String nombreRol);

    @Query("SELECT rm.rol FROM RolModulo rm WHERE rm.modulo.nombre = :nombreModulo")
    List<Rol> findRolesByNombreModulo(@Param("nombreModulo") String nombreModulo);
}
