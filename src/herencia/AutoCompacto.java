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
public class AutoCompacto extends Auto {
    private int nrpoPasajeros;

    public AutoCompacto(int nrpoPasajeros, String placa, int nroSerie, int ano, double precio, String marca) {
        super(placa, nroSerie, ano, precio, marca);
        this.nrpoPasajeros = nrpoPasajeros;
    }

    public int getNrpoPasajeros() {
        return nrpoPasajeros;
    }

    public void setNrpoPasajeros(int nrpoPasajeros) {
        this.nrpoPasajeros = nrpoPasajeros;
    }
    
    }
   
    

 