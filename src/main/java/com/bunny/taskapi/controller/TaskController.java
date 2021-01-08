package com.bunny.taskapi.controller;

import com.bunny.taskapi.domain.Tasks;
import com.bunny.taskapi.service.TaskCommandService;
import com.bunny.taskapi.service.TaskQueryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "task")
public class TaskController {
    private final TaskCommandService taskCommandService;
    private final TaskQueryService taskQueryService;

    public TaskController(TaskCommandService taskCommandService, TaskQueryService taskQueryService) {
        this.taskCommandService = taskCommandService;
        this.taskQueryService = taskQueryService;
    }

    @PostMapping
    public ResponseEntity<Tasks> upsertTask(@RequestBody Tasks tasks){
        return ResponseEntity.ok(taskCommandService.upsertTasks(tasks));
    }

    @GetMapping("/list")
    public ResponseEntity<Page<Tasks>> listByUserId(@RequestParam("page") int page,
                                                    @RequestParam("per_page") int size,
                                                    @RequestParam("user_id") Long userId)
                                                    {
                                                        page = page -1;
                                                        return ResponseEntity.ok(taskQueryService.findByUserId(userId, PageRequest.of(page,size)));

    }
}
