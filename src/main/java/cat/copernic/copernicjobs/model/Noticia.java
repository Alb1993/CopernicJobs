/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.copernicjobs.model;

import java.time.LocalDate;
import java.util.Date;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author joang
 */
@Data
public class Noticia{
    private int id;
    private Rol rol;
    private String titulo;
    private String descripcion;
    private LocalDate fechaHora;
}