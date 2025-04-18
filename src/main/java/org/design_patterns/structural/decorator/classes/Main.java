package org.design_patterns.structural.decorator.classes;

import org.design_patterns.structural.decorator.classes.components.Coffee;
import org.design_patterns.structural.decorator.classes.components.Tea;
import org.design_patterns.structural.decorator.classes.components.decorators.MilkDecorator;
import org.design_patterns.structural.decorator.classes.components.decorators.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        new MilkDecorator(new SugarDecorator(new Coffee())).drink();
        System.out.println();

        new Tea().drink();
        System.out.println();

        new MilkDecorator(new Tea()).drink();
        System.out.println();
    }
}
