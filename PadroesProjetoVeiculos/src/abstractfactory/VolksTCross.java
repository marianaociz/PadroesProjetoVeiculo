/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 * Produto Concreto da família Volkswagen.
 *
 * Representa o Volkswagen T-Cross,
 * que pertence à categoria SUV.
 */
public class VolksTCross implements SUV{
       /**
     * Exibe as características do Volkswagen T-Cross.
     */
    @Override
    public void exibirCaracteristicas() {
        System.out.println("Volkswagen T-Cross");
        System.out.println("Categoria: SUV");
        System.out.println("Família: Volkswagen");
    }
}
