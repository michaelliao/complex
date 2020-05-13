package com.itranswarp.math;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ComplexUtils {

	private static final Log log = LogFactory.getLog(ComplexUtils.class);

	public static boolean isZero(Complex c) {
		return c.getReal() == 0 && c.getImaginary() == 0;
	}

	public static double abs(Complex c) {
		double r = Math.sqrt(c.getReal() * c.getReal() + c.getImaginary() * c.getImaginary());
		if (log.isDebugEnabled()) {
			log.debug(String.format("abs(%s) = %s", c, r));
		}
		return r;
	}
}
