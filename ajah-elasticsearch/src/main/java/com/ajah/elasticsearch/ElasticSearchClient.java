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

package com.ajah.elasticsearch;

import java.io.IOException;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.index.query.FilterBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.sort.SortBuilder;

import com.ajah.util.Identifiable;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Interface for Elastic Search Clients.
 * 
 * @author <a href="http://efsavage.com">Eric F. Savage</a>, <a
 *         href="mailto:code@efsavage.com">code@efsavage.com</a>.
 * @param <K>
 *            The type of key/ID.
 * @param <T>
 *            The type (may be an interface).
 * @param <C>
 *            The implemented type (must be concrete class).
 * 
 */
public interface ElasticSearchClient<K extends Comparable<K>, T extends Identifiable<K>, C extends T> extends AutoCloseable {

	public IndexResponse index(final T entity) throws JsonProcessingException;

	public SearchList<C> search(final String query) throws IOException;

	public SearchList<C> search(final QueryBuilder queryBuilder, final FilterBuilder filterBuilder, final SortBuilder[] sortBuilders, final int page, final int count) throws IOException;

	public void close();

}
