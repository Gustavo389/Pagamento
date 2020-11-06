package com.Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JInternalFrame {
    private JPanel Background;
    private JTextField TxtEmail;
    private JButton fazerLoginButton;
    private JButton criarUmaContaButton;
    private JPasswordField pwordSenha;
    private JPanel PnlLogin;
    private JPanel PnlCadastroCard;
    private JLabel LblcardCadastro;
    private JLabel LblLogin;
    private JLabel LblEmail;
    private JLabel LblSenha;
    private JPanel Opcoes;

    public TelaLogin() {
        setVisible(true);
        setSize(640, 480);
        setTitle("Login");
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        add(Background);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        fazerLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Cadastro_LoginBDCache.getEmails().size();
                int i = 0;
                if (TxtEmail.getText() != Cadastro_LoginBDCache.getEmails().get(i)) {
                    for ( i = 0; i < index; i++) {
                        System.out.println("Procurando Cadastro...");
                        System.out.println(Cadastro_LoginBDCache.getEmails().get(i));
                    }
                    System.out.println("Senha ");
                        System.out.println("Senha ");
                        String senha = String.valueOf(pwordSenha);
                        System.out.println("Senha " + senha);
                        if (senha != Cadastro_LoginBDCache.getSenhas().get(i)) {
                            System.out.println("if");
                            JOptionPane.showMessageDialog(null, "Senha Incorreta\n Insira Novamente a sua senha");
                        } else {
                            System.out.println("else");
                            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                        }



                }
                if (TxtEmail.getText() == Cadastro_LoginBDCache.getEmails().get(i)) {
                    String senha = String.valueOf(pwordSenha);
                    System.out.println("Senha " + senha);
                    if (senha != Cadastro_LoginBDCache.getSenhas().get(i)) {
                        System.out.println("if");
                        JOptionPane.showMessageDialog(null, "Senha Incorreta\n Insira Novamente a sua senha");
                    } else {
                        System.out.println("else");
                        JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                    }


                }
            }

        });}

}

