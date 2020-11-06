package com.Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public TelaCadastro() {
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
                                                    String senha1 = String.valueOf(PwordSenha1.getPassword());
                                                    String senha2 = String.valueOf(PwordSenha2Conf.getPassword());
                                                   if (senha1.equals(senha2)) {
                                                       System.out.println("Teste");

                                                       Cadastro_LoginBDCache.AddNome(TxtEmail.getText());
                                                       Cadastro_LoginBDCache.AddEmails(TxtNome.getText());
                                                       Cadastro_LoginBDCache.AddSenha(senha1);
                                                        JOptionPane.showMessageDialog(null,"Conta criada com sucesso");



                                                   }else{
                                                       System.out.println("N passou pelo if");
                                                       System.out.println(PwordSenha1.getPassword());
                                                       System.out.println(PwordSenha2Conf.getPassword());

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
