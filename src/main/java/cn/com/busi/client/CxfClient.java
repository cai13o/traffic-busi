package cn.com.busi.client;

import cn.com.busi.common.LoginInterceptor;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

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
//        Client client = dcf.createClient("http://1.85.14.166:19071/services/webService?wsdl");
        Client client = dcf.createClient("http://localhost:8889/services/webService?wsdl");
        //  Client client = dcf.createClient("http://1.85.14.166:829/TransportWebService.asmx?wsdl");

        // 需要密码的情况需要加上用户名和密码
        client.getOutInterceptors().add(new LoginInterceptor("admin", "123456"));
        Object[] objects = new Object[0];
        String imgpath = "D:\\1.jpg";//"D:\\1.jpg";
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("insertArtificialJDCAQJSJYB", getInfo(), ImageToBase64(imgpath), ImageToBase64(imgpath), ImageToBase64(imgpath));
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static String getInfo() {
        //insertZongHeXNJYBGD接口
//        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"csk202008310001\",\"bgbh\":\"610203001202006090017\",\"zzrdzsbh\":\"172705340018\",\"jyjgdz\":\"西安市雁塔区\",\"jyjgdh\":\"029-88888888\",\"jylsh\":\"610203001202006090017\",\"cphm\":\"陕A00000\",\"wtr\":\"冯守建\",\"dlyszh\":\"610222000975\",\"cllx\":\"重型仓栅式货车\",\"ppxh\":\"解放牌CA4250P25K27T1E5M\",\"zcdjrq\":\"20190604\",\"ccny\":\"20190527\",\"csys\":\"红色\",\"vin\":\"LFWRRX9L6KAB03950\",\"fdjhm\":\"3119C018648\",\"xzqy\":\"西安市雁塔区\",\"gcphm\":\"\",\"gwtr\":\"\",\"gdlyszh\":\"\",\"gcllx\":\"\",\"gppxh\":\"\",\"gzcdjrq\":\"\",\"gccny\":\"\",\"gvin\":\"\",\"gxsz\":\"\",\"jylb\":\"技术等级评定\",\"ywlx\":\"在用\",\"jyrq\":\"2020-06-09 17:52:29\",\"wgjc\":\"1/○\",\"wgjcxm\":\"无/无\",\"dpjc\":\"—\",\"dpjcxm\":\"—\",\"gzxxzd\":\"○\",\"gzxxzdxm\":\"无\",\"wyxrd\":\"—\",\"wyxrdxm\":\"—\",\"hcpd\":\"—\",\"hcpdxm\":\"—\",\"yxjc\":\"—\",\"yxjcxm\":\"—\",\"dlx\":\"59.0\",\"jjx\":\"\",\"yzzdl\":\"\",\"yzbphl\":\"\",\"yzzlzzl\":\"\",\"yzylzzl\":\"\",\"ezzdl\":\"\",\"ezbphl\":\"\",\"ezzlzzl\":\"\",\"ezylzzl\":\"\",\"tzzdl\":\"\",\"tzbphl\":\"\",\"tzzlzzl\":\"\",\"tzylzzl\":\"\",\"fzzdl\":\"\",\"fzbphl\":\"\",\"fzzlzzl\":\"\",\"fzylzzl\":\"\",\"wzzdl\":\"\",\"wzbphl\":\"\",\"wzzlzzl\":\"\",\"wzylzzl\":\"\",\"lzzdl\":\"\",\"lzbphl\":\"\",\"lzzlzzl\":\"\",\"lzylzzl\":\"\",\"dcqyczheczdl\":\"\",\"dcqyczhuczdl\":\"\",\"zdxtsj\":\"\",\"lsmfdd\":\"\",\"lszdwdx\":\"\",\"lspdzcqk\":\"\",\"qzzylxjxslc\":\"\",\"hzzylxjxslc\":\"\",\"csb\":\"37.3\",\"dyzlchl\":\"\",\"dezlchl\":\"\",\"gdshc\":\"\",\"gdsco\":\"\",\"gdslmn\":\"\",\"dshc\":\"\",\"dsco\":\"\",\"wt5025gkco\":\"\",\"wt5025gkhc\":\"\",\"wt5025gkno\":\"\",\"wt2540gkco\":\"\",\"wt2540gkhc\":\"\",\"wt2540gkno\":\"\",\"gxsxs\":\"\",\"lzyd\":\"\",\"jzjsgk100\":\"\",\"jzjsgk90\":\"\",\"jzjsgk80\":\"\",\"sczdgl\":\"\",\"zwdyggq\":\"\",\"zwdygczpyl\":\"\",\"zwdygsppyl\":\"\",\"zwdjgczpyl\":\"\",\"zwdjgsppyl\":\"\",\"zndyggq\":\"\",\"zndygczpyl\":\"\",\"zndygsppyl\":\"\",\"ywdyggq\":\"\",\"ywdygczpyl\":\"\",\"ywdygsppyl\":\"\",\"ywdjgczpyl\":\"\",\"ywdjgsppyl\":\"\",\"yndyggq\":\"\",\"yndygczpyl\":\"\",\"yndygsppyl\":\"\",\"lbsyj\":\"106.4\",\"dlxbzxz\":\"≥40.4\",\"jjxbzxz\":\"\",\"yzzdlbzxz\":\"\",\"yzbphlbzxz\":\"\",\"yzzlzzlbzxz\":\"\",\"yzylzzlbzxz\":\"\",\"ezzdlbzxz\":\"\",\"ezbphlbzxz\":\"\",\"ezzlzzlbzxz\":\"\",\"ezylzzlbzxz\":\"\",\"tzzdlbzxz\":\"\",\"tzbphlbzxz\":\"\",\"tzzlzzlbzxz\":\"\",\"tzylzzlbzxz\":\"\",\"fzzdlbzxz\":\"\",\"fzbphlbzxz\":\"\",\"fzzlzzlbzxz\":\"\",\"fzylzzlbzxz\":\"\",\"wzzdlbzxz\":\"\",\"wzbphlbzxz\":\"\",\"wzzlzzlbzxz\":\"\",\"wzylzzlbzxz\":\"\",\"lzzdlbzxz\":\"\",\"lzbphlbzxz\":\"\",\"lzzlzzlbzxz\":\"\",\"lzylzzlbzxz\":\"\",\"dcqyczheczdlbzxz\":\"\",\"dcqyczhuczdlbzxz\":\"\",\"lsmfddbzxz\":\"\",\"zdxtsjbzxz\":\"\",\"lszdwdxbzxz\":\"\",\"lspdzcqkbzxz\":\"\",\"qzzxjxslbzxz\":\"\",\"qzyxjxslbzxz\":\"\",\"qzzylxjxslcbzxz\":\"\",\"hzzxjxslbzxz\":\"\",\"hzyxjxslbzxz\":\"\",\"hzzylxjxslcbzxz\":\"\",\"csbbzxz\":\"32.8～40\",\"dyzlchlbzxz\":\"\",\"dezlchlbzxz\":\"\",\"gdshcbzxz\":\"\",\"gdscobzxz\":\"\",\"gdslmnbzxz\":\"\",\"dshcbzxz\":\"\",\"dscobzxz\":\"\",\"wt5025gkcobzxz\":\"\",\"wt5025gkhcbzxz\":\"\",\"wt5025gknobzxz\":\"\",\"wt2540gkcobzxz\":\"\",\"wt2540gkhcbzxz\":\"\",\"wt2540gknobzxz\":\"\",\"gxsxsbzxz\":\"\",\"lzydbzxz\":\"\",\"jzjsgk100bzxz\":\"\",\"jzjsgk90bzxz\":\"\",\"jzjsgk80bzxz\":\"\",\"sczdglbzxz\":\"\",\"zwdyggqbzxz\":\"\",\"zwdygczpylbzxz\":\"\",\"zwdygsppylbzxz\":\"\",\"zwdjgczpylbzxz\":\"\",\"zwdjgsppylbzxz\":\"\",\"zndyggqbzxz\":\"\",\"zndygczpylbzxz\":\"\",\"zndygsppylbzxz\":\"\",\"ywdyggqbzxz\":\"\",\"ywdygczpylbzxz\":\"\",\"ywdygsppylbzxz\":\"\",\"ywdjgczpylbzxz\":\"\",\"ywdjgsppylbzxz\":\"\",\"yndyggqbzxz\":\"\",\"yndygczpylbzxz\":\"\",\"yndygsppylbzxz\":\"\",\"lbsyjbzxz\":\"90～115\",\"dlxpd\":\"一级\",\"jjxpd\":\"\",\"yzzdlpd\":\"\",\"yzbphlpd\":\"\",\"yzzlzzlpd\":\"\",\"yzylzzlpd\":\"\",\"ezzdlpd\":\"\",\"ezbphlpd\":\"\",\"ezzlzzlpd\":\"\",\"ezylzzlpd\":\"\",\"tzzdlpd\":\"\",\"tzbphlpd\":\"\",\"tzzlzzlpd\":\"\",\"tzylzzlpd\":\"\",\"fzzdlpd\":\"合格\",\"fzbphlpd\":\"合格\",\"fzzlzzlpd\":\"\",\"fzylzzlpd\":\"\",\"wzzdlpd\":\"\",\"wzbphlpd\":\"\",\"wzzlzzlpd\":\"\",\"wzylzzlpd\":\"\",\"lzzdlpd\":\"\",\"lzbphlpd\":\"\",\"lzzlzzlpd\":\"\",\"lzylzzlpd\":\"\",\"dcqyczheczdlpd\":\"\",\"dcqyczhuczdlpd\":\"\",\"lsmfddpd\":\"\",\"zdxtsjpd\":\"\",\"lszdwdxpd\":\"\",\"lspdzcqkpd\":\"\",\"qzzxjxslpd\":\"\",\"qzyxjxslpd\":\"\",\"qzzylxjxslcpd\":\"\",\"hzzxjxslpd\":\"\",\"hzyxjxslpd\":\"\",\"hzzylxjxslcpd\":\"\",\"csbpd\":\"合格\",\"dyzlchlpd\":\"二级\",\"dezlchlpd\":\"一级\",\"gdshcpd\":\"合格\",\"gdscopd\":\"一级\",\"gdslmnpd\":\"二级\",\"dshcpd\":\"合格\",\"dscopd\":\"合格\",\"wt5025gkcopd\":\"合格\",\"wt5025gkhcpd\":\"合格\",\"wt5025gknopd\":\"合格\",\"wt2540gkcopd\":\"合格\",\"wt2540gkhcpd\":\"合格\",\"wt2540gknopd\":\"合格\",\"gxsxspd\":\"合格\",\"lzydpd\":\"合格\",\"jzjsgk100pd\":\"合格\",\"jzjsgk90pd\":\"合格\",\"jzjsgk80pd\":\"合格\",\"sczdglpd\":\"合格\",\"zwdyggqpd\":\"不合格\",\"zwdygczpylpd\":\"\",\"zwdygsppylpd\":\"\",\"zwdjgczpylpd\":\"\",\"zwdjgsppylpd\":\"\",\"zndyggqpd\":\"\",\"zndygczpylpd\":\"\",\"zndygsppylpd\":\"\",\"ywdyggqpd\":\"-\",\"ywdygczpylpd\":\"\",\"ywdygsppylpd\":\"\",\"ywdjgczpylpd\":\"\",\"ywdjgsppylpd\":\"\",\"yndyggqpd\":\"\",\"yndygczpylpd\":\"\",\"yndygsppylpd\":\"\",\"lbsyjpd\":\"合格\",\"bz\":\"\",\"jcjl\":\"一级\",\"zjcs\":\"1\",\"uptime\":\"2020-06-10\",\"clzbzl\":\"900\",\"dyrq\":\"2020-06-10\",\"syxz\":\"A\",\"clyt\":\"g1\"}]}}";
//        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"csk202008310002\",\"bgbh\":\"610202001202007160023\",\"zzrdzsbh\":\"162705340036\",\"jyjgdz\":\"西安市雁塔区\",\"jyjgdh\":\"18292590870\",\"jylsh\":\"610202001202007160004\",\"cphm\":\"陕A99999\",\"wtr\":\"陈海龙\",\"dlyszh\":\"610201011514\",\"cllx\":\"大型普通客车\",\"ppxh\":\"宇通牌ZK6906H1E\",\"zcdjrq\":\"20160719\",\"ccny\":\"20160711\",\"csys\":\"蓝色\",\"vin\":\"LZYTDTD61G1032062\",\"fdjhm\":\"A02YBG30466\",\"xzqy\":\"西安市雁塔区\",\"gcphm\":\"\",\"gwtr\":\"\",\"gdlyszh\":\"\",\"gcllx\":\"\",\"gppxh\":\"\",\"gzcdjrq\":\"\",\"gccny\":\"\",\"gvin\":\"\",\"gxsz\":\"\",\"jylb\":\"技术等级评定\",\"ywlx\":\"在用\",\"jyrq\":\"2020-07-20 11:37:53\",\"wyxrd\":\"合格\",\"wyxrdxm\":\"无\",\"yxjc\":\"一级\",\"yxjcxm\":\"无\",\"hcpd\":\"未检验\",\"hcpdxm\":\"—\",\"wgjc\":\"一级\",\"wgjcxm\":\"无\",\"dpjc\":\"合格\",\"dpjcxm\":\"无\",\"gzxxzd\":\"合格\",\"gzxxzdxm\":\"无\",\"dlx\":\"71.0\",\"jjx\":\"14.3\",\"yzzdl\":\"82.3\",\"yzbphl\":\"2.1\",\"yzzlzzl\":\"0.4\",\"yzylzzl\":\"0.5\",\"ezzdl\":\"62.5\",\"ezbphl\":\"3.2\",\"ezzlzzl\":\"0.4\",\"ezylzzl\":\"0.3\",\"tzzdl\":\"\",\"tzbphl\":\"\",\"tzzlzzl\":\"\",\"tzylzzl\":\"\",\"fzzdl\":\"\",\"fzbphl\":\"\",\"fzzlzzl\":\"\",\"fzylzzl\":\"\",\"wzzdl\":\"\",\"wzbphl\":\"\",\"wzzlzzl\":\"\",\"wzylzzl\":\"\",\"lzzdl\":\"\",\"lzbphl\":\"\",\"lzzlzzl\":\"\",\"lzylzzl\":\"\",\"dcqyczheczdl\":\"68.3\",\"dcqyczhuczdl\":\"27.0\",\"zdxtsj\":\"\",\"lsmfdd\":\"\",\"lszdwdx\":\"\",\"lspdzcqk\":\"\",\"qzzylxjxslc\":\"\",\"hzzylxjxslc\":\"\",\"csb\":\"36.5\",\"dyzlchl\":\"-0.6\",\"dezlchl\":\"\",\"gdshc\":\"\",\"gdsco\":\"\",\"gdslmn\":\"\",\"dshc\":\"\",\"dsco\":\"\",\"wt5025gkco\":\"\",\"wt5025gkhc\":\"\",\"wt5025gkno\":\"\",\"wt2540gkco\":\"\",\"wt2540gkhc\":\"\",\"wt2540gkno\":\"\",\"gxsxs\":\"\",\"lzyd\":\"\",\"jzjsgk100\":\"0\",\"jzjsgk90\":\"\",\"jzjsgk80\":\"0.10\",\"sczdgl\":\"109.7\",\"zwdyggq\":\"33200\",\"zwdygczpyl\":\"\",\"zwdygsppyl\":\"\",\"zwdjgczpyl\":\"+38\",\"zwdjgsppyl\":\"-461\",\"zndyggq\":\"\",\"zndygczpyl\":\"\",\"zndygsppyl\":\"\",\"ywdyggq\":\"58600\",\"ywdygczpyl\":\"\",\"ywdygsppyl\":\"\",\"ywdjgczpyl\":\"-11\",\"ywdjgsppyl\":\"+405\",\"yndyggq\":\"\",\"yndygczpyl\":\"\",\"yndygsppyl\":\"\",\"lbsyj\":\"101.1\",\"dlxbzxz\":\"≥61.1\",\"jjxbzxz\":\"≤15.5\",\"yzzdlbzxz\":\"≥60\",\"yzbphlbzxz\":\"≤20\",\"yzzlzzlbzxz\":\"≤3.5\",\"yzylzzlbzxz\":\"≤3.5\",\"ezzdlbzxz\":\"≥40\",\"ezbphlbzxz\":\"≤24\",\"ezzlzzlbzxz\":\"≤3.5\",\"ezylzzlbzxz\":\"≤3.5\",\"tzzdlbzxz\":\"\",\"tzbphlbzxz\":\"\",\"tzzlzzlbzxz\":\"\",\"tzylzzlbzxz\":\"\",\"fzzdlbzxz\":\"\",\"fzbphlbzxz\":\"\",\"fzzlzzlbzxz\":\"\",\"fzylzzlbzxz\":\"\",\"wzzdlbzxz\":\"\",\"wzbphlbzxz\":\"\",\"wzzlzzlbzxz\":\"\",\"wzylzzlbzxz\":\"\",\"lzzdlbzxz\":\"\",\"lzbphlbzxz\":\"\",\"lzzlzzlbzxz\":\"\",\"lzylzzlbzxz\":\"\",\"dcqyczheczdlbzxz\":\"≥60\",\"dcqyczhuczdlbzxz\":\"≥20\",\"lsmfddbzxz\":\"\",\"zdxtsjbzxz\":\"\",\"lszdwdxbzxz\":\"\",\"lspdzcqkbzxz\":\"\",\"qzzxjxslbzxz\":\"\",\"qzyxjxslbzxz\":\"\",\"qzzylxjxslcbzxz\":\"\",\"hzzxjxslbzxz\":\"\",\"hzyxjxslbzxz\":\"\",\"hzzylxjxslcbzxz\":\"\",\"csbbzxz\":\"32.8～40\",\"dyzlchlbzxz\":\"-5～+5\",\"dezlchlbzxz\":\"\",\"gdshcbzxz\":\"\",\"gdscobzxz\":\"\",\"gdslmnbzxz\":\"\",\"dshcbzxz\":\"\",\"dscobzxz\":\"\",\"wt5025gkcobzxz\":\"\",\"wt5025gkhcbzxz\":\"\",\"wt5025gknobzxz\":\"\",\"wt2540gkcobzxz\":\"\",\"wt2540gkhcbzxz\":\"\",\"wt2540gknobzxz\":\"\",\"gxsxsbzxz\":\"\",\"lzydbzxz\":\"\",\"jzjsgk100bzxz\":\"＜1.20\",\"jzjsgk90bzxz\":\"\",\"jzjsgk80bzxz\":\"＜1.20\",\"sczdglbzxz\":\"≥72.8\",\"zwdyggqbzxz\":\"≥15000\",\"zwdygczpylbzxz\":\"\",\"zwdygsppylbzxz\":\"\",\"zwdjgczpylbzxz\":\"-300～-50\",\"zwdjgsppylbzxz\":\"-170～+350\",\"zndyggqbzxz\":\"\",\"zndygczpylbzxz\":\"\",\"zndygsppylbzxz\":\"\",\"ywdyggqbzxz\":\"≥15000\",\"ywdygczpylbzxz\":\"\",\"ywdygsppylbzxz\":\"\",\"ywdjgczpylbzxz\":\"-300～-50\",\"ywdjgsppylbzxz\":\"-170～+350\",\"yndyggqbzxz\":\"\",\"yndygczpylbzxz\":\"\",\"yndygsppylbzxz\":\"\",\"lbsyjbzxz\":\"90～115\",\"dlxpd\":\"一级\",\"jjxpd\":\"合格\",\"yzzdlpd\":\"合格\",\"yzbphlpd\":\"一级\",\"yzzlzzlpd\":\"合格\",\"yzylzzlpd\":\"合格\",\"ezzdlpd\":\"合格\",\"ezbphlpd\":\"一级\",\"ezzlzzlpd\":\"合格\",\"ezylzzlpd\":\"合格\",\"tzzdlpd\":\"\",\"tzbphlpd\":\"\",\"tzzlzzlpd\":\"\",\"tzylzzlpd\":\"\",\"fzzdlpd\":\"\",\"fzbphlpd\":\"\",\"fzzlzzlpd\":\"\",\"fzylzzlpd\":\"\",\"wzzdlpd\":\"\",\"wzbphlpd\":\"\",\"wzzlzzlpd\":\"\",\"wzylzzlpd\":\"\",\"lzzdlpd\":\"\",\"lzbphlpd\":\"\",\"lzzlzzlpd\":\"\",\"lzylzzlpd\":\"\",\"dcqyczheczdlpd\":\"合格\",\"dcqyczhuczdlpd\":\"合格\",\"lsmfddpd\":\"\",\"zdxtsjpd\":\"\",\"lszdwdxpd\":\"\",\"lspdzcqkpd\":\"\",\"qzzxjxslpd\":\"\",\"qzyxjxslpd\":\"\",\"qzzylxjxslcpd\":\"\",\"hzzxjxslpd\":\"\",\"hzyxjxslpd\":\"\",\"hzzylxjxslcpd\":\"\",\"csbpd\":\"合格\",\"dyzlchlpd\":\"合格\",\"dezlchlpd\":\"\",\"gdshcpd\":\"\",\"gdscopd\":\"\",\"gdslmnpd\":\"\",\"dshcpd\":\"\",\"dscopd\":\"\",\"wt5025gkcopd\":\"\",\"wt5025gkhcpd\":\"\",\"wt5025gknopd\":\"\",\"wt2540gkcopd\":\"\",\"wt2540gkhcpd\":\"\",\"wt2540gknopd\":\"\",\"gxsxspd\":\"\",\"lzydpd\":\"\",\"jzjsgk100pd\":\"合格\",\"jzjsgk90pd\":\"\",\"jzjsgk80pd\":\"合格\",\"sczdglpd\":\"合格\",\"zwdyggqpd\":\"合格\",\"zwdygczpylpd\":\"\",\"zwdygsppylpd\":\"\",\"zwdjgczpylpd\":\"不合格\",\"zwdjgsppylpd\":\"不适用\",\"zndyggqpd\":\"\",\"zndygczpylpd\":\"\",\"zndygsppylpd\":\"\",\"ywdyggqpd\":\"合格\",\"ywdygczpylpd\":\"\",\"ywdygsppylpd\":\"\",\"ywdjgczpylpd\":\"不合格\",\"ywdjgsppylpd\":\"不适用\",\"yndyggqpd\":\"\",\"yndygczpylpd\":\"\",\"yndygsppylpd\":\"\",\"lbsyjpd\":\"合格\",\"bz\":\"\",\"jcjl\":\"一级\",\"zjcs\":\"1\",\"uptime\":\"2020-08-13\",\"dyrq\":\"2020-08-13\",\"clyt\":\"普通汽车\",\"sqqzr\":\"徐洪斌\",\"jcjgmc\":\"陕西省西安市雁塔区\",\"clrllb\":\"柴油\",\"clzbzl\":\"10000\",\"syxz\":\"B\"}]}}";
        //insertZongHeXNJYJLD接口
//        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"csk20200831000111\",\"jylsh\":\"610203001202006090017\",\"jyjgbh\":\"610203001\",\"jyjgmc\":\"西安市雁塔区测试检测站\",\"jcxdh\":\"A\",\"wtr\":\"冯先生\",\"dlyszh\":\"610222000975\",\"jylb\":\"技术等级评定\",\"ywlx\":\"在用\",\"jcxb\":\"A\",\"jcrq\":\"2020-06-09 17:52:29\",\"jcjldbh\":\"610203001202006090053\",\"cphm\":\"陕A00000\",\"hpzl\":\"大型汽车\",\"gcpzh\":\"\",\"gclx\":\"\",\"clccrq\":\"20190527\",\"wjdly\":\"白先生\",\"ycy\":\"邱先生\",\"wqczy\":\"杨先生\",\"zcdjrq\":\"20190604\",\"vin\":\"LFWRRX9L6KAB03950\",\"clxh\":\"CA4250P25K27T1E5M\",\"fdjh\":\"3119C018648\",\"csys\":\"红色\",\"xszlc\":\"151352\",\"qdxs\":\"并装双轴驱动\",\"zxzxjxs\":\"非独立\",\"gczs\":\"\",\"yrsfdjedg\":\"316.0\",\"drsednj\":\"\",\"drsedzs\":\"\",\"rllb\":\"天然气\",\"qdlltggxh\":\"12R22.5\",\"zzl\":\"25000.0\",\"cg\":\"3960\",\"qlj\":\"2020\",\"kccc\":\"\",\"kclxdj\":\"\",\"hccsxs\":\"牵引车\",\"qdzs\":\"2\",\"qdzkzzl\":\"5407.0\",\"qycmzzzl\":\"38775.0\",\"bzzxs\":\"并装轴\",\"zxzs\":\"1\",\"qzdzs\":\"二\",\"kczws\":\"\",\"dczs\":\"3\",\"dcc\":\"7415\",\"dck\":\"2495\",\"dcg\":\"3960\",\"gcc\":\"\",\"gck\":\"\",\"gcg\":\"\",\"ygsnfddtz\":\"否\",\"zcz\":\"23\",\"dccxlbgd\":\"\",\"gccxbgd\":\"\",\"jyxm\":\"\",\"fzxs\":\"0.90/0.89\",\"zjycs\":\"1\",\"hjwd\":\"21.9\",\"xdsd\":\"67.5\",\"dqyl\":\"89.9\",\"dbgl\":\"259.1\",\"edcs\":\"40.4\",\"jzl\":\"15383\",\"wdcs\":\"59.0\",\"dlxpd\":\"1\",\"dlxdxcs1\":\"1\",\"yhxz\":\"\",\"yhscz\":\"\",\"jjxpd\":\"\",\"jjxdxcs\":\"\",\"czdxcs\":\"\",\"dcspcz\":\"400\",\"dczczdl\":\"\",\"dcsczdl\":\"\",\"dcpd\":\"——\",\"dcdxcs\":\"1\",\"lcspcz\":\"\",\"lczdl1\":\"\",\"lczdl2\":\"\",\"lcsczdl\":\"\",\"lczdxtsj\":\"\",\"lczdpd1\":\"\",\"lczdpd2\":\"\",\"lczdcs1\":\"\",\"lczdcs2\":\"\",\"lczds1\":\"\",\"lczds2\":\"\",\"lczds3\":\"\",\"lczds4\":\"\",\"lczds5\":\"\",\"lczds6\":\"\",\"lczdsx1\":\"\",\"lczdsx2\":\"\",\"lczdsx3\":\"\",\"lczdsx4\":\"\",\"lczdsx5\":\"\",\"lczdsx6\":\"\",\"lczdsxpd\":\"\",\"lczdsxcs\":\"\",\"lczczdb1\":\"\",\"lczczdb2\":\"\",\"lczczdbpd\":\"\",\"lczczdbcs\":\"\",\"dzzdcs\":\"\",\"lscsd\":\"\",\"lscdkd\":\"\",\"lszdjl\":\"\",\"lsmfdd\":\"\",\"lszdwdx\":\"\",\"lszdxtsj\":\"\",\"lsxcpd\":\"\",\"lsxccs\":\"\",\"lszcpd\":\"\",\"lszcqk\":\"\",\"lszcppd\":\"\",\"lszccs\":\"\",\"gdsco\":\"\",\"gdshc\":\"\",\"gds\":\"\",\"dsco\":\"\",\"dshc\":\"\",\"co5025\":\"\",\"hc5025\":\"\",\"no5025\":\"\",\"co2540\":\"\",\"hc2540\":\"\",\"no2540\":\"\",\"drspd\":\"\",\"drscs\":\"\",\"gxs1\":\"\",\"gxs2\":\"\",\"gxs3\":\"\",\"gxspj\":\"\",\"lz1\":\"\",\"lz2\":\"\",\"lz3\":\"\",\"lzpj\":\"\",\"gxs100\":\"\",\"gxs90\":\"\",\"gxs80\":\"\",\"lbgl\":\"\",\"yrpd\":\"\",\"yrcs\":\"\",\"qzzxsl\":\"\",\"qzyxsl\":\"\",\"qzzyc\":\"\",\"qzzypd\":\"\",\"qzxjcs\":\"\",\"hzzxsl\":\"\",\"hzyxsl\":\"\",\"hzzyc\":\"\",\"hzzypd\":\"\",\"hzxjcs\":\"\",\"zwjgdg\":\"\",\"zwygdg\":\"\",\"zwyggq\":\"\",\"zwygcz\":\"\",\"zwygsp\":\"\",\"zwjgcz\":\"\",\"zwjgsp\":\"\",\"zwpd\":\"\",\"zwcs\":\"\",\"znjgdg\":\"\",\"znygdg\":\"\",\"znyggq\":\"\",\"znygcz\":\"\",\"znygsp\":\"\",\"znjgcz\":\"\",\"znjgsp\":\"\",\"znpd\":\"\",\"zncs\":\"\",\"ywjgdg\":\"\",\"ywygdg\":\"\",\"ywyggq\":\"\",\"ywygcz\":\"\",\"ywygsp\":\"\",\"ywjgcz\":\"\",\"ywjgsp\":\"\",\"ywpd\":\"\",\"ywcs\":\"\",\"ynjgdg\":\"\",\"ynygdg\":\"\",\"yndggq\":\"\",\"ynygcz\":\"\",\"ynygsp\":\"\",\"ynjgcz\":\"\",\"ynjgsp\":\"\",\"ynpd\":\"\",\"yncs\":\"\",\"csb\":\"37.3\",\"csbpd\":\"○\",\"csbcs\":\"1\",\"bhgx\":\"无\",\"lbsj\":\"106.4\",\"lbpd\":\"○\",\"lbcs\":\"1\",\"chl1\":\"\",\"chlpd1\":\"\",\"chlcs1\":\"\",\"chl2\":\"\",\"chlpd2\":\"\",\"chlcs2\":\"\",\"zdjygw\":\"\",\"dgjygw\":\"\",\"dlxjygw\":\"20200609141547H201.jpg\",\"cllx\":\"重型仓栅式货车\",\"clzbzl\":\"1000\",\"syxz\":\"A\",\"clyt\":\"g1\",\"xzqy\":\"西安市雁塔区\"}]}}";
//        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"csk202008310185\",\"jylsh\":\"610202001202007160005\",\"jyjgbh\":\"610202001\",\"jyjgmc\":\"铜川市运通机动车辆检测有限公司\",\"jcxdh\":\"A\",\"wtr\":\"陈先生\",\"dlyszh\":\"610201011514\",\"jylb\":\"技术等级评定\",\"ywlx\":\"在用\",\"jcxb\":\"A\",\"jcrq\":\"2020-07-20 11:37:53\",\"jcjldbh\":\"610202001202007160023\",\"cphm\":\"陕A33333\",\"hpzl\":\"大型汽车\",\"gcpzh\":\"\",\"gclx\":\"\",\"clccrq\":\"20160711\",\"wjdly\":\"王瑞祥\",\"ycy\":\"袁磊磊\",\"wqczy\":\"党李波\",\"zcdjrq\":\"20160719\",\"vin\":\"LZYTDTD61G1032062\",\"clxh\":\"ZK6906H1E\",\"fdjh\":\"A02YBG30466\",\"csys\":\"蓝色\",\"xszlc\":\"397388\",\"qdxs\":\"后驱\",\"zxzxjxs\":\"非独立\",\"gczs\":\"\",\"yrsfdjedg\":\"191.0\",\"drsednj\":\"\",\"drsedzs\":\"\",\"rllb\":\"柴油\",\"qdlltggxh\":\"10R22.5\",\"zzl\":\"13100.0\",\"cg\":\"3440\",\"qlj\":\"2095\",\"kccc\":\"8995\",\"kclxdj\":\"中级\",\"hccsxs\":\"\",\"qdzs\":\"1\",\"qdzkzzl\":\"7210.0\",\"qycmzzzl\":\"\",\"bzzxs\":\"\",\"zxzs\":\"1\",\"qzdzs\":\"二\",\"kczws\":\"39\",\"dczs\":\"2\",\"dcc\":\"8995\",\"dck\":\"2500\",\"dcg\":\"3440\",\"gcc\":\"\",\"gck\":\"\",\"gcg\":\"\",\"ygsnfddtz\":\"否\",\"zcz\":\"2\",\"dccxlbgd\":\"\",\"gccxbgd\":\"\",\"jyxm\":\"\",\"fzxs\":\"0.89/0.90\",\"zjycs\":\"1\",\"hjwd\":\"29.7\",\"xdsd\":\"48.8\",\"dqyl\":\"81.7\",\"dbgl\":\"156.6\",\"edcs\":\"61.1\",\"jzl\":\"5346\",\"wdcs\":\"71.0\",\"dlxpd\":\"一级\",\"dlxdxcs1\":\"1\",\"yhxz\":\"15.5\",\"yhscz\":\"14.3\",\"jjxpd\":\"合格\",\"jjxdxcs\":\"1\",\"zlh2\":\"3646.0\",\"ylh2\":\"3427.0\",\"czzh2\":\"\",\"zdllh2\":\"\",\"ydllh2\":\"\",\"zxczdl2\":\"2247.0\",\"yxczdl2\":\"2176.0\",\"zzczdl2\":\"1387.0\",\"yzczdl2\":\"1313.0\",\"zdxcs2\":\"1\",\"zlh1\":\"1433.0\",\"ylh1\":\"1483.0\",\"czzh1\":\"\",\"zdllh1\":\"\",\"ydllh1\":\"\",\"zxczdl1\":\"1188.0\",\"yxczdl1\":\"1213.0\",\"zzczdl1\":\"\",\"yzczdl1\":\"\",\"zdxcs1\":\"1\",\"zlh3\":\"\",\"ylh3\":\"\",\"czzh3\":\"\",\"zdllh3\":\"\",\"ydllh3\":\"\",\"zxczdl3\":\"\",\"yxczdl3\":\"\",\"zzczdl3\":\"\",\"yzczdl3\":\"\",\"zdxcs3\":\"\",\"zlh4\":\"\",\"ylh4\":\"\",\"czzh4\":\"\",\"zdllh4\":\"\",\"ydllh4\":\"\",\"zxczdl4\":\"\",\"yxczdl4\":\"\",\"zzczdl4\":\"\",\"yzczdl4\":\"\",\"zdxcs4\":\"\",\"zlh5\":\"\",\"ylh5\":\"\",\"czzh5\":\"\",\"zdllh5\":\"\",\"ydllh5\":\"\",\"zxczdl5\":\"\",\"yxczdl5\":\"\",\"zzczdl5\":\"\",\"yzczdl5\":\"\",\"zdxcs5\":\"\",\"zlh6\":\"\",\"ylh6\":\"\",\"czzh6\":\"\",\"zdllh6\":\"\",\"ydllh6\":\"\",\"zxczdl6\":\"\",\"yxczdl6\":\"\",\"zzczdl6\":\"\",\"yzczdl6\":\"\",\"zdxcs6\":\"\",\"czdxcs\":\"\",\"dcspcz\":\"9989.0\",\"dczczdl\":\"68.3\",\"dcsczdl\":\"27.0\",\"dcpd\":\"○○\",\"dcdxcs\":\"1\",\"lcspcz\":\"\",\"lczdl1\":\"\",\"lczdl2\":\"\",\"lcsczdl\":\"\",\"lczdxtsj\":\"\",\"lczdpd1\":\"\",\"lczdpd2\":\"\",\"lczdcs1\":\"\",\"lczdcs2\":\"\",\"lczds1\":\"\",\"lczds2\":\"\",\"lczds3\":\"\",\"lczds4\":\"\",\"lczds5\":\"\",\"lczds6\":\"\",\"lczdsx1\":\"\",\"lczdsx2\":\"\",\"lczdsx3\":\"\",\"lczdsx4\":\"\",\"lczdsx5\":\"\",\"lczdsx6\":\"\",\"lczdsxpd\":\"\",\"lczdsxcs\":\"\",\"lczczdb1\":\"\",\"lczczdb2\":\"\",\"lczczdbpd\":\"\",\"lczczdbcs\":\"\",\"dzzdcs\":\"\",\"zzdl2\":\"62.5\",\"zzdbphl2\":\"3.2\",\"zlgczdd2\":\"2247.0\",\"ylgczdd2\":\"2176.0\",\"zlclzzl2\":\"0.4\",\"ylclzzl2\":\"0.3\",\"dzzdpd2\":\"○1○\",\"dzzdcs2\":\"1\",\"zzdl1\":\"82.3\",\"zzdbphl1\":\"2.1\",\"zlgczdd1\":\"1126.0\",\"ylgczdd1\":\"1151.0\",\"zlclzzl1\":\"0.4\",\"ylclzzl1\":\"0.5\",\"dzzdpd1\":\"○1○\",\"dzzdcs1\":\"\",\"zzdl3\":\"\",\"zzdbphl3\":\"\",\"zlgczdd3\":\"\",\"ylgczdd3\":\"\",\"zlclzzl3\":\"\",\"ylclzzl3\":\"\",\"dzzdpd3\":\"\",\"dzzdcs3\":\"\",\"zzdl4\":\"\",\"zzdbphl4\":\"\",\"zlgczdd4\":\"\",\"ylgczdd4\":\"\",\"zlclzzl4\":\"\",\"ylclzzl4\":\"\",\"dzzdpd4\":\"\",\"dzzdcs4\":\"\",\"zzdl5\":\"\",\"zzdbphl5\":\"\",\"zlgczdd5\":\"\",\"ylgczdd5\":\"\",\"zlclzzl5\":\"\",\"ylclzzl5\":\"\",\"dzzdpd5\":\"\",\"dzzdcs5\":\"\",\"zzdl6\":\"\",\"zzdbphl6\":\"\",\"zlgczdd6\":\"\",\"ylgczdd6\":\"\",\"zlclzzl6\":\"\",\"ylclzzl6\":\"\",\"dzzdpd6\":\"\",\"dzzdcs6\":\"\",\"lscsd\":\"\",\"lscdkd\":\"\",\"lszdjl\":\"\",\"lsmfdd\":\"\",\"lszdwdx\":\"\",\"lszdxtsj\":\"\",\"lsxcpd\":\"\",\"lsxccs\":\"\",\"lszcpd\":\"\",\"lszcqk\":\"\",\"lszcppd\":\"\",\"lszccs\":\"\",\"gdsco\":\"\",\"gdshc\":\"\",\"gds\":\"\",\"dsco\":\"\",\"dshc\":\"\",\"co5025\":\"\",\"hc5025\":\"\",\"no5025\":\"\",\"co2540\":\"\",\"hc2540\":\"\",\"no2540\":\"\",\"drspd\":\"\",\"drscs\":\"\",\"gxs1\":\"\",\"gxs2\":\"\",\"gxs3\":\"\",\"gxspj\":\"\",\"lz1\":\"\",\"lz2\":\"\",\"lz3\":\"\",\"lzpj\":\"\",\"gxs100\":\"0.07\",\"gxs90\":\"\",\"gxs80\":\"0.1\",\"lbgl\":\"109.7\",\"yrpd\":\"\",\"yrcs\":\"1\",\"qzzxsl\":\"\",\"qzyxsl\":\"\",\"qzzyc\":\"\",\"qzzypd\":\"\",\"qzxjcs\":\"\",\"hzzxsl\":\"\",\"hzyxsl\":\"\",\"hzzyc\":\"\",\"hzzypd\":\"\",\"hzxjcs\":\"\",\"zwjgdg\":\"\",\"zwygdg\":\"\",\"zwyggq\":\"\",\"zwygcz\":\"\",\"zwygsp\":\"\",\"zwjgcz\":\"\",\"zwjgsp\":\"\",\"zwpd\":\"\",\"zwcs\":\"\",\"ywjgdg\":\"\",\"ywygdg\":\"\",\"ywyggq\":\"\",\"ywygcz\":\"\",\"ywygsp\":\"\",\"ywjgcz\":\"\",\"ywjgsp\":\"\",\"ywpd\":\"\",\"ywcs\":\"\",\"znjgdg\":\"\",\"znygdg\":\"\",\"znyggq\":\"\",\"znygcz\":\"\",\"znygsp\":\"\",\"znjgcz\":\"\",\"znjgsp\":\"\",\"znpd\":\"\",\"zncs\":\"\",\"ynjgdg\":\"\",\"ynygdg\":\"\",\"yndggq\":\"\",\"ynygcz\":\"\",\"ynygsp\":\"\",\"ynjgcz\":\"\",\"ynjgsp\":\"\",\"ynpd\":\"\",\"yncs\":\"\",\"bhgx\":\"左外灯、右外灯\",\"chl1\":\"-0.6\",\"chlpd1\":\"合格\",\"chlcs1\":\"1\",\"lbsj\":\"101.1\",\"lbpd\":\"合格\",\"lbcs\":\"1\",\"csb\":\"36.5\",\"csbpd\":\"合格\",\"csbcs\":\"1\",\"chl2\":\"\",\"chlpd2\":\"\",\"chlcs2\":\"\",\"zdjygw\":\"20200716100048Z202.jpg\",\"dgjygw\":\"20200716100048Z203.jpg\",\"dlxjygw\":\"20200716100048H301.jpg\",\"clyt\":\"普通汽车\",\"xzqy\":\"铜川测试\",\"jyjgdz\":\"陕西省铜川市王益区王家河工业园区\",\"cllx\":\"大型普通客车\",\"clzbzl\":\"10000\",\"syxz\":\"\"}]}}";
//        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"TYT40288a8273fa7c1f01740aa96acb02491\",\"jylsh\":\"610202001202008200005\",\"jyjgbh\":\"610202001\",\"jyjgmc\":\"检测站\",\"jcxdh\":\"A\",\"wtr\":\"李明\",\"dlyszh\":\"待领\",\"jylb\":\"技术等级评定\",\"ywlx\":\"申请\",\"jcxb\":\"A\",\"jcrq\":\"2020-08-20 16:16:42\",\"jcjldbh\":\"610202001202008200050\",\"cphm\":\"陕039351\",\"hpzl\":\"大型汽车\",\"gcpzh\":\"\",\"gclx\":\"\",\"clccrq\":\"20200415\",\"wjdly\":\"四\",\"ycy\":\"五\",\"wqczy\":\"六\",\"zcdjrq\":\"20200820\",\"vin\":\"LZGJL4844LX039351\",\"clxh\":\"SX4259XD4TLQ1\",\"fdjh\":\"3120D025998\",\"csys\":\"红色\",\"xszlc\":\"1800\",\"qdxs\":\"并装双轴驱动\",\"zxzxjxs\":\"非独立\",\"gczs\":\"\",\"yrsfdjedg\":\"\",\"drsednj\":\"2300.0\",\"drsedzs\":\"1400.0\",\"rllb\":\"天然气\",\"qdlltggxh\":\"12R22.5 18PR\",\"zzl\":\"25000.0\",\"cg\":\"4000\",\"qlj\":\"2070\",\"kccc\":\"\",\"kclxdj\":\"\",\"hccsxs\":\"牵引车\",\"qdzs\":\"2\",\"qdzkzzl\":\"\",\"qycmzzzl\":\"\",\"bzzxs\":\"并装轴\",\"zxzs\":\"1\",\"qzdzs\":\"二\",\"kczws\":\"\",\"dczs\":\"3\",\"dcc\":\"7460\",\"dck\":\"2550\",\"dcg\":\"4000\",\"gcc\":\"\",\"gck\":\"\",\"gcg\":\"\",\"ygsnfddtz\":\"否\",\"zcz\":\"23\",\"dccxlbgd\":\"\",\"gccxbgd\":\"\",\"jyxm\":\"\",\"fzxs\":\"0.89/0.90\",\"zjycs\":\"1\",\"hjwd\":\"\",\"xdsd\":\"\",\"dqyl\":\"\",\"dbgl\":\"\",\"edcs\":\"\",\"jzl\":\"\",\"wdcs\":\"\",\"dlxpd\":\"\",\"dlxdxcs1\":\"\",\"yhxz\":\"\",\"yhscz\":\"\",\"jjxpd\":\"\",\"jjxdxcs\":\"\",\"czdxcs\":\"\",\"dcspcz\":\"\",\"dczczdl\":\"\",\"dcsczdl\":\"\",\"dcpd\":\"——\",\"dcdxcs\":\"1\",\"lcspcz\":\"\",\"lczdl1\":\"\",\"lczdl2\":\"\",\"lcsczdl\":\"\",\"lczdxtsj\":\"\",\"lczdpd1\":\"\",\"lczdpd2\":\"\",\"lczdcs1\":\"\",\"lczdcs2\":\"\",\"lczds1\":\"\",\"lczds2\":\"\",\"lczds3\":\"\",\"lczds4\":\"\",\"lczds5\":\"\",\"lczds6\":\"\",\"lczdsx1\":\"\",\"lczdsx2\":\"\",\"lczdsx3\":\"\",\"lczdsx4\":\"\",\"lczdsx5\":\"\",\"lczdsx6\":\"\",\"lczdsxpd\":\"\",\"lczdsxcs\":\"\",\"lczczdb1\":\"\",\"lczczdb2\":\"\",\"lczczdbpd\":\"\",\"lczczdbcs\":\"\",\"dzzdcs\":\"\",\"lscsd\":\"\",\"lscdkd\":\"\",\"lszdjl\":\"\",\"lsmfdd\":\"\",\"lszdwdx\":\"\",\"lszdxtsj\":\"\",\"lsxcpd\":\"\",\"lsxccs\":\"\",\"lszcpd\":\"\",\"lszcqk\":\"\",\"lszcppd\":\"\",\"lszccs\":\"\",\"gdsco\":\"\",\"gdshc\":\"\",\"gds\":\"\",\"dsco\":\"\",\"dshc\":\"\",\"co5025\":\"\",\"hc5025\":\"\",\"no5025\":\"\",\"co2540\":\"\",\"hc2540\":\"\",\"no2540\":\"\",\"drspd\":\"\",\"drscs\":\"\",\"gxs1\":\"\",\"gxs2\":\"\",\"gxs3\":\"\",\"gxspj\":\"\",\"lz1\":\"\",\"lz2\":\"\",\"lz3\":\"\",\"lzpj\":\"\",\"gxs100\":\"\",\"gxs90\":\"\",\"gxs80\":\"\",\"lbgl\":\"\",\"yrpd\":\"\",\"yrcs\":\"\",\"qzzxsl\":\"\",\"qzyxsl\":\"\",\"qzzyc\":\"\",\"qzzypd\":\"\",\"qzxjcs\":\"\",\"hzzxsl\":\"\",\"hzyxsl\":\"\",\"hzzyc\":\"\",\"hzzypd\":\"\",\"hzxjcs\":\"\",\"zwjgdg\":\"\",\"zwygdg\":\"\",\"zwyggq\":\"\",\"zwygcz\":\"\",\"zwygsp\":\"\",\"zwjgcz\":\"\",\"zwjgsp\":\"\",\"zwpd\":\"\",\"zwcs\":\"\",\"znjgdg\":\"\",\"znygdg\":\"\",\"znyggq\":\"\",\"znygcz\":\"\",\"znygsp\":\"\",\"znjgcz\":\"\",\"znjgsp\":\"\",\"znpd\":\"\",\"zncs\":\"\",\"ywjgdg\":\"\",\"ywygdg\":\"\",\"ywyggq\":\"\",\"ywygcz\":\"\",\"ywygsp\":\"\",\"ywjgcz\":\"\",\"ywjgsp\":\"\",\"ywpd\":\"\",\"ywcs\":\"\",\"ynjgdg\":\"\",\"ynygdg\":\"\",\"yndggq\":\"\",\"ynygcz\":\"\",\"ynygsp\":\"\",\"ynjgcz\":\"\",\"ynjgsp\":\"\",\"ynpd\":\"\",\"yncs\":\"\",\"lbsj\":\"102.6\",\"lbpd\":\"合格\",\"lbcs\":\"1\",\"bhgx\":\"无\",\"csb\":\"\",\"csbpd\":\"\",\"csbcs\":\"\",\"chl1\":\"\",\"chlpd1\":\"\",\"chlcs1\":\"\",\"chl2\":\"\",\"chlpd2\":\"\",\"chlcs2\":\"\",\"zdjygw\":\"\",\"dgjygw\":\"\",\"dlxjygw\":\"\",\"clyt\":\"普通汽车\",\"xzqy\":\"铜川市\",\"jyjgdz\":\"陕西省铜川市王益区王家河工业园区\",\"cllx\":\"重型半挂牵引车\",\"clzbzl\":\"9300\"}]}}";
        //insertInstitutionInfo接口
//        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"csk202008210002\",\"name\":\"西安新西高机动车检测有限公司\",\"owner\":\"王总\",\"phone\":\"15000002222\",\"contact\":\"张总\",\"area\":\"西安市雁塔区\",\"address\":\"陕西省西安市\",\"certificate\":\"610001235612\",\"startDate\":\"2020-02-23\",\"endDate\":\"2020-07-24\",\"opFlag\":\"1\",\"opDate\":\"2020-8-24\"}]}}";
        //insertInstitutionPerson接口
//        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"csk2020082200016\",\"name\":\"六\",\"institution\":\"西安市雁塔区测试检测站\",\"gender\":\"男\",\"idNo\":\"610001199809220000\",\"major\":\"汽车\",\"recode\":\"大学\",\"position\":\"尾气员\",\"certificate\":\"610326666\",\"endDate\":\"2020-07-25\",\"fileMan\":\"测试\",\"regiDate\":\"2019-07-13\",\"remarks\":\"备注\",\"opFlag\":\"1\",\"opDate\":\"2020-08-24\"}]}}";
        //insertInstitutionDevice 接口
//        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"csk202008211003\",\"name\":\"高拍仪\",\"institution\":\"西安市雁塔区测试检测站1\",\"model\":\"GK-F5425\",\"idNo\":\"0356\",\"trace\":\"未知\",\"checkIns\":\"陕西省计量院\",\"checkDate\":\"2019-05-13\",\"cycle\":\"2年\",\"nextDate\":\"2020-07-28\",\"useLife\":\"1\",\"remarks\":\"备注\",\"opFlag\":\"1\",\"opDate\":\"2020-08-24\"}]}}";
        //insertApparatusJDCAQJSJYB 接口
        String s = "{Jsontype=STRING, Json={\"Table\":[{\"id\":\"csk202008211003\",\"rgjyjg\":[{\"jyxm\":\"检验项目\",\"jgpd\":\"结果判定\",\"qksm\":\"具体不符合项目说明\",\"bz\":\"备注\"},{\"jyxm\":\"检验项目1\",\"jgpd\":\"结果判定1\",\"qksm\":\"具体不符合项目说明1\",\"bz\":\"备注1\"}]}]}}";
        System.out.println(s);
        return s;
    }

    private static byte[] ImageToBase64(String imgPath) {
        byte[] data = null;
        System.out.println(imgPath);
        if(imgPath == "")
            return new byte[0];
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imgPath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        System.out.println(data);
        BASE64Encoder encoder = new BASE64Encoder();
//         返回Base64编码过的字节数组字符串
        System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(data)));
        return data;
    }
}


