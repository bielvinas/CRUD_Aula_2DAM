package Controller;

import DAO.ProfessorDAO;
import Model.Professor;

import java.util.List;

public class ProfessorController {
    private final ProfessorDAO professorDAO;

    public ProfessorController(ProfessorDAO professorDAO) {
        this.professorDAO = professorDAO;
    }

    public void altaProfessor(Professor professor) {
        professorDAO.addDam2(professor);
    }

    public void eliminarProfessor(int id) {
        professorDAO.deleteDam2(id);
    }

    public void actualitzarProfessor(int id, String nom, String cognom) {
        professorDAO.updateDam2(id, nom, cognom);
    }

    public List<Professor> llistaProfessor() {
        return professorDAO.readDam2();
    }

}