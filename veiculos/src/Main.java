public class Main {

    public static void main(String[] args) {
        // Criando um veículo de carga
        VeiculoCarga caminhao = new VeiculoCarga("ABC-1234", "Mercedes-Benz", "Actros", 2022, 2021, "1234567890ABCDE",
                "987654321", "Nacional", 20000, 3.0, 2.5, 8.0, "Branco", "Preto", "Diesel", "V8",
                100000, 5.0, 2, 15000);

        // Criando um veículo de passageiros
        VeiculoPassageiro onibus = new VeiculoPassageiro("XYZ-9876", "Volkswagen", "Ônibus Urbano", 2023, 2022, "0987654321FEDCB",
                "123456789", "Importado", 5000, 3.5, 2.8, 10.0, "Azul", "Cinza", "Diesel", "V6",
                50000, 8.0, 2, 45);

        // Exibindo as informações dos veículos
        System.out.println("Veículo de Carga:");
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Capacidade de Carga: " + caminhao.getCapacidadeCarga() + " kg");
        System.out.println();

        System.out.println("Veículo de Passageiros:");
        System.out.println("Placa: " + onibus.getPlaca());
        System.out.println("Marca: " + onibus.getMarca());
        System.out.println("Número de Passageiros: " + onibus.getNumeroPassageiros());
    }
}

