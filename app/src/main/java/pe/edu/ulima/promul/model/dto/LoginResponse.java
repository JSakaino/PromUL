package pe.edu.ulima.promul.model.dto;

/**
 * Created by Jaime on 8/12/2016.
 */

public class LoginResponse {

    private String msg;

    public LoginResponse() {
    }

    public LoginResponse(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
