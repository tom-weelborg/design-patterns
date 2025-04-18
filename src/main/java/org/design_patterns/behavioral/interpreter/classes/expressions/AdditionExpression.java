package org.design_patterns.behavioral.interpreter.classes.expressions;

public class AdditionExpression implements MathExpression {
    private final MathExpression summand1;
    private final MathExpression summand2;

    public AdditionExpression(final MathExpression summand1, final MathExpression summand2) {
        this.summand1 = summand1;
        this.summand2 = summand2;
    }

    @Override
    public Double calculate() {
        return this.summand1.calculate() + this.summand2.calculate();
    }
}
