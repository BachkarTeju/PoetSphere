package com.youtube.firstProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.youtube.firstProject.model.User;

import com.youtube.firstProject.service.UserServiceIMPL;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class FirstCon {

@Autowired
    UserServiceIMPL obj;

    @GetMapping("/index")
    public String fun1()
     {
        return "index";
    }
    @GetMapping("/login")
    public String fun7()
     {
        return "login";
    }
    @GetMapping("/home")
    public String fun2(@RequestParam String name, @RequestParam String email) 
    {
        System.out.println(name);
        System.out.println(email);
        return "home";
    }
    @GetMapping("/about")
    public String fun3() 
    {
        return "about";
    }
    @GetMapping("/writer")
    public String fun4()
     {
        return "writer";
    }
    
    @GetMapping("/content")
    public String fun5()
     {
        return "content";
    }
    @GetMapping("/community")
    public String fun6() 
    {
        return "community";
    }
    @PostMapping("/home")
    public String f1(@ModelAttribute User c) 
    {
        User b= obj.addUser(c);
        System.out.println(b);
        return "home";
    }
@GetMapping("/deleteUser/{id}")
public String deleteUser(@PathVariable int id) 
{
    obj.deleteUser(id);
    return "redirect:/index"; // Redirect to the index page after deleting the user.
}
@GetMapping ("/getUser")
public String  getAllSignup()
{
   List<User> users = obj.getAllSignup() ;
   users.forEach(data-> System.out.println(data.toString())); 
   return "index";
}
}





//@GetMapping("/updateByEmail")
// public String updateByEmail(@RequestParam String email,@RequestParam String name,@RequestParam String password)
// User updatUser=new User();
// updatUser.setName(name);
// updatUser.setPassword(password);
// updatUser.setContact(password);
// User updated=obj.updateUserByEmail(email,updatedUser);
// if(updated!=null)
// {
//     System.out.println("user updated"+updated);

// }else{
//     System.out.println("user with email"+email+"user not found");
// }
// return "index";
// }

