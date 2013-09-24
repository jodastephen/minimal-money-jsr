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
 * A unit of currency.
 * <p>
 * This interface represents a unit of currency such as the British Pound, Euro or US Dollar.
 * 
 * <h4>Implementation specification</h4>
 * This interface must be implemented with care to ensure other classes operate correctly.
 * All implementations that can be instantiated must be final, immutable and thread-safe.
 */
public interface CurrencyUnit {

    /**
     * Gets the code that uniquely defines the currency.
     * <p>
     * The code must uniquely define the currency within the implementation.
     * It is desirable that codes follow international standards wherever possible.
     * It is also desirable to ensure that there are no code overlaps between two implementations.
     * 
     * @return the code, not null
     */
    String getCurrencyCode();

}
