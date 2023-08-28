package backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextDataService {

    @Autowired
    private TextDataRepository textDataRepository;

    public TextData saveTextData(String text) {
        TextData textData = new TextData();
        textData.setText(text);
        return textDataRepository.save(textData);
    }
}