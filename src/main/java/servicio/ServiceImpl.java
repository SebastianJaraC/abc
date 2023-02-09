/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Clase;

/**
 *
 * @author sebas
 */
public class ServiceImpl implements Service{

    private static List<Clase> claseList = new ArrayList<>();

    public ServiceImpl() {
        claseList= new ArrayList<>();
    }
    
    @Override
    public void crear(Clase clase) {
        this.claseList.add(clase);
    }

    @Override
    public List<Clase> listar() {
        return this.claseList;
    }
    
}
