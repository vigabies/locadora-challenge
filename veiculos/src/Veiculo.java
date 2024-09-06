//Contém os dados comuns a todos os veículos, como placa, marca, modelo (CLASSE MÃE)
public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private String chassi;
    private String renavam;
    private String procedencia;
    private double capacidadeMaximaCarga;
    private double altura;
    private double largura;
    private double profundidade;
    private String corExterna;
    private String corInterna;
    private String tipoCombustivel;
    private String motor;
    private double quilometragem;
    private double consumoMedio;
    private int numeroPortas;

    // Construtor da classe Veiculo
    public Veiculo(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                   String chassi, String renavam, String procedencia, double capacidadeMaximaCarga,
                   double altura, double largura, double profundidade, String corExterna, String corInterna,
                   String tipoCombustivel, String motor, double quilometragem, double consumoMedio, int numeroPortas) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavam = renavam;
        this.procedencia = procedencia;
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.corExterna = corExterna;
        this.corInterna = corInterna;
        this.tipoCombustivel = tipoCombustivel;
        this.motor = motor;
        this.quilometragem = quilometragem;
        this.consumoMedio = consumoMedio;
        this.numeroPortas = numeroPortas;
    }

    // Métodos getters e setters 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public String getCorExterna() {
        return corExterna;
    }

    public void setCorExterna(String corExterna) {
        this.corExterna = corExterna;
    }

    public String getCorInterna() {
        return corInterna;
    }

    public void setCorInterna(String corInterna) {
        this.corInterna = corInterna;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

}

    
    