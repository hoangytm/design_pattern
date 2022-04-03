package adapter;

public class Execute {
    public static void main(String[] args) {
        Japanese japanese = new JapaneseMan();
        String japaneseWord = japanese.speakJapanese("okinawa");
        Vietnamese vietnamese = new VietnameseGirl();
        vietnamese.understand(japaneseWord);
// vấn đề ở đây là mỗi lần japanese nói thì mình phải làm lại khá nhiều

        Adapter adapter = new AdapterImpl(new JapaneseMan());
        adapter.translate("okinawa");

    }
}
