/*
 *      Copyright (c) 2000-2019, Bmac Inc All rights reserved.
 *
 *  Author: xuzhanfu (xuzhanfu@bmac.com.cn)
 */
package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@ApiModel(value = "TInfo对象", description = "TInfo对象")
public class TInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String jylsh;
	private String jyjgbh;
	private String jyjgmc;
	private String jcxdh;
	private String wtr;
	private String dlyszh;
	private String jylb;
	private String ywlx;
	private String jcxb;
	private Date jcrq;
	private String jcjldbh;
	private String cphm;
	private String hpzl;
	private String gcpzh;
	private String gclx;
	private Date clccrq;
	private String wjdly;
	private String ycy;
	private String wqczy;
	private Date zcdjrq;
	private String vin;
	private String clxh;
	private String fdjh;
	private String csys;
	private String xszlc;
	private String qdxs;
	private String zxzxjxs;
	private String gczs;
	private String zdjygw;
	private String dgjygw;
	private String dlxjygw;
	private String tDetail;

}
