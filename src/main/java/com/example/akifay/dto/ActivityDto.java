package com.example.akifay.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDto
{
    private String activityTitle;
    private String activityTopic;
    private Date activityDate;
    private Boolean activityStatus;
}
