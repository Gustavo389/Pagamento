package com.Classes;

public class Sistema {
    private static double horasTrabalhadas;
    private static double valorpHora;
    private static int numdeDependentes;

    public static void setHorasTrabalhadas(double horasTrabalhadas) {
        Sistema.horasTrabalhadas = horasTrabalhadas;
    }

    public static void setNumdeDependentes(int numdeDependentes) {
        Sistema.numdeDependentes = numdeDependentes;
    }

    public static void setValorpHora(double valorpHora) {
        Sistema.valorpHora = valorpHora;
    }

    public static double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public static int getNumdeDependentes() {
        return numdeDependentes;
    }

    public static double getValorpHora() {
        return valorpHora;
    }

    public static double calculoSalarioBruto() {
        double SalarioBruto = horasTrabalhadas * valorpHora + 50 * numdeDependentes;
        return SalarioBruto;
    }

    public static double calculoDescontoINSS() {
        double DescontoINSS = 0;
        if (calculoSalarioBruto() <= 1247.70) {
            DescontoINSS = calculoSalarioBruto() * 8 / 100;
        }
        if (calculoSalarioBruto() >= 1247.71 && calculoSalarioBruto() < 2079.50) {
            DescontoINSS = calculoSalarioBruto() * 9 / 100;
        }
        if (calculoSalarioBruto() >= 2079.51 && calculoSalarioBruto() < 4159.00) {
            DescontoINSS = calculoSalarioBruto() * 11 / 100;
        }
        if (calculoSalarioBruto() > 4159) {
            DescontoINSS = calculoSalarioBruto() - 457.28;
        }
        return DescontoINSS;
    }

    public static double calculoDescontoIR() {
        double DescontoIR = 0;
        if (calculoSalarioBruto() < 700) {
            DescontoIR = 0;
        }
        if (calculoSalarioBruto() >= 700 && calculoSalarioBruto() < 1000) {
            DescontoIR = calculoSalarioBruto() * 5 / 100;

        }
        if (calculoSalarioBruto() >= 1000) {
            DescontoIR = calculoSalarioBruto() * 7 / 100;

        }
        return DescontoIR;
    }

    public static double calculoSalarioLiquido() {
        double SalarioLiquido = 0;
        SalarioLiquido = calculoSalarioBruto() - calculoDescontoINSS() - calculoDescontoIR();
        return SalarioLiquido;
    }

    public static void sout(String texto) {
        System.out.println(texto);
    }

    public static void printar() {
        sout("Horas " + horasTrabalhadas);
        sout("ValorpHora " + valorpHora);
        sout("Num de Dependentes " + numdeDependentes);
        sout("Bruto " + calculoSalarioBruto());
        sout("INSS " + calculoDescontoINSS());
        sout("IR " + calculoDescontoIR());
        sout("SalarioLiquido " + calculoSalarioLiquido());
    }
}
