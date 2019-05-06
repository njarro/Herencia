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
public class Camioneta extends Auto{
    private int CapacidadCarga;
    private int CantidadEjes;
    private int nroRodadas;

    public Camioneta(int CapacidadCarga, int CantidadEjes, int nroRodadas, String placa, int nroSerie, int ano, double precio, String marca) {
        super(placa, nroSerie, ano, precio, marca);
        this.CapacidadCarga = CapacidadCarga;
        this.CantidadEjes = CantidadEjes;
        this.nroRodadas = nroRodadas;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(int CapacidadCarga) {
        this.CapacidadCarga = CapacidadCarga;
    }

    public int getCantidadEjes() {
        return CantidadEjes;
    }

    public void setCantidadEjes(int CantidadEjes) {
        this.CantidadEjes = CantidadEjes;
    }

    public int getNroRodadas() {
        return nroRodadas;
    }

    public void setNroRodadas(int nroRodadas) {
        this.nroRodadas = nroRodadas;
    }
   
    
}
