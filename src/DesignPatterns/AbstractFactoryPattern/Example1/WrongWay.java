package DesignPatterns.AbstractFactoryPattern.Example1;

interface Component {
    void createNew();
}

// Windows Components
class WindowsButton implements Component {
    public void createNew() {
        System.out.println("Created Windows button");
    }
}

class WindowsCheckBox implements Component {
    public void createNew() {
        System.out.println("Created Windows checkbox");
    }
}

// Mac Components
class MacButton implements Component {
    public void createNew() {
        System.out.println("Created Mac button");
    }
}

class MacCheckBox implements Component {
    public void createNew() {
        System.out.println("Created Mac checkbox");
    }
}

// Simple Factory for OS Components
class ComponentFactory {
    public static Component createComponent(String os, String type) {
        if (os.equalsIgnoreCase("windows")) {
            if (type.equalsIgnoreCase("button")) return new WindowsButton();
            else if (type.equalsIgnoreCase("checkbox")) return new WindowsCheckBox();
        } else if (os.equalsIgnoreCase("mac")) {
            if (type.equalsIgnoreCase("button")) return new MacButton();
            else if (type.equalsIgnoreCase("checkbox")) return new MacCheckBox();
        }
        return null; // Handle invalid cases
    }
}

public class WrongWay {
    public static void main(String[] args) {
        String apiResultOS = "windows";
        String apiResultComponent = "button";

        Component component = ComponentFactory.createComponent(apiResultOS, apiResultComponent);

        if (component != null) {
            component.createNew();
        } else {
            System.out.println("Invalid component request");
        }
    }
}
