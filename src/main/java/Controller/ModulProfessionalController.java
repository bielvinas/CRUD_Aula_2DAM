package Controller;

import DAO.ModulProfessionalDAO;
import Model.ModulProfessional;
import java.util.List;

public class ModulProfessionalController {
    private final ModulProfessionalDAO modulProfessionalDAO;

    public ModulProfessionalController(ModulProfessionalDAO modulProfessionalDAO) {
        this.modulProfessionalDAO = modulProfessionalDAO;
    }

    public void altaModulProfessional(ModulProfessional modul) {
        modulProfessionalDAO.addDam2(modul);
    }

    public void eliminarModulProfessional(int id) {
        modulProfessionalDAO.deleteDam2(id);
    }

    public void actualitzarModulProfessional(int id, String nom, int idProfessor) {
        modulProfessionalDAO.updateDam2(id, nom, idProfessor);
    }

    public List<ModulProfessional> llistaModulProfessional() {
        return modulProfessionalDAO.readDam2();
    }

}