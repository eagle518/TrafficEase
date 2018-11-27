package net.devyy.trafficease.main.homepage;

import java.util.List;

/**
 * 聚合数据新闻头条实体类（由 Gson 工具生成 | 认证个人开发者版本）
 * <p>
 * 接口地址：http://v.juhe.cn/toutiao/index
 * 返回格式：json
 * 请求方式：get/post
 * 请求示例：http://v.juhe.cn/toutiao/index?type=top&key=APPKEY
 * 接口备注：返回头条，社会，国内，娱乐，体育，军事，科技，财经，时尚等新闻信息
 * <p>
 * <p>
 * URL=http://v.juhe.cn/toutiao/index?type=top&key=4c71dccb365e8058f28093d02a7149ff
 * <p>
 * Created by ZYY on 2018/5/24.
 */

public class NewsBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"4c21abed3ea2d261636894e617015a4e","title":"Angelababy解锁推塔战 \u201c围殴\u201d李晨盛一伦队","date":"2018-05-24 08:25","category":"头条","author_name":"中国甘肃网","url":"http://mini.eastday.com/mobile/180524082532026.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_3_mwpm_03200403.jpg"},{"uniquekey":"effa0028a77f628b59ad06201669d1cd","title":"谢震业给中学生上体育课 寻找好苗子还是激励好苗子？","date":"2018-05-24 08:23","category":"头条","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/180524082322668.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180524/20180524082322_0e1322fdb7a71b047be060b12e9e9ac0_1_mwpm_03200403.jpg"},{"uniquekey":"749e6fc634d55f1aa0719a4a45fc4ae8","title":"特斯拉新车涨价 50%，可能意味着对传统汽车制造业的破坏性创新失败","date":"2018-05-24 08:22","category":"头条","author_name":"马若飞 龚方毅","url":"http://mini.eastday.com/mobile/180524082259132.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180524/20180524082259_882dd4a34866bb2fb49fe9a312939950_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180524/20180524082259_882dd4a34866bb2fb49fe9a312939950_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180524/20180524082259_882dd4a34866bb2fb49fe9a312939950_2_mwpm_03200403.jpg"},{"uniquekey":"8c87071bb9571f46adfb095684e94425","title":"欧盟和印日俄土纷纷挺身抵御美国贸易政策","date":"2018-05-24 08:20","category":"头条","author_name":"经济参考报","url":"http://mini.eastday.com/mobile/180524082050570.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180524/20180524082050_969fcc90b654f54fcf55e133f5ffa930_1_mwpm_03200403.jpg"},{"uniquekey":"b139ec38623a94fa8343f08955ef4a8c","title":"叙军主力南下德拉，动用弹道导弹威慑以色列，部分叛军未打先降","date":"2018-05-24 08:20","category":"头条","author_name":"军武杂谈","url":"http://mini.eastday.com/mobile/180524082016929.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180524/20180524_e8b40e4eaca55276c60f83a58673de9c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180524/20180524_d9645ba853cfcce678025e813b8cc36c_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180524/20180524_1fb50c61cb2c275bbde799fdfc60da71_cover_mwpm_03200403.jpg"},{"uniquekey":"fc738d20eca3318209a39ba16d2e84bf","title":"【实务】中国境内机构和个人跨境投资实务","date":"2018-05-24 08:19","category":"头条","author_name":"中华创投家","url":"http://mini.eastday.com/mobile/180524081947293.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180524/20180524081947_b725a43afddfc94c3acf642d7a130079_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180524/20180524081947_b725a43afddfc94c3acf642d7a130079_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180524/20180524081947_b725a43afddfc94c3acf642d7a130079_5_mwpm_03200403.jpg"},{"uniquekey":"48add8aaee09b988dc77017215f735dc","title":"朱婷北京恢复训练即将回归","date":"2018-05-24 08:18","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/180524081845173.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180524/20180524081845_b02f1b0f9204338b3e0bc2358c7c9f98_1_mwpm_03200403.jpg"},{"uniquekey":"7f83782356b2854e797d00050fce3fbe","title":"台当局已黔驴技穷？蔡英文叫嚣对大陆\u201c下通牒\u201d","date":"2018-05-24 08:14","category":"头条","author_name":"杭州网","url":"http://mini.eastday.com/mobile/180524081419534.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524081419_e1591e2cc496dd20f9668e80ee8d5237_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180524/20180524081419_e1591e2cc496dd20f9668e80ee8d5237_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180524/20180524081419_e1591e2cc496dd20f9668e80ee8d5237_1_mwpm_03200403.jpg"},{"uniquekey":"56eea273154d831910cb5770155837df","title":"特朗普称金正恩对美强硬是受中方影响?外交部回应","date":"2018-05-24 08:12","category":"头条","author_name":"外交部网站","url":"http://mini.eastday.com/mobile/180524081242883.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524081242_1b2b17f16597ebddccde96407301791e_1_mwpm_03200403.jpg"},{"uniquekey":"2fb5d56b990c281f66e6074b1f2b1bc6","title":"周末晴天 你敢不敢在郑州西边的山水间消失两天","date":"2018-05-24 08:10","category":"头条","author_name":"郑州ZAKER","url":"http://mini.eastday.com/mobile/180524081037530.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524081037_6f4dee7d8abcd40ba9019fa5cdea5e2b_16_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180524/20180524081037_6f4dee7d8abcd40ba9019fa5cdea5e2b_19_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180524/20180524081037_6f4dee7d8abcd40ba9019fa5cdea5e2b_2_mwpm_03200403.jpg"},{"uniquekey":"dc5f8bb0f1b7df2400ee7b620794a464","title":"融资\u201c窗口\u201d持续收紧，房企如何缓解融资焦虑？","date":"2018-05-24 08:10","category":"头条","author_name":"蓝鲸财经","url":"http://mini.eastday.com/mobile/180524081032506.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180524/20180524081032_e29c8fd3574d941476721d573d9f6d42_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180524/20180524081032_e29c8fd3574d941476721d573d9f6d42_2_mwpm_03200403.jpg"},{"uniquekey":"8ac831d56478ece37cbe4de442dccedc","title":"曝意甲最佳主帅将取代孔蒂 7000万锋霸却密谋叛逃","date":"2018-05-24 08:09","category":"头条","author_name":"网易体育","url":"http://mini.eastday.com/mobile/180524080959180.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180524/20180524080959_6950e3295f5fb7f7c428288a62de5700_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180524/20180524080959_6950e3295f5fb7f7c428288a62de5700_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180524/20180524080959_6950e3295f5fb7f7c428288a62de5700_3_mwpm_03200403.jpg"},{"uniquekey":"e8f0e72f4132e3c294e1b1161411f957","title":"不算不知道！震惊！北京把房租出去要多少年才能回本？泪崩","date":"2018-05-24 08:08","category":"头条","author_name":"最爱大北京","url":"http://mini.eastday.com/mobile/180524080821202.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180524/20180524080821_09938bde5fc2a3d2ac77b06bcc4bc162_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180524/20180524080821_09938bde5fc2a3d2ac77b06bcc4bc162_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180524/20180524080821_09938bde5fc2a3d2ac77b06bcc4bc162_1_mwpm_03200403.jpg"},{"uniquekey":"1b99afef5d54666e8107246e3c6a3b22","title":"粤媒曝广东宏远未续约尤纳斯 还有比他更合适的人选吗？","date":"2018-05-24 08:04","category":"头条","author_name":"宫爆体育","url":"http://mini.eastday.com/mobile/180524080440127.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180524/20180524_8e5aa1a04c08d85e1ebe096fb681a3a4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180524/20180524_bdbeed466fe8a06815e68f52ac325bf5_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180524/20180524_337c4c1536eac372fcd214aeb966fd5a_cover_mwpm_03200403.jpg"},{"uniquekey":"a6e8cd4da25d5700a916eadfc2d5d94f","title":"最\u201c尿性\u201d的反人类设计，设计师的脑袋里全是浆糊？","date":"2018-05-24 08:03","category":"头条","author_name":"弥雨祭","url":"http://mini.eastday.com/mobile/180524080344277.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524080344_7807a91f63d292f6b0ab549b4750dfb8_11_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180524/20180524080344_7807a91f63d292f6b0ab549b4750dfb8_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180524/20180524080344_7807a91f63d292f6b0ab549b4750dfb8_13_mwpm_03200403.jpg"},{"uniquekey":"ce892ba8566cfe320b29670b5fe9fc56","title":"一波四折，火箭2次落后10分2次逆转，火箭巨头心脏不适退场不看了","date":"2018-05-24 08:03","category":"头条","author_name":"时刻体育","url":"http://mini.eastday.com/mobile/180524080342245.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180524/20180524080342_d620d63f1ea444ffbbddd6d9c5c93ef2_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180524/20180524080342_d620d63f1ea444ffbbddd6d9c5c93ef2_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180524/20180524080342_d620d63f1ea444ffbbddd6d9c5c93ef2_1_mwpm_03200403.jpg"},{"uniquekey":"8e48b237e9b1ab409b97420d33354fad","title":"王者荣耀：小鲜肉还是肌肉男，究竟谁是大小姐的下路绝配？","date":"2018-05-24 08:03","category":"头条","author_name":"时刻保持微笑丶","url":"http://mini.eastday.com/mobile/180524080307189.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524080307_0532f2b9641f2a5bc787400bc95de738_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180524/20180524080307_0532f2b9641f2a5bc787400bc95de738_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180524/20180524080307_0532f2b9641f2a5bc787400bc95de738_1_mwpm_03200403.jpg"},{"uniquekey":"0024a7a30efb0b8db9da66a725ba718c","title":"阿根廷被指做掉梅西最稳帮手：足协撒谎 想除掉他","date":"2018-05-24 08:01","category":"头条","author_name":"新浪体育","url":"http://mini.eastday.com/mobile/180524080134689.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180524/20180524080134_e9e608ec47f7c2d85b1e39d33936d681_1_mwpm_03200403.jpg"},{"uniquekey":"de7b2bb11a80fc9678fb85289e23ddc7","title":"何洁与儿子时尚大片来袭 逗趣打闹画面很温馨","date":"2018-05-24 08:01","category":"头条","author_name":"中国青年网","url":"http://mini.eastday.com/mobile/180524080123075.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180524/20180524080123_14d8454c690c46205d8c4ab9209feed5_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180524/20180524080123_d962b55febb4d1d00935f74f3de658eb_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180524/20180524080123_550e6a269ada781eea6b3138b1f1c623_1_mwpm_03200403.jpg"},{"uniquekey":"4318a626bbb0ede8314b76da79296a0b","title":"万松书院20余处摩崖石刻 到底藏着什么秘密","date":"2018-05-24 08:01","category":"头条","author_name":"浙江在线","url":"http://mini.eastday.com/mobile/180524080111722.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180524/20180524080111_11dd4f80c2898e88fb9304650a42d021_1_mwpm_03200403.jpg"},{"uniquekey":"db572e8f67645669efd5f06cee2dc02e","title":"丹东港:资产查封、冻结事项可能使公司融资环境恶化","date":"2018-05-24 08:01","category":"头条","author_name":"上海清算所","url":"http://mini.eastday.com/mobile/180524080102503.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180524/20180524080102_c3ef2164b21ad40c29d5f8f281444f13_1_mwpm_03200403.jpg"},{"uniquekey":"9aaf038068db2157b15fe9c3b6a8dfda","title":"【中国梦·践行者】武痴张子豪：义务传承只为\"理\"","date":"2018-05-24 07:58","category":"头条","author_name":"大洋网","url":"http://mini.eastday.com/mobile/180524075809512.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180524/20180524075809_04b302c926c39b0ca56541ae7f83e855_1_mwpm_03200403.jpg"},{"uniquekey":"2d8cdc00df780d40c09ce0d215afd105","title":"英雄，就是普通人拥有一颗伟大的心！","date":"2018-05-24 07:57","category":"头条","author_name":"人民网app","url":"http://mini.eastday.com/mobile/180524075745066.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180524/20180524075745_a29a2af08ea6d1e7aa62fe77568016a0_17_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180524/20180524075745_a29a2af08ea6d1e7aa62fe77568016a0_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180524/20180524075745_a29a2af08ea6d1e7aa62fe77568016a0_5_mwpm_03200403.jpg"},{"uniquekey":"f35e5c1234c6eba009f5f7d97b6a3b02","title":"美股收评：在这件事发生之后，美股齐刷刷地飞涨","date":"2018-05-24 07:55","category":"头条","author_name":"汇通网","url":"http://mini.eastday.com/mobile/180524075558321.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180524/20180524075558_0556be98e4322df054fdf50b7884d1cb_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180524/20180524075558_0556be98e4322df054fdf50b7884d1cb_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180524/20180524075558_0556be98e4322df054fdf50b7884d1cb_2_mwpm_03200403.jpg"},{"uniquekey":"a66f104c03e40f3e588f1ed8635f9299","title":"天津户口狂欢背后：城市在分化，未来这样的城市才有机会","date":"2018-05-24 07:55","category":"头条","author_name":"大猫财经","url":"http://mini.eastday.com/mobile/180524075552884.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180524/20180524075552_6cf3b41de44f8eaf8453b51c9752975c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180524/20180524075552_6cf3b41de44f8eaf8453b51c9752975c_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180524/20180524075552_6cf3b41de44f8eaf8453b51c9752975c_3_mwpm_03200403.jpg"},{"uniquekey":"85358855b58b00f14189bd2e97af8675","title":"如何传承发展浙江优秀传统文化？浙江发布行动计划","date":"2018-05-24 07:55","category":"头条","author_name":"浙江在线","url":"http://mini.eastday.com/mobile/180524075537525.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180524/20180524075537_f3c17a82ba7a52f34b992c6081138624_1_mwpm_03200403.jpg"},{"uniquekey":"39150cd1785424d5409846bafbb1c002","title":"高清：BMW PGA锦标赛练习日 李昊桐吴阿顺出战","date":"2018-05-24 07:55","category":"头条","author_name":"搜狐体育","url":"http://mini.eastday.com/mobile/180524075534306.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180524/20180524075534_50a9ebf98ccf5e2190ec6db2307b4b94_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180524/20180524075534_50a9ebf98ccf5e2190ec6db2307b4b94_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180524/20180524075534_50a9ebf98ccf5e2190ec6db2307b4b94_12_mwpm_03200403.jpg"},{"uniquekey":"5b3d799bd7aee4e93107ba53e084e436","title":"2018汤尤杯第4日赛果 8强全部产生 你喜欢的球队在吗？","date":"2018-05-24 07:53","category":"头条","author_name":"新小特羽毛球","url":"http://mini.eastday.com/mobile/180524075313602.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180524/20180524075313_e19d83b2556a9258cdca04fbb3c5c705_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180524/20180524075313_e19d83b2556a9258cdca04fbb3c5c705_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180524/20180524075313_e19d83b2556a9258cdca04fbb3c5c705_1_mwpm_03200403.jpg"},{"uniquekey":"024427e8b032afadbb392513eb115619","title":"龙一一《海洋之城》杀青 接力《三生三世十里桃花》舞台剧上演","date":"2018-05-24 07:52","category":"头条","author_name":"千龙网","url":"http://mini.eastday.com/mobile/180524075247005.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180524/20180524075247_09a64d7f4f944e9581369a90d0bacfc1_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180524/20180524075247_09a64d7f4f944e9581369a90d0bacfc1_2_mwpm_03200403.jpg"},{"uniquekey":"f596279c1433d2d939dd87c6a9731e9a","title":"幽门螺杆菌总是复发！医生说是作死，都怪爱做这\u201c3个动作\u201d！","date":"2018-05-24 07:52","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180524075217261.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180524/20180524075217_10d814f163cfcf028852aec7d6d8fc5a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180524/20180524075217_10d814f163cfcf028852aec7d6d8fc5a_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180524/20180524075217_10d814f163cfcf028852aec7d6d8fc5a_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason( ) {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult( ) {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code( ) {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"4c21abed3ea2d261636894e617015a4e","title":"Angelababy解锁推塔战 \u201c围殴\u201d李晨盛一伦队","date":"2018-05-24 08:25","category":"头条","author_name":"中国甘肃网","url":"http://mini.eastday.com/mobile/180524082532026.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_3_mwpm_03200403.jpg"},{"uniquekey":"effa0028a77f628b59ad06201669d1cd","title":"谢震业给中学生上体育课 寻找好苗子还是激励好苗子？","date":"2018-05-24 08:23","category":"头条","author_name":"钱江晚报","url":"http://mini.eastday.com/mobile/180524082322668.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180524/20180524082322_0e1322fdb7a71b047be060b12e9e9ac0_1_mwpm_03200403.jpg"},{"uniquekey":"749e6fc634d55f1aa0719a4a45fc4ae8","title":"特斯拉新车涨价 50%，可能意味着对传统汽车制造业的破坏性创新失败","date":"2018-05-24 08:22","category":"头条","author_name":"马若飞 龚方毅","url":"http://mini.eastday.com/mobile/180524082259132.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180524/20180524082259_882dd4a34866bb2fb49fe9a312939950_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180524/20180524082259_882dd4a34866bb2fb49fe9a312939950_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180524/20180524082259_882dd4a34866bb2fb49fe9a312939950_2_mwpm_03200403.jpg"},{"uniquekey":"8c87071bb9571f46adfb095684e94425","title":"欧盟和印日俄土纷纷挺身抵御美国贸易政策","date":"2018-05-24 08:20","category":"头条","author_name":"经济参考报","url":"http://mini.eastday.com/mobile/180524082050570.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180524/20180524082050_969fcc90b654f54fcf55e133f5ffa930_1_mwpm_03200403.jpg"},{"uniquekey":"b139ec38623a94fa8343f08955ef4a8c","title":"叙军主力南下德拉，动用弹道导弹威慑以色列，部分叛军未打先降","date":"2018-05-24 08:20","category":"头条","author_name":"军武杂谈","url":"http://mini.eastday.com/mobile/180524082016929.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180524/20180524_e8b40e4eaca55276c60f83a58673de9c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180524/20180524_d9645ba853cfcce678025e813b8cc36c_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180524/20180524_1fb50c61cb2c275bbde799fdfc60da71_cover_mwpm_03200403.jpg"},{"uniquekey":"fc738d20eca3318209a39ba16d2e84bf","title":"【实务】中国境内机构和个人跨境投资实务","date":"2018-05-24 08:19","category":"头条","author_name":"中华创投家","url":"http://mini.eastday.com/mobile/180524081947293.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180524/20180524081947_b725a43afddfc94c3acf642d7a130079_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180524/20180524081947_b725a43afddfc94c3acf642d7a130079_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180524/20180524081947_b725a43afddfc94c3acf642d7a130079_5_mwpm_03200403.jpg"},{"uniquekey":"48add8aaee09b988dc77017215f735dc","title":"朱婷北京恢复训练即将回归","date":"2018-05-24 08:18","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/180524081845173.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180524/20180524081845_b02f1b0f9204338b3e0bc2358c7c9f98_1_mwpm_03200403.jpg"},{"uniquekey":"7f83782356b2854e797d00050fce3fbe","title":"台当局已黔驴技穷？蔡英文叫嚣对大陆\u201c下通牒\u201d","date":"2018-05-24 08:14","category":"头条","author_name":"杭州网","url":"http://mini.eastday.com/mobile/180524081419534.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524081419_e1591e2cc496dd20f9668e80ee8d5237_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180524/20180524081419_e1591e2cc496dd20f9668e80ee8d5237_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180524/20180524081419_e1591e2cc496dd20f9668e80ee8d5237_1_mwpm_03200403.jpg"},{"uniquekey":"56eea273154d831910cb5770155837df","title":"特朗普称金正恩对美强硬是受中方影响?外交部回应","date":"2018-05-24 08:12","category":"头条","author_name":"外交部网站","url":"http://mini.eastday.com/mobile/180524081242883.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524081242_1b2b17f16597ebddccde96407301791e_1_mwpm_03200403.jpg"},{"uniquekey":"2fb5d56b990c281f66e6074b1f2b1bc6","title":"周末晴天 你敢不敢在郑州西边的山水间消失两天","date":"2018-05-24 08:10","category":"头条","author_name":"郑州ZAKER","url":"http://mini.eastday.com/mobile/180524081037530.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524081037_6f4dee7d8abcd40ba9019fa5cdea5e2b_16_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180524/20180524081037_6f4dee7d8abcd40ba9019fa5cdea5e2b_19_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180524/20180524081037_6f4dee7d8abcd40ba9019fa5cdea5e2b_2_mwpm_03200403.jpg"},{"uniquekey":"dc5f8bb0f1b7df2400ee7b620794a464","title":"融资\u201c窗口\u201d持续收紧，房企如何缓解融资焦虑？","date":"2018-05-24 08:10","category":"头条","author_name":"蓝鲸财经","url":"http://mini.eastday.com/mobile/180524081032506.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180524/20180524081032_e29c8fd3574d941476721d573d9f6d42_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180524/20180524081032_e29c8fd3574d941476721d573d9f6d42_2_mwpm_03200403.jpg"},{"uniquekey":"8ac831d56478ece37cbe4de442dccedc","title":"曝意甲最佳主帅将取代孔蒂 7000万锋霸却密谋叛逃","date":"2018-05-24 08:09","category":"头条","author_name":"网易体育","url":"http://mini.eastday.com/mobile/180524080959180.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180524/20180524080959_6950e3295f5fb7f7c428288a62de5700_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180524/20180524080959_6950e3295f5fb7f7c428288a62de5700_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180524/20180524080959_6950e3295f5fb7f7c428288a62de5700_3_mwpm_03200403.jpg"},{"uniquekey":"e8f0e72f4132e3c294e1b1161411f957","title":"不算不知道！震惊！北京把房租出去要多少年才能回本？泪崩","date":"2018-05-24 08:08","category":"头条","author_name":"最爱大北京","url":"http://mini.eastday.com/mobile/180524080821202.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180524/20180524080821_09938bde5fc2a3d2ac77b06bcc4bc162_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180524/20180524080821_09938bde5fc2a3d2ac77b06bcc4bc162_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180524/20180524080821_09938bde5fc2a3d2ac77b06bcc4bc162_1_mwpm_03200403.jpg"},{"uniquekey":"1b99afef5d54666e8107246e3c6a3b22","title":"粤媒曝广东宏远未续约尤纳斯 还有比他更合适的人选吗？","date":"2018-05-24 08:04","category":"头条","author_name":"宫爆体育","url":"http://mini.eastday.com/mobile/180524080440127.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180524/20180524_8e5aa1a04c08d85e1ebe096fb681a3a4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20180524/20180524_bdbeed466fe8a06815e68f52ac325bf5_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20180524/20180524_337c4c1536eac372fcd214aeb966fd5a_cover_mwpm_03200403.jpg"},{"uniquekey":"a6e8cd4da25d5700a916eadfc2d5d94f","title":"最\u201c尿性\u201d的反人类设计，设计师的脑袋里全是浆糊？","date":"2018-05-24 08:03","category":"头条","author_name":"弥雨祭","url":"http://mini.eastday.com/mobile/180524080344277.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524080344_7807a91f63d292f6b0ab549b4750dfb8_11_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180524/20180524080344_7807a91f63d292f6b0ab549b4750dfb8_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180524/20180524080344_7807a91f63d292f6b0ab549b4750dfb8_13_mwpm_03200403.jpg"},{"uniquekey":"ce892ba8566cfe320b29670b5fe9fc56","title":"一波四折，火箭2次落后10分2次逆转，火箭巨头心脏不适退场不看了","date":"2018-05-24 08:03","category":"头条","author_name":"时刻体育","url":"http://mini.eastday.com/mobile/180524080342245.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180524/20180524080342_d620d63f1ea444ffbbddd6d9c5c93ef2_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20180524/20180524080342_d620d63f1ea444ffbbddd6d9c5c93ef2_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20180524/20180524080342_d620d63f1ea444ffbbddd6d9c5c93ef2_1_mwpm_03200403.jpg"},{"uniquekey":"8e48b237e9b1ab409b97420d33354fad","title":"王者荣耀：小鲜肉还是肌肉男，究竟谁是大小姐的下路绝配？","date":"2018-05-24 08:03","category":"头条","author_name":"时刻保持微笑丶","url":"http://mini.eastday.com/mobile/180524080307189.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20180524/20180524080307_0532f2b9641f2a5bc787400bc95de738_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20180524/20180524080307_0532f2b9641f2a5bc787400bc95de738_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20180524/20180524080307_0532f2b9641f2a5bc787400bc95de738_1_mwpm_03200403.jpg"},{"uniquekey":"0024a7a30efb0b8db9da66a725ba718c","title":"阿根廷被指做掉梅西最稳帮手：足协撒谎 想除掉他","date":"2018-05-24 08:01","category":"头条","author_name":"新浪体育","url":"http://mini.eastday.com/mobile/180524080134689.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180524/20180524080134_e9e608ec47f7c2d85b1e39d33936d681_1_mwpm_03200403.jpg"},{"uniquekey":"de7b2bb11a80fc9678fb85289e23ddc7","title":"何洁与儿子时尚大片来袭 逗趣打闹画面很温馨","date":"2018-05-24 08:01","category":"头条","author_name":"中国青年网","url":"http://mini.eastday.com/mobile/180524080123075.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180524/20180524080123_14d8454c690c46205d8c4ab9209feed5_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180524/20180524080123_d962b55febb4d1d00935f74f3de658eb_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180524/20180524080123_550e6a269ada781eea6b3138b1f1c623_1_mwpm_03200403.jpg"},{"uniquekey":"4318a626bbb0ede8314b76da79296a0b","title":"万松书院20余处摩崖石刻 到底藏着什么秘密","date":"2018-05-24 08:01","category":"头条","author_name":"浙江在线","url":"http://mini.eastday.com/mobile/180524080111722.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20180524/20180524080111_11dd4f80c2898e88fb9304650a42d021_1_mwpm_03200403.jpg"},{"uniquekey":"db572e8f67645669efd5f06cee2dc02e","title":"丹东港:资产查封、冻结事项可能使公司融资环境恶化","date":"2018-05-24 08:01","category":"头条","author_name":"上海清算所","url":"http://mini.eastday.com/mobile/180524080102503.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20180524/20180524080102_c3ef2164b21ad40c29d5f8f281444f13_1_mwpm_03200403.jpg"},{"uniquekey":"9aaf038068db2157b15fe9c3b6a8dfda","title":"【中国梦·践行者】武痴张子豪：义务传承只为\"理\"","date":"2018-05-24 07:58","category":"头条","author_name":"大洋网","url":"http://mini.eastday.com/mobile/180524075809512.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180524/20180524075809_04b302c926c39b0ca56541ae7f83e855_1_mwpm_03200403.jpg"},{"uniquekey":"2d8cdc00df780d40c09ce0d215afd105","title":"英雄，就是普通人拥有一颗伟大的心！","date":"2018-05-24 07:57","category":"头条","author_name":"人民网app","url":"http://mini.eastday.com/mobile/180524075745066.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20180524/20180524075745_a29a2af08ea6d1e7aa62fe77568016a0_17_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20180524/20180524075745_a29a2af08ea6d1e7aa62fe77568016a0_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20180524/20180524075745_a29a2af08ea6d1e7aa62fe77568016a0_5_mwpm_03200403.jpg"},{"uniquekey":"f35e5c1234c6eba009f5f7d97b6a3b02","title":"美股收评：在这件事发生之后，美股齐刷刷地飞涨","date":"2018-05-24 07:55","category":"头条","author_name":"汇通网","url":"http://mini.eastday.com/mobile/180524075558321.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20180524/20180524075558_0556be98e4322df054fdf50b7884d1cb_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20180524/20180524075558_0556be98e4322df054fdf50b7884d1cb_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20180524/20180524075558_0556be98e4322df054fdf50b7884d1cb_2_mwpm_03200403.jpg"},{"uniquekey":"a66f104c03e40f3e588f1ed8635f9299","title":"天津户口狂欢背后：城市在分化，未来这样的城市才有机会","date":"2018-05-24 07:55","category":"头条","author_name":"大猫财经","url":"http://mini.eastday.com/mobile/180524075552884.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180524/20180524075552_6cf3b41de44f8eaf8453b51c9752975c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180524/20180524075552_6cf3b41de44f8eaf8453b51c9752975c_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180524/20180524075552_6cf3b41de44f8eaf8453b51c9752975c_3_mwpm_03200403.jpg"},{"uniquekey":"85358855b58b00f14189bd2e97af8675","title":"如何传承发展浙江优秀传统文化？浙江发布行动计划","date":"2018-05-24 07:55","category":"头条","author_name":"浙江在线","url":"http://mini.eastday.com/mobile/180524075537525.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20180524/20180524075537_f3c17a82ba7a52f34b992c6081138624_1_mwpm_03200403.jpg"},{"uniquekey":"39150cd1785424d5409846bafbb1c002","title":"高清：BMW PGA锦标赛练习日 李昊桐吴阿顺出战","date":"2018-05-24 07:55","category":"头条","author_name":"搜狐体育","url":"http://mini.eastday.com/mobile/180524075534306.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180524/20180524075534_50a9ebf98ccf5e2190ec6db2307b4b94_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180524/20180524075534_50a9ebf98ccf5e2190ec6db2307b4b94_8_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20180524/20180524075534_50a9ebf98ccf5e2190ec6db2307b4b94_12_mwpm_03200403.jpg"},{"uniquekey":"5b3d799bd7aee4e93107ba53e084e436","title":"2018汤尤杯第4日赛果 8强全部产生 你喜欢的球队在吗？","date":"2018-05-24 07:53","category":"头条","author_name":"新小特羽毛球","url":"http://mini.eastday.com/mobile/180524075313602.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20180524/20180524075313_e19d83b2556a9258cdca04fbb3c5c705_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20180524/20180524075313_e19d83b2556a9258cdca04fbb3c5c705_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20180524/20180524075313_e19d83b2556a9258cdca04fbb3c5c705_1_mwpm_03200403.jpg"},{"uniquekey":"024427e8b032afadbb392513eb115619","title":"龙一一《海洋之城》杀青 接力《三生三世十里桃花》舞台剧上演","date":"2018-05-24 07:52","category":"头条","author_name":"千龙网","url":"http://mini.eastday.com/mobile/180524075247005.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20180524/20180524075247_09a64d7f4f944e9581369a90d0bacfc1_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20180524/20180524075247_09a64d7f4f944e9581369a90d0bacfc1_2_mwpm_03200403.jpg"},{"uniquekey":"f596279c1433d2d939dd87c6a9731e9a","title":"幽门螺杆菌总是复发！医生说是作死，都怪爱做这\u201c3个动作\u201d！","date":"2018-05-24 07:52","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/180524075217261.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20180524/20180524075217_10d814f163cfcf028852aec7d6d8fc5a_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20180524/20180524075217_10d814f163cfcf028852aec7d6d8fc5a_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20180524/20180524075217_10d814f163cfcf028852aec7d6d8fc5a_1_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat( ) {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData( ) {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 4c21abed3ea2d261636894e617015a4e
             * title : Angelababy解锁推塔战 “围殴”李晨盛一伦队
             * date : 2018-05-24 08:25
             * category : 头条
             * author_name : 中国甘肃网
             * url : http://mini.eastday.com/mobile/180524082532026.html
             * thumbnail_pic_s : http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_2_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_1_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://03.imgmini.eastday.com/mobile/20180524/20180524082532_873177ab0870cc8311fd534eef0779b9_3_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey( ) {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle( ) {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate( ) {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory( ) {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name( ) {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl( ) {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s( ) {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02( ) {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03( ) {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
