package baekjoon;

//case 1 : General Singleton
public class Singleton {

    private static Singleton obj = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(obj == null)
            obj = new Singleton();
        return obj;
    }

}

//case 2 : Singleton By Static Block
class StaticBlock{

    private static StaticBlock obj;

    private StaticBlock(){}

    static{
        obj = new StaticBlock();
    }

    public static StaticBlock getInstance(){
        return obj;
    }

}

//case 3 : Singleton By Lazy Init
class LazyInit{

    private static LazyInit obj;

    private LazyInit(){}

    public static LazyInit getInstance(){
        if(obj == null)
            obj = new LazyInit();
        return obj;
    }

}

//case 4 : Singleton By Thread Safe With Lazy
class ThreadSafeLazy{

    private static ThreadSafeLazy obj;

    private ThreadSafeLazy(){}

    public static synchronized ThreadSafeLazy getInstance(){
        if(obj == null)
            obj = new ThreadSafeLazy();
        return obj;
    }

}

//case 5 : Singleton By Holder
class Holder{

    private Holder(){}

    private static class Obj {
        private static final Holder obj = new Holder();
    }

    public static Holder getInstance(){
        return Obj.obj;
    }
}