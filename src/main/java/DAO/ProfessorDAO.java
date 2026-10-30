package DAO;

import Model.Professor;

public interface ProfessorDAO {

    void addDam2(Professor professor);

    void deleteDam2(int id);

    void updateDam2(int id, String nom, String cognom);
}
