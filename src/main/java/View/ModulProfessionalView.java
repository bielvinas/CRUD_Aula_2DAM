package View;

import Controller.ModulProfessionalController;
import Model.ModulProfessional;
import java.util.List;
import java.util.Scanner;

public class ModulProfessionalView {
    private final Scanner scanner;
    private final ModulProfessionalController controlador;

    public ModulProfessionalView(ModulProfessionalController controlador) {
        this.scanner = new Scanner(System.in);
        this.controlador = controlador;
    }

    public void demanaModulProfessional() {
        System.out.print("Introdueix el nom del mòdul: ");
        String nom = scanner.nextLine();

        System.out.print("Introdueix el id del professor del mòdul: ");
        int idProfessor = Integer.parseInt(scanner.nextLine());

        ModulProfessional modul = new ModulProfessional(nom, idProfessor);
        controlador.altaModulProfessional(modul);
    }

    public void demanaIdModulProfessionalEliminar() {
        System.out.print("Introdueix el id del mòdul: ");
        int id = Integer.parseInt(scanner.nextLine());

        controlador.eliminarModulProfessional(id);
    }

    public void demanaIdModulProfessionalActualitzar() {
        System.out.print("Introdueix el id del mòdul: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Introdueix el nom del mòdul actualitzat: ");
        String nom = scanner.nextLine();

        System.out.print("Introdueix el id del professor actualitzat: ");
        int idProfessor = Integer.parseInt(scanner.nextLine());

        controlador.actualitzarModulProfessional(id, nom, idProfessor);
    }

    public void llistarTotsModulsProfessionals() {
        List<ModulProfessional> llistaModuls = controlador.llistaModulProfessional();
        int id = 0;
        String nom = "";
        String nomProfessor = "";

        for (ModulProfessional modul : llistaModuls) {
            id = modul.getId();
            nom = modul.getNom();
            nomProfessor = modul.getNomProfessor();
            System.out.println("  " + id + ".  " + nom + " - Professor: " + nomProfessor);
        }

    }
}