package com.MateuszBernacki.zeus.module.dashboard;


import com.MateuszBernacki.zeus.module.dashboard.dto.ArticleDto;
import com.MateuszBernacki.zeus.module.dashboard.dto.CommentDto;
import com.MateuszBernacki.zeus.module.dashboard.dto.MenuDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DashboardController {

    @Autowired
    private  ArticleService articleService;

    @Autowired
    private MenuService menuService;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {

        model.addAttribute("menu", menuService.getMenu() );
        model.addAttribute("article", articleService.getArticle());

        return "dashboard.html";
    }


}
