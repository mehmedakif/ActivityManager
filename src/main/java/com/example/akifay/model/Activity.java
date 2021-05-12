package com.example.akifay.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ACTIVITIES")
public class Activity extends BaseEntitiy
{
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TITLE", length = 256, nullable = false)
    @Getter @Setter
    private String activityTitle;
    @Column(name = "TOPIC", nullable = false)
    @Getter @Setter
    private String activityTopic;
    @Column(name = "DATE")
    @Getter @Setter
    private Date activityDate;
    @Column(name = "STATUS", length = 1, nullable = false)
    @Getter @Setter
    private Boolean activityStatus;
}
