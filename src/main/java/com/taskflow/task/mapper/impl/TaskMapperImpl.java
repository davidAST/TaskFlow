package com.taskflow.task.mapper.impl;

import com.taskflow.task.domain.CreateTaskRequest;
import com.taskflow.task.domain.UpdateTaskRequest;
import com.taskflow.task.domain.dto.CreateTaskRequestDto;
import com.taskflow.task.domain.dto.TaskDto;
import com.taskflow.task.domain.dto.UpdateTaskRequestDto;
import com.taskflow.task.domain.entity.Task;
import com.taskflow.task.mapper.TaskMapper;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public UpdateTaskRequest fromDto(UpdateTaskRequestDto dto) {
        return new UpdateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.status(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
