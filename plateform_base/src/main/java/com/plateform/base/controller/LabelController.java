package com.plateform.base.controller;

import com.plateform.base.pojo.Label;
import entity.CommonResponse;
import entity.StatuCode;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {

    @RequestMapping(method = RequestMethod.GET)
    public CommonResponse findAll() {
        return new CommonResponse(StatuCode.ok,true,"查询成功");
    }

    @RequestMapping(path = "/{labelId}",method = RequestMethod.GET)
    public CommonResponse findById(@PathVariable("labelId") String labelId) {
        return new CommonResponse(StatuCode.ok,true,"查询成功");
    }

    @RequestMapping(method = RequestMethod.POST)
    public CommonResponse save(@RequestBody Label label) {
        return new CommonResponse(StatuCode.ok,true,"添加成功");
    }

    @RequestMapping(path = "/{labelId}",method = RequestMethod.PUT)
    public CommonResponse update(@PathVariable("labelId") String labelId,@RequestBody Label label) {
        return new CommonResponse(StatuCode.ok,true,"修改成功");
    }

    @RequestMapping(path = "/{labelId}",method = RequestMethod.DELETE)
    public CommonResponse deleteById(@PathVariable("labelId") String labelId) {
        return new CommonResponse(StatuCode.ok,true,"删除成功");
    }
}
