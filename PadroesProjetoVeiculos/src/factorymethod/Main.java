/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package factorymethod;

import javax.swing.*;
import java.awt.*;

/**
 * Classe cliente da aplicação.
 *
 * Utiliza Java Swing para criar a interface gráfica
 * e utiliza a VeiculoFactory para criar os veículos.
 */
public class Main extends JFrame {

    private JComboBox<String> comboVeiculo;
    private JButton botaoCriar;
    private JTextArea areaResultado;

    /**
     * Construtor da tela.
     */
    public Main() {

        // Configurações da janela.
        setTitle("Factory Method - Veículos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        criarInterface();
    }

    /**
     * Cria os componentes da interface gráfica.
     */
    private void criarInterface() {

        // Painel principal.
        JPanel painel = new JPanel(new BorderLayout(10, 10));
        painel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        // Título.
        JLabel titulo = new JLabel(
                "Factory Method - Criação de Veículos",
                SwingConstants.CENTER
        );

        titulo.setFont(
                new Font("Arial", Font.BOLD, 20)
        );

        painel.add(titulo, BorderLayout.NORTH);

        // Painel central.
        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(
                new BoxLayout(painelCentral, BoxLayout.Y_AXIS)
        );

        // Painel para seleção.
        JPanel painelSelecao = new JPanel();

        JLabel labelVeiculo =
                new JLabel("Escolha o veículo:");

        comboVeiculo =
                new JComboBox<>();

        comboVeiculo.addItem("CARRO");
        comboVeiculo.addItem("MOTO");

        botaoCriar =
                new JButton("Criar Veículo");

        painelSelecao.add(labelVeiculo);
        painelSelecao.add(comboVeiculo);
        painelSelecao.add(botaoCriar);

        painelCentral.add(painelSelecao);

        // Espaço entre a seleção e o resultado.
        painelCentral.add(Box.createVerticalStrut(25));

        // Área onde os detalhes serão exibidos.
        areaResultado =
                new JTextArea();

        areaResultado.setEditable(false);
        areaResultado.setFont(
                new Font("Arial", Font.PLAIN, 16)
        );

        areaResultado.setLineWrap(true);
        areaResultado.setWrapStyleWord(true);

        // Remove a aparência de "caixa".
        areaResultado.setBorder(null);
        areaResultado.setBackground(painel.getBackground());

        // Centraliza o texto.
        areaResultado.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Painel para centralizar o texto.
        JPanel painelResultado = new JPanel(
                new GridBagLayout()
        );

        painelResultado.setBackground(painel.getBackground());

        painelResultado.add(areaResultado);

        painelCentral.add(painelResultado);

        painel.add(
                painelCentral,
                BorderLayout.CENTER
        );

        // Ação do botão.
        botaoCriar.addActionListener(e -> criarVeiculo());

        // Define o painel da janela.
        setContentPane(painel);
    }

    /**
     * Utiliza a VeiculoFactory para criar o veículo
     * selecionado pelo usuário.
     */
    private void criarVeiculo() {

        String tipo =
                comboVeiculo.getSelectedItem().toString();

        // Cria a fábrica.
        VeiculoFactory factory =
                new VeiculoFactory();

        // A fábrica cria o veículo.
        Veiculo veiculo =
                factory.criarVeiculo(tipo);

        // Exibe o resultado na interface gráfica.
        areaResultado.setText("");

        if (veiculo instanceof Carro) {

            areaResultado.append(
                    "Veículo criado: CARRO\n\n"
            );

            areaResultado.append(
                    "Tipo: Automóvel de quatro rodas."
            );

        } else if (veiculo instanceof Moto) {

            areaResultado.append(
                    "Veículo criado: MOTO\n\n"
            );

            areaResultado.append(
                    "Tipo: Motocicleta de duas rodas."
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
