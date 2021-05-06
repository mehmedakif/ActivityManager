package com.example.akifay.service;

import com.example.akifay.dto.ActivityDto;
import com.example.akifay.dto.UserDto;

import java.util.List;

public interface ActivityService
{
    ActivityDto createActivity(ActivityDto activity);
    List<ActivityDto> getActivities();
    ActivityDto getActivity(Long id);
    ActivityDto updateActivity(Long id, ActivityDto activity);
    Boolean deleteActivity(Long id);
}
