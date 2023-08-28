package backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TextDataController {

    @Autowired
    private TextDataService textDataService;

    @PostMapping("/saveText")
    public ResponseEntity<String> saveText(@RequestBody Map<String, String> requestBody) {
        String text = requestBody.get("text");
        TextData savedTextData = textDataService.saveTextData(text);
        return ResponseEntity.ok("Text saved with ID: " + savedTextData.getId());
    }
}
