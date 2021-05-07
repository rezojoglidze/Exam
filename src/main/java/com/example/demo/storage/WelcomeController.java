package com.example.demo.storage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WelcomeController {

  @GetMapping("/login")
  public ModelAndView hello() {
    ModelAndView modelAndView = new ModelAndView("login");
    modelAndView.addObject("hello", new Hello("helloA", "HelloB"));
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

  class Hello {
    private String hello1;
    private String hello2;

    public Hello(String hello1, String hello2) {
      this.hello1 = hello1;
      this.hello2 = hello2;
    }

    public String getHello1() {
      return hello1;
    }

    public void setHello1(String hello1) {
      this.hello1 = hello1;
    }

    public String getHello2() {
      return hello2;
    }

    public void setHello2(String hello2) {
      this.hello2 = hello2;
    }
  }
}
