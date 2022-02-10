package com.zzw.mymall.controller;

import com.zzw.mymall.vo.ResultVo;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 张志伟
 * @version v1.0
 */
@Controller
@RequestMapping("/goods")
@Api(value = "提供商品添加、修改、删除及查询的相关接口",tags = "商品管理")
public class GoodsController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultVo addGoods(){
        return null;
    }

    @RequestMapping(value = "/delete/{gid}", method = RequestMethod.POST)
    public ResultVo deleteGoods(@PathVariable("gid") int goodsId){
        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResultVo updateGoods(int goodsId){
        return null;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultVo listGoods(){
        return null;
    }

}
