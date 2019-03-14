package com.deepe.pay.service;

import com.deepe.pay.domain.eo.Enterprise;
import com.deepe.pay.domain.dto.EnterpriseDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * enterprise
 */
public interface EnterpriseService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<Enterprise> findPage(Enterprise eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<Enterprise> findAll(Enterprise eo);

    /**
      获取详情
    * @return
    */
    Enterprise detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,Enterprise eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(Enterprise eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(String pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(String...pk);
}