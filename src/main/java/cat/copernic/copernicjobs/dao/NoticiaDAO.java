/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.copernicjobs.dao;

import cat.copernic.copernicjobs.model.Noticia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * DAO de la entidad Noticia.
 * @author joang
 */
public interface NoticiaDAO extends JpaRepository<Noticia, Integer> {

    //Aqui podrem afegir altres mètodes que necessitem i que no estiguin definits a la interface CrudRepository,
    //com el següent mètode, findByNom que retornarà els gossos amb el nom passat per paràmetre
}
