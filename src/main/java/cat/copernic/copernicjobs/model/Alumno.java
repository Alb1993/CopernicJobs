/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.copernicjobs.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import lombok.Data;

/**
 *
 * @author Cole
 */
@Data
public class Alumno extends Persona{
    @Column(name = "tarjeta_sanitaria")
    private String tarjetaSanitaria;
    @Column(name = "seg_social")
    private String segSocial;
    @Column(name = "dni")
    private String dni;
}