package cn.com.busi.service;

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
    String insertInstitutionInfo(String json);

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
}
