/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Clase;
import servicio.ServiceImpl;

/**
 *
 * @author sebas
 */
public class Control {
       private ServiceImpl serviceImpl  = new ServiceImpl();
    
    
    
    public void crear(String [] data){
        var codigo=Integer.valueOf(data[0]);
        var origen=(data[1]);
        var destino=(data[2]);
        var year=Integer.valueOf(data[3]);
        var mes=Integer.valueOf(data[4]);
        var dia=Integer.valueOf(data[5]);
        var clase= new Clase(codigo,origen,destino,LocalDate.of(year, mes, dia));
        this.serviceImpl.crear(clase);
    }
    
    public List<Clase> listar(){
        return this.serviceImpl.listar();
    }
    
}



