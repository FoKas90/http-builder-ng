/*
 * Copyright 2003-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * You are receiving this code free of charge, which represents many hours of
 * effort from other individuals and corporations.  As a responsible member 
 * of the community, you are asked (but not required) to donate any 
 * enhancements or improvements back to the community under a similar open 
 * source license.  Thank you. -TMN
 */
package groovyx.net.http;

/**
 * Thrown when a response body is parsed unsuccessfully.  This most often 
 * occurs when a server returns an error status code and sends a different 
 * content-type body from what was expected.  You can inspect the response 
 * content-type by calling <code>ex.response.contentType</code>.
 * 
 * @author <a href='mailto:tomstrummer+httpbuilder@gmail.com'>Tom Nichols</a>
 * @since 0.5.0
 */
public class ResponseParseException extends HttpResponseException {
	
	private static final long serialVersionUID = -1398234959324603287L;

	public ResponseParseException( HttpResponseDecorator response ) {
		super( response );
	}
}