package com.res.command.inter.impl;

import com.res.command.entity.Product;
import com.res.command.inter.Command;

public class ReducePriceCommand implements Command {

    private Product product;
    private Double reduce;

    public ReducePriceCommand(Product product, Double reduce) {
        this.product = product;
        this.reduce = reduce;
    }

    @Override
    public void execute() {
        double result = product.getPrice() - reduce;
        product.setPrice(result >= 0 ? result : 0);
    }
}
