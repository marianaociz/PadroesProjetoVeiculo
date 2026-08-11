/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 * Produto Concreto da família Fiat.
 *
 * Representa o Fiat Pulse, que pertence
 * à categoria SUV.
 */
public class FiatPulse implements SUV {
     /**
     * Exibe as características do Fiat Pulse.
     */
    @Override
    public void exibirCaracteristicas() {
        System.out.println("Fiat Pulse");
        System.out.println("Categoria: SUV");
        System.out.println("Família: Fiat");
    }
}
