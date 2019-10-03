package arlyn.mvp.base;


public interface RequestResponseListener <T> {
    void onSuccess(DataResult<T> result);

    void onFailure(Throwable throwable);
}
