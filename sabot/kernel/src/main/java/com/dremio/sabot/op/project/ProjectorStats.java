/*
 * Copyright (C) 2017-2018 Dremio Corporation
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
package com.dremio.sabot.op.project;

import com.dremio.sabot.exec.context.MetricDef;

public class ProjectorStats {
  public enum Metric implements MetricDef {
    JAVA_EXPRESSIONS,
    JAVA_BUILD_TIME,
    JAVA_EVALUATE_TIME,
    GANDIVA_EXPRESSIONS,
    GANDIVA_BUILD_TIME,
    GANDIVA_EVALUATE_TIME,
    MIXED_EXPRESSIONS,
    MIXED_SPLITS;

    @Override
    public int metricId() {
      return ordinal();
    }
  }
}
