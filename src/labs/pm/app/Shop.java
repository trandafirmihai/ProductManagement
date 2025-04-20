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

import labs.pm.data.Product;
import labs.pm.data.ProductManager;

import java.util.Comparator;

/**
 @author MihaiTrandafir
 **/

public class Shop {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager("en-GB");
        pm.parseProduct("D,101,Tea,1.99,0,2023-04-21");
        pm.printProductReport(101);
        pm.parseReview("101,4,Nice hot cup of tea");
        pm.parseReview("101,2,Rather weak tea");
        pm.parseReview("101,4,Fine tea");
        pm.parseReview("101,4,Good tea");
        pm.parseReview("101,5,Perfect tea");
        pm.parseReview("101,3,Just add some lemon");
        pm.printProductReport(101);
        pm.parseProduct("D,102,Coffee,1.99,0,2023-04-20");
        pm.parseReview("102,3,Coffee was ok");
        pm.parseReview("102,1,Where is the milk?!");
        pm.parseReview("102,4,It's perfect with the tea spoon of sugar!");
        pm.printProductReport(102);
        pm.parseProduct("F,103,Cake,3.99,0,2025-04-22");
        pm.parseReview("103,5,Very nice cake");
        pm.parseReview("103,4,Good, but I've expected more chocolate");
        pm.parseReview("103,5,This cake is perfect!");
        pm.printProductReport(103);
        pm.parseProduct("F,104,Cookie,2.99,0,2025-04-20");
        pm.parseReview("104,3,Just another cookie");
        pm.parseReview("104,3,OK");
        pm.printProductReport(104);
        Comparator<Product> ratingSorter = (p1, p2) ->
                p2.getRating().ordinal() - p1.getRating().ordinal();
        Comparator<Product> priceSorter = (p1, p2) ->
                p2.getPrice().compareTo(p1.getPrice());
        pm.printProducts(p->p.getPrice().floatValue()<2, ratingSorter.thenComparing(priceSorter));
        pm.getDiscounts().forEach(
                (rating, discount) -> System.out.println((rating+"\t"+discount)));
    }
}