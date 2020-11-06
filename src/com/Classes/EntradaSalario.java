package com.Classes;

import javax.swing.*;
import java.awt.*;

public class EntradaSalario extends JInternalFrame {
    public EntradaSalario() {
        setVisible(true);
        setSize(640, 480);
        setTitle("Entrada");
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);

        Container scene = new Container();
        FlowLayout flowLayout = new FlowLayout();
        scene.setLayout(flowLayout);
        setContentPane(scene);

        Label lblHoras = new Label("Insira a Quantidade de Horas Trabalhadas: ");
        add(lblHoras);
        TextField txtHoras = new TextField();
        add(txtHoras);
        Label lblSalariopHora = new Label("Insira Quanto Ganha por Hora Trabalhada: ");
        add(lblSalariopHora);
        TextField txtSalpHora = new TextField();
        add(txtSalpHora);
        Label lblNumdeDependentes = new Label("Insira o Número de Pessoas que Sustenta: ");
        add(lblNumdeDependentes);
        TextField txtNumdeDependentes = new TextField();
        add(txtNumdeDependentes);
        Button btt = new Button("Registrar Entrada");
        add(btt);
        btt.addActionListener(e -> {
            try {
                Double.parseDouble(txtHoras.getText());
                Double.parseDouble(txtSalpHora.getText());
                Integer.parseInt(txtNumdeDependentes.getText());
                Sistema.setHorasTrabalhadas(Double.parseDouble(txtHoras.getText()));
                Sistema.setValorpHora(Double.parseDouble(txtSalpHora.getText()));
                Sistema.setNumdeDependentes(Integer.parseInt(txtNumdeDependentes.getText()));
            } catch (Exception f) {
                JOptionPane.showMessageDialog(null,"ERRO!\n Por favor digite válores númericos!","ERRO!", JOptionPane.ERROR_MESSAGE);

            }



        });

    }
}
