/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY of FITNESS FOR A PARTICULAR PURPOSE. See the GNU general Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/license/>.
 */

package labs.pm.app;
/*
  {@code Shop} class represents an application that manages Products
  @version 4.0
  @author oracle
 */

import labs.pm.data.Condition;
import labs.pm.data.Product;

import java.math.BigDecimal;

/**
 @author MihaiTrandafir
 **/

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Coffee", BigDecimal.valueOf(1.99), Condition.WARM);
        System.out.println(p1.serve());
        for (Condition c: Condition.values())
            System.out.println(c.ordinal()+" "+c.name());
//        p1.setId(101);
//        p1.setName("Tea");
//        p1.setPrice(BigDecimal.valueOf(1.99));
//        System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount());

    }
}