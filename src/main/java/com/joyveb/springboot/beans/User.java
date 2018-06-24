package com.joyveb.springboot.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
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
