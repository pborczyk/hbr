package dmcs.projectx.client.api;

import com.caucho.burlap.client.BurlapProxyFactory;
import common.api.ChatService;

public class BurlapChatServiceFactory implements ChatServiceFactory {

    private String url;
    private BurlapProxyFactory burlapProxyFactory = new BurlapProxyFactory();

    public BurlapChatServiceFactory(String url) {
        this.url = url;
    }

    @Override
    public ChatService get() throws Exception {
        return (ChatService) burlapProxyFactory.create(ChatService.class, url);
    }
}
