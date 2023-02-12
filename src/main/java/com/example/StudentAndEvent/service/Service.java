package com.example.StudentAndEvent.service;

import com.example.StudentAndEvent.model.EventModel;
import com.example.StudentAndEvent.model.StudentModel;

import java.util.*;
import java.util.function.Predicate;

@org.springframework.stereotype.Service

public class Service {
    static List<StudentModel> st=new ArrayList<>();

    static{
        st.add(new StudentModel(323,"Abhi","Sahani",24,"Mech"));
    }
    static List<EventModel> event1=new ArrayList<>();
    static{
        event1.add(new EventModel(1,"B'Day","Royal Palace","15-12-2023","12:00","01:00","https://www.google.com/url?sa=i&url=https%3A%2F%2Fstackoverflow.com%2Fquestions%2F47739566%2Funparseable-date-while-post-date-application-json-from-postman&psig=AOvVaw0fiJK1-791CDqpNYsI0CfB&ust=1676274909398000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCPDLiebAj_0CFQAAAAAdAAAAABAN"));
    }


    public void add(StudentModel stModel){
        st.add(stModel);
    }

    public List<StudentModel> getAll(){
        return st;
    }

    public StudentModel getById(int id){
        for(StudentModel stud:st){
            if(stud.getStudentId()==id){
                return stud;
            }
        }
        return null;
    }

    public void updateDepartment(int id, String dept){
        StudentModel stud=getById(id);
        stud.setDepartment(dept);
    }

    public void deleteStudent(int id){
        Predicate<? super StudentModel> stud=st1->st1.getStudentId()==id;
        st.removeIf(stud);
    }




    public void addEve(EventModel em){
        event1.add(em);
    }

    public void updateEve(EventModel em, int eveId){
        for(EventModel eve:event1){
            if(eve.getEventId()==eveId){
//                eve.setEventId(em.getEventId());
                eve.setEventName(em.getEventName());
                eve.setDate(em.getDate());
                eve.setStartTime(em.getStartTime());
                eve.setEndTime(em.getEndTime());
                eve.setImageurl(em.getImageurl());
                eve.setLocationOfEvent(em.getLocationOfEvent());
            }
        }
    }

    public void deleteEvent(int eventId) {
        Predicate<? super EventModel> eve=eve1->eve1.getEventId()==eventId;
        event1.removeIf(eve);
    }

    public List<EventModel> getEventDates(String date1) {
        List<EventModel> l=new ArrayList<>();
        for(EventModel eve:event1){
            if(eve.getDate().equals(date1)){
                l.add(eve);
            }
        }
        return l;
    }
}
