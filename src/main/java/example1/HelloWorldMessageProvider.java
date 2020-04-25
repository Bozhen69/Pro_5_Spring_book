package example1;

import org.springframework.stereotype.Component;

@Component(value = "provider")
public class HelloWorldMessageProvider implements MessageProvider {
    public String provideMessage(String message) {
        return "Hello, u have this message: " + message;
    }
}
