package ref1;

public class Mouse implements Human{

//    public final static int num = 3;

    private Mouse(){};
    private static class LazyHolder{
        private static final Mouse mouse = new Mouse();
    }
    public static Mouse getInstance(){
        return LazyHolder.mouse;
    }

    @Override
    public String func() {
        return "말하다";
    }
}
