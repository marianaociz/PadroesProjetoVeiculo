/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 * Produto Concreto do padrão Factory Method.
 *
 * Representa um carro e implementa a interface Veiculo.
 */
public class Carro  implements Veiculo {
    
    /**
     * Exibe os detalhes do carro.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Veículo: Carro");
        System.out.println("Tipo: Automóvel de quatro rodas.");
    }
}
