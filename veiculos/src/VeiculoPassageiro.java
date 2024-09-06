//Representa veículos de passageiros e inclui dados específicos como o número de portas e o número de passageiros (CLASSE FILHA)

public class VeiculoPassageiro extends Veiculo {
    private int numeroPassageiros;

    public VeiculoPassageiro(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                             String chassi, String renavam, String procedencia, double capacidadeMaximaCarga,
                             double altura, double largura, double profundidade, String corExterna, String corInterna,
                             String tipoCombustivel, String motor, double quilometragem, double consumoMedio, int numeroPortas,
                             int numeroPassageiros) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeMaximaCarga, altura, largura, profundidade,
              corExterna, corInterna, tipoCombustivel, motor, quilometragem, consumoMedio, numeroPortas);
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}