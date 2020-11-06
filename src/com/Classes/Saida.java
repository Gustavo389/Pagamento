package com.Classes;

import javax.swing.*;
import java.awt.*;

public class Saida extends JInternalFrame {
    public Saida() {
        setVisible(true);
        setSize(640, 480);
        setTitle("Saída");
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        Container scene = new Container();
        FlowLayout flowLayout = new FlowLayout();
        scene.setLayout(flowLayout);
        setContentPane(scene);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);



//-----------------------------------------------------------------------------------------------------------------------

        Label lblHoras = new Label("Horas Trabalhadas:" + Sistema.getHorasTrabalhadas());
        add(lblHoras);
//-----------------------------------------------------------------------------------------------------------------------

        Label lblSalariopHora = new Label("Quanto Ganha por Hora Trabalhada: " + Sistema.getValorpHora());
        add(lblSalariopHora);
//-----------------------------------------------------------------------------------------------------------------------

        Label lblNumdeDependentes = new Label("Número de Pessoas que Sustenta: " + Sistema.getNumdeDependentes());
        add(lblNumdeDependentes);
//-----------------------------------------------------------------------------------------------------------------------

        Label lblSalarioBruto = new Label("Sálario Bruto: " + Sistema.calculoSalarioBruto());
        add(lblSalarioBruto);
//-----------------------------------------------------------------------------------------------------------------------
        Label lblDescontoInss = new Label("DescontoInss: " + Sistema.calculoDescontoINSS());
        add(lblDescontoInss);
//-----------------------------------------------------------------------------------------------------------------------

        Label lblDescontoIR = new Label("Desconto IR: " + Sistema.calculoDescontoIR());
        add(lblDescontoIR);
//-----------------------------------------------------------------------------------------------------------------------

        Label lblSalarioLiquido = new Label("Salário Líquido: " + Sistema.calculoSalarioLiquido());
        add(lblSalarioLiquido);
//-----------------------------------------------------------------------------------------------------------------------


    }
}
