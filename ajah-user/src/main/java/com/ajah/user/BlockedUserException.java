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
package com.ajah.user;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Thrown when a user is {@link UserStatus#BLOCKED}.
 * 
 * @author Eric F. Savage <code@efsavage.com>
 * 
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BlockedUserException extends AuthenticationException {

	private UserId userId;
	private String username;
	private Date expiration;

	/**
	 * Calls super with username as message.
	 * 
	 * @param username
	 *            User that failed to authenticate.
	 */
	public BlockedUserException(final UserId userId, final String username, final Date expiration) {
		super(username);
		this.userId = userId;
		this.expiration = expiration;
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
