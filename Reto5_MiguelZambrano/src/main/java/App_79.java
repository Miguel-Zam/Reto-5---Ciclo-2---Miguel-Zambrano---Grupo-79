import java.awt.EventQueue;
import view.*;

/**
 * Persistencia Proyectos Construcción
 *
 */
public class App_79 {
    public static void main( String[] args ){        
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                try{
                    VistaRequerimientosReto4_79 frame = new VistaRequerimientosReto4_79();
                    frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}
