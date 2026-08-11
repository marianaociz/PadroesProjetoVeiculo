/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 * Fábrica responsável pela criação dos veículos.
 *
 * Esta classe implementa a lógica do Factory Method,
 * centralizando a criação dos objetos Carro e Moto.
 */
public class VeiculoFactory {
     /**
     * Cria um veículo de acordo com o tipo informado.
     *
     * @param tipo tipo do veículo: CARRO ou MOTO
     * @return um objeto Carro ou Moto
     */
    public Veiculo criarVeiculo(String tipo) {

        if (tipo == null) {
            throw new IllegalArgumentException(
                    "O tipo do veículo não pode ser nulo."
            );
        }

        switch (tipo.toUpperCase()) {

            case "CARRO":
                return new Carro();

            case "MOTO":
                return new Moto();

            default:
                throw new IllegalArgumentException(
                        "Tipo de veículo inválido: " + tipo
                );
        }
    }
}
