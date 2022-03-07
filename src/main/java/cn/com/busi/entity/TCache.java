package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 实体类
 *
 * @author xuzhanfu
 * @since 2020-05-29
 */
@Data
@ApiModel(value = "TCache对象", description = "TCache对象")
public class TCache implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String result;

}
