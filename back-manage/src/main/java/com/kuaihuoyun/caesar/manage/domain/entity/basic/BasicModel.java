/**
 * Copyright (C) 2015-? WWW.KUAIHUOYUN.COM.
 *
 * @Author BaoFeng (bf@kuaihuoyun.com)
 */
package com.kuaihuoyun.caesar.manage.domain.entity.basic;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class BasicModel {

    @Id
    @GeneratedValue
    @Column
    private int id; //自增主键id
    @Column(nullable = false)
    private int oid; //机构ID
    @Column(nullable = false)
    private int cid; //公司ID
    @Column(nullable = false)
    private int eid; //员工ID
    @Column(nullable = false, columnDefinition = "int default 0")
    private int updatedBy; //最后修改人
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date created; //创建时间
    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Date updated; //修改时间
    @Column(nullable = false, columnDefinition = "tinyint(1) default 0")
    private boolean disabled; //是否禁用
    @Column(nullable = false, columnDefinition = "tinyint(1) default 0")
    private boolean deleted; //是否删除
    @Column(nullable = false, columnDefinition = "int default 0")
    private int belongOid; //上级机构
}
