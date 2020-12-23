package candy.ssm.controller;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/15 10:48
 * version 1.0
 * Description: 商品中控制器类
 */

import candy.ssm.domain.Product;
import candy.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;



    //产品添加
    @RequestMapping("/save.do")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }

    //查询全部产品
    @RequestMapping("/findAll.do")
    @RolesAllowed("ADMIN")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> ps = productService.findAll();
        mv.addObject("productList", ps);
        mv.setViewName("product-list");
        return mv;

    }
}
