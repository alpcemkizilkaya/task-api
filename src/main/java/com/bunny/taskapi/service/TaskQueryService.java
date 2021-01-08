package com.bunny.taskapi.service;

import com.bunny.taskapi.domain.Tasks;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TaskQueryService {
    public Page<Tasks> findByUserId(Long userId, Pageable pageable);
}
