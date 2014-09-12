package org.rnr.player.controller;

import java.util.List;

import org.rnr.commons.controller.GenericController;
import org.rnr.commons.dto.PlayerInfo;
import org.rnr.core.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/player")
public class PlayerController extends GenericController {

    private static final Logger LOG = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    private PlayerService service;

    @RequestMapping(method = GET)
    public ResponseEntity<List<PlayerInfo>> findAll() {
        LOG.debug("Finding all players.");
        return ok(service.findAllInfo());
    }

    @RequestMapping(value = "/{id}", method = GET)
    public ResponseEntity<PlayerInfo> findOne(@PathVariable Long id) {
        LOG.debug("Finding player. id={}", id);
        return ok(service.findOneInfo(id));
    }

    @RequestMapping(method = POST)
    public ResponseEntity<PlayerInfo> save(PlayerInfo playerInfo) {
        LOG.debug("Saving player. player={}", playerInfo);
        return ok(service.saveInfo(playerInfo));
    }

}
