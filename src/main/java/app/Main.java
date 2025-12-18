package main.java.app;

import main.java.model.Tarefa;
import main.java.repository.TarefaRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        TarefaRepository tarefaRepo = new TarefaRepository();

        tarefaRepo.exibirMenu();
    }
}