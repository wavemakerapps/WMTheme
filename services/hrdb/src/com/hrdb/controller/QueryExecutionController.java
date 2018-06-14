/*Generated by WaveMaker Studio*/

package com.hrdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import com.hrdb.models.query.InsertQueryUserRequest;
import com.hrdb.models.query.InsertQuesryEmployeeRequest;
import com.hrdb.models.query.InsertQuesryVacationRequest;
import com.hrdb.service.HrdbQueryExecutorService;

@RestController(value = "Hrdb.QueryExecutionController")
@RequestMapping("/hrdb/queryExecutor")
@Api(value = "QueryExecutionController", description = "controller class for query execution")
public class QueryExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutionController.class);

    @Autowired
    private HrdbQueryExecutorService queryService;

    @RequestMapping(value = "/queries/insertQuesryEmployee", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "insertQuesryEmployee")
    public Integer executeInsertQuesryEmployee(@Valid @RequestBody InsertQuesryEmployeeRequest insertQuesryEmployeeRequest, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: insertQuesryEmployee");
        Integer _result = queryService.executeInsertQuesryEmployee(insertQuesryEmployeeRequest);
        LOGGER.debug("got the result for named query: insertQuesryEmployee, result:{}", _result);
        return _result;
    }

    @RequestMapping(value = "/queries/insertQuery_User", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "insertQuery_User")
    public Integer executeInsertQuery_User(@Valid @RequestBody InsertQueryUserRequest insertQueryUserRequest, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: insertQuery_User");
        Integer _result = queryService.executeInsertQuery_User(insertQueryUserRequest);
        LOGGER.debug("got the result for named query: insertQuery_User, result:{}", _result);
        return _result;
    }

    @RequestMapping(value = "/queries/insertQuesryVacation", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "insertQuesryVacation")
    public Integer executeInsertQuesryVacation(@Valid @RequestBody InsertQuesryVacationRequest insertQuesryVacationRequest, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: insertQuesryVacation");
        Integer _result = queryService.executeInsertQuesryVacation(insertQuesryVacationRequest);
        LOGGER.debug("got the result for named query: insertQuesryVacation, result:{}", _result);
        return _result;
    }

}

