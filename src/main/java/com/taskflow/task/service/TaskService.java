package com.taskflow.task.service;

import com.taskflow.task.domain.CreateTaskRequest;
import com.taskflow.task.domain.UpdateTaskRequest;
import com.taskflow.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);
}
