package com.taskflow.task.service;

import com.taskflow.task.domain.CreateTaskRequest;
import com.taskflow.task.domain.entity.Task;

import java.util.List;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();
}
