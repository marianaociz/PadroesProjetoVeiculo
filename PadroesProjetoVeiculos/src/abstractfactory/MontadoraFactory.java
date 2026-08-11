/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstractfactory;

/**
 * Abstract Factory do padrão Abstract Factory.
 *
 * Define os métodos responsáveis pela criação
 * dos produtos que pertencem a uma família de veículos.
 */
public interface MontadoraFactory {
      /**
     * Cria um veículo Sedan.
     *
     * @return um Sedan da montadora correspondente.
     */
    Sedan criarSedan();

    /**
     * Cria um veículo Hatch.
     *
     * @return um Hatch da montadora correspondente.
     */
    Hatch criarHatch();
      /**
     * Cria um veículo SUV.
     *
     * @return SUV da montadora correspondente.
     */
    SUV criarSUV();
}
