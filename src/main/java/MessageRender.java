public interface MessageRender {
    void RenderMessage(String message);

    void setMessageProvider(MessageProvider mp);

    MessageProvider getMessageProvider();
}
