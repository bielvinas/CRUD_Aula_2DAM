package DAOImpl;

import DAO.ProfessorDAO;
import Model.Professor;
import Utils.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
