/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Celular;
import servicio.CelularServiceImpl;

/**
 *
 * @author sebas
 */
public class CelularControl {

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private CelularServiceImpl celularserviceImpl = new CelularServiceImpl();

    ///////////////////////////////////////////////////////////////////////////
    public void crear(String[] data) {
        var codigo = Integer.valueOf(data[0]);
        var precio = Double.valueOf(data[1]);
        var marca = (data[2]);
        var modelo = (data[3]);

        var celular = new Celular(codigo, precio, marca, modelo);
        this.celularserviceImpl.crear(celular);
    }
    ///////////////////////////////////////////////////////////////////////////
    public List<Celular> listar() {
        return this.celularserviceImpl.listar();
    }

}
