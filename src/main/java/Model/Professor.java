package Model;


public class Professor {
    private int id;
    private String nom;
    private String cognom;


    public Professor(String nom, String cognom) {
        this.id = 0;
        this.nom = nom;
        this.cognom = cognom;
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


    public String getCognom() {
        return cognom;
    }


    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
}