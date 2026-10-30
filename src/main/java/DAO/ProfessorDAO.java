package DAO;

import Model.Professor;
import java.util.List;

public interface ProfessorDAO {

    void addDam2(Professor professor);

    void deleteDam2(int id);

    void updateDam2(int id, String nom, String cognom);

    List<Professor> readDam2();
}
