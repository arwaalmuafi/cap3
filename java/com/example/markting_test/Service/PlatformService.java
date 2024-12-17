package com.example.markting_test.Service;
import com.example.markting_test.ApiResponse.ApiException;
import com.example.markting_test.Model.Platform;
import com.example.markting_test.Repository.PlatformRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlatformService {
    private final PlatformRepository platformRepository;

    public List<Platform> getAllPlatform(){
        return platformRepository.findAll();
    }

    public void addPlatform(Platform platform){
        platformRepository.save(platform);
    }

    public void updatePlatform(Integer id ,Platform platform){
        Platform platform1 = platformRepository.findPlatformById(id);
        if(platform1 == null){
            throw new ApiException("platform not found");
        }
        platform1.setPlatform_name(platform.getPlatform_name());
        platform1.setPlatform_followers(platform.getPlatform_followers());
        platformRepository.save(platform1);
    }

    public void deletePlatform(Integer id){
        Platform platform = platformRepository.findPlatformById(id);
        if(platform == null){
            throw new ApiException("platform not found");
        }
        platformRepository.delete(platform);
    }
}
