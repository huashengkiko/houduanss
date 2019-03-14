package com.deepe.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepe.pay.domain.eo.Enterprise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  EnterpriseMapper extends BaseMapper<Enterprise> {

    List<Enterprise> findList(@Param("eo")  Enterprise eo);

    int deleteByIds(@Param("ids") List<String> ids);

}