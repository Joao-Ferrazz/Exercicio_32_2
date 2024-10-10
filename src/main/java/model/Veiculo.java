package model;

import javax.swing.JOptionPane;

public class Veiculo {

    private Integer peso;
    private Integer velocmax;
    private Double preco;

    public Veiculo() {
        this.peso = 0;
        this.velocmax = 0;
        this.preco = 0.0;
    }

    public Veiculo(Integer peso, Integer velocmax, Double preco) {
        this.peso = peso;
        this.velocmax = velocmax;
        this.preco = preco;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getVelocmax() {
        return velocmax;
    }

    public void setVelocmax(Integer velocmax) {
        this.velocmax = velocmax;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void solicitarDados() {
        String entpeso = JOptionPane.showInputDialog("Insira o peso do veículo:");
        this.peso = Integer.valueOf(entpeso);
        String entvelocmax = JOptionPane.showInputDialog("Insira a velocidade máxima do veículo");
        this.velocmax = Integer.valueOf(entvelocmax);
        String entpreco = JOptionPane.showInputDialog("Insira o preço do veículo:");
        this.preco = Double.valueOf(entpreco);
    }
    public String stringDados(){
        String precof = String.format("%.3f", preco);
        return "Peso: " + peso + " Kg\n" + "Velocidade Máxima: \n" + velocmax + " Km/h\n" + "Preço: " + precof + " R$\n";
    }
    public void imprimirDados(){
        String precof = String.format("%.3f", preco);
        String dados = peso + " Kg\n" + velocmax + " Km/h\n" + precof + " R$\n";
        JOptionPane.showMessageDialog(null, "Dados:\n" + dados);
    }
}
