package com.Classes;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;

public class TelaCadastro extends JInternalFrame {
    private JPanel panel1;
    private JTextField TxtNome;
    private JTextField TxtEmail;
    private JPasswordField PwordSenha1;
    private JPasswordField PwordSenha2Conf;
    private JButton criarContaButton;
    private JLabel LblNome;
    private JLabel LblEmail;
    private JLabel LblSenha;
    private JLabel LblSenha2;

    TelaCadastro() {
        setVisible(true);
        setSize(640, 480);
        setTitle("Cadastro");
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        add(panel1);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        criarContaButton.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {
                                                   if (PwordSenha1.getPassword() == PwordSenha2Conf.getPassword()) {
                                                       System.out.println("Teste");
                                                       Cadastro_LoginBDCache.setSolicitacao(Cadastro_LoginBDCache.solicitacao + 1);
                                                       Cadastro_LoginBDCache.setEmail(TxtEmail.getText());
                                                       Cadastro_LoginBDCache.setNomes(TxtNome.getText());
                                                       Cadastro_LoginBDCache.setSenhas(PwordSenha1.getPassword());
                                                        JOptionPane.showMessageDialog(null,"Conta criada com sucesso");
                                                   }
                                               }

                                           }
        );

    }

    public JTextField getTxtEmail() {
        return TxtEmail;
    }

    public JTextField getTxtNome() {
        return TxtNome;
    }

    public JPasswordField getPwordSenha1() {
        return PwordSenha1;
    }
}
