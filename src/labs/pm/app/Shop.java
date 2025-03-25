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

import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 @author MihaiTrandafir
 **/

public class Shop {
    public static void main(String[] args) {
        Product p1 = new Drink(101,"Tea",BigDecimal.valueOf(1.99), Rating.THREE_STAR);
        Product p2 = new Drink(102,"Coffee",BigDecimal.valueOf(2.99), Rating.FOUR_STAR);
        Product p3 = new Food(103,"Cake",BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p4 = new Food(105,"Cookie",BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now());
        Product p5 = p3.applyRating(Rating.THREE_STAR);
        Product p6 = new Drink(104,"Chocolate",BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
        Product p7 = new Food(104,"Chocolate",BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
        Product p8 = p4.applyRating(Rating.FIVE_STAR);
        Product p9 = p1.applyRating(Rating.ONE_STAR);

//        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount()+" "+p1.getRating().getStars());
//        System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getPrice()+" "+p2.getDiscount()+" "+p2.getRating().getStars());
//        System.out.println(p3.getId()+" "+p3.getName()+" "+p3.getPrice()+" "+p3.getDiscount()+" "+p3.getRating().getStars());
//        System.out.println(p4.getId()+" "+p4.getName()+" "+p4.getPrice()+" "+p4.getDiscount()+" "+p4.getRating().getStars());
//        System.out.println(p5.getId()+" "+p5.getName()+" "+p5.getPrice()+" "+p5.getDiscount()+" "+p5.getRating().getStars());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println("p6.equals(p7): "+p6.equals(p7));
        System.out.println(p8);
        System.out.println(p9);

        if (p3 instanceof Food f) {
            System.out.println(f.getName()+" is best before date: "+f.getBestBefore());
        }
    }
}