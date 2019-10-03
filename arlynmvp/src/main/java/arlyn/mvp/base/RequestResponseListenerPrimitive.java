package arlyn.mvp.base;


public interface RequestResponseListenerPrimitive {
    void onSuccess(String result);

    void onFailure(Throwable throwable);
}
