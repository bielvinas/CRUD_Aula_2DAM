package DAOImpl;
import DAO.ModulProfessionalDAO;
import Model.ModulProfessional;
import Utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModulProfessionalDAOImpl implements ModulProfessionalDAO {

    @Override
    public void addDam2(ModulProfessional modul) {
        String sql = "INSERT INTO ModulsProfessionals (nom, id_professor) VALUES (?, ?)";

        try (Connection conn = Utils.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, modul.getNom());
            stmt.setInt(2, modul.getIdProfessor());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDam2(int id) {
        String sql = "DELETE FROM ModulsProfessionals WHERE id = ?";

        try (Connection conn = Utils.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int files = stmt.executeUpdate();

            if (files == 0) {
                System.out.println("No s'ha trobat cap mòdul amb aquest id.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDam2(int id, String nom, int idProfessor) {
        String sql = "UPDATE ModulsProfessionals SET nom = ?, id_professor = ? WHERE id = ?";

        try (Connection conn = Utils.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nom);
            stmt.setInt(2, idProfessor);
            stmt.setInt(3, id);

            int files = stmt.executeUpdate();

            if (files == 0) {
                System.out.println("No s'ha trobat cap mòdul amb aquest id.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ModulProfessional> readDam2() {
        List<ModulProfessional> moduls = new ArrayList<>();

        // JOIN per agafar també el nom del professor
        String sql = "SELECT m.id, m.nom, m.id_professor, p.nom AS nom_professor "
                + "FROM ModulsProfessionals m "
                + "JOIN professor p ON m.id_professor = p.id";

        try (Connection conn = Utils.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ModulProfessional m = new ModulProfessional(rs.getString("nom"), rs.getInt("id_professor"));
                m.setId(rs.getInt("id"));
                m.setNomProfessor(rs.getString("nom_professor"));
                moduls.add(m);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return moduls;
    }
}