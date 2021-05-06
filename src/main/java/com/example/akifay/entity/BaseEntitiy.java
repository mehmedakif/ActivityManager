package com.example.akifay.entity;

import com.sun.source.doctree.SerialDataTree;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseEntitiy implements Serializable
{
    private Date createdDate;
    private String createdBy;
    private Date updatedDate;
    private String updatedBy;

}
