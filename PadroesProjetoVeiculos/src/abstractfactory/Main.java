/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

import javax.swing.*;
import java.awt.*;

/**
 * Classe cliente da aplicação.
 *
 * Utiliza Java Swing para criar a interface gráfica
 * e utiliza o padrão Abstract Factory para criar
 * os veículos das famílias Fiat e Volkswagen.
 */
public class Main extends JFrame {

    private JComboBox<String> comboMontadora;
    private JButton botaoCriar;
    private JTextArea areaResultado;

    /**
     * Construtor da tela.
     */
    public Main() {

        // Configurações da janela.
        setTitle("Abstract Factory - Montadoras");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Cria a interface gráfica.
        criarInterface();
    }

    /**
     * Cria e organiza os componentes da tela.
     */
    private void criarInterface() {

        // Painel principal da janela.
        JPanel painelPrincipal = new JPanel(
                new BorderLayout(10, 10)
        );

        painelPrincipal.setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20
                )
        );

        // ==========================================
        // PAINEL SUPERIOR
        // ==========================================

        JPanel painelSuperior = new JPanel(
                new BorderLayout(10, 15)
        );

        // Título.
        JLabel titulo = new JLabel(
                "Abstract Factory - Montadoras",
                SwingConstants.CENTER
        );

        titulo.setFont(
                new Font("Arial", Font.BOLD, 20)
        );

        painelSuperior.add(
                titulo,
                BorderLayout.NORTH
        );

        // ==========================================
        // PAINEL DE SELEÇÃO
        // ==========================================

        JPanel painelSelecao = new JPanel();

        JLabel labelMontadora =
                new JLabel("Escolha a montadora:");

        comboMontadora =
                new JComboBox<>();

        comboMontadora.addItem("FIAT");
        comboMontadora.addItem("VOLKSWAGEN");

        botaoCriar =
                new JButton("Criar Família");

        painelSelecao.add(labelMontadora);
        painelSelecao.add(comboMontadora);
        painelSelecao.add(botaoCriar);

        painelSuperior.add(
                painelSelecao,
                BorderLayout.CENTER
        );

        painelPrincipal.add(
                painelSuperior,
                BorderLayout.NORTH
        );

        // ==========================================
        // ÁREA DE RESULTADO
        // ==========================================

        areaResultado =
                new JTextArea();

        areaResultado.setEditable(false);

        // Fonte menor para deixar o resultado mais confortável.
        areaResultado.setFont(
                new Font("Arial", Font.PLAIN, 14)
        );

        areaResultado.setLineWrap(true);
        areaResultado.setWrapStyleWord(true);

        areaResultado.setBorder(
                BorderFactory.createEmptyBorder(
                        10, 10, 10, 10
                )
        );

        JScrollPane scrollPane =
                new JScrollPane(areaResultado);

        scrollPane.setBorder(
                BorderFactory.createTitledBorder(
                        "Veículos criados"
                )
        );

        // Agora o resultado ocupa o centro da tela.
        painelPrincipal.add(
                scrollPane,
                BorderLayout.CENTER
        );

        // ==========================================
        // AÇÃO DO BOTÃO
        // ==========================================

        botaoCriar.addActionListener(
                e -> criarFamilia()
        );

        // Define o painel principal da janela.
        setContentPane(painelPrincipal);
    }

    /**
 * Cria os veículos da família selecionada.
 *
 * A fábrica concreta é escolhida de acordo
 * com a montadora selecionada pelo usuário.
 */
private void criarFamilia() {

    String montadora =
            comboMontadora.getSelectedItem().toString();

    MontadoraFactory factory;

    // Escolhe a fábrica de acordo com a montadora.
    if (montadora.equals("FIAT")) {

        factory = new FiatFactory();

    } else {

        factory = new VolksFactory();
    }

    // A fábrica cria os produtos da família.
    Sedan sedan =
            factory.criarSedan();

    Hatch hatch =
            factory.criarHatch();

    SUV suv =
            factory.criarSUV();

    // Limpa o resultado anterior.
    areaResultado.setText("");

    // ==========================================
    // IDENTIFICA A MONTADORA
    // ==========================================

    areaResultado.append(
            "MONTADORA: " + montadora + "\n\n"
    );

    // ==========================================
    // EXIBE O SEDAN
    // ==========================================

    if (sedan instanceof FiatCronos) {

        areaResultado.append(
                "SEDAN\n"
                + "Modelo: Fiat Cronos\n"
                + "Porta-malas: aproximadamente 525 litros.\n\n"
        );

    } else if (sedan instanceof VolksVirtus) {

        areaResultado.append(
                "SEDAN\n"
                + "Modelo: Volkswagen Virtus\n"
                + "Porta-malas: aproximadamente 521 litros.\n\n"
        );
    }

    // ==========================================
    // EXIBE O HATCH
    // ==========================================

    if (hatch instanceof FiatArgo) {

        areaResultado.append(
                "HATCH\n"
                + "Modelo: Fiat Argo\n"
                + "Família: Fiat.\n\n"
        );

    } else if (hatch instanceof VolksPolo) {

        areaResultado.append(
                "HATCH\n"
                + "Modelo: Volkswagen Polo\n"
                + "Família: Volkswagen.\n\n"
        );
    }

    // ==========================================
    // EXIBE O SUV
    // ==========================================

    if (suv instanceof FiatPulse) {

        areaResultado.append(
                "SUV\n"
                + "Modelo: Fiat Pulse\n"
                + "Categoria: SUV\n"
                + "Família: Fiat.\n"
        );

    } else if (suv instanceof VolksTCross) {

        areaResultado.append(
                "SUV\n"
                + "Modelo: Volkswagen T-Cross\n"
                + "Categoria: SUV\n"
                + "Família: Volkswagen.\n"
        );
    }
}

/**
 * Método principal que inicia a aplicação.
 */
public static void main(String[] args) {

    SwingUtilities.invokeLater(() -> {

        Main tela = new Main();

        tela.setVisible(true);
    });
}
}