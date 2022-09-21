/*
 * Copyright 2017-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.eureka.config;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.netflix.eureka.sample.EurekaSampleApplication;
import org.springframework.test.annotation.DirtiesContext;

/**
 * @author Daniel Lavoie
 */
@DirtiesContext
@SpringBootTest(classes = EurekaSampleApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
class JerseyOptionalArgsConfigurationTest {

	// @Autowired
	// private DiscoveryClientOptionalArgs optionalArgs;

	@Test
	@Disabled // FIXME: 4.0.0
	void contextLoads() {
		// assertThat(optionalArgs).isNotNull();
	}

}
