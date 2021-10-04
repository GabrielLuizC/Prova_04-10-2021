package Prova;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sessao ses = new Sessao(303, "Noite", 12.00);
        Filme fil = new Filme("Acao", "Homem-Aranha", 120);

        System.out.println(ses.toString() + fil.toString());
    }
}
