package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4_79 {  
    private final Consulta1_79Dao consulta1_79Dao;
    private final Consulta2_79Dao consulta2_79Dao;
    private final Consulta3_79Dao consulta3_79Dao;

    public ControladorRequerimientosReto4_79(){
        this.consulta1_79Dao=new Consulta1_79Dao();
        this.consulta2_79Dao=new Consulta2_79Dao();
        this.consulta3_79Dao=new Consulta3_79Dao();
    }

    public ArrayList<Consulta1VO_79> realizarConsulta1() throws SQLException {
        return consulta1_79Dao.consulta1DAO();
    }

    public ArrayList<Consulta2VO_79> realizarConsulta2() throws SQLException {
        return consulta2_79Dao.consulta2DAO();
    }

    public ArrayList<Consulta3VO_79> realizarConsulta3() throws SQLException {
        return consulta3_79Dao.consulta3DAO();
    }
    
}
