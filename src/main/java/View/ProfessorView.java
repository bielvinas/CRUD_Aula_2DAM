package View;

import Controller.ProfessorController;
import Model.Professor;

import java.util.List;
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

    public void demanaIdProfessorEliminar() {
        System.out.print("Introdueix el id del professor: ");
        int id = Integer.parseInt(scanner.nextLine());

        controlador.eliminarProfessor(id);
    }

    public void demanaIdProfessorActualitzar() {
        System.out.print("Introdueix el id del professor: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Introdueix el nom del professor actualitzat: ");
        String nom = scanner.nextLine();

        System.out.print("Introdueix els cognoms del professor actualitzat: ");
        String cognom = scanner.nextLine();

        controlador.actualitzarProfessor(id,nom,cognom);
    }

    public void llistarTotsProfessors() {
        List<Professor> llistaProfessors = controlador.llistaProfessor();
        int id = 0;
        String nom = "";
        String cognom = "";

        for (Professor professor : llistaProfessors) {
            id = professor.getId();
            nom = professor.getNom();
            cognom = professor.getCognom();
            System.out.println("  " + id + ".  " + nom + " " + cognom);
        }

    }
}