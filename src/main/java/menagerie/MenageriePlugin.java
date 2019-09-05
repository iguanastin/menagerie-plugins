package menagerie;

public interface MenageriePlugin {

    boolean addErrorListener(ErrorListener listener);

    boolean removeErrorListener(ErrorListener listener);

    void postMessageToListeners(String msg);

    void postErrorToListeners(String msg, Exception e);

    String getPluginName();

    void close();

}
