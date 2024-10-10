package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {

    private Integer cargamax;
    private Integer alturamax;
    private Integer comprimentomax;

    public Caminhao() {
        super();
        this.cargamax = 0;
        this.alturamax = 0;
        this.comprimentomax = 0;
    }
    
    public Caminhao(Integer peso, Integer velocmax, Double preco, Integer cargamax, Integer alturamax, Integer comprimentomax) {
        super(peso, velocmax, preco);
        this.cargamax = cargamax;
        this.alturamax = alturamax;
        this.comprimentomax = comprimentomax;
    }

    public Integer getCargamax() {
        return cargamax;
    }

    public void setCargamax(Integer cargamax) {
        this.cargamax = cargamax;
    }

    public Integer getAlturamax() {
        return alturamax;
    }

    public void setAlturamax(Integer alturamax) {
        this.alturamax = alturamax;
    }

    public Integer getComprimentomax() {
        return comprimentomax;
    }

    public void setComprimentomax(Integer comprimentomax) {
        this.comprimentomax = comprimentomax;
    }
    @Override
    public void solicitarDados(){
        super.solicitarDados();
        String entcagarmax = JOptionPane.showInputDialog("Insira a carga máxima:");
        this.cargamax = Integer.valueOf(entcagarmax);
        String entalturamax = JOptionPane.showInputDialog("Insira a altura máxima:");
        this.alturamax = Integer.valueOf(entalturamax);
        String entcomprimento = JOptionPane.showInputDialog("Insira o comprimento do veículo:");
        this.comprimentomax = Integer.valueOf(entcomprimento);
    }
    @Override
    public void imprimirDados(){
        String dadosVeiculo = super.stringDados();
        String dados = dadosVeiculo + cargamax + " Toneladas\n" + alturamax + " Metros\n" + comprimentomax + "Metros\n";
        JOptionPane.showMessageDialog(null, dados);
    }
}
