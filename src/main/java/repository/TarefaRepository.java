package main.java.repository;

import main.java.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {
    private List<Tarefa> tarefas =  new ArrayList<Tarefa>();

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void criarTarefa(String descricao) {
        try {
            Tarefa tarefa = new Tarefa();
            tarefa.setDescricao(descricao);
            tarefas.add(tarefa);
            System.out.println("✅ Tarefa criada com sucesso!");
        } catch (Exception e) {
            System.out.println("❌ Erro ao criar tarefa!");
        }
    }
}
