package example1;

public class StandardMessageRender implements MessageRender {

    private MessageProvider mp;

    public void renderMessage(String message) {
        System.out.println(mp.provideMessage(message));
    }

    public void setMessageProvider(MessageProvider mp) {
        this.mp = mp;
    }

    public MessageProvider getMessageProvider() {
        return this.mp;
    }
}
