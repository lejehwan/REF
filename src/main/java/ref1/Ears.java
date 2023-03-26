package ref1;

public class Ears implements Human{

//    public final static int num = 4;

    private Ears(){};
    private static class LazyHolder{
        private static final Ears ears = new Ears();
    }
    public static Ears getInstance(){
        return LazyHolder.ears;
    }

    @Override
    public String func() {
        return "듣다";
    }
}
