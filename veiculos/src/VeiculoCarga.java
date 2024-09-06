//Representa veículos de carga e inclui dados específicos como a capacidade máxima de carga e as dimensões (CLASSE FILHA)

public class VeiculoCarga extends Veiculo {
    private double capacidadeCarga;

    public VeiculoCarga(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                        String chassi, String renavam, String procedencia, double capacidadeMaximaCarga,
                        double altura, double largura, double profundidade, String corExterna, String corInterna,
                        String tipoCombustivel, String motor, double quilometragem, double consumoMedio, int numeroPortas,
                        double capacidadeCarga) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeMaximaCarga, altura, largura, profundidade,
              corExterna, corInterna, tipoCombustivel, motor, quilometragem, consumoMedio, numeroPortas);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}