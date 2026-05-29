package com.taskflow.task.mapper;

import com.taskflow.task.domain.CreateTaskRequest;
import com.taskflow.task.domain.UpdateTaskRequest;
import com.taskflow.task.domain.dto.CreateTaskRequestDto;
import com.taskflow.task.domain.dto.TaskDto;
import com.taskflow.task.domain.dto.UpdateTaskRequestDto;
import com.taskflow.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);
    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);

}
