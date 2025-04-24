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

import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

import java.math.BigDecimal;

/**
 @author MihaiTrandafir
 **/

public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-GB");

        pm.createProduct(105, "Kombucha", BigDecimal.valueOf(1.99),
                Rating.NOT_RATED);
        pm.reviewProduct(105, Rating.TWO_STAR, "Looks like tea but is it?");
        pm.reviewProduct(105, Rating.FOUR_STAR, "Fine tea");
        pm.reviewProduct(105, Rating.FOUR_STAR, "This is not tea");
        pm.reviewProduct(105, Rating.TWO_STAR, "Perfect!");
//        pm.dumpData(); // make the methods public for testing, but normally they should be private and be triggered from inside the ProductManager
//        pm.restoreData(); // process is too fast, comment this line to see the tmp file
        pm.printProductReport(105);

//        pm.printProductReport(42);
//        pm.printProductReport(101);
//        pm.printProductReport(102);
//        pm.printProductReport(103);
//        pm.printProductReport(104);

        pm.printProducts(
                p -> p.getPrice().floatValue() < 2,
                (p1,p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());

    }
}