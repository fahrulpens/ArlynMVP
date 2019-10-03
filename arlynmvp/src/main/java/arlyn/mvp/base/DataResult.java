package arlyn.mvp.base;

import java.util.List;


public class DataResult<T> {
    /**
     * Kode hasil query
     */
    private int code;

    /**
     * Pesan dalam bahasa manusiawi
     */
    private String message;

    /**
     * Pesan Teknis
     * */
    private String debugMessage;

    /**
     * Data hasil query (single)
     */
    private T data;

    /**
     * Data hasil query (multiple)
     */
    private List<T> datas;

    private DataPage dataPage;

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataPage getDataPage() {
        return dataPage;
    }

    public void setDataPage(DataPage dataPage) {
        this.dataPage = dataPage;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    @Override
    public String toString() {
        return "DataResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", datas=" + datas +
                '}';
    }
}
