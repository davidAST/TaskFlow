package com.taskflow.task.mapper;

import com.taskflow.task.domain.CreateTaskRequest;
import com.taskflow.task.domain.dto.CreateTaskRequestDto;
import com.taskflow.task.domain.dto.TaskDto;
import com.taskflow.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
