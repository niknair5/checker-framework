package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The value represents a bit pattern rather than a numeric value. Bit patterns can be used in
 * bitwise operations (AND, OR, XOR, shifts, complement) but cannot be used in arithmetic operations
 * (addition, subtraction, multiplication, division, modulus) or string concatenation.
 *
 * <p>This annotation is typically used for values returned by methods like {@code
 * Double.doubleToLongBits()} and {@code Float.floatToIntBits()}, which return the bit
 * representation of floating-point values.
 *
 * @checker_framework.manual #signedness-checker Signedness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownSignedness.class})
public @interface BitPattern {}
