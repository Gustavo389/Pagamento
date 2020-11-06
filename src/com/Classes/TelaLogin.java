package com.Classes;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JInternalFrame {
    private JPanel Background;
    private JTextField TxtUsuario;
    private JButton fazerLoginButton;
    private JButton criarUmaContaButton;
    private JPasswordField pwordSenha;
    private JPanel PnlLogin;
    private JPanel PnlCadastroCard;
    private JLabel LblcardCadastro;
    private JLabel LblLogin;
    private JLabel LblUsuario;
    private JLabel LblSenha;
    private JPanel Opcoes;

    TelaLogin() {
        setVisible(true);
        setSize(640, 480);
        setTitle("Login");
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        add(Background);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setVisible(true);


    }
}
