package com.deepe.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepe.pay.domain.eo.Enterprise;
import com.deepe.pay.service.EnterpriseService;
import com.deepe.pay.mapper.EnterpriseMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @Override
    public PageBean<Enterprise> findPage(Enterprise eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<Enterprise> pages =  enterpriseMapper.findList(eo);
        return new PageBean<Enterprise>(pages);
    }

    @Override
    public List<Enterprise> findAll(Enterprise eo) {
        List<Enterprise> list = enterpriseMapper.findList(eo);
        return list;
    }
    @Override
    public Enterprise detail(String pk) {
        Enterprise eo = enterpriseMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,Enterprise eo) {
        Enterprise old = enterpriseMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = enterpriseMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(Enterprise eo) {
        int result = enterpriseMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = enterpriseMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = enterpriseMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}