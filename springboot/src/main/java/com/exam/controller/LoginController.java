package com.exam.controller;

import com.exam.entity.*;
import com.exam.serviceimpl.LoginServiceImpl;
import com.exam.structure.Tree;
import com.exam.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;

    @PostMapping("/login")
    public ApiResult login(@RequestBody Login login) {

        Integer username = login.getUsername();
        String password = login.getPassword();
        Admin adminRes = loginService.adminLogin(username, password);
        if (adminRes != null) {
            return ApiResultHandler.buildApiResult(200, "", adminRes);
        }

        Teacher teacherRes = loginService.teacherLogin(username,password);
        if (teacherRes != null) {
            return ApiResultHandler.buildApiResult(200, "", teacherRes);
        }

        Student studentRes = loginService.studentLogin(username,password);
        if (studentRes != null) {
            return ApiResultHandler.buildApiResult(200, "", studentRes);
        }

        return ApiResultHandler.buildApiResult(200, "", null);
    }

    @GetMapping("/getTree")
    public ApiResult<?> getTree() {
        Tree<Map<String, String>> mapTree = new Tree<>();
        Tree.Node<Map<String, String>> rootNode = mapTree.getRootNode();
        Map<String, String> fLevel = new HashMap<>();
        fLevel.put("id", "1");
        Tree.Node<Map<String, String>> fNode = mapTree.createNode();
        fNode.setNodeEntity(fLevel);

        Map<String, String> sLevel = new HashMap<>();
        sLevel.put("id", "1-1");
        Tree.Node<Map<String, String>> sNode = mapTree.createNode();
        sNode.setNodeEntity(sLevel);
        Map<String, String> sLevel2 = new HashMap<>();
        sLevel2.put("id", "1-2");
        Tree.Node<Map<String, String>> sNode2 = mapTree.createNode();
        sNode2.setNodeEntity(sLevel2);

        rootNode.appendChildNode(fNode);
        fNode.appendChildNode(sNode);
        fNode.appendChildNode(sNode2);
        return ApiResultHandler.buildApiResult(200, "", mapTree);
    }
}
