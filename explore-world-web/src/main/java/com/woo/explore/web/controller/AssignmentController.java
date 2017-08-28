package com.woo.explore.web.controller;


import com.woo.explore.domain.Result;
import com.woo.explore.service.AssignmentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wuminggu on 2017/8/18.
 */
@Controller
@RequestMapping("/assignment")
public class AssignmentController {
    private final Logger LOGGER = LoggerFactory.getLogger(AssignmentController.class);

    @Autowired
    private AssignmentService assignmentService;

    @RequestMapping(value = "/home/getAssignmentList",method = RequestMethod.POST)
    @ResponseBody
    public Result getAssignmentList() {
        Result result = new Result();
        try {
            result = assignmentService.getAssignmentList();
        } catch (Exception e) {
            result.setSuccess(false);
            result.setErrorMsg("取得数据为null");
            LOGGER.error("getAssignmentList result is null");
            return result;
        }
        
        result.setSuccess(true);
        return result;
    }
}
