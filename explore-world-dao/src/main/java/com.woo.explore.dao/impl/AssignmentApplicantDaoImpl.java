package com.woo.explore.dao.impl;


import com.woo.explore.dao.AssignmentApplicantDao;
import com.woo.explore.domain.AssignmentApplicant;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wuminggu on 2017/8/18.
 */
@Repository("assignmentApplicantDao")
public class AssignmentApplicantDaoImpl implements AssignmentApplicantDao {

    @Autowired
    private SqlSessionTemplate releaseSqlSession;

    public List<AssignmentApplicant> getAssignmentList() {
        return releaseSqlSession.selectList("AssignmentApplicants.getAssignmentList");
    }
}
