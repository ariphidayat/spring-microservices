package id.arip.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arip Hidayat on 11/13/2018.
 */
@RefreshScope
@RestController
public class MessageRestController {

    @Value("${message: Default Product!}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
