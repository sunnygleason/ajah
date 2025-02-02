/*
 *  Copyright 2011 Eric F. Savage, code@efsavage.com
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
package com.ajah.user;

import lombok.EqualsAndHashCode;

/**
 * Thrown when a password or token is wrong.
 * 
 * @author Eric F. Savage <code@efsavage.com>
 * 
 */
@EqualsAndHashCode(callSuper = false)
public class AuthenticationFailureException extends AuthenticationException {

	private String username;

	/**
	 * Calls super with username as message.
	 * 
	 * @param username
	 *            User that failed to authenticate.
	 */
	public AuthenticationFailureException(final String username) {
		super(username);
	}

	/**
	 * User that failed to authenticate.
	 * 
	 * @return Username that failed to authenticate. Should not be null.
	 */
	public String getUsername() {
		return this.username;
	}

}
