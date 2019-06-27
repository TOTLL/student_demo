package com.qf.controller;

import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("stu")
public class StuController {

    @Autowired
    IStuService stuService;

    @Autowired
    IClassesService classesService;
    @RequestMapping("stuList")
    public Object queryAll(Model model){
        List<Student> list = stuService.getList();
        model.addAttribute("list",list);
        return "stuList";
    }
    @RequestMapping("delete")
    public Object delete(int id){
        stuService.delete(id);
        return "redirect:/stu/stuList";
    }
    @RequestMapping("toadd")
    public  Object toadd(Model model){
        List<Classes> list=classesService.queryClasses();
        model.addAttribute("list",list);
        return "addStu";
    }
    @RequestMapping("add")
    public Object add(Student student){
        stuService.insert(student);
        return "redirect:/stu/stuList";
    }
    @RequestMapping("getId")
    public Object getId(int id, Model model){
        Student student=stuService.getId(id);
        Classes infoByStuId = classesService.getInfoByStuId(student.getCid());
        student.setClasses(infoByStuId);
        List<Classes> list = classesService.queryClasses();
        model.addAttribute("list",list);
        model.addAttribute("stu",student);
        return "update";
    }
    @RequestMapping("update")
    public Object update(Student student){
        stuService.update(student);
        return "redirect:/stu/stuList";
    }
}
