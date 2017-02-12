/*
 * Copyright 2012-2015 the original author or authors.
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

package com.travix.flightsearch.service;

import java.io.Serializable;

import org.springframework.util.Assert;

public class CitySearchCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	private String destination;

	public CitySearchCriteria() {
	}

	public CitySearchCriteria(String destination) {
		Assert.notNull(destination, "Name must not be null");
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}
