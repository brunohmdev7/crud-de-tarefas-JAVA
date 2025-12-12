package main.java.app;

import main.java.model.Tarefa;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa();
        Tarefa tarefa2 = new Tarefa();
        Tarefa tarefa3 = new Tarefa();
        tarefa1.criarTarefa("Estudar java");
        tarefa2.criarTarefa("Estudar POO");
        tarefa3.criarTarefa("Estudar Arquitetura");

        Tarefa.listarTarefas();
    }
}