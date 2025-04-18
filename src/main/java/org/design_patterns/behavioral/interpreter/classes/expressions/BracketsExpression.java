package org.design_patterns.behavioral.interpreter.classes.expressions;

public class BracketsExpression implements MathExpression {
    private final MathExpression expression;

    public BracketsExpression(final MathExpression expression) {
        this.expression = expression;
    }

    @Override
    public Double calculate() {
        return this.expression.calculate();
    }
}
