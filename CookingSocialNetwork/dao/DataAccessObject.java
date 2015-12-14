/*
 * Copyright 2015 Antonio López Marín <tonilopezmr.github.io>
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
 */

package KataRubenToni.CookingSocialNetwork.dao;

import java.util.List;

/**
 * Crud methods.
 *
 * @author Antonio López.
 */
public interface DataAccessObject<T> {
    List<T> getList() throws Exception;
    T create(T entity) throws Exception;
    void update(T entity) throws Exception;
    void delete(T entity) throws Exception;
    T readById(T entity) throws Exception;
}
