public class StandardMessageRender implements MessageRender {

    private MessageProvider mp;

    public void RenderMessage(String message) {
        System.out.println(mp.provideMessage(message));
    }

    public void setMessageProvider(MessageProvider mp) {
        this.mp = mp;
    }

    public MessageProvider getMessageProvider() {
        return this.mp;
    }
}
