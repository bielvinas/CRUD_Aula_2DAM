package DAO;

import Model.ModulProfessional;
import java.util.List;

public interface ModulProfessionalDAO {

    void addDam2(ModulProfessional modul);

    void deleteDam2(int id);

    void updateDam2(int id, String nom, int idProfessor);

    List<ModulProfessional> readDam2();
}