public class FirstClass {
    private String firstProperty;

    public FirstClass(String firstProperty) {
        this.firstProperty = firstProperty;
    }

    public String getFirstProperty() {
        return firstProperty;
    }
}

public class SecondClass extends FirstClass {
    private String secondProperty;

    public SecondClass(String firstProperty, String secondProperty) {
        super(firstProperty);
        this.secondProperty = secondProperty;
    }

    public String getSecondProperty() {
        return secondProperty;
    }

    public void overloadedMethod() {
        System.out.println("Overloaded method in SecondClass");
    }

    public final void nonOverridableMethod() {
        System.out.println("Non-overridable method in SecondClass");
    }
}

public final class ThirdClass extends SecondClass {
    private String thirdProperty;

    public ThirdClass(String firstProperty, String secondProperty, String thirdProperty) {
        super(firstProperty, secondProperty);
        this.thirdProperty = thirdProperty;
    }

    public String getThirdProperty() {
        return thirdProperty;
    }

    @Override
    public void overloadedMethod() {
        System.out.println("Overridden method in ThirdClass");
    }
}
