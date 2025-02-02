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
package test.ajah.geo.us;

import org.junit.Assert;
import org.junit.Test;

import com.ajah.geo.iso.ISOCountry;

/**
 * Unit tests for ISOCountry class.
 * 
 * @author Eric F. Savage <code@efsavage.com>
 */
@SuppressWarnings("static-method")
public class ISOCountryTest {

	/**
	 * Test basic lookups.
	 */
	@Test
	public void get() {
		Assert.assertEquals(ISOCountry.US, ISOCountry.get("us"));
	}

	/**
	 * Test basic lookups.
	 */
	@Test
	public void loop() {
		for (ISOCountry isoCountry : ISOCountry.values()) {
			System.out.println("'" + isoCountry.getName().replaceAll("\\'", "\\\\'") + "',");
		}
	}

}
