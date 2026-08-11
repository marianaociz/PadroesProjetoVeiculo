/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 * Produto Concreto da família Fiat.
 *
 * Representa o Fiat Argo, que é um veículo Hatch.
 */
public class FiatArgo implements Hatch {
    
     /**
     * Exibe informações sobre o consumo do Fiat Argo.
     */
    @Override
    public void exibirConsumo() {
        System.out.println("Fiat Argo");
        System.out.println("Modelo: Hatch da família Fiat.");
    }
}
