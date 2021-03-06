/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.animation;

/**
Builder class for javafx.animation.FillTransition
@see javafx.animation.FillTransition
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public final class FillTransitionBuilder extends javafx.animation.TransitionBuilder<javafx.animation.FillTransitionBuilder> implements javafx.util.Builder<javafx.animation.FillTransition> {
    protected FillTransitionBuilder() {
    }

    /** Creates a new instance of FillTransitionBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.animation.FillTransitionBuilder create() {
        return new javafx.animation.FillTransitionBuilder();
    }

    private int __set;
    public void applyTo(javafx.animation.FillTransition x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setDuration(this.duration);
        if ((set & (1 << 1)) != 0) x.setFromValue(this.fromValue);
        if ((set & (1 << 2)) != 0) x.setShape(this.shape);
        if ((set & (1 << 3)) != 0) x.setToValue(this.toValue);
    }

    private javafx.util.Duration duration;
    /**
    Set the value of the {@link javafx.animation.FillTransition#getDuration() duration} property for the instance constructed by this builder.
    */
    public javafx.animation.FillTransitionBuilder duration(javafx.util.Duration x) {
        this.duration = x;
        __set |= 1 << 0;
        return this;
    }

    private javafx.scene.paint.Color fromValue;
    /**
    Set the value of the {@link javafx.animation.FillTransition#getFromValue() fromValue} property for the instance constructed by this builder.
    */
    public javafx.animation.FillTransitionBuilder fromValue(javafx.scene.paint.Color x) {
        this.fromValue = x;
        __set |= 1 << 1;
        return this;
    }

    private javafx.scene.shape.Shape shape;
    /**
    Set the value of the {@link javafx.animation.FillTransition#getShape() shape} property for the instance constructed by this builder.
    */
    public javafx.animation.FillTransitionBuilder shape(javafx.scene.shape.Shape x) {
        this.shape = x;
        __set |= 1 << 2;
        return this;
    }

    private javafx.scene.paint.Color toValue;
    /**
    Set the value of the {@link javafx.animation.FillTransition#getToValue() toValue} property for the instance constructed by this builder.
    */
    public javafx.animation.FillTransitionBuilder toValue(javafx.scene.paint.Color x) {
        this.toValue = x;
        __set |= 1 << 3;
        return this;
    }

    /**
    Make an instance of {@link javafx.animation.FillTransition} based on the properties set on this builder.
    */
    public javafx.animation.FillTransition build() {
        javafx.animation.FillTransition x = new javafx.animation.FillTransition();
        applyTo(x);
        return x;
    }
}
