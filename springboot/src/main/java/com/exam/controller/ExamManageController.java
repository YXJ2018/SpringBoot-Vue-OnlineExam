package com.exam.controller;

import com.exam.entity.ApiResult;
import com.exam.entity.Exammanage;
import com.exam.serviceimpl.ExamManageServiceImpl;
import com.exam.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExamManageController {

    @Autowired
    private ExamManageServiceImpl examManageService;

    @GetMapping("/exams")
    public ApiResult findAll(){
        System.out.println("查询全部");
        return ApiResultHandler.buildApiResult(200,"请求成功！",examManageService.findAll());
    }

    @GetMapping("/exam/{examCode}")
    public ApiResult findById(@PathVariable("examCode") Integer examCode){
        System.out.println("根据ID查找");
        Exammanage res = examManageService.findById(examCode);
        if(res == null) {
            return ApiResultHandler.buildApiResult(10000,"考试编号不存在",null);
        }
        return ApiResultHandler.buildApiResult(200,"请求成功！",res);
    }

    @DeleteMapping("/exam/{examCode}")
    public ApiResult deleteById(@PathVariable("examCode") Integer examCode){
        int res = examManageService.delete(examCode);
        System.out.println(res);
        if (res == 0) {
            return ApiResultHandler.buildApiResult(10000,"考试编号不存在",null);
        }
        return ApiResultHandler.buildApiResult(200,"删除成功",res);
    }

    @PutMapping("/exam/{examCode}")
    public ApiResult update(@PathVariable("examCode") Integer examCode, Exammanage exammanage){
        int res = examManageService.update(exammanage);
//        if (res == 0) {
//            return ApiResultHandler.buildApiResult(20000,"请求参数错误");
//        }
        System.out.printf("更新操作执行---");
        return ApiResultHandler.buildApiResult(200,"更新成功",res);
    }

    @PostMapping("/examCode")
    public ApiResult add(Exammanage exammanage){
        int res = examManageService.update(exammanage);
//        if (res == 0) {
//            return ApiResultHandler.buildApiResult(20000,"请求参数错误",null);
//        }
        return ApiResultHandler.buildApiResult(200,"添加成功",res);
    }
}
