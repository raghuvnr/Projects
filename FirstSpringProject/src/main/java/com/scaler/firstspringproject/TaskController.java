package com.scaler.firstspringproject;

import org.springframework.web.bind.annotation.*;

import com.scaler.tasks.pojo.Task;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private List<Task> tasks = new ArrayList<>();

    @GetMapping("/")
    public List<Task> getTasks() {
        return tasks;
    }

    @GetMapping("/articles")
    public List<Task> getFilteredTasks(@RequestParam boolean complete) {
        List<Task> toBeReturnedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (complete) {
                if (task.isCompleted()) {
                    toBeReturnedTasks.add(task);
                }
            } else {
                if (!task.isCompleted()) {
                    toBeReturnedTasks.add(task);
                }
            }
        }
        return toBeReturnedTasks;
    }

    @GetMapping("/{task_id}")
    public Task getFilteredTasks(@PathVariable("task_id") Integer task_id) {
        List<Task> toBeReturnedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getId() == task_id) {
                return task;
            }
        }
        return null;
    }

    @PostMapping("/")
    public void createTask(@RequestBody Task task) {
        tasks.add(task);
        return;
    }
}
