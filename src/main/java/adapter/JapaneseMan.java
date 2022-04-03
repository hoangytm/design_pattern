package adapter;

public class JapaneseMan implements Japanese {
    @Override
    public String speakJapanese(String input) {
        return "japan" + input;
    }
}
