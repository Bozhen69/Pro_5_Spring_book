package example1;

public interface MessageRender {
    void renderMessage(String message);

    void setMessageProvider(MessageProvider mp);

    MessageProvider getMessageProvider();
}
