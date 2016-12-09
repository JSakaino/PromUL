package pe.edu.ulima.promul.model.dto;

/**
 * Created by Jaime on 9/12/2016.
 */

public class PromoRequest {
    private String idPromo;

    public PromoRequest() {
    }

    public PromoRequest(String idPromo) {
        this.idPromo = idPromo;
    }

    public String getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(String idPromo) {
        this.idPromo = idPromo;
    }
}
