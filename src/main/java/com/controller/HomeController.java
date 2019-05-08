package com.controller;

import com.pojo.MTest;
import com.service.MTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class HomeController {
        @Autowired
        @Qualifier("testService")
        private MTestService testService;

        @RequestMapping(value = "/get", method = RequestMethod.GET)
        @ResponseBody
        public MTest getTestById(@RequestParam("id") String id) {

            return testService.getById(Integer.parseInt(id));
        }
}
