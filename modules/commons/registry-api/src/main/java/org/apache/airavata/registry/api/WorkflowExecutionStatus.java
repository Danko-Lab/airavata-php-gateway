/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.registry.api;

import java.util.Date;

public class WorkflowExecutionStatus {
	public enum ExecutionStatus {
		STARTED,
		RUNNING,
		ERROR,
		PAUSED,
		FINISHED,
		UNKNOWN
	}

	private ExecutionStatus executionStatus;
	private Date statusUpdateTime=null;
	
	public ExecutionStatus getExecutionStatus() {
		return executionStatus;
	}

	public void setExecutionStatus(ExecutionStatus executionStatus) {
		this.executionStatus = executionStatus;
	}

	public Date getStatusUpdateTime() {
		return statusUpdateTime;
	}

	public void setStatusUpdateTime(Date statusUpdateTime) {
		this.statusUpdateTime = statusUpdateTime;
	}

	public WorkflowExecutionStatus(ExecutionStatus executionStatus) {
		this(executionStatus,null);
	}
	
	public WorkflowExecutionStatus(ExecutionStatus executionStatus, Date statusUpdateTime) {
		setExecutionStatus(executionStatus);
		setStatusUpdateTime(statusUpdateTime);
	}
}
