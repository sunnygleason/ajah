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

package com.ajah.email;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.ajah.util.data.format.EmailAddress;

/**
 * An email recipient.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * 
 */
@Data
@AllArgsConstructor
public class EmailRecipient {

	private EmailAddress address;
	private String name;
	private EmailRecipientType type;

	public static Collection<EmailRecipient> from(EmailAddress[] emailAddresses, EmailRecipientType type) {
		List<EmailRecipient> list = new ArrayList<>(emailAddresses.length);
		for (EmailAddress emailAddress : emailAddresses) {
			list.add(new EmailRecipient(emailAddress, emailAddress.toString(), type));
		}
		return list;
	}

}
