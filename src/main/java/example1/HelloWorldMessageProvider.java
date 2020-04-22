package example1;

public class HelloWorldMessageProvider implements MessageProvider {
    public String provideMessage(String message) {
        return "Hello, u have this message: " + message;
    }
}
