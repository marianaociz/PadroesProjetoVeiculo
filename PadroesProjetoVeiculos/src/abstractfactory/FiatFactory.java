/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;


/**
 * Concrete Factory do padrão Abstract Factory.
 *
 * Esta fábrica é responsável por criar
 * os produtos da família Fiat.
 */
public class FiatFactory implements MontadoraFactory {

    /**
     * Cria o Sedan da família Fiat.
     *
     * @return uma instância de FiatCronos.
     */
    @Override
    public Sedan criarSedan() {
        return new FiatCronos();
    }

    /**
     * Cria o Hatch da família Fiat.
     *
     * @return uma instância de FiatArgo.
     */
    @Override
    public Hatch criarHatch() {
        return new FiatArgo();
    }

    /**
     * Cria o SUV da família Fiat.
     *
     * @return uma instância de FiatPulse.
     */
    @Override
    public SUV criarSUV() {
        return new FiatPulse();
    }
}