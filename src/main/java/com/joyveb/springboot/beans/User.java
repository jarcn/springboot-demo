package com.joyveb.springboot.beans;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class User implements java.io.Serializable {

    private Long id;
    private String name;
    private Date createdate;

    private Department deparment;

    private List<Role> roles;

}
