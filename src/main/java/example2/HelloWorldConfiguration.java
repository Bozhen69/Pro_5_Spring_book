package example2;

import example1.HelloWorldMessageProvider;
import example1.MessageProvider;
import example1.MessageRender;
import example1.StandardMessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean(name = "rendered")
    public MessageRender render(){
        MessageRender messageRender = new StandardMessageRender();
        messageRender.setMessageProvider(provider());
        return messageRender;
    }
}
