package pe.edu.ulima.promul.model.dto;

import java.util.List;

import pe.edu.ulima.promul.model.beans.Promo;

/**
 * Created by Jaime on 9/12/2016.
 */

public class ListadoPromoResponse {
    private List<Promo> lPromos;

    public ListadoPromoResponse() {
    }

    public ListadoPromoResponse(List<Promo> lPromos) {
        this.lPromos = lPromos;
    }

    public List<Promo> getlPromos() {
        return lPromos;
    }

    public void setlPromos(List<Promo> lPromos) {
        this.lPromos = lPromos;
    }
}
