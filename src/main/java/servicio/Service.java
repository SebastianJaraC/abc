/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Clase;

/**
 *
 * @author sebas
 */
public interface Service {
    
    
    public void crear(Clase clase);
    public List<Clase> listar();
    
}


