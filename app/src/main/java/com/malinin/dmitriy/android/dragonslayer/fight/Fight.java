package com.malinin.dmitriy.android.dragonslayer.fight;

import com.malinin.dmitriy.android.dragonslayer.players.BlockPart;
import com.malinin.dmitriy.android.dragonslayer.players.Player;

/**
 * Created by dmitriy on 29.03.2015.
 */
public class Fight {

    public int hitDamage (Player attackPlayer, Player defendPlayer, BlockPart hitPart)
    {
        int damage=0;
        if(checkBlock(defendPlayer,hitPart))
        {
            damage=attackPlayer.getStrength()/(defendPlayer.getDefense()*2);
            return damage;
        }
        else
        {
            damage=attackPlayer.getStrength()/(defendPlayer.getDefense());
        }
        return damage;
    }

    private boolean checkBlock(Player defendPlayer, BlockPart hitPart) {
        if(defendPlayer.getBlockPart()==hitPart)
        {return true;}
        else {return false;}
    }



}
