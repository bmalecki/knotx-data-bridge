/*
 * Copyright (C) 2018 Knot.x Project
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
package io.knotx.databridge.http.common.placeholders;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UriTransformerPlaceholderTest {

  @Test
  public void getPlaceholders_whenGivenUrlWithPlaceholders_expectPlaceholdersExtractedInArray() {
    List<String> placeholders =
        UriTransformer.getPlaceholders("/dssds/{first.aa}/dsu/{second}");
    Assertions.assertArrayEquals(placeholders.toArray(), new String[]{"first.aa", "second"});
  }
}
