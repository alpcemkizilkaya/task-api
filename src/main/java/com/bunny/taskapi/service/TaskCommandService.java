package com.bunny.taskapi.service;

import com.bunny.taskapi.domain.Tasks;

public interface TaskCommandService {
    public Tasks upsertTasks(Tasks tasks);
}
