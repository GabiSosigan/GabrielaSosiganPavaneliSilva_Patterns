package decorator;

public class SmsDecorator extends NotifierDecorator{

    public SmsDecorator(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String message) {
        wrapper.send(message);
        System.out.println("Enviando SMS: " + message);
    }
}
