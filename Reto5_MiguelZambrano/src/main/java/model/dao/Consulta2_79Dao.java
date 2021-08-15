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

public class Consulta2_79Dao {
    public ArrayList<Consulta2VO_79> consulta2DAO() throws SQLException {
        ArrayList<Consulta2VO_79> response = new ArrayList<Consulta2VO_79>();
        try (Connection connection = JDBCUtilities.getConnection();
                PreparedStatement statement = connection.prepareStatement("SELECT l.Nombre, l.Salario, l.Salario*0.08 as deducible, l.Primer_Apellido ||'-'|| l.Segundo_apellido as apellidos FROM Lider l WHERE l.Salario>=500000 and l.Salario<=650000");
                ResultSet rset = statement.executeQuery()) {

            while (rset.next()) {
                Consulta2VO_79 lideres = new Consulta2VO_79();

                lideres.setNombre(rset.getString("Nombre"));
                lideres.setSalario(rset.getInt("Salario"));
                lideres.setDeducible(rset.getString("deducible"));
                lideres.setApellidos(rset.getString("apellidos"));

                response.add(lideres);
            }
            rset.close();
            statement.close();
        }
        return response;
    }  
}
