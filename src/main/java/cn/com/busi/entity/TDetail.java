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

/**
 * 实体类
 *
 * @author xuzhanfu
 * @since 2020-05-29
 */
@Data
@ApiModel(value = "TDetail对象", description = "TDetail对象")
public class TDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String jylsh;
	private String bgbh;
	private String zzrdzsbh;
	private String jyjgdz;
	private String jyjgdh;
	private String cphm;
	private String wtr;
	private String dlyszh;
	private String cllx;
	private String ppxh;
	private Date zcdjrq;
	private Date ccny;
	private String csys;
	private String vin;
	private String fdjhm;
	private String xzqy;
	private String gcphm;
	private String gwtr;
	private String gdlyszh;
	private String gcllx;
	private String gppxh;
	private Date gzcdjrq;
	private Date gccny;
	private String gvin;
	private String gxsz;
	private String jylb;
	private String ywlx;
	private Date jyrq;
	private String tDetail;


}
