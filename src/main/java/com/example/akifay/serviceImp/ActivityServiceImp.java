package com.example.akifay.serviceImp;

import com.example.akifay.config.ModelMapperConfig;
import com.example.akifay.dto.ActivityDto;
import com.example.akifay.repository.ActivityRepository;
import com.example.akifay.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ActivityServiceImp implements ActivityService
{
    @Autowired
    private final ActivityRepository activityRepository;
    private final ModelMapperConfig modelMapperConfig;


    @Override
    public ActivityDto createActivity(ActivityDto activity) {
        return null;
    }

    @Override
    public List<ActivityDto> getActivities() {
        return null;
    }

    @Override
    public ActivityDto getActivity(Long id) {
        return null;
    }

    @Override
    public ActivityDto updateActivity(Long id, ActivityDto activity) {
        return null;
    }

    @Override
    public Boolean deleteActivity(Long id) {
        return null;
    }
}
