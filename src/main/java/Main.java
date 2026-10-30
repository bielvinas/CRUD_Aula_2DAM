import Controller.ModulProfessionalController;
import Controller.ProfessorController;
import DAO.ModulProfessionalDAO;
import DAO.ProfessorDAO;
import DAOImpl.ModulProfessionalDAOImpl;
import DAOImpl.ProfessorDAOImpl;
import View.ModulProfessionalView;
import View.ProfessorView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcio = 0;

        while (opcio != 3) {
            System.out.println("MENÚ:");
            System.out.println("1 - Gestionar professors");
            System.out.println("2 - Gestionar mòduls professionals");
            System.out.println("3 - Sortir");
            System.out.print("Escull una opció: ");
            try {
                opcio = Integer.parseInt(scanner.nextLine());
                if (opcio < 1 || opcio > 3) {
                    System.err.println("Error. Has d'entrar números de l'1 al 3.\n");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. Has d'entrar un número vàlid.\n");
            }

            switch (opcio) {
                case 1:
                    menuGestio(scanner, "professors");
                    break;
                case 2:
                    menuGestio(scanner, "mòduls professionals");
                    break;
                case 3:
                    System.out.println("Adéu!");
                    break;
            }
        }
    }

    //menú per a professors i mòduls
    public static void menuGestio(Scanner scanner, String gestio) {
        int opcio = 0;

        ProfessorDAO professorDAO = new ProfessorDAOImpl();
        ProfessorController professorController = new ProfessorController(professorDAO);
        ProfessorView professorView = new ProfessorView(professorController);

        ModulProfessionalDAO modulProfessionalDAO = new ModulProfessionalDAOImpl();
        ModulProfessionalController modulProfessionalController = new ModulProfessionalController(modulProfessionalDAO);
        ModulProfessionalView modulProfessionalView = new ModulProfessionalView(modulProfessionalController);

        while (opcio != 5) {
            System.out.println("MENÚ " + gestio);
            System.out.println("1 - Alta");
            System.out.println("2 - Llistar");
            System.out.println("3 - Actualitzar");
            System.out.println("4 - Eliminar");
            System.out.println("5 - Tornar al menú");
            System.out.print("Escull una opció: ");
            try {
                opcio = Integer.parseInt(scanner.nextLine());
                if (opcio < 1 || opcio > 5) {
                    System.err.println("Error. Has d'entrar números de l'1 al 5.\n");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error. Has d'entrar un número vàlid.\n");
            }

            switch (opcio) {
                case 1:
                    System.out.println("Alta de " + gestio);
                    if (gestio.equals("professors")) {
                        professorView.demanaProfessor();
                    }
                    else if (gestio.equals("mòduls professionals")) {
                        modulProfessionalView.demanaModulProfessional();
                    }
                    break;
                case 2:
                    if (gestio.equals("professors")) {
                        professorView.llistarTotsProfessors();
                    }
                    else if (gestio.equals("mòduls professionals")) {
                        modulProfessionalView.llistarTotsModulsProfessionals();
                    }
                    System.out.println("Llistar " + gestio);
                    break;
                case 3:
                    System.out.println("Actualitzar " + gestio);
                    if (gestio.equals("professors")) {
                        professorView.llistarTotsProfessors();
                        professorView.demanaIdProfessorActualitzar();
                    }
                    else if (gestio.equals("mòduls professionals")) {
                        modulProfessionalView.llistarTotsModulsProfessionals();
                        modulProfessionalView.demanaIdModulProfessionalActualitzar();
                    }
                    break;
                case 4:
                    System.out.println("Eliminar " + gestio);
                    if (gestio.equals("professors")) {
                        professorView.llistarTotsProfessors();
                        professorView.demanaIdProfessorEliminar();
                    }
                    else if (gestio.equals("mòduls professionals")) {
                        modulProfessionalView.llistarTotsModulsProfessionals();
                        modulProfessionalView.demanaIdModulProfessionalEliminar();
                    }
                    break;
                case 5:
                    break;
            }
        }
    }
}