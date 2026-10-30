package Controller;

import DAO.ProfessorDAO;
import Model.Professor;

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



}