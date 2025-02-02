/*
 *  Copyright 2014 Eric F. Savage, code@efsavage.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.ajah.util;

import lombok.extern.java.Log;

/**
 * Utilities for dealing with numbers.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * 
 */
@Log
public class NumberUtils {

	/**
	 * Parses an array of Strings into an array of ints.
	 * 
	 * @param strings
	 *            An array of strings, may be null or empty, but should not
	 *            contain null values.
	 * @return The array of ints, will be null if null is passed in.
	 * @throws NumberFormatException
	 *             If any of the strings cannot be parsed.
	 */
	public static int[] parseInts(final String[] strings) {
		if (strings == null) {
			return null;
		}
		final int[] ints = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			ints[i] = Integer.parseInt(strings[i]);
		}
		return ints;
	}

	/**
	 * Parses an int out of a String, falling back to a default value if the
	 * string is null, empty, or not a number.
	 * 
	 * @param value
	 *            The value to parse.
	 * @param defaultValue
	 *            The value to use if no valid int could be parsed.
	 * @return The parsed value, or the specified default.
	 */
	public static int safeInt(final String value, final int defaultValue) {
		if (StringUtils.isBlank(value)) {
			return defaultValue;
		}
		try {
			return Integer.parseInt(value);
		} catch (final NumberFormatException e) {
			log.fine(e.getMessage());
			return defaultValue;
		}
	}

	/**
	 * Parses a double out of a String, falling back to zero if the string is
	 * null, empty, or not a number.
	 * 
	 * @param value
	 *            The value to parse.
	 * @return The parsed value, or the specified default.
	 */
	public static double safeDouble(String value) {
		return safeDouble(value, 0);
	}

	/**
	 * Parses a double out of a String, falling back to a default value if the
	 * string is null, empty, or not a number.
	 * 
	 * @param value
	 *            The value to parse.
	 * @param defaultValue
	 *            The value to use if no valid int could be parsed.
	 * @return The parsed value, or the specified default.
	 */
	public static double safeDouble(String value, final int defaultValue) {
		if (StringUtils.isBlank(value)) {
			return defaultValue;
		}
		try {
			return Double.parseDouble(value);
		} catch (final NumberFormatException e) {
			log.fine(e.getMessage());
			return defaultValue;
		}
	}

}
