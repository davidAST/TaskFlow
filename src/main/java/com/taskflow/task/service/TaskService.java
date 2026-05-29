package com.taskflow.task.service;

import com.taskflow.task.domain.CreateTaskRequest;
import com.taskflow.task.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);
}
