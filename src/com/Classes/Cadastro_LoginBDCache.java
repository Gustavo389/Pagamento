package com.Classes;


import java.util.ArrayList;

public class Cadastro_LoginBDCache {

    private static ArrayList <String> Nomes = new ArrayList<>();
    private static ArrayList <String> Senhas = new ArrayList<>();
    private static ArrayList <String> Emails = new ArrayList<>();



    public static void AddNome(String texto){
        Nomes.add(texto);
    }
    public static void AddSenha(String texto) {
        Senhas.add(texto);
    }
    public static void AddEmails(String texto) {
        Emails.add(texto);
    }

    public  int Posicaotamanho(){
        int index = Nomes.size();
        return index;
    }

    public static ArrayList<String> getEmails() {
        return Emails;
    }

    public static ArrayList<String> getSenhas() {
        return Senhas;
    }
}
