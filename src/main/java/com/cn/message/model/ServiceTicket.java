package com.cn.message.model;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author syp
 * @package_name com.cn.message.model
 * @date 2019-07-09 10:29
 * @description
 **/
@Data
public class ServiceTicket {

    private String theme;

    private String sender;

    private String receiver;

    private String createTime;

    private String content;

    private String priority;

    private String size;

    private List<InputStream> attachment;



}
