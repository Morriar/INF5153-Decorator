/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package game;

public class PlayerDecorator implements Player {

    Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public void attack(Player other) {
        player.attack(other);
    }

    @Override
    public void hurt(int domages) {
        player.hurt(domages);
    }

    @Override
    public int getDamages() {
        return player.getDamages();
    }

    @Override
    public int getLife() {
        return player.getLife();
    }

    @Override
    public String getName() {
        return player.getName();
    }

}
