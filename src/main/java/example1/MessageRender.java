package example1;

public interface MessageRender {
    void renderMessage();

    void setMessageProvider(MessageProvider mp);

    MessageProvider getMessageProvider();
}
