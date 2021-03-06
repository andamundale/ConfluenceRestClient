/**
 * Copyright 2016 Micromata GmbH
 * Modifications Copyright 2017 Martin Böhmer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.itboehmer.confluence.rest.core.misc;

/**
 * @author Christian Schulze (c.schulze@micromata.de)
 * @author Martin Böhmer
 */
public interface RestPathConstants {

    String BASE_REST_PATH = "/rest/api";

    String USER = "/user";

    String CURRENT = "/current";

    String ANONYMUS = "/anonymous";

    String SPACE = "/space";

    String CONTENT = "/content";

    String SEARCH = "/search";

    String SPECIFIC_CONTENT = CONTENT + "/%1$s";

    String CONTENT_ATTACHMENT = SPECIFIC_CONTENT + "/child/attachment";

    String CONTENT_LABEL = SPECIFIC_CONTENT + "/label";

}
