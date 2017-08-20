package com.woo.explore.service.impl;

import com.woo.explore.dao.AssignmentApplicantDao;
import com.woo.explore.domain.AssignmentApplicant;
import com.woo.explore.domain.Result;
import com.woo.explore.service.AssignmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wuminggu on 2017/8/18.
 */
@Service("assignmentService")
public class AssignmentServiceImpl implements AssignmentService {

    @Autowired
    private AssignmentApplicantDao assignmentApplicantDao;

    public Result getAssignmentList() {
        Result result = new Result();
        List<AssignmentApplicant> res= assignmentApplicantDao.getAssignmentList();
        if (res == null || res.size() == 0) {
            result.setSuccess(false);
            result.setErrorMsg("·µ»ØÖµÎª¿Õ");
            return result;
        }
        result.setData(res);
        return result;
    }
}
