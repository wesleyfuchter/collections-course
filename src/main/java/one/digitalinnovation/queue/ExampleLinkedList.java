package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        //Adiciona 4 elementos na fila
        filaBanco.add("Pedro");
        filaBanco.add("Edson");
        filaBanco.add("João");
        filaBanco.add("Jonas");

        System.out.println(filaBanco);

        //Retorna o primeira da lista, mas não remove
        String primeiroNaFila = filaBanco.peek();

        System.out.println(primeiroNaFila);

        System.out.println(filaBanco);

        //Retorna o primeira da lista, removendo
        String primeiroNaFilaRemovido = filaBanco.poll();

        System.out.println(primeiroNaFilaRemovido);

        System.out.println(filaBanco);

        //Retorna o tamanho do fila
        System.out.println(filaBanco.size());

        //Navega em todos os itens da fila
        for (String proximoNaFila: filaBanco) {
            System.out.println(proximoNaFila);
        }

        //Navega em todos os itens da fila usando iterator
        Iterator<String> iterator = filaBanco.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
