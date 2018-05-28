package net.emmecilab.players_client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Mauro Cicolella
 */
@RestController
public class PlayersController {

    @RequestMapping("/players")
    public String getplayers() {
        RestTemplate rt = new RestTemplate();
        return rt.getForObject("http://localhost:9090/players", String.class);
    }
}
