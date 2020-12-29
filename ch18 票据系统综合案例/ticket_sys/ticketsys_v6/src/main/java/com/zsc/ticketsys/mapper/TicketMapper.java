package com.zsc.ticketsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsc.ticketsys.entity.Ticket;
import com.zsc.ticketsys.vo.TicketUserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TicketMapper extends BaseMapper<Ticket> {

}
