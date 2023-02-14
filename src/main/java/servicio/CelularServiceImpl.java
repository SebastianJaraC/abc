/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Celular;

/**
 *
 * @author sebas
 */
public class CelularServiceImpl implements CelularService {

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private static List<Celular> celularList = new ArrayList<>();
 ///////////////////////////////////////////////////////////////////////////
    public CelularServiceImpl() {
        celularList = new ArrayList<>();
    }
 ///////////////////////////////////////////////////////////////////////////
    @Override
    public void crear(Celular celular) {
        this.celularList.add(celular);
    }

    @Override
    public List<Celular> listar() {
        return this.celularList;
    }

}
