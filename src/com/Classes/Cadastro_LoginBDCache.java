package com.Classes;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Arrays;

public class Cadastro_LoginBDCache {
    protected static int solicitacao = 1;
    private static java.lang.String Nomes = Arrays.toString(new String[solicitacao]);
    private static char[] Senhas = new char[solicitacao];
    private static java.lang.String Email = Arrays.toString(new String[solicitacao]);

    static void setSenhas(char[] senhas) {
        Senhas = senhas;
    }

    public static void setSolicitacao(int solicitacao) {
        Cadastro_LoginBDCache.solicitacao = solicitacao;
    }

    public static void setNomes(java.lang.String text) {
        Nomes = text;
    }

    public static void setEmail(java.lang.String text) {
    Email = text;
    }
}
