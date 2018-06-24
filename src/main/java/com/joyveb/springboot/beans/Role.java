package com.joyveb.springboot.beans;

import lombok.Data;

import javax.persistence.*;

@Data
public class Role implements java.io.Serializable{
    private Long id;
    private String name;

}
