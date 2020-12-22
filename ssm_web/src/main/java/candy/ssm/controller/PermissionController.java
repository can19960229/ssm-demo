package candy.ssm.controller;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/21 19:52
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Permission;
import candy.ssm.service.IPermissionService;
import candy.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *
 */
@RequestMapping("/permission")
@Controller
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;


    @RequestMapping("/save.do")
    public String save(Permission permission) throws Exception {

        permissionService.save(permission);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Permission> permissionList = permissionService.findAll();
        mv.addObject("permissionList",permissionList);
        mv.setViewName("permission-list");
        return mv;
    }

    //查询资源权限详情
    @RequestMapping("/findById")
    public ModelAndView findById(String id) throws Exception{
        Permission permission = permissionService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("permission-show");
        mv.addObject("permission",permission);
        return mv;
    }

    @RequestMapping("/deletePermission")
    public String deletePermission(String id) throws Exception {
        permissionService.deleteById(id);
        return "redirect:findAll.do";
    }
}
