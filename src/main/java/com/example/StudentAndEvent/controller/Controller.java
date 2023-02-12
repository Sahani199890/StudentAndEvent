package com.example.StudentAndEvent.controller;

import com.example.StudentAndEvent.model.EventModel;
import com.example.StudentAndEvent.model.StudentModel;
import com.example.StudentAndEvent.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Event-management")
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody StudentModel stModel){
        service.add(stModel);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);

    }
    @GetMapping("/get-All-students")
    public List<StudentModel> getAllStudents(){
       return service.getAll();
    }
    @GetMapping("/get-by-id/Id/{id}")
    public StudentModel getById(@PathVariable int id){
        return service.getById(id);
    }
    @PutMapping("/update-department")
    public void updateDepartment(@RequestParam int id,@RequestParam String dept){
        service.updateDepartment(id,dept);
    }
    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestParam int id){
        service.deleteStudent(id);
    }



    @PostMapping("/add-event")
    public void addEvent(@RequestBody EventModel em){
        service.addEve(em);
    }
    @PutMapping("/update-event")
    public void updateEvent(@RequestBody EventModel em ,@RequestParam int eveId){
        service.updateEve(em,eveId);
    }
    @DeleteMapping("/delete-event")
    public void deleteEvent(@RequestParam int eventId){
        service.deleteEvent(eventId);
    }
    @GetMapping("/GetAllDatesOfEvent/date/{date}")
    public List<EventModel> getEventDates(@PathVariable String date){
        return service.getEventDates(date);
    }

}
