package com.javaee.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javaee.ticketsys.model.Audit;
import com.javaee.ticketsys.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AuditMapper extends BaseMapper<Audit> {


}
