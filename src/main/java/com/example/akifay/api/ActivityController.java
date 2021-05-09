package com.example.akifay.api;

import com.example.akifay.dto.ActivityDto;
import com.example.akifay.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController
{
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService){

        this.activityService = activityService;
    }
    @PostMapping("/create")
    public ResponseEntity<ActivityDto> createActivity(@RequestBody ActivityDto activityDto)
    {
        ActivityDto resultActivity = activityService.createActivity(activityDto);
        return ResponseEntity.ok(resultActivity);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ActivityDto>> getActivities()
    {
        List<ActivityDto> resultActivity = activityService.getActivities();
        return ResponseEntity.ok(resultActivity);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ActivityDto> getActivity(@PathVariable Long id)
    {
        ActivityDto resultActivity = activityService.getActivity(id);
        return ResponseEntity.ok(resultActivity);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ActivityDto> updateActivity(@PathVariable Long id,@RequestBody ActivityDto activityDto)
    {
        ActivityDto resultActivity = activityService.updateActivity(id, activityDto);
        return ResponseEntity.ok(resultActivity);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Boolean> deleteActivity(@PathVariable Long id)
    {
        Boolean result = activityService.deleteActivity(id);
        return ResponseEntity.ok(result);
    }
}
