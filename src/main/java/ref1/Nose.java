package ref1;

public class Nose implements Human{

//    public final static int num = 2;

    private Nose(){};
    private static class LazyHolder{
        private static final Nose nose =  new Nose();
    }
    public static Nose getInstance(){
        return LazyHolder.nose;
    }

    @Override
    public String func() {
        return "맡다";
    }
}
