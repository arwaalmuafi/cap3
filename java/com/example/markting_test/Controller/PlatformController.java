package com.example.markting_test.Controller;

import com.example.markting_test.Model.Platform;
import com.example.markting_test.Service.PlatformService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/platform")
@RequiredArgsConstructor
public class PlatformController {
    private final PlatformService platformService;
    @GetMapping("/getAll")
    public ResponseEntity getAllPlatforms() {
        return ResponseEntity.ok().body(platformService.getAllPlatform());
    }
    @PostMapping("/add")
    public ResponseEntity addPlatform(@RequestBody@Valid Platform platform) {
        platformService.addPlatform(platform);
        return ResponseEntity.ok().body("platform added successfully");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity updatePlatform(@PathVariable Integer id ,@RequestBody@Valid Platform platform) {
        platformService.updatePlatform(id, platform);
        return ResponseEntity.ok().body("platform updated successfully");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePlatform(@PathVariable Integer id) {
        platformService.deletePlatform(id);
        return ResponseEntity.ok().body("platform deleted successfully");
    }
}
