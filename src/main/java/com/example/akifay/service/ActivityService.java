package com.example.akifay.service;

import com.example.akifay.dto.ActivityDto;
import com.example.akifay.entity.Activity;

import java.util.List;
import java.util.Optional;

public interface ActivityService
{
    ActivityDto createActivity(ActivityDto activityDto);
    List<ActivityDto> getActivities();
    ActivityDto getActivity(Long id);
    ActivityDto updateActivity(Long id, ActivityDto activityDto);
    Boolean deleteActivity(Long id);
}
