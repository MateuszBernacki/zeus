package com.MateuszBernacki.zeus.module.dashboard;


import com.MateuszBernacki.zeus.module.dashboard.dto.MenuDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MenuService {

    public List<MenuDto> getMenu() {
        return List.of(
                new MenuDto("AWS", "http://michalszalkowski.com/aws/"),
                new MenuDto("Security", "http://michalszalkowski.com/security/"),
                new MenuDto("Java", "http://michalszalkowski.com/java/")
        );
    }
}
