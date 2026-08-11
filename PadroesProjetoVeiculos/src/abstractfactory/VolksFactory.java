/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 * Concrete Factory do padrão Abstract Factory.
 *
 * Esta fábrica é responsável por criar
 * os produtos da família Volkswagen.
 */
public class VolksFactory implements MontadoraFactory {

    /**
     * Cria o Sedan da família Volkswagen.
     *
     * @return uma instância de VolksVirtus.
     */
    @Override
    public Sedan criarSedan() {
        return new VolksVirtus();
    }

    /**
     * Cria o Hatch da família Volkswagen.
     *
     * @return uma instância de VolksPolo.
     */
    @Override
    public Hatch criarHatch() {
        return new VolksPolo();
    }

    /**
     * Cria o SUV da família Volkswagen.
     *
     * @return uma instância de VolksTCross.
     */
    @Override
    public SUV criarSUV() {
        return new VolksTCross();
    }
}