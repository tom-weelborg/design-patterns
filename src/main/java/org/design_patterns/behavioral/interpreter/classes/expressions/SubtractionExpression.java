package org.design_patterns.behavioral.interpreter.classes.expressions;

public class SubtractionExpression implements MathExpression {
    private final MathExpression minuend;
    private final MathExpression subtrahend;

    public SubtractionExpression(final MathExpression minuend, final MathExpression subtrahend) {
        this.minuend = minuend;
        this.subtrahend = subtrahend;
    }

    @Override
    public Double calculate() {
        return this.minuend.calculate() - this.subtrahend.calculate();
    }
}
