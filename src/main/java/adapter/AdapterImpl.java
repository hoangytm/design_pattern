package adapter;

public class AdapterImpl implements Adapter {
    private Japanese japanese;

    public AdapterImpl(Japanese japanese) {
        this.japanese = japanese;
    }

    @Override
    public void translate(String input) {
        String word = japanese.speakJapanese(input);
        Vietnamese vietnamese = new VietnameseGirl();
        vietnamese.understand(word);
    }
}
