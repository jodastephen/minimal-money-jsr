/*
 *  Copyright 2013 - present Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.jsr.money;

/**
 * Exception thrown when an error occurs during monetary operations.
 * 
 * <h4>Implementation specification</h4>
 * This interface places no restrictions on the mutability of implementations,
 * however immutability is strongly recommended.
 */
public class MonetaryException extends RuntimeException {

    /**
     * Serialization version.
     */
    private static final long serialVersionUID = 4177241048780579710L;

    /**
     * Creates an instance.
     * 
     * @param message  the message
     */
    public MonetaryException(String message) {
        super(message);
    }

}
