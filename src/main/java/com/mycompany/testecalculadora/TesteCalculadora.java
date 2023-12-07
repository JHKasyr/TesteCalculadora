package com.mycompany.testecalculadora;

import java.util.Scanner;

public class TesteCalculadora {

    int n1;
    int n2;

    public TesteCalculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int adicao() {
        return n1 + n2;
    }

    public int subtracao() {
        return n1 - n2;
    }

    public int multiplicacao() {
        return n1 * n2;
    }

    public int divisao() {
        return n1 / n2;
    }
    public static void main(String[] args) {
        TesteCalculadora calculadora = new TesteCalculadora(0,0);
        calculadora.adicao();
        calculadora.subtracao();
        calculadora.divisao();
        calculadora.multiplicacao();
    }
}

