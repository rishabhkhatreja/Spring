package Question2AndQuestion3;

import org.springframework.context.ApplicationListener;

public class MyEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("hello "+event.getSource());
    }
}