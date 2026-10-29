package View;

import Controller.ProfessorController;
import Model.Professor;

import java.util.Scanner;

public class ProfessorView {
    private final Scanner scanner;
    private final ProfessorController controlador;

    public ProfessorView(ProfessorController controlador) {
        this.scanner = new Scanner(System.in);
        this.controlador = controlador;
    }

    public void demanaProfessor() {
        System.out.print("Introdueix el nom del professor: ");
        String nom = scanner.nextLine();

        System.out.print("Introdueix els cognoms del professor: ");
        String cognom = scanner.nextLine();

        Professor professor = new Professor(nom, cognom);
        controlador.altaProfessor(professor);
    }
}