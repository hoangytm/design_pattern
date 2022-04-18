package adapter;

public class Execute {
    public static void main(String[] args) {
        Duck duck = new Duck();
//        bây giờ mong muốn duck cũng có thể chơi được
        Adapter adapter = new Adapter(duck);
        adapter.makeFun();

    }
}
