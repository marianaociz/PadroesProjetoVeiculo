/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 * Produto Concreto da família Volkswagen.
 *
 * Representa o Volkswagen Virtus, que é um veículo Sedan.
 */
public class VolksVirtus implements Sedan {
    
    /**
     * Exibe informações sobre o porta-malas do Volkswagen Virtus.
     */
    @Override
    public void exibirPortaMalas() {
        System.out.println("Volkswagen Virtus");
        System.out.println("Porta-malas: aproximadamente 521 litros.");
    }
}
