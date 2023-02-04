package FactoryMethodPattern;

/**
 * Created by wgPark on 2023-01-31.
 */
interface Button {
    void paint();
}

class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

class OSXButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created OSXButton.");
    }
}

interface GUIFactory {
    Button createButton();
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

class OSXFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}

class Client {
    private Button button;

    Client(GUIFactory factory) {
        button = factory.createButton();
    }

    void paint() {
        button.paint();
    }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        Client windowsClient = new Client(new WindowsFactory());
        windowsClient.paint();

        Client osxClient = new Client(new OSXFactory());
        osxClient.paint();
    }
}