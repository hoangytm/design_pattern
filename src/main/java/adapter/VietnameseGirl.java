package adapter;

public class VietnameseGirl implements Vietnamese {
    @Override
    public void understand(String vietnameseWords) {
        System.out.println("i understand  " + vietnameseWords);
    }
}
