/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.context.properties.bind;

import org.springframework.boot.context.properties.source.ConfigurationPropertySource;

/**
 * Internal strategy used by {@link Binder} to bind beans.
 *
 * @author Phillip Webb
 * @author Madhura Bhave
 */
interface BeanBinder {

	/**
	 * Return a bound bean instance or {@code null} if the {@link BeanBinder} does not
	 * support the specified {@link Bindable}.
	 * @param target the bindable to bind
	 * @param hasKnownBindableProperties if this binder has known bindable elements. If
	 * names from underlying {@link ConfigurationPropertySource} cannot be iterated this
	 * method can be {@code false}, even though binding may ultimately succeed.
	 * @param propertyBinder property binder
	 * @param <T> The source type
	 * @return a bound instance or {@code null}
	 */
	<T> T bind(Bindable<T> target, boolean hasKnownBindableProperties,
			BeanPropertyBinder propertyBinder);

}
