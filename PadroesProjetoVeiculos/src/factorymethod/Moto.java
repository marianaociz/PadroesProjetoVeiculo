/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 * Produto Concreto do padrão Factory Method.
 *
 * Representa uma moto e implementa a interface Veiculo.
 */
public class Moto  implements Veiculo{
    
      /**
     * Exibe os detalhes da moto.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Veículo: Moto");
        System.out.println("Tipo: Motocicleta de duas rodas.");
    }
}
