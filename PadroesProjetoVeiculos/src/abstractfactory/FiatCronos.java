/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 * Produto Concreto da família Fiat.
 *
 * Representa o Fiat Cronos, que é um veículo Sedan.
 */
public class FiatCronos implements Sedan {
    
     /**
     * Exibe informações sobre o porta-malas do Fiat Cronos.
     */
    @Override
    public void exibirPortaMalas() {
        System.out.println("Fiat Cronos");
        System.out.println("Porta-malas: aproximadamente 525 litros.");
    }
}
