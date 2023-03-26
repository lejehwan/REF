package ref1;

public class FactoryMethodPattern {

    public Human createFuc(int value){
        switch (value) {
            case 1: return Eyes.getInstance();
            case 2: return Nose.getInstance();
            case 3: return Mouse.getInstance();
            case 4: return Ears.getInstance();
            default: return null;
        }
    }
}
