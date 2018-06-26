package com.test.controller;

import com.github.pagehelper.PageInfo;
import com.test.service.TDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.model.TDomain;

/**
 * @author chenxing
 *         Created by ChenXing on 2018/6/22.
 */
@Controller
public class TestController {
    @Autowired
    TDomainService tDomainService;

    @RequestMapping(path = "oracle")
    public @ResponseBody PageInfo test(){
        PageInfo<TDomain> pageInfo= tDomainService.searchDomain(new TDomain(),1,10);
        return pageInfo;
    }
}
