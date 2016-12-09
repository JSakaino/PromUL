package pe.edu.ulima.promul.model.dto;

/**
 * Created by Jaime on 9/12/2016.
 */

public class PromoResponse {
    private String idPromo;
    private String titulo;
    private String descripcion;
    private String urlImagen;
    private String condiciones;
    private String vigencia;
    private int idTipoPromo;

    public PromoResponse() {
    }

    public PromoResponse(String idPromo, String titulo, String descripcion, String urlImagen, String condiciones, String vigencia, int idTipoPromo) {
        this.idPromo = idPromo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.condiciones = condiciones;
        this.vigencia = vigencia;
        this.idTipoPromo = idTipoPromo;
    }

    public String getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(String idPromo) {
        this.idPromo = idPromo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public int getIdTipoPromo() {
        return idTipoPromo;
    }

    public void setIdTipoPromo(int idTipoPromo) {
        this.idTipoPromo = idTipoPromo;
    }
}
