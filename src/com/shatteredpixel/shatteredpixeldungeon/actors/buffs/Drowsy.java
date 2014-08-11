/*
 * Pixel Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.shatteredpixel.shatteredpixeldungeon.actors.buffs;

import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.utils.GLog;

public class Drowsy extends FlavourBuff {

    public static final float DURATION	= 4f;

    @Override
    public int icon() {
        return BuffIndicator.DROWSY;
    }

    @Override
    public boolean act(){
        Buff.affect(target, MagicalSleep.class);
        GLog.i("You fall into a deep magical sleep.");
        return super.act();
    }

    @Override
    public String toString() {
        return "Drowsy";
    }
}
