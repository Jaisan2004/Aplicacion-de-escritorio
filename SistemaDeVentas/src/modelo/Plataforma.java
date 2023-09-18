package modelo;

/**
 *
 * @author USER
 */
public class Plataforma {
    
    private int idPlataforma;
    private String descripcion;
    private int estado;

    public Plataforma() {
        this.idPlataforma = 0;
        this.descripcion = "";
        this.estado = 0;
    }
    
    public Plataforma(int idPlataforma, String descripcion, int estado) {
        this.idPlataforma = idPlataforma;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
