package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta3_79Dao {
    public ArrayList<Consulta3VO_79> consulta3DAO() throws SQLException {
        ArrayList<Consulta3VO_79> response = new ArrayList<Consulta3VO_79>();
        try (Connection connection = JDBCUtilities.getConnection();
                PreparedStatement statement = connection.prepareStatement("SELECT p.ID_Proyecto, l.Nombre ||' '|| l.Primer_Apellido as nom_ape FROM Proyecto p JOIN Lider l ON l.ID_Lider = p.ID_Lider WHERE p.Banco_Vinculado = 'Colpatria'");
                ResultSet rset = statement.executeQuery()) {

            while (rset.next()) {
                Consulta3VO_79 nombreApellidos = new Consulta3VO_79();

                nombreApellidos.setId_proyecto(rset.getInt("ID_Proyecto"));
                nombreApellidos.setNom_ape(rset.getString("nom_ape"));

                response.add(nombreApellidos);
            }
            rset.close();
            statement.close();
        }
        return response;
    }  
}
