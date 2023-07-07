public class FourthClass {
    private String fourthProperty;

    public FourthClass(String fourthProperty) {
        this.fourthProperty = fourthProperty;
    }

    public String getFourthProperty() {
        return fourthProperty;
    }
}

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
    private FourthClass secondProperty;

    public SecondClass(String firstProperty, FourthClass secondProperty) {
        super(firstProperty);
        this.secondProperty = secondProperty;
    }

    public FourthClass getSecondProperty() {
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
    private SomeEnum thirdProperty;

    public ThirdClass(String firstProperty, FourthClass secondProperty, SomeEnum thirdProperty) {
        super(firstProperty, secondProperty);
        this.thirdProperty = thirdProperty;
    }

    public SomeEnum getThirdProperty() {
        return thirdProperty;
    }

    @Override
    public void overloadedMethod() {
        System.out.println("Overridden method in ThirdClass");
    }
}

public enum SomeEnum {
    VALUE1,
    VALUE2,
    VALUE3
}

