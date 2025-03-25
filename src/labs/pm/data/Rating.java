/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY of FITNESS FOR A PARTICULAR PURPOSE. See the GNU general Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/license/>.
 */

package labs.pm.data;

/**
 * @author MihaiTrandafir
 **/

public enum Rating {
    NOT_RATED("\u2606\u2606\u2606\u2606\u2606"),
    ONE_STAR("\u2605\u2606\u2606\u2606\u2606"),
    TWO_STAR("\u2605\u2605\u2606\u2606\u2606"),
    THREE_STAR("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_STAR("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");

    private String stars;

    Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }
}
