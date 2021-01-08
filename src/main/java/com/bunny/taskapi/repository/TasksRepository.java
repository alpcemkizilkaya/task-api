package com.bunny.taskapi.repository;

import com.bunny.taskapi.domain.Tasks;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TasksRepository extends JpaRepository<Tasks,Long> {
    public Page<Tasks> findAllByUserId(Long userId, Pageable pageable);
}
