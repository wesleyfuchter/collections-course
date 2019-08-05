package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        // Adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        // Altera o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");

        // Remove o esporte da posição 2
        esportes.remove(2);

        // Remove o esporte Handebol do vetor
        esportes.remove("Handebol");

        System.out.println(esportes);

        // Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        // Navega nos esportes
        for (String esporte: esportes) {
            System.out.println(esporte);
        }

    }

}
