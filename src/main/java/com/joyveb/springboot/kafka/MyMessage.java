package com.joyveb.springboot.kafka;

import lombok.Data;

import java.util.Date;

/**
 * @author: chenjia
 * @date: 2018/6/28 21:49
 * @decription:
 * @modified By:
 */

@Data
public class MyMessage {

    private String id;

    private String msg;

    private Date sendTime;
}
