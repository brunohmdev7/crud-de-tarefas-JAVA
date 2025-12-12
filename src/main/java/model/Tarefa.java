package main.java.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Tarefa {
    private UUID id;
    private String descricao;
    private boolean concluida;
    public List<Tarefa> tarefas =  new ArrayList<Tarefa>();

    public UUID getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Tarefa() {
        this.id = UUID.randomUUID();
    }

    public Tarefa(String descricao, boolean concluida) {
        this.id = UUID.randomUUID();
        this.descricao = descricao;
        this.concluida = concluida;
    }

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
