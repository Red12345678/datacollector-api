/*
 * Copyright 2017 StreamSets Inc.
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
package com.streamsets.pipeline.api;

import java.util.List;

/**
 * Context for a batch, primarily used in PushSource to start and finish execution of a batch.
 */
public interface BatchContext extends ToErrorContext, ToEventContext, ProcessedContext {

  /**
   * Return batch maker associated with this batch context.
   *
   * @return Instance of BatchMaker, multiple calls returns the same object
   */
  public BatchMaker getBatchMaker();

  /**
   * Returns list of records marked as Source Response
   *
   * @return List of Source Response Records
   */
  List<Record> getSourceResponseRecords();

}
