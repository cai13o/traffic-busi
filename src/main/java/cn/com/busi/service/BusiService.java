package cn.com.busi.service;

import java.io.IOException;

public interface BusiService {

    /**
     * *********************************************
     *
     * @method :  insertZongHeXNJYJLD
     * @description :  TODO
     * @date :  2020/5/29
     * @author :  WangXiaoTao
     * @version :  1.0
     * *********************************************
     */
    String insertZongHeXNJYJLD(String json, byte[] zdjygw, byte[] dgjygw, byte[] dlxjygw);

    /**
     * *********************************************
     *
     * @class :  insertZongHeXNJYBGD
     * @description :  TODO
     * @date :  2020/5/29
     * @author :  WangXiaoTao
     * @version :  1.0
     * *********************************************
     */
    String insertZongHeXNJYBGD(String json);

    /**
     * *********************************************
     *
     * @class :  insertInstitutionInfo
     * @description :  TODO
     * @date :  2020/7/6
     * @author :  cai13o
     * @version :  1.0
     * *********************************************
     */
    String insertInstitutionInfo(String json) throws IOException;

    /**
     * *********************************************
     *
     * @class :  insertInstitutionPerson
     * @description :  TODO
     * @date :  2020/7/6
     * @author :  cai13o
     * @version :  1.0
     * *********************************************
     */
    String insertInstitutionPerson(String json);

    /**
     * *********************************************
     *
     * @class :  insertInstitutionDevice
     * @description :  TODO
     * @date :  2020/7/6
     * @author :  cai13o
     * @version :  1.0
     * *********************************************
     */
    String insertInstitutionDevice(String json);

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
     * @method :  insertApparatusJDCAQJSJYB
     * @description :  TODO
     * @date :  2021/1/29
     * @author :  caibo
     * @version :  2.0
     * *********************************************
     */
    String insertJDCAQJSJYBG(String json,byte[] seal,byte[] ewtm);
}
