package pe.edu.ulima.promul.model;

/**
 * Created by sodm on 11/28/2016.
 */

public class TipoPromo {
    private String titulo;
    private String urlImagen;

    public TipoPromo(String titulo, String urlImagen) {
        this.titulo = titulo;
        this.urlImagen = urlImagen;
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
