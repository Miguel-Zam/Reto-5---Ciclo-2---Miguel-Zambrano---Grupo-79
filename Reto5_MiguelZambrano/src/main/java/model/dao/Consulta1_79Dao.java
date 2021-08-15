package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta1_79Dao{
    public ArrayList<Consulta1VO_79> consulta1DAO() throws SQLException{
        ArrayList<Consulta1VO_79> response = new ArrayList<Consulta1VO_79>();
        try (Connection connection = JDBCUtilities.getConnection();
                PreparedStatement statement = connection.prepareStatement("SELECT p.ID_Proyecto , p.Fecha_Inicio, p.Banco_Vinculado, p.Serial FROM Proyecto p WHERE p.ID_Proyecto>4 and p.ID_Proyecto <12");
                ResultSet rset = statement.executeQuery()) {

            while (rset.next()) {
                Consulta1VO_79 proyectos = new Consulta1VO_79();

                proyectos.setId_proyecto(rset.getInt("ID_Proyecto"));
                proyectos.setFecha_inicio(rset.getString("Fecha_Inicio"));
                proyectos.setBanco_vinculado(rset.getString("Banco_Vinculado"));
                proyectos.setSerial(rset.getString("Serial"));

                response.add(proyectos);
            }
            rset.close();
            statement.close();
        }
        return response;
    }  
}
