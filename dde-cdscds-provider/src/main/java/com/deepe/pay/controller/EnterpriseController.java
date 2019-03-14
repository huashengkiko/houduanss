package com.deepe.pay.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepe.pay.service.EnterpriseService;
import com.deepe.pay.domain.eo.Enterprise;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/企业 -供应商-医院", description = "$desc")
@RestController
@RequestMapping("/api/v1/enterprises")
public class  EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(Enterprise eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(enterpriseService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(Enterprise eo) {
        return new Payload(enterpriseService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(enterpriseService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改Enterprise")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody Enterprise eo) {
     eo.setId(pk);
     return new Payload(enterpriseService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建Enterprise", notes = "创建Enterprise")
    public Payload create(@RequestBody Enterprise eo) {
        return new Payload(enterpriseService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除Enterprise", notes = "根据id删除Enterprise")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(enterpriseService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除Enterprise", notes = "根据id批量删除Enterprise")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(enterpriseService.delete(ids));
    }

}