package principal;

import model.Caminhao;
import model.CarroPasseio;
import model.Veiculo;

public class Principal {
    public static void main(String[] args){
        Veiculo veic = new Veiculo();
        veic.solicitarDados();
        veic.imprimirDados();
        CarroPasseio carro = new CarroPasseio();
        carro.solicitarDados();
        carro.imprimirDados();
        Caminhao cam = new Caminhao();
        cam.solicitarDados();
        cam.imprimirDados();
    }
}