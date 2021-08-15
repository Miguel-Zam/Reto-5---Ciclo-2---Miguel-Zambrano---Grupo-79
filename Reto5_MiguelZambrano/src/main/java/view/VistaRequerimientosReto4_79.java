package view;

import controller.*;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.event.*;
//import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JLabel;
//import javax.swing.border.EmptyBorder;

public class VistaRequerimientosReto4_79 extends JFrame{
    
    public static final ControladorRequerimientosReto4_79 controlador = new ControladorRequerimientosReto4_79();

    private JPanel contentPane;
    private JTextArea textArea;

    public VistaRequerimientosReto4_79(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450,200,510,620);
        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbtitulo=new JLabel();
        lbtitulo.setText("UTP - Misión TIC: Ciclo 2 Programación Básica - Reto 5");
        lbtitulo.setBounds(56,14,420,16);
        lbtitulo.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lbtitulo);

        JLabel lbautor=new JLabel();
        lbautor.setText("Presentado por: Miguel Julián Zambrano Gutierrez - Grupo 79");
        lbautor.setBounds(34,38,450,16);
        lbautor.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lbautor);

        JScrollPane scrollPane=new JScrollPane();
        scrollPane.setBounds(28,70,442,455);
        contentPane.add(scrollPane);

        textArea=new JTextArea();
        scrollPane.setViewportView(textArea);

        JButton btnConsulta1=new JButton("Consulta 1");
        btnConsulta1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                consulta1();
            }
        });
        btnConsulta1.setBounds(28,537,117,29);
        contentPane.add(btnConsulta1);

        JButton btnConsulta2=new JButton("Consulta 2");
        btnConsulta2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                consulta2();
            }
        });
        btnConsulta2.setBounds(191,537,117,29);
        contentPane.add(btnConsulta2);
    
        JButton btnConsulta3=new JButton("Consulta 3");
        btnConsulta3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                consulta3();
            }
        });
        btnConsulta3.setBounds(352,537,117,29);
        contentPane.add(btnConsulta3);
    }

    public void consulta1(){ 
        try{
            ArrayList<Consulta1VO_79> lista = controlador.realizarConsulta1();

            //Encabezado del resultado
            String tabla1="-----Consulta 1-------\n\n";
            tabla1+="ID_Proyecto\tFecha_Inicio\tBanco_Vinculado\tSerial\n\n";

            //Cada VO cargado, mostrarlo en la vista
            for (Consulta1VO_79 proyecto : lista) {
                tabla1+=proyecto.getId_proyecto()+"\t"+proyecto.getFecha_inicio()+"\t"+proyecto.getBanco_vinculado()+"\t\t"+proyecto.getSerial()+"\n";
            }

            textArea.setText(tabla1);
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }

    public void consulta2(){
        try{
            ArrayList<Consulta2VO_79> lista = controlador.realizarConsulta2();

            //Encabezado del resultado
            String tabla2="-----Consulta 2-------\n\n";
            tabla2+="Nombre\tSalario\tDeducible\t\tApellidos\n\n";
            //Cada VO cargado, mostrarlo en la vista
            for (Consulta2VO_79 lider : lista) {
                tabla2+=lider.getNombre()+"\t"+lider.getSalario()+"\t"+lider.getDeducible()+"0000\t\t"+lider.getApellidos()+"\n";
            }

            textArea.setText(tabla2);
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }


    public void consulta3(){ 
        try{
            ArrayList<Consulta3VO_79> lista = controlador.realizarConsulta3();

            //Encabezado del resultado
            String tabla3="-----Consulta 3-------\n\n";
            tabla3+="ID_Proyecto\tNom_Ape\n\n";

            //Cada VO cargado, mostrarlo en la vista
            for (Consulta3VO_79 nombreApellido : lista) {
                //System.out.printf("%d %s %n", nombreApellido.getId_proyecto(), nombreApellido.getNom_ape());
                tabla3+=nombreApellido.getId_proyecto()+"\t"+nombreApellido.getNom_ape()+"\n";
            }

           textArea.setText(tabla3);
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }
}
