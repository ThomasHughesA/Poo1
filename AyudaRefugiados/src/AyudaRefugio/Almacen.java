/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AyudaRefugio;

/**
 *
 * @author The_A
 */
public class Almacen {
    
    private String Ropa;
    private String Comida;
    private String Agua;
    private String Medicamentos;

    Almacen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRopa() {
        return Ropa;
    }

    public void setRopa(String Ropa) {
        this.Ropa = Ropa;
    }

    public String getComida() {
        return Comida;
    }

    public void setComida(String Comida) {
        this.Comida = Comida;
    }

    public String getAgua() {
        return Agua;
    }

    public void setAgua(String Agua) {
        this.Agua = Agua;
    }

    public String getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(String Medicamentos) {
        this.Medicamentos = Medicamentos;
    }
    
    

    public Almacen(String Ropa, String Comida, String Agua, String Medicamentos) {
        this.Ropa = Ropa;
        this.Comida = Comida;
        this.Agua = Agua;
        this.Medicamentos = Medicamentos;
    }

    
}
