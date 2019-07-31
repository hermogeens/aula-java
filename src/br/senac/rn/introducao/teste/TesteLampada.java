package br.senac.rn.introducao.teste;

import br.senac.rn.introducao.Lampada;

public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("branco",80);

        lampada.acende();

        System.out.println(lampada);
    }
}
