package com.spring.SpringApp.service;

import com.spring.SpringApp.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    // get all tasks
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    // get task by Id
    public Task getTaskById(Long id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
