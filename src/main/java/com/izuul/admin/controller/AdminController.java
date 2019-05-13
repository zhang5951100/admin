package com.izuul.admin.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.izuul.admin.entity.SysUser;
import com.izuul.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/edit")
    public String adminEdit() {
        return "admin-edit";
    }

    @RequestMapping("/add")
    public String adminAdd() {
        return "admin-add";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String adminList(@RequestParam(defaultValue = "1") int pageNum, Model model) {
        PageHelper.startPage(pageNum, 10);
        PageInfo<SysUser> adminList = adminService.findAllSysUsers().toPageInfo();
        model.addAttribute("adminList", adminList);
        return "admin-list";
    }

    @RequestMapping("/cate")
    public String adminCate() {
        return "admin-cate";
    }

    @RequestMapping("/rule")
    public String adminRule() {
        return "admin-rule";
    }

    @RequestMapping("/role")
    public String adminRole() {
        return "admin-role";
    }

    @RequestMapping("/role/edit")
    public String roleEdit() {
        return "role-edit";
    }

    @RequestMapping("/role/add")
    public String roleAdd() {
        return "role-add";
    }
}
