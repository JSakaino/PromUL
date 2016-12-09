package pe.edu.ulima.promul.model.beans;

/**
 * Created by sodm on 11/28/2016.
 */

public class TipoPromo {
    private long idTipoPromo;
    private String titulo;
    private String urlImagen;

    public TipoPromo(long idTipoPromo,String titulo, String urlImagen) {
        this.idTipoPromo = idTipoPromo;
        this.titulo = titulo;
        this.urlImagen = urlImagen;
    }

    public long getIdTipoPromo() {
        return idTipoPromo;
    }

    public void setIdTipoPromo(int idTipoPromo) {
        this.idTipoPromo = idTipoPromo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
