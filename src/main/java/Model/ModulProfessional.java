package Model;

public class ModulProfessional {
    private int id;
    private String nom;
    private int idProfessor;
    private String nomProfessor;

    public ModulProfessional(String nom, int idProfessor) {
        this.id = 0;
        this.nom = nom;
        this.idProfessor = idProfessor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNomProfessor() {
        return nomProfessor;
    }

    public void setNomProfessor(String nomProfessor) {
        this.nomProfessor = nomProfessor;
    }
}