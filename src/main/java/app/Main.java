package main.java.app;

import main.java.model.Tarefa;
import main.java.repository.TarefaRepository;

public class Main {
    public static void main(String[] args) {
        TarefaRepository tarefaRepository = new TarefaRepository();
        tarefaRepository.criarTarefa("Estudar Java");
        tarefaRepository.criarTarefa("Estudar PHP");
        tarefaRepository.criarTarefa("Estudar C++");
        tarefaRepository.criarTarefa("Estudar Cobol");
        tarefaRepository.criarTarefa("Estudar Ruby");
        tarefaRepository.criarTarefa("Estudar Python");

        tarefaRepository.listarTarefas();

    }
}