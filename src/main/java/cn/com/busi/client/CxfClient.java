package cn.com.busi.client;

import cn.com.busi.common.LoginInterceptor;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class CxfClient {

    public static void main(String[] args) {
        //CxfClient.main1();
         CxfClient.main2();
    }
    /**
     * 1.代理类工厂的方式,需要拿到对方的接口地址
     */
    public static void main1() {
        try {
            // 接口地址
            String address = "http://127.0.0.1:8889/services/webService?wsdl";
            // 代理工厂
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress(address);
            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass(String.class);
            // 创建一个代理接口实现
            String us = (String) jaxWsProxyFactoryBean.create();


            // 调用代理接口的方法调用并返回结果
            //String result = us.getUserName(userId);
            System.out.println("返回结果:" + us);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 2：动态调用
     */
    public static void main2() {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://127.0.0.1:8889/services/webService?wsdl");
       //  Client client = dcf.createClient("http://1.85.14.166:829/TransportWebService.asmx?wsdl");

        // 需要密码的情况需要加上用户名和密码
         client.getOutInterceptors().add(new LoginInterceptor("admin", "123456"));
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("insertZongHeXNJYBGD",getInfo());
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    public static String getInfo(){
        //第一个接口
       // String s="{Jsontype=STRING, Json={\"Table\":[{\"id\":\"18240288a7c729378f1017297b586ac00ee1\",\"bgbh\":\"610203001202006090053\",\"zzrdzsbh\":\"172705340018\",\"jyjgdz\":\"陕西省铜川市印台区金锁关镇马莲滩村\",\"jyjgdh\":\"0919-7886666\",\"jylsh\":\"610203001202006090017\",\"cphm\":\"陕B38990\",\"wtr\":\"冯守建\",\"dlyszh\":\"610222000975\",\"cllx\":\"重型半挂牵引车\",\"ppxh\":\"解放牌CA4250P25K27T1E5M\",\"zcdjrq\":\"20190604\",\"ccny\":\"20190527\",\"csys\":\"红色\",\"vin\":\"LFWRRX9L6KAB03950\",\"fdjhm\":\"3119C018648\",\"xzqy\":\"610200\",\"gcphm\":\"\",\"gwtr\":\"\",\"gdlyszh\":\"\",\"gcllx\":\"\",\"gppxh\":\"\",\"gzcdjrq\":\"\",\"gccny\":\"\",\"gvin\":\"\",\"gxsz\":\"\",\"jylb\":\"技术等级评定\",\"ywlx\":\"在用\",\"jyrq\":\"2020-06-09 17:52:29\",\"wgjc\":\"1/○\",\"wgjcxm\":\"无/无\",\"dpjc\":\"—\",\"dpjcxm\":\"—\",\"gzxxzd\":\"○\",\"gzxxzdxm\":\"无\",\"wyxrd\":\"—\",\"wyxrdxm\":\"—\",\"hcpd\":\"—\",\"hcpdxm\":\"—\",\"yxjc\":\"—\",\"yxjcxm\":\"—\",\"dlx\":\"59.0\",\"jjx\":\"\",\"yzzdl\":\"\",\"yzbphl\":\"\",\"yzzlzzl\":\"\",\"yzylzzl\":\"\",\"ezzdl\":\"\",\"ezbphl\":\"\",\"ezzlzzl\":\"\",\"ezylzzl\":\"\",\"tzzdl\":\"\",\"tzbphl\":\"\",\"tzzlzzl\":\"\",\"tzylzzl\":\"\",\"fzzdl\":\"\",\"fzbphl\":\"\",\"fzzlzzl\":\"\",\"fzylzzl\":\"\",\"wzzdl\":\"\",\"wzbphl\":\"\",\"wzzlzzl\":\"\",\"wzylzzl\":\"\",\"lzzdl\":\"\",\"lzbphl\":\"\",\"lzzlzzl\":\"\",\"lzylzzl\":\"\",\"dcqyczheczdl\":\"\",\"dcqyczhuczdl\":\"\",\"zdxtsj\":\"\",\"lsmfdd\":\"\",\"lszdwdx\":\"\",\"lspdzcqk\":\"\",\"qzzylxjxslc\":\"\",\"hzzylxjxslc\":\"\",\"csb\":\"37.3\",\"dyzlchl\":\"\",\"dezlchl\":\"\",\"gdshc\":\"\",\"gdsco\":\"\",\"gdslmn\":\"\",\"dshc\":\"\",\"dsco\":\"\",\"wt5025gkco\":\"\",\"wt5025gkhc\":\"\",\"wt5025gkno\":\"\",\"wt2540gkco\":\"\",\"wt2540gkhc\":\"\",\"wt2540gkno\":\"\",\"gxsxs\":\"\",\"lzyd\":\"\",\"jzjsgk100\":\"\",\"jzjsgk90\":\"\",\"jzjsgk80\":\"\",\"sczdgl\":\"\",\"zwdyggq\":\"\",\"zwdygczpyl\":\"\",\"zwdygsppyl\":\"\",\"zwdjgczpyl\":\"\",\"zwdjgsppyl\":\"\",\"zndyggq\":\"\",\"zndygczpyl\":\"\",\"zndygsppyl\":\"\",\"ywdyggq\":\"\",\"ywdygczpyl\":\"\",\"ywdygsppyl\":\"\",\"ywdjgczpyl\":\"\",\"ywdjgsppyl\":\"\",\"yndyggq\":\"\",\"yndygczpyl\":\"\",\"yndygsppyl\":\"\",\"lbsyj\":\"106.4\",\"dlxbzxz\":\"≥40.4\",\"jjxbzxz\":\"\",\"yzzdlbzxz\":\"\",\"yzbphlbzxz\":\"\",\"yzzlzzlbzxz\":\"\",\"yzylzzlbzxz\":\"\",\"ezzdlbzxz\":\"\",\"ezbphlbzxz\":\"\",\"ezzlzzlbzxz\":\"\",\"ezylzzlbzxz\":\"\",\"tzzdlbzxz\":\"\",\"tzbphlbzxz\":\"\",\"tzzlzzlbzxz\":\"\",\"tzylzzlbzxz\":\"\",\"fzzdlbzxz\":\"\",\"fzbphlbzxz\":\"\",\"fzzlzzlbzxz\":\"\",\"fzylzzlbzxz\":\"\",\"wzzdlbzxz\":\"\",\"wzbphlbzxz\":\"\",\"wzzlzzlbzxz\":\"\",\"wzylzzlbzxz\":\"\",\"lzzdlbzxz\":\"\",\"lzbphlbzxz\":\"\",\"lzzlzzlbzxz\":\"\",\"lzylzzlbzxz\":\"\",\"dcqyczheczdlbzxz\":\"\",\"dcqyczhuczdlbzxz\":\"\",\"lsmfddbzxz\":\"\",\"zdxtsjbzxz\":\"\",\"lszdwdxbzxz\":\"\",\"lspdzcqkbzxz\":\"\",\"qzzxjxslbzxz\":\"\",\"qzyxjxslbzxz\":\"\",\"qzzylxjxslcbzxz\":\"\",\"hzzxjxslbzxz\":\"\",\"hzyxjxslbzxz\":\"\",\"hzzylxjxslcbzxz\":\"\",\"csbbzxz\":\"32.8～40\",\"dyzlchlbzxz\":\"\",\"dezlchlbzxz\":\"\",\"gdshcbzxz\":\"\",\"gdscobzxz\":\"\",\"gdslmnbzxz\":\"\",\"dshcbzxz\":\"\",\"dscobzxz\":\"\",\"wt5025gkcobzxz\":\"\",\"wt5025gkhcbzxz\":\"\",\"wt5025gknobzxz\":\"\",\"wt2540gkcobzxz\":\"\",\"wt2540gkhcbzxz\":\"\",\"wt2540gknobzxz\":\"\",\"gxsxsbzxz\":\"\",\"lzydbzxz\":\"\",\"jzjsgk100bzxz\":\"\",\"jzjsgk90bzxz\":\"\",\"jzjsgk80bzxz\":\"\",\"sczdglbzxz\":\"\",\"zwdyggqbzxz\":\"\",\"zwdygczpylbzxz\":\"\",\"zwdygsppylbzxz\":\"\",\"zwdjgczpylbzxz\":\"\",\"zwdjgsppylbzxz\":\"\",\"zndyggqbzxz\":\"\",\"zndygczpylbzxz\":\"\",\"zndygsppylbzxz\":\"\",\"ywdyggqbzxz\":\"\",\"ywdygczpylbzxz\":\"\",\"ywdygsppylbzxz\":\"\",\"ywdjgczpylbzxz\":\"\",\"ywdjgsppylbzxz\":\"\",\"yndyggqbzxz\":\"\",\"yndygczpylbzxz\":\"\",\"yndygsppylbzxz\":\"\",\"lbsyjbzxz\":\"90～115\",\"dlxpd\":\"一级\",\"jjxpd\":\"\",\"yzzdlpd\":\"\",\"yzbphlpd\":\"\",\"yzzlzzlpd\":\"\",\"yzylzzlpd\":\"\",\"ezzdlpd\":\"\",\"ezbphlpd\":\"\",\"ezzlzzlpd\":\"\",\"ezylzzlpd\":\"\",\"tzzdlpd\":\"\",\"tzbphlpd\":\"\",\"tzzlzzlpd\":\"\",\"tzylzzlpd\":\"\",\"fzzdlpd\":\"\",\"fzbphlpd\":\"\",\"fzzlzzlpd\":\"\",\"fzylzzlpd\":\"\",\"wzzdlpd\":\"\",\"wzbphlpd\":\"\",\"wzzlzzlpd\":\"\",\"wzylzzlpd\":\"\",\"lzzdlpd\":\"\",\"lzbphlpd\":\"\",\"lzzlzzlpd\":\"\",\"lzylzzlpd\":\"\",\"dcqyczheczdlpd\":\"\",\"dcqyczhuczdlpd\":\"\",\"lsmfddpd\":\"\",\"zdxtsjpd\":\"\",\"lszdwdxpd\":\"\",\"lspdzcqkpd\":\"\",\"qzzxjxslpd\":\"\",\"qzyxjxslpd\":\"\",\"qzzylxjxslcpd\":\"\",\"hzzxjxslpd\":\"\",\"hzyxjxslpd\":\"\",\"hzzylxjxslcpd\":\"\",\"csbpd\":\"合格\",\"dyzlchlpd\":\"\",\"dezlchlpd\":\"\",\"gdshcpd\":\"\",\"gdscopd\":\"\",\"gdslmnpd\":\"\",\"dshcpd\":\"\",\"dscopd\":\"\",\"wt5025gkcopd\":\"\",\"wt5025gkhcpd\":\"\",\"wt5025gknopd\":\"\",\"wt2540gkcopd\":\"\",\"wt2540gkhcpd\":\"\",\"wt2540gknopd\":\"\",\"gxsxspd\":\"\",\"lzydpd\":\"\",\"jzjsgk100pd\":\"\",\"jzjsgk90pd\":\"\",\"jzjsgk80pd\":\"\",\"sczdglpd\":\"\",\"zwdyggqpd\":\"\",\"zwdygczpylpd\":\"\",\"zwdygsppylpd\":\"\",\"zwdjgczpylpd\":\"\",\"zwdjgsppylpd\":\"\",\"zndyggqpd\":\"\",\"zndygczpylpd\":\"\",\"zndygsppylpd\":\"\",\"ywdyggqpd\":\"\",\"ywdygczpylpd\":\"\",\"ywdygsppylpd\":\"\",\"ywdjgczpylpd\":\"\",\"ywdjgsppylpd\":\"\",\"yndyggqpd\":\"\",\"yndygczpylpd\":\"\",\"yndygsppylpd\":\"\",\"lbsyjpd\":\"合格\",\"bz\":\"\",\"jcjl\":\"一级\",\"zjcs\":\"1\",\"uptime\":\"2020-06-10\",\"dyrq\":\"2020-06-10\"}]}}";
         //第二个接口
        String s="{Jsontype=STRING, Json={\"Table\":[{\"id\":\"18240288a7c729378f1017297b586ac00ee1\",\"jylsh\":\"610203001202006090017\",\"jyjgbh\":\"610203001\",\"jyjgmc\":\"铜川市鼎立机动车检测有限公司\",\"jcxdh\":\"A\",\"wtr\":\"冯守建\",\"dlyszh\":\"610222000975\",\"jylb\":\"技术等级评定\",\"ywlx\":\"在用\",\"jcxb\":\"A\",\"jcrq\":\"2020-06-09 17:52:29\",\"jcjldbh\":\"610203001202006090053\",\"cphm\":\"陕B38990\",\"hpzl\":\"大型汽车\",\"gcpzh\":\"\",\"gclx\":\"\",\"clccrq\":\"20190527\",\"wjdly\":\"白杨\",\"ycy\":\"邱保林\",\"wqczy\":\"杨帆\",\"zcdjrq\":\"20190604\",\"vin\":\"LFWRRX9L6KAB03950\",\"clxh\":\"CA4250P25K27T1E5M\",\"fdjh\":\"3119C018648\",\"csys\":\"红色\",\"xszlc\":\"151352\",\"qdxs\":\"并装双轴驱动\",\"zxzxjxs\":\"非独立\",\"gczs\":\"\",\"yrsfdjedg\":\"316.0\",\"drsednj\":\"\",\"drsedzs\":\"\",\"rllb\":\"天然气\",\"qdlltggxh\":\"12R22.5\",\"zzl\":\"25000.0\",\"cg\":\"3960\",\"qlj\":\"2020\",\"kccc\":\"\",\"kclxdj\":\"\",\"hccsxs\":\"牵引车\",\"qdzs\":\"2\",\"qdzkzzl\":\"5407.0\",\"qycmzzzl\":\"38775.0\",\"bzzxs\":\"并装轴\",\"zxzs\":\"1\",\"qzdzs\":\"二\",\"kczws\":\"\",\"dczs\":\"3\",\"dcc\":\"7415\",\"dck\":\"2495\",\"dcg\":\"3960\",\"gcc\":\"\",\"gck\":\"\",\"gcg\":\"\",\"ygsnfddtz\":\"否\",\"zcz\":\"23\",\"dccxlbgd\":\"\",\"gccxbgd\":\"\",\"jyxm\":\"\",\"fzxs\":\"0.90/0.89\",\"zjycs\":\"1\",\"hjwd\":\"21.9\",\"xdsd\":\"67.5\",\"dqyl\":\"89.9\",\"dbgl\":\"259.1\",\"edcs\":\"40.4\",\"jzl\":\"15383\",\"wdcs\":\"59.0\",\"dlxpd\":\"1\",\"dlxdxcs1\":\"1\",\"yhxz\":\"\",\"yhscz\":\"\",\"jjxpd\":\"\",\"jjxdxcs\":\"\",\"czdxcs\":\"\",\"dcspcz\":\"\",\"dczczdl\":\"\",\"dcsczdl\":\"\",\"dcpd\":\"——\",\"dcdxcs\":\"1\",\"lcspcz\":\"\",\"lczdl1\":\"\",\"lczdl2\":\"\",\"lcsczdl\":\"\",\"lczdxtsj\":\"\",\"lczdpd1\":\"\",\"lczdpd2\":\"\",\"lczdcs1\":\"\",\"lczdcs2\":\"\",\"lczds1\":\"\",\"lczds2\":\"\",\"lczds3\":\"\",\"lczds4\":\"\",\"lczds5\":\"\",\"lczds6\":\"\",\"lczdsx1\":\"\",\"lczdsx2\":\"\",\"lczdsx3\":\"\",\"lczdsx4\":\"\",\"lczdsx5\":\"\",\"lczdsx6\":\"\",\"lczdsxpd\":\"\",\"lczdsxcs\":\"\",\"lczczdb1\":\"\",\"lczczdb2\":\"\",\"lczczdbpd\":\"\",\"lczczdbcs\":\"\",\"dzzdcs\":\"\",\"lscsd\":\"\",\"lscdkd\":\"\",\"lszdjl\":\"\",\"lsmfdd\":\"\",\"lszdwdx\":\"\",\"lszdxtsj\":\"\",\"lsxcpd\":\"\",\"lsxccs\":\"\",\"lszcpd\":\"\",\"lszcqk\":\"\",\"lszcppd\":\"\",\"lszccs\":\"\",\"gdsco\":\"\",\"gdshc\":\"\",\"gds\":\"\",\"dsco\":\"\",\"dshc\":\"\",\"co5025\":\"\",\"hc5025\":\"\",\"no5025\":\"\",\"co2540\":\"\",\"hc2540\":\"\",\"no2540\":\"\",\"drspd\":\"\",\"drscs\":\"\",\"gxs1\":\"\",\"gxs2\":\"\",\"gxs3\":\"\",\"gxspj\":\"\",\"lz1\":\"\",\"lz2\":\"\",\"lz3\":\"\",\"lzpj\":\"\",\"gxs100\":\"\",\"gxs90\":\"\",\"gxs80\":\"\",\"lbgl\":\"\",\"yrpd\":\"\",\"yrcs\":\"\",\"qzzxsl\":\"\",\"qzyxsl\":\"\",\"qzzyc\":\"\",\"qzzypd\":\"\",\"qzxjcs\":\"\",\"hzzxsl\":\"\",\"hzyxsl\":\"\",\"hzzyc\":\"\",\"hzzypd\":\"\",\"hzxjcs\":\"\",\"zwjgdg\":\"\",\"zwygdg\":\"\",\"zwyggq\":\"\",\"zwygcz\":\"\",\"zwygsp\":\"\",\"zwjgcz\":\"\",\"zwjgsp\":\"\",\"zwpd\":\"\",\"zwcs\":\"\",\"znjgdg\":\"\",\"znygdg\":\"\",\"znyggq\":\"\",\"znygcz\":\"\",\"znygsp\":\"\",\"znjgcz\":\"\",\"znjgsp\":\"\",\"znpd\":\"\",\"zncs\":\"\",\"ywjgdg\":\"\",\"ywygdg\":\"\",\"ywyggq\":\"\",\"ywygcz\":\"\",\"ywygsp\":\"\",\"ywjgcz\":\"\",\"ywjgsp\":\"\",\"ywpd\":\"\",\"ywcs\":\"\",\"ynjgdg\":\"\",\"ynygdg\":\"\",\"yndggq\":\"\",\"ynygcz\":\"\",\"ynygsp\":\"\",\"ynjgcz\":\"\",\"ynjgsp\":\"\",\"ynpd\":\"\",\"yncs\":\"\",\"csb\":\"37.3\",\"csbpd\":\"○\",\"csbcs\":\"1\",\"bhgx\":\"无\",\"lbsj\":\"106.4\",\"lbpd\":\"○\",\"lbcs\":\"1\",\"chl1\":\"\",\"chlpd1\":\"\",\"chlcs1\":\"\",\"chl2\":\"\",\"chlpd2\":\"\",\"chlcs2\":\"\",\"zdjygw\":\"\",\"dgjygw\":\"\",\"dlxjygw\":\"20200609141547H201.jpg\"}]}}";
        System.out.println(s);
        return s;
    }
}
