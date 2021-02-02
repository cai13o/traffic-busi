package cn.com.busi.service;

import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.io.IOException;

@Component
@WebService(targetNamespace = "http://service.busi.com.cn/")
public interface TrfficWebService {

    /**
     *
     * *********************************************
     * @method      :  InsertZongHeXNJYJLD
     * @description :  新增综合性能检测记录单
     * @date        :  2020/5/28
     * @author      :  WangXiaoTao
     * @version     :  1.0
     * *********************************************
     */
    String insertZongHeXNJYJLD(String json, byte[] zdjygw, byte[] dgjygw, byte[] dlxjygw);

    /**
     *
     * *********************************************
     * @method      :  InsertZongHeXNJYBGD
     * @description :  新增综合性能检测记录单
     * @date        :  2020/5/28
     * @author      :  WangXiaoTao
     * @version     :  1.0
     * *********************************************
     */
    String insertZongHeXNJYBGD(String json);

    /**
     *
     * *********************************************
     * @method      :  InsertZongHeXNJYBGD
     * @description :  新增检测机构基本信息
     * @date        :  2020/5/28
     * @author      :  WangXiaoTao
     * @version     :  1.0
     * *********************************************
     */
    String insertInstitutionInfo (String json) throws IOException;

    /**
     *
     * *********************************************
     * @method      :  InsertZongHeXNJYBGD
     * @description :  新增检测机构人员信息
     * @date        :  2020/5/28
     * @author      :  WangXiaoTao
     * @version     :  1.0
     * *********************************************
     */
    String insertInstitutionPerson (String json);

    /**
     *
     * *********************************************
     * @method      :  InsertZongHeXNJYBGD
     * @description :  新增检测机构设备信息
     * @date        :  2020/5/28
     * @author      :  WangXiaoTao
     * @version     :  1.0
     * *********************************************
     */
    String insertInstitutionDevice (String json);

    /**
     * *********************************************
     *
     * @method :  insertApparatusJDCAQJSJYB
     * @description :  TODO
     * @date :  2021/1/29
     * @author :  caibo
     * @version :  2.0
     * *********************************************
     */
    String insertApparatusJDCAQJSJYB(String json);

    /**
     * *********************************************
     *
     * @method :  insertArtificialJDCAQJSJYB
     * @description :  TODO
     * @date :  2021/1/29
     * @author :  caibo
     * @version :  2.0
     * *********************************************
     */
    String insertArtificialJDCAQJSJYB(String json,byte[] bhgx);

    /**
     * *********************************************
     *
     * @method :  insertJDCAQJSJYBG
     * @description :  TODO
     * @date :  2021/1/29
     * @author :  caibo
     * @version :  2.0
     * *********************************************
     */
    String insertJDCAQJSJYBG(String json,byte[] seal,byte[] ewtm);
}
