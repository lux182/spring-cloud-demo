package com.kuaihuoyun.caesar.manage.domain.entity.user;

import com.kuaihuoyun.caesar.manage.domain.entity.basic.BasicModel;
import lombok.Data;

/**
 * Created by xs on 2017/5/22.
 */
@Data
//@Entity
//@Table(name = "t_basic_employee")
public class Employee extends BasicModel {

    private String username; //用户名

    private String password; //密码

    private String name; //姓名

    private String employeeNumber;//职工号

    private String addr; //地址

    private String desc; //备注

    private int province; //省份id

    private int city; //城市id

    private int county; //区县id

    private String phone1; //电话

    private String phone2; //电话

    private String phone3; //电话

    private int rid; //所属角色

    private String token; //TOKEN
}
