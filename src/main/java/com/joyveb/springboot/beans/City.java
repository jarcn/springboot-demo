package com.joyveb.springboot.beans;

import lombok.Data;

/**
 * `id` varchar(10) NOT NULL,
 * `province_id` varchar(10) DEFAULT NULL,
 * `city_name` varchar(10) DEFAULT NULL,
 * `description` varchar(10) DEFAULT NULL,
 */
@Data
public class City {

    private String id;
    private String provinceId;
    private String cityName;
    private String description;
}
