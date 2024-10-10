package model;

import javax.swing.JOptionPane;

public class CarroPasseio extends Veiculo {

    private String cor;
    private String modelo;

    public CarroPasseio() {
        super();
        this.cor = "";
        this.modelo = "";
    }

    public CarroPasseio(Integer peso, Integer velocmax, Double precoDouble, String corString, String modelo) {
        super(peso, velocmax, precoDouble);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void solicitarDados() {
        super.solicitarDados();
        this.cor = JOptionPane.showInputDialog("Insira a cor do veículo:");
        this.modelo = JOptionPane.showInputDialog("Insira o modelo do veículo:");
    }
    
    @Override
    public void imprimirDados(){
        String dadosVeiculo = super.stringDados();
        String dados = dadosVeiculo + "Cor: " + cor + "\n" + "Modelo: " + modelo + "\n";
        JOptionPane.showMessageDialog(null, dados);
    }
}
