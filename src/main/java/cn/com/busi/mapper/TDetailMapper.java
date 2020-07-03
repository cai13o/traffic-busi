
package cn.com.busi.mapper;

import cn.com.busi.entity.TDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TDetailMapper{

	/**
	 *
	 * *********************************************
	 * @method      :  insertTDetail
	 * @description :  新增
	 * @date        :  2020/5/29
	 * @author      :  WangXiaoTao
	 * @version     :  1.0
	 * *********************************************
	 */
	void insertTDetail(TDetail tDetail);

}
