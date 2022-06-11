package com.zzw.mymall.controller;

import com.zzw.mymall.vo.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张志伟
 * @version v1.0
 */
@RestController
@RequestMapping("/goods")
@Api(value = "提供商品添加、修改、删除及查询的相关接口",tags = "商品管理")
public class GoodsController {

    @PostMapping("/add")
    public ResultVo addGoods(){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResultVo deleteGoods(@PathVariable("id") int goodsId){
        System.out.println("-----" + goodsId);
        return new ResultVo(10000, "删除成功", null);
    }

    @PutMapping("/{id}")
    public ResultVo updateGoods(@PathVariable("id") int goodsId){
        return null;
    }

    @GetMapping("/list")
    public ResultVo listGoods(){
        return null;
    }

    @GetMapping("/id")
    public ResultVo get(@PathVariable("id") int goodsId){
        return null;
    }

}
