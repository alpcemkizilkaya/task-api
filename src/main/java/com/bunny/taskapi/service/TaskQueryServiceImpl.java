package com.bunny.taskapi.service;

import com.bunny.taskapi.domain.Tasks;
import com.bunny.taskapi.repository.TasksRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaskQueryServiceImpl implements TaskQueryService{
    private final TasksRepository tasksRepository;

    public TaskQueryServiceImpl(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @Override
    public Page<Tasks> findByUserId(Long userId, Pageable pageable) {
        return tasksRepository.findAllByUserId(userId,pageable);
    }
}
