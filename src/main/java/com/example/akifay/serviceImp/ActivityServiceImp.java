package com.example.akifay.serviceImp;

import com.example.akifay.config.ObjectMapperUtils;
import com.example.akifay.dto.ActivityDto;
import com.example.akifay.dto.UserDto;
import com.example.akifay.entity.Activity;
import com.example.akifay.repository.ActivityRepository;
import com.example.akifay.service.ActivityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImp implements ActivityService
{
    @Autowired
    ActivityRepository activityRepository;

    @Override
    public ActivityDto createActivity(ActivityDto activityDto)
    {
        Activity activity = new Activity();
        ObjectMapperUtils.map(activityDto, activity);
        activityRepository.save(activity);
        return activityDto;
    }

    @Override
    public List<ActivityDto> getActivities()
    {
        List<ActivityDto> activityList;
        var activities = activityRepository.findAll();
        return ObjectMapperUtils.mapAll(activities, ActivityDto.class);
    }

    @Override
    public ActivityDto getActivity(Long id)
    {
        Activity activity = activityRepository.getOne(id);
        return ObjectMapperUtils.map(activity, ActivityDto.class);
    }

    @Override
    public ActivityDto updateActivity(Long id, ActivityDto activityDto)
    {
        Activity activity = new Activity();
        activityRepository.deleteById(id);
        ObjectMapperUtils.map(activityDto, activity);
        activityRepository.save(activity);
        return activityDto;
    }

    @Override
    public Boolean deleteActivity(Long id)
    {
        activityRepository.deleteById(id);
        return true;
    }
}
