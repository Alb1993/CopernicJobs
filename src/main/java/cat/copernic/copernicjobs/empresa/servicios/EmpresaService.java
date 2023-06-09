/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.copernicjobs.empresa.servicios;

import cat.copernic.copernicjobs.dao.EmpresaDAO;
import cat.copernic.copernicjobs.model.Empresa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * Servicio para el DAO de Empresa.
 * @author Albert
 */
@Service
public class EmpresaService implements EmpresaServiceInterface {

    public void setEmpresa(EmpresaDAO empresa) {
        this.empresa = empresa;
    }

    @Autowired
    private EmpresaDAO empresa;

    @Override
    @Transactional(readOnly = true)
    public List<Empresa> llistarEmpreses() {
        return (List<Empresa>) empresa.findAll();
    }

    @Override
    @Transactional()
    public void afegirEmpresa(Empresa empresa) {
        this.empresa.save(empresa);
    }

    @Override
    @Transactional()
    public void eliminarEmpresa(Empresa empresa) {
        this.empresa.delete(empresa);
    }

    @Override
    @Transactional(readOnly = true)
    public Empresa cercarEmpresa(Empresa empresa) {
        return this.empresa.findById(empresa.getId()).orElse(null);
    }

    @Override
    public Empresa buscarPorNombre(String nombreEmpresa) {
        return this.empresa.findByNombreEmpresa(nombreEmpresa);
    }
    
    @Override
    public Empresa buscarPorUsername(String username) {
        return empresa.findByUsername(username);
    }

}
