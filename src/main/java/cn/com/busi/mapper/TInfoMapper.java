
package cn.com.busi.mapper;


import cn.com.busi.entity.TInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TInfoMapper{

    /**
     *
     * *********************************************
     * @method      :  inserTInfo
     * @description :  新增
     * @date        :  2020/5/29
     * @author      :  WangXiaoTao
     * @version     :  1.0
     * *********************************************
     */
  void inserTInfo(TInfo tInfo);
}
