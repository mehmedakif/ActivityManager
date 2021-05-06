package com.example.akifay.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class ActivityDto
{
    private String activityTitle;
    private String activityTopic;
    private Date activityDate;
    private int activityStatus;
}
