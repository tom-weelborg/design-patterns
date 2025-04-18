package org.design_patterns.behavioral.interpreter.classes;

import org.design_patterns.behavioral.interpreter.classes.expressions.*;

public class Main {
    public static void main(String[] args) {
        // 5 + 7 - (2 + 4) = 6
        final MathExpression mathExpression1 = new AdditionExpression(
                new NumberExpression(5),
                new SubtractionExpression(
                        new NumberExpression(7),
                        new BracketsExpression(
                                new AdditionExpression(
                                        new NumberExpression(2),
                                        new NumberExpression(4)
                                )
                        )
                )
        );
        System.out.println(mathExpression1.calculate());

        // 5 * 6 / 30 = 1
        final MathExpression mathExpression2 = new DivisionExpression(
                new MultiplicationExpression(
                        new NumberExpression(5),
                        new NumberExpression(6)
                ),
                new NumberExpression(30)
        );
        System.out.println(mathExpression2.calculate());
    }
}
