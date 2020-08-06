package cn.com.busi;

import cn.com.busi.entity.TRecord;
import cn.com.busi.mapper.TRecordDao;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Objects;

/**
 * @BelongsProject: traffic-busi
 * @BelongsPackage: cn.com.busi
 * @Author: Administrator
 * @CreateTime: 2020-08-03 13:39
 * @Description:
 */

public class test {

    public static void main(String[] args) throws ClassNotFoundException {
        byte[] data = null;
        String imagePath = "D:\\umpay_pm2.0.0\\umpay_pm2.0.0\\web\\static\\img\\login-ico1.png";
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imagePath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串
        System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(data)));
        String encode = encoder.encode(Objects.requireNonNull(data));
        TRecord tRecord = new TRecord();
        tRecord.setId("123");
        tRecord.setZdjygw(encode);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/wolf-cloud?useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true&tinyInt1isBit=false&allowMultiQueries=true&serverTimezone=GMT%2B8&allowPublicKeyRetrieval=true",
                    "root", "root");
            String sql1 = "insert into t_record (id,zdjygw) values(?,?)";
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setString(1,tRecord.getId());
            pst.setString(2,tRecord.getZdjygw());
            pst.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void main1(String[] args){

    }
}
