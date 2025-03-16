/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY of FITNESS FOR A PARTICULAR PURPOSE. See the GNU general Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/license/>.
 */

package labs.pm.data;
/*
  {@code Product} class represents properties and behaviours of
  product objects in the ProductManagement System.
  <br>
  Each product has an id, name, and price
  <br>
  Each product can have a discount, calculated based on a
  {@link DISCOUNT_RATE discount rate}
  @version 4.0
 * @author oracle
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
@author MihaiTrandafir
**/

public class Product {

    private int id;
    private String name;
    private BigDecimal price;
    public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);
    private Condition condition;

//    public Product() {
//        this(0, "no name", BigDecimal.ZERO);
//    }

    public Product(int id, String name, BigDecimal price, Condition condition) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.condition = condition;
    }

    public String serve() {
        return switch(condition) {
                case Condition.COLD ->
                    "It is cold";
                case Condition.WARM ->
                    "It is warm";
                case Condition.HOT ->
                    "It is hot";
            };
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    /*
      Calculate discount based on a product price and
      {@link DISCOUNT_RATE discount rate}
      @return a {@link java.math.BigDecimal BigDecimal}
      value of the discount
     */
    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }
}
