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
 * Strategy for adjusting a monetary amount.
 * <p>
 * Adjusters are a key tool for modifying monetary amounts.
 * They match the strategy design pattern, allowing different types of
 * adjustment to be easily captured.
 * Examples might be an adjuster that rounds the amount to the nearest 1000,
 * or one that performs currency conversion.
 * <p>
 * There are two equivalent ways of using a {@code MonetaryAdjuster}.
 * The first is to invoke the method on this interface.
 * The second is to use {@link MonetaryAmount#with(MonetaryAdjuster)}:
 * <pre>
 *   // these two lines are equivalent, but the second approach is recommended
 *   monetary = thisAdjuster.adjustInto(monetary);
 *   monetary = monetary.with(thisAdjuster);
 * </pre>
 * It is recommended to use the second approach, {@code with(MonetaryAdjuster)},
 * as it is a lot clearer to read in code.
 * 
 * <h4>Implementation specification</h4>
 * This interface places no restrictions on the mutability of implementations,
 * however immutability is strongly recommended.
 */
public interface MonetaryAdjuster {

    /**
     * Adjusts the specified monetary object.
     * <p>
     * This adjusts the specified monetary object using the logic
     * encapsulated in the implementing class.
     * Examples might be an adjuster that rounds the amount to the nearest 1000,
     * or one that performs currency conversion.
     * <p>
     * There are two equivalent ways of using a {@code MonetaryAdjuster}.
     * The first is to invoke the method on this interface.
     * The second is to use {@link MonetaryAmount#with(MonetaryAdjuster)}:
     * <pre>
     *   // these two lines are equivalent, but the second approach is recommended
     *   monetary = thisAdjuster.adjustInto(monetary);
     *   monetary = monetary.with(thisAdjuster);
     * </pre>
     * It is recommended to use the second approach, {@code with(MonetaryAdjuster)},
     * as it is a lot clearer to read in code.
     * 
     * <h4>Implementation specification</h4>
     * The implementation must take the input object and adjust it.
     * The implementation defines the logic of the adjustment and is responsible for
     * documenting that logic.
     * It may use any method on {@code MonetaryAmount} to determine the result.
     * <p>
     * The input object must not be altered.
     * Instead, an adjusted copy of the original must be returned.
     * This provides equivalent, safe behavior for immutable and mutable monetary amounts.
     * <p>
     * This method may be called from multiple threads in parallel.
     * It must be thread-safe when invoked.
     *
     * @param amount  the amount to adjust, not null
     * @return a monetary amount with the adjustment made, not null
     * @throws MonetaryException if unable to make the adjustment
     * @throws ArithmeticException if numeric overflow occurs
     */
    MonetaryAmount adjustInto(MonetaryAmount amount);

}
