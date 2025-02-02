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
package com.ajah.swagger;

import java.util.ArrayList;
import java.util.List;

public class SwaggerOperation {
	public String method = "GET";
	public String notes;
	public String nickname;
	public String summary;
	public String responseClass;

	public String[] produces = { "application/json" };

	public List<SwaggerParameter> parameters = new ArrayList<>();
	public boolean deprecated = false;
	public List<SwaggerResponseMessage> responseMessages = new ArrayList<>();

}
