/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Empresa empresa=new Empresa();   
    Camioneta camioneta=new Camioneta(10,4,5,"VSF321",123,321,445,"Mazda" );
    Vagoneta vagoneta =new Vagoneta(11,"VSF321",5,123,321,"Mazda" );
    empresa.registerAuto(vagoneta);
    empresa.registerAuto(camioneta);
    //listar
    HashMap<String,Auto> autos=empresa.listarAutos();
    for(Auto auto: autos.values()){
        System.out.println(auto.getNroSerie());
        System.out.println(auto.getPlaca());
    }
        
        
        
        
    }
    
}
