package menagerie;

public interface ErrorListener {

    void postMessage(String msg);

    void postException(String msg, Exception e);

}
