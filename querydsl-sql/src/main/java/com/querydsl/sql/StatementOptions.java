/*
 * Copyright 2015, The Querydsl Team (http://www.querydsl.com/team)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.querydsl.sql;

import java.sql.Statement;

/**
 * {@code StatementOptions} holds parameters that should be applied to {@link Statement}s.
 */
public class StatementOptions {

    private final Integer maxFieldSize;
    private final Integer maxRows;
    private final Integer queryTimeout;
    private final Integer fetchSize;

    public StatementOptions(Integer maxFieldSize, Integer maxRows, Integer queryTimeout, Integer fetchSize) {
        this.maxFieldSize = maxFieldSize;
        this.maxRows = maxRows;
        this.queryTimeout = queryTimeout;
        this.fetchSize = fetchSize;
    }

    public Integer getMaxFieldSize() {
        return maxFieldSize;
    }

    public Integer getMaxRows() {
        return maxRows;
    }

    public Integer getQueryTimeout() {
        return queryTimeout;
    }

    public Integer getFetchSize() {
        return fetchSize;
    }

    /**
     * Builder for {@link StatementOptions}
     */
    public static class Builder {
        private Integer maxFieldSize = 0;
        private Integer maxRows = 0;
        private Integer queryTimeout = 0;
        private Integer fetchSize = 0;

        public Builder setMaxFieldSize(Integer maxFieldSize) {
            this.maxFieldSize = maxFieldSize;
            return this;
        }

        public Builder setMaxRows(Integer maxRows) {
            this.maxRows = maxRows;
            return this;
        }

        public Builder setQueryTimeout(Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setFetchSize(Integer fetchSize) {
            this.fetchSize = fetchSize;
            return this;
        }

        public StatementOptions build() {
            return new StatementOptions(maxFieldSize, maxRows, queryTimeout, fetchSize);
        }
    }
}
