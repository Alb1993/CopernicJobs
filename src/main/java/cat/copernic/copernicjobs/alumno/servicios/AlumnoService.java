/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.copernicjobs.alumno.servicios;

import cat.copernic.copernicjobs.DAO.AlumnoDAO;
import cat.copernic.copernicjobs.general.servicios.*;
import cat.copernic.copernicjobs.DAO.IncidenciaDAO;
import cat.copernic.copernicjobs.model.Alumno;
import cat.copernic.copernicjobs.model.Incidencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Cole
 */
@Service
public class AlumnoService implements AlumnoServiceInterface{

    @Autowired
    AlumnoDAO alumnoDAO;

    @Override
    public List<Alumno> listarAlumnos() {
        return (List<Alumno>) alumnoDAO.findAll();
    }

    @Override
    public void anadirAlumno(Alumno alumno) {
        alumnoDAO.save(alumno);
    }

    @Override
    public void eliminarAlumno(Alumno alumno) {
        alumnoDAO.save(alumno);
    }

    @Override
    public Alumno buscarAlumno(Alumno alumno) {
        return alumnoDAO.findById(alumno.getId()).orElse(null);
    }
    


    
}