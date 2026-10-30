package DAOImpl;

import DAO.ProfessorDAO;
import Model.Professor;
import Utils.Utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAOImpl implements ProfessorDAO {

    @Override
    public void addDam2(Professor professor) {
        try (Connection conn = Utils.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO professor (nom, cognoms) VALUES (?, ?)")) {

            stmt.setString(1, professor.getNom());
            stmt.setString(2, professor.getCognom());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDam2(int id) {
        try (Connection conn = Utils.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM professor WHERE id = ?")) {

            stmt.setInt(1, id);
            int files = stmt.executeUpdate();

            if (files == 0) {
                System.out.println("No s'ha trobat cap professor amb aquest id.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDam2(int id, String nom, String cognoms) {
        String sql = "UPDATE professor SET nom = ?, cognoms = ? WHERE id = ?";

        try (Connection conn = Utils.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nom);
            stmt.setString(2, cognoms);
            stmt.setInt(3, id);

            int files = stmt.executeUpdate();

            if (files == 0) {
                System.out.println("No s'ha trobat cap professor amb aquest id.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Professor> readDam2() {
        List<Professor> professors = new ArrayList<>();
        String sql = "SELECT * FROM professor";

        try (Connection conn = Utils.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Professor p = new Professor(rs.getString("nom"), rs.getString("cognoms"));
                p.setId(rs.getInt("id"));
                professors.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return professors;
    }

}
