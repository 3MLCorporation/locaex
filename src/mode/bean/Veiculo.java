/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mode.bean;

/**
 *
 * @author lucas.gabriel
 */
public class Veiculo {
    private String placa;
    private String cor;
    private String marca;
    private String modelo;
    private float kilometragem;
    private String disponibilidade;
    
    public Veiculo(){
    
    }
    public Veiculo(String placa, String cor, String marca, String modelo, float kilometragem, String disponibilidade){
        this.placa=placa;
        this.cor=cor;
        this.marca=marca;
        this.modelo=modelo;
        this.kilometragem=kilometragem;
        this.disponibilidade=disponibilidade;
    
    }
    
    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(float kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
