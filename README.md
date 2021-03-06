# TrafficEase 客户端（LTS）

![](readme/ic_trafficease.png)

## TrafficEase v1.2.1

**“TrafficEase”** 是一款基于百度地图SDK的智慧出行APP。用户通过此款APP，即可规划出行路线，记录出行轨迹，路线导航，查询公交实时信息，了解出行天气状况，选择酒店、餐厅、停车场等。同时也可以通过各大社交平台转发自己的出行动态，分享出行的实时路况以及出行攻略。

随着人类社会的不断发展，人们生活已步入新时代，社会主要矛盾已经转化为人民日益增长的美好生活需要和不平衡不充分的发展之间的矛盾。出行作为“衣食住行”其中一个重要维度，直接影响着人们生活的幸福指数。当下，人们出行通常需要考虑很多问题（如天气，出行时间，交通工具，停车场，出行耗时等），需要一款应用帮助人们从日常紧张忙碌的生活节奏中解脱出来，不用再手动从多个应用、网站、渠道中通过找寻筛选来获取相关出行信息。此时，**“TrafficEase”** 应运而生了。

## 数据来源

- 新闻来源：聚合数据
- 地图来源：百度地图
- 天气来源：和风天气
- 背景图来源：必应图片（每日一图）

## 应用截图

![](readme/v1.1.2_1.png)
![](readme/v1.1.2_2.png)
![](readme/v1.1.2_3.png)
![](readme/v1.1.2_4.png)

## 历史版本

| 序号 | 版本号 | 说明 |
| :-: | :-: | - |
| 1 | v1.0.0 | 前期准备 & 统一开发环境 |
| 2 | v1.0.1 | 实现登录注册功能 & 接入SMS短信验证码功能 & 接入百度地图SDK |
| 3 | v1.0.2 | 主框架-底部Fragment导航栏实现 & 登录页面使用SharedPreferences优化用户体验 |
| 4 | v1.0.3 | 天气Fragment demo实现 & 天气来源：和风天气 |
| 5 | v1.1.0 | 基于和风天气认证开发者接口重写WeatherFragment & MapFragment定位功能实现 |
| 6 | v1.1.1 | 初步实现MimeFragment个人静态页面 & glide框架版本从 4.6.1 回退到 3.7.0 |
| 7 | v1.1.2 | 实现HomeFragment首页页面 HDEMO & 注：HDEMO部分仅为快速展示效果，后续版本将去除 |
| 8 | v1.2.0 | 增添readme文件夹 & 适配 Android 8.0 & 实现 HomeFragment 功能 & 移除登录注册页面 |
| 9 | v1.2.1 | 更新 readme & 移除服务端通信部分 & 跳过登录注册页面 |

## 最新版开发环境

1. Android Studio >= 3.3.1
2. Gradel Version: 4.10.1
3. Gradle Plugin Version: 3.3.1
4. minSdkVersion：21
5. targetSdkVersion 27

## 相关依赖
	
	    // 百度地图SDK
	    compile files('libs/BaiduLBS_Android.jar')
	    // butterknife 框架
	    compile 'com.jakewharton:butterknife:8.8.1'
	    annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
	    // umeng 集成友盟SDK
	    compile 'com.umeng.analytics:analytics:latest.integration'
	    // glide 框架
	    compile 'com.github.bumptech.glide:glide:3.7.0'
	//    implementation 'com.github.bumptech.glide:glide:4.6.1'
	//    annotationProcessor 'com.github.bumptech.glide:compiler:4.6.1'
	    // recyclerview、v4包 和 v13包,注意版本一致
	    implementation 'com.android.support:recyclerview-v7:27.0.0'
	    compile 'com.android.support:support-v4:27.0.0'
	    compile 'com.android.support:support-v13:27.0.0'
	    // gson工具
	    compile 'com.google.code.gson:gson:2.8.2'
	    // 网络封装类 okhttp 与 retrofit
	    compile 'com.squareup.okhttp3:okhttp:3.9.1'
	    compile 'com.squareup.retrofit2:retrofit:2.3.0'
	    compile 'com.squareup.retrofit2:converter-gson:2.3.0'
	    // litepal框架
	    compile 'org.litepal.android:core:1.6.1'
	    // circleimageview框架
	    implementation 'de.hdodenhof:circleimageview:2.2.0'
