package com.example.StudentAndEvent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.sql.Time;
import java.text.DateFormatSymbols;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventModel {
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String startTime;
    private String endTime;
    private String imageurl;
}
