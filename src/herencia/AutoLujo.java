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
public class AutoLujo extends Auto{
    private int nroPasajeros;

    public AutoLujo(int nroPasajeros, String placa, int nroSerie, int ano, double precio, String marca) {
        super(placa, nroSerie, ano, precio, marca);
        this.nroPasajeros = nroPasajeros;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }

    public void setNroPasajeros(int nroPasajeros) {
        this.nroPasajeros = nroPasajeros;
    }
    
    
}
