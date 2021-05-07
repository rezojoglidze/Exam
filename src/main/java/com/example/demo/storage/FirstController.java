package com.example.demo.storage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FirstController {

  @GetMapping("/login")
  public ModelAndView hello() {
    ModelAndView modelAndView = new ModelAndView("login");
    modelAndView.addObject("user", new User("rezo", "joglidze"));
    return modelAndView;
  }

  @GetMapping("/home")
  public ModelAndView home() {
    ModelAndView modelAndView = new ModelAndView("home");
    return modelAndView;
  }

  @RequestMapping(method = RequestMethod.POST, value = "/login")
  public String login(@RequestParam String username, @RequestParam String password, HttpServletResponse httpServletResponse) {
    if (username.equals(password)) {
      Cookie cookie = new Cookie("user_signed", "yes");
      cookie.setHttpOnly(true);
      httpServletResponse.addCookie(cookie);
      return "redirect:home";
    }
    Cookie cookie = new Cookie("user_signed", "no");
    cookie.setHttpOnly(true);
    httpServletResponse.addCookie(cookie);
    return "redirect:login";
  }

}
