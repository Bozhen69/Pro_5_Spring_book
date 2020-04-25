package example1;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "render")
public class StandardMessageRender implements MessageRender {


    @Resource(name = "provider")
    public void setMessageProvider(MessageProvider mp) {
        this.mp = mp;
    }

    public MessageProvider getMessageProvider() {
        return this.mp;
    }

    private MessageProvider mp;

    private String printMessage;

    public StandardMessageRender(@Value("#{config.message}")String printMessage) {
        this.printMessage = printMessage;
    }

    public void renderMessage() {
        System.out.println(mp.provideMessage(this.getPrintMessage()));
    }

    public MessageProvider getMp() {
        return mp;
    }

    public void setMp(MessageProvider mp) {
        this.mp = mp;
    }

    public String getPrintMessage() {
        return printMessage;
    }

    public void setPrintMessage(String printMessage) {
        this.printMessage = printMessage;
    }

}
