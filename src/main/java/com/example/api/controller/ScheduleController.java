package com.example.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.entity.Schedule;
import com.example.api.repo.ScheduleRepository;

@RestController
@RequestMapping("/api")
public class ScheduleController {
	
    private final ScheduleRepository repository;

    public ScheduleController(ScheduleRepository repository) {
        this.repository = repository;
    }

	//To add data in database
    @PostMapping("/save")
    public Schedule createSchedule(@RequestBody Schedule schedule) {
        return repository.save(schedule);
    }

    @GetMapping("/getAll")
    public List<Schedule> getAllSchedules() {
        return repository.findAll();
    }

}
