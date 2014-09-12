package org.rnr.core.service;

import java.util.List;

import org.rnr.commons.dto.PlayerInfo;

public interface PlayerServiceCustom {

    List<PlayerInfo> findAllInfo();
    PlayerInfo findOneInfo(Long id);
    PlayerInfo saveInfo(PlayerInfo playerInfo);

}
