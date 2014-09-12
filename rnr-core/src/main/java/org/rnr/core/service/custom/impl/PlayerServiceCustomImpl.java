package org.rnr.core.service.custom.impl;

import java.util.List;

import org.rnr.commons.dto.PlayerInfo;
import org.rnr.core.model.Player;
import org.rnr.core.service.PlayerService;
import org.rnr.core.service.PlayerServiceCustom;
import org.rnr.core.util.MappingService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mbmartinez
 */
public class PlayerServiceCustomImpl extends MappingService<Player, PlayerInfo> 
    implements PlayerServiceCustom {

    @Autowired
    private PlayerService service;

    @Override
    public List<PlayerInfo> findAllInfo() {
        return toDto(service.findAll());
    }

    @Override
    public PlayerInfo findOneInfo(Long id) {
        return toDto(service.findOne(id));
    }

    @Override
    public PlayerInfo saveInfo(PlayerInfo playerInfo) {
        return toDto(service.save(toEntity(playerInfo)));
    }

}
