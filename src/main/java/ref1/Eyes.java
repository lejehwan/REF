package ref1;

public class Eyes implements Human{

//    public final static int num = 1;

    private Eyes(){};
    private static class LazyHolder{
        private static final Eyes eyes = new Eyes();
    }
    public static Eyes getInstance(){
        return LazyHolder.eyes;
    }

    @Override
    public String func() {
        return "보다";
    }
}
