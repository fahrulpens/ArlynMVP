package arlyn.mvp.base;

public class DataPage {
    private int totalData;
    private int totalPage;
    private int currentPage;
    private int nextPage;

    public int getTotalData() {
        return totalData;
    }

    public void setTotalData(int totalData) {
        this.totalData = totalData;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    @Override
    public String toString() {
        return "DataPage{" +
                "totalData=" + totalData +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                ", nextPage=" + nextPage +
                '}';
    }
}
