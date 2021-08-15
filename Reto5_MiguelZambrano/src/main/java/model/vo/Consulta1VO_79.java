package model.vo;

public class Consulta1VO_79{
    private Integer id_proyecto;
    private String fecha_inicio; 
    private String banco_vinculado;
    private String serial;

    public Consulta1VO_79(){
        
    }

    public Consulta1VO_79(Integer id_proyecto){
        this.id_proyecto=id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }

    public String getBanco_vinculado() {
        return banco_vinculado;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getSerial() {
        return serial;
    }
}
