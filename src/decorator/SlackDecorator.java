package decorator;

public class SlackDecorator extends NotifierDecorator {

    protected SlackDecorator(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String message) {
        wrapper.send(message);
        System.out.println("Enviando SLACK: " + message);
    }
}
