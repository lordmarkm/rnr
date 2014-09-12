package org.rnr.core.service;

import org.rnr.core.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerService extends JpaRepository<Player, Long>, PlayerServiceCustom {

}
