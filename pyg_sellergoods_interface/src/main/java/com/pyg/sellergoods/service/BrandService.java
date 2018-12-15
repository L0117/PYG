package com.pyg.sellergoods.service;

import com.pyg.pojo.TbBrand;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * @author 刘鹏飞
 */
public interface BrandService {

    List<TbBrand> findAll();

    /**
     * 分页
     * @param pageNum 当前页码
     * @param pageSize 每页记录数
     * @return
     */
    PageResult findPage(int pageNum,int pageSize);

    /**
     * 增加
     * @param brand
     */
    void add(TbBrand brand);

    /**
     * 修改
     * @param brand
     */
    void update(TbBrand brand);

    /**
     * 获取实体类
     * @param id
     * @return
     */
    TbBrand findOne(Long id);

    /**
     * 批量删除
     * @param ids
     */
    void delete(Long[] ids);

    /**
     * 分页
     * @param brand
     * @param pageNum  当前页码
     * @param pageSize  每页记录数
     * @return
     */
    PageResult findPage(TbBrand brand,int pageNum,int pageSize);
    /**
     * 品牌下拉框数据
     */
    List<Map> selectOptionList();
}


