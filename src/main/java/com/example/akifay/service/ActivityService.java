package com.example.akifay.service;

import com.example.akifay.dto.ActivityDto;

import java.util.List;

public interface ActivityService
{
    ActivityDto createActivity(ActivityDto activityDto);
    List<ActivityDto> getActivities();
    ActivityDto getActivity(Long id);
    ActivityDto updateActivity(Long id, ActivityDto activityDto);
    Boolean deleteActivity(Long id);
}
