package com.itranswarp.math;

import java.util.Objects;

/**
 * Sample for complex number.
 * 
 * @author liaoxuefeng
 */
public final class Complex extends Number {

	private final double real;
	private final double imaginary;

	public static Complex valueOf(double real, double imaginary) {
		return new Complex(real, imaginary);
	}

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public Complex add(Complex c) {
		return valueOf(this.real + c.real, this.imaginary + c.imaginary);
	}

	public Complex subtract(Complex c) {
		return valueOf(this.real - c.real, this.imaginary - c.imaginary);
	}

	@Override
	public int intValue() {
		if (this.imaginary == 0.0) {
			return (int) this.real;
		}
		throw new java.lang.ArithmeticException("Cannot convert to long for imaginary is non-zero");
	}

	@Override
	public long longValue() {
		if (this.imaginary == 0.0) {
			return (long) this.real;
		}
		throw new java.lang.ArithmeticException("Cannot convert to long for imaginary is non-zero");
	}

	@Override
	public float floatValue() {
		if (this.imaginary == 0.0) {
			return (float) this.real;
		}
		throw new java.lang.ArithmeticException("Cannot convert to long for imaginary is non-zero");
	}

	@Override
	public double doubleValue() {
		if (this.imaginary == 0.0) {
			return (double) this.real;
		}
		throw new java.lang.ArithmeticException("Cannot convert to long for imaginary is non-zero");
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Complex) {
			Complex c = (Complex) o;
			return this.real == c.real && this.imaginary == c.imaginary;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.real, this.imaginary);
	}

	@Override
	public String toString() {
		return this.real + (this.imaginary < 0 ? "" : "+") + imaginary + "i";
	}
}
