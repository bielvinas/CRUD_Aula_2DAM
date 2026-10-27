package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {
    private static final String URL = "jdbc:mysql://localhost:3306/dam2";
    private static final String USUARI = "root";
    private static final String CONTRASENYA = "1234";

    public static Connection obtenirConnexio() throws SQLException {
        return DriverManager.getConnection(URL,USUARI,CONTRASENYA);
    }
}

