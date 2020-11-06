package com.Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    JDesktopPane desktopPane;

    public TelaPrincipal() {
        setSize(1024, 768);
        setTitle("Folha de Pagamento");
        setLocationRelativeTo(null);

        desktopPane = new JDesktopPane();
        add(desktopPane);
        setVisible(true);
        criarMenus();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }

    void criarMenus() {
        JMenuBar barGuia = new JMenuBar();
        setJMenuBar(barGuia);
        JMenu mnFerramentas = new JMenu("Ferramentas");
        barGuia.add(mnFerramentas);
        JMenuItem mnItemEntrada = new JMenuItem("Inserir Dados");

        mnItemEntrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chamaEntradaDados();
            }
        });
        mnFerramentas.add(mnItemEntrada);
        JMenuItem mnItemSaida = new JMenuItem("Saída de Dados");

        mnItemSaida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chamaSaida();
            }
        });
        mnFerramentas.add(mnItemSaida);
        JMenuItem MnuItemLogin = new JMenuItem("Login");
        JMenuItem MnuItemCadastro = new JMenuItem("Cadastro");
        mnFerramentas.add(MnuItemCadastro);
        MnuItemCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chamaTelaCadastro();
            }
        });
        mnFerramentas.add(MnuItemLogin);
        MnuItemLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chamaTelaLogin();
            }
        });


    }

    protected void chamaTelaCadastro() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            TelaCadastro cadastro = new TelaCadastro();
            cadastro.setVisible(true);
            desktopPane.add(cadastro);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException erro1) {
            JOptionPane.showMessageDialog(desktopPane, "Erro de Layout \n" + erro1.getMessage());

        }
    }

    protected void chamaSaida() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Saida saida = new Saida();
            saida.setVisible(true);
            desktopPane.add(saida);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException erro1) {
            JOptionPane.showMessageDialog(desktopPane, "Erro de Layout \n" + erro1.getMessage());

        }

    }

    protected void chamaEntradaDados() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            EntradaSalario entrada = new EntradaSalario();
            entrada.setVisible(true);
            desktopPane.add(entrada);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException erro1) {
            JOptionPane.showMessageDialog(desktopPane, "Erro de Layout \n" + erro1.getMessage());

        }
    }

    protected void chamaTelaLogin() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);
            desktopPane.add(telaLogin);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException erro1) {
            JOptionPane.showMessageDialog(desktopPane, "Erro de Layout \n" + erro1.getMessage());

        }

    }


}



