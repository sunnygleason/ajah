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
package com.ajah.user.achievement;

import com.ajah.util.IdentifiableEnum;

/**
 * Valid states of Achievement entities.
 * 
 * @author Eric F. Savage <code@efsavage.com>
 * 
 */
public enum AchievementType implements IdentifiableEnum<String> {

	/**
	 * A one-time event. Example: Perfect score.
	 */
	EVENT("0", "event", "Event", "A one-time event."),
	/**
	 * A growing tally. Example: 10 victories.
	 */
	TALLY("1", "tally", "Tally", "An ongoing tally."),
	/**
	 * An array. Example: Victory on each section of a map.
	 */
	ARRAY("2", "array", "Array", "An array of choices.");

	/**
	 * Finds a AchievementType that matches the id on id, name, or name().
	 * 
	 * @param string
	 *            Value to match against id, name, or name()
	 * @return Matching AchievementType, or null.
	 */
	public static AchievementType get(final String string) {
		for (final AchievementType type : values()) {
			if (type.getId().equals(string) || type.getCode().equals(string) || type.name().equals(string) || type.getName().equals(string)) {
				return type;
			}
		}
		return null;
	}

	private final String id;
	private final String code;
	private final String name;
	private final String description;

	private AchievementType(final String id, final String code, final String name, final String description) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
	}

	/**
	 * The short, display-friendly code of the type. If no code is applicable,
	 * it should be an alias for the ID.
	 * 
	 * @return The short, display-friendly code of the type. Cannot be null.
	 */
	@Override
	public String getCode() {
		return this.code;
	}

	/**
	 * The display-friendly description of the type.
	 * 
	 * @return The display-friendly description of the type. May be null.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * The internal ID of the type.
	 * 
	 * @return The internal ID of the type. Cannot be null.
	 */
	@Override
	public String getId() {
		return this.id;
	}

	/**
	 * The display-friendly name of the type. If no name is applicable, it
	 * should be an alias for the ID or code.
	 * 
	 * @return The display-friendly name of the type. Cannot be null.
	 */
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setId(final String id) {
		throw new UnsupportedOperationException();
	}

}
