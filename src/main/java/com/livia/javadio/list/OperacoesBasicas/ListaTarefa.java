package com.livia.javadio.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefaList.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String tarefa) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        tarefaList.forEach((t) -> {
            if (t.getDescricao().equalsIgnoreCase(tarefa)) {
                tarefasParaRemover.add(t);
            }
        });
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();
    
        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");
    
        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();
    
        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Trabalhar");
    
        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();
    
        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Estudar para o exame");
    
        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
      }
}
