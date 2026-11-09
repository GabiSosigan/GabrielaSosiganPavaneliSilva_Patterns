package decorator;

public abstract class NotifierDecorator implements Notifier{
    protected final Notifier wrapper;

    protected NotifierDecorator(Notifier wrapper) {
        this.wrapper = wrapper;
    }
}
