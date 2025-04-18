package org.design_patterns.behavioral.interpreter.classes.expressions;

public class NumberExpression implements MathExpression {
    private final Number number;

    public NumberExpression(final Number number) {
        this.number = number;
    }

    @Override
    public Double calculate() {
        return this.number.doubleValue();
    }
}
