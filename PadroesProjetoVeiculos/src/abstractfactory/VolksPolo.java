/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 * Produto Concreto da família Volkswagen.
 *
 * Representa o Volkswagen Polo, que é um veículo Hatch.
 */
public class VolksPolo implements Hatch {
     /**
     * Exibe informações sobre o consumo do Volkswagen Polo.
     */
    @Override
    public void exibirConsumo() {
        System.out.println("Volkswagen Polo");
        System.out.println("Modelo: Hatch da família Volkswagen.");
    }
}
