package cn.com.busi.enums;



/**
 *
 * *********************************************
 * @class       :  BusiEnum
 * @description :  业务处理错误枚举类
 * @date        :  2020/5/29
 * @author      :  WangXiaoTao
 * @version     :  1.0
 * *********************************************
 */
public enum BusiEnum implements AbstartEnum {
    E0000("0000","成功"),
    E1001("1001","报文格式不对"),
    E1002("1002","没有上送主键"),
    E8999("8999","数据库操作异常"),
    E9999("9999","系统异常")
    ;

     String code;
     String message;

    BusiEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BusiEnum{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
