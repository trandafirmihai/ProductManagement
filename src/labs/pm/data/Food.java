/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY of FITNESS FOR A PARTICULAR PURPOSE. See the GNU general Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/license/>.
 */

package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author MihaiTrandafir
 **/

public class Food extends Product {

    private LocalDate bestBefore;

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return super.toString()+", "+bestBefore;
    }

    @Override
    public BigDecimal getDiscount() {
        return (bestBefore.isEqual(LocalDate.now()/*.minusDays(1)*/)) ? super.getDiscount() : BigDecimal.ZERO;
    }
}
