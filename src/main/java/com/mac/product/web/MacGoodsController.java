package com.mac.product.web;

import com.mac.common.vo.ResultVo;
import com.mac.dto.MacProductDto;
import com.mac.product.entity.MacGoods;
import com.mac.product.service.IMacGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sqs
 * @Date: 2019/12/14 15:41
 * @Description:
 * @Version: 1.0
 */
@Api(value = "全部产品",tags = "全部产品")
@RestController
public class MacGoodsController {

    @Autowired
    IMacGoodsService macGoodsService;

    @ApiOperation(value ="查询指定商品",notes = "查询指定商品")
    @GetMapping("/api/mac/product/macgoods/findByGoodsId.do")
    public ResultVo queryAllSort(int id) {
        return macGoodsService.findByGoodsId(id);
    }

    @ApiOperation(value ="查询指定标签商品",notes = "查询指定标签商品")
    @GetMapping("/api/mac/product/macgoods/queryByKind.do")
    public ResultVo querySortByUp(int kid) {
        return macGoodsService.queryByKind(kid);
    }

    @ApiOperation(value ="后台管理添加商品",notes = "查询指定标签商品")
    @GetMapping("/api/mac/product/macgoods/addGoods.do")
    public ResultVo addGoods(MacGoods macGoods) {
        return macGoodsService.addGoods(macGoods);
    }


    @ApiOperation(value ="关键字搜索商品",notes = "关键字搜索商品")
    @GetMapping("/api/mac/product/macgoods/findGoodsByKeyWord.do")
    public ResultVo findGoodsByKeyWord(String keyWord) {
        return macGoodsService.findGoodsByKeyWord(keyWord);
    }





}
