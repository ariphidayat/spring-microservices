package id.arip.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arip Hidayat on 11/14/2018.
 */
@RestController
public class MessageRestController {

    @Value("${message: Default Order!}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}