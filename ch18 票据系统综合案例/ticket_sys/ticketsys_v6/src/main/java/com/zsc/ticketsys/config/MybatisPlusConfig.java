package com.zsc.ticketsys.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

//    /**
//     * 分页插件
//     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        // 开启 count 的 join 优化,只针对 left join !!!
//        return  new PaginationInterceptor();
//     //   return new PaginationInterceptor().setCountSqlParser(new JsqlParserCountOptimize(true));
//    }
}
