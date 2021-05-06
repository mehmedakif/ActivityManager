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
    public ResponseEntity<ActivityDto> createUser(@RequestBody ActivityDto activityDto)
    {
        ActivityDto resultUser = activityService.createActivity(activityDto);
        return ResponseEntity.ok(resultUser);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ActivityDto>> getActivities()
    {
        List<ActivityDto> resultUsers = activityService.getActivities();
        return ResponseEntity.ok(resultUsers);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ActivityDto> getUser(@PathVariable("id") Long id)
    {
        ActivityDto resultUser = activityService.getActivity(id);
        return ResponseEntity.ok(resultUser);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ActivityDto> updateUser(@PathVariable("id") Long id,@RequestBody ActivityDto activityDto)
    {
        ActivityDto resultUser = activityService.updateActivity(id, activityDto);
        return ResponseEntity.ok(resultUser);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id") Long id)
    {
        Boolean result = activityService.deleteActivity(id);
        return ResponseEntity.ok(result);
    }
}
