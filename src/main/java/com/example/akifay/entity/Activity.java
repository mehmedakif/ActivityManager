package com.example.akifay.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "ACTIVITIES")
public class Activity extends BaseEntitiy
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TITLE", length = 256, nullable = false)
    private String activityTitle;
    @Column(name = "TOPIC", nullable = false)
    private String activityTopic;
    @Column(name = "DATE")
    private Date activityDate;
    @Column(name = "STATUS", length = 1, nullable = false)
    private int activityStatus;
}
