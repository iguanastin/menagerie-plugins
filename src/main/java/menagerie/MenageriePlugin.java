package menagerie;

public interface MenageriePlugin {

    boolean addErrorListener(ErrorListener listener);

    boolean removeErrorListener(ErrorListener listener);

    void postExceptionToListeners(Exception e);

    void postMessageToListeners(String msg);

    String getPluginName();

    void close();

}
