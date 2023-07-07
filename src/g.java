public class Main {
    public static void main(String[] args) {
        FourthClass fourth = new FourthClass("Fourth Property");

        SecondClass objectA = new SecondClass("First Property", fourth);
        ThirdClass objectB = new ThirdClass("First Property", fourth, SomeEnum.VALUE1);
        ThirdClass objectC = new ThirdClass("First Property", fourth, SomeEnum.VALUE2);

        System.out.println("objectA properties:");
        System.out.println(objectA.getFirstProperty());
        System.out.println(objectA.getSecondProperty().getFourthProperty());
        objectA.overloadedMethod();
        objectA.nonOverridableMethod();
        System.out.println();

        System.out.println("objectB properties:");
        System.out.println(objectB.getFirstProperty());
        System.out.println(objectB.getSecondProperty().getFourthProperty());
        System.out.println(objectB.getThirdProperty());
        objectB.overloadedMethod();
        objectB.nonOverridableMethod();
        objectB.additionalMethod();
        System.out.println();

        System.out.println("objectC properties:");
        System.out.println(objectC.getFirstProperty());
        System.out.println(objectC.getSecondProperty().getFourthProperty());
        System.out.println(objectC.getThirdProperty());
        objectC.overloadedMethod();
        objectC.nonOverridableMethod();
        objectC.additionalMethod();
    }
}
