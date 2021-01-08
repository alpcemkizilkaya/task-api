package com.bunny.taskapi.service;

import com.bunny.taskapi.domain.Tasks;
import com.bunny.taskapi.repository.TasksRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskCommandServiceImpl implements TaskCommandService
{
    private final TasksRepository tasksRepository;

    public TaskCommandServiceImpl(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @Override
    public Tasks upsertTasks(Tasks tasks) {
        return tasksRepository.save(tasks);
    }
}
