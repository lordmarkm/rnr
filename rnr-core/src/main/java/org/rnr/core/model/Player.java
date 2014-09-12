package org.rnr.core.model;

import javax.persistence.Entity;

import com.baldy.commons.models.BaseEntity;

/**
 * Base player class. NO INTELLIGENCE ATTRIBUTE because int decisions will be determined by the player's
 * in-game actions.
 * @author mbmartinez
 */
@Entity(name = "PLAYER")
public class Player extends BaseEntity {

    private int strength;
    private int vitality;
    private int charm;

    private String name;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getCharm() {
        return charm;
    }

    public void setCharm(int charm) {
        this.charm = charm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
