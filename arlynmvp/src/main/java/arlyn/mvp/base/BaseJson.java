package arlyn.mvp.base;

public class BaseJson {
    private String ID = "0";

    private String statusMsg;

    private String statusCode;

    public String getStatusMsg() {
        return statusMsg.replace("error:", "");
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
