# EasyAIoT（深度智核AI云平台）
[![Gitee star](https://gitee.com/soaring-xiongkulu/easyaiot/badge/star.svg?theme=gvp)](https://gitee.com/soaring-xiongkulu/easyaiot/stargazers)
[![Gitee fork](https://gitee.com/soaring-xiongkulu/easyaiot//badge/fork.svg?theme=gvp)](https://gitee.com/soaring-xiongkulu/easyaiot/members)
### 我希望全世界都能使用这个系统，实现AI的真正0门槛，人人都能体验到AI带来的好处，而并不只是掌握在少数人手里。 
<div align="center">
    <img src=".image/logo.png" width="30%" height="30%" alt="EasyAIoT">
</div>

## 🌟 关于项目的一些思考
#### 我认为没有任何一个编程语言是擅长所有事情，但如果是3种编程语言混合，EasyAIoT将所向披靡，恰好我具备这种特质。
#### Java适合做平台但不适合网络编程和AI编程，Python适合做网络和AI编程但不适合做高性能任务执行，C++适合做高性能任务执行但不适合做前面两者做的事情，EasyAIoT设想是采用三合一语言混编，构建一个实现不太Easy，但是使用非常Easy的AIoT平台。
![EasyAIoT平台架构.jpg](.image/iframe2.jpg)
#### EasyAIoT其实不是一个项目，而是五个项目。
#### 好处是什么呢？假如说你在一个受限的设备上（比如RK3588），你只需要拿出其中某个项目就可以独立部署，所以看似这个项目是云平台，其实他也可以是边缘平台。

### 🌟 真开源不易，如果这个项目对您有帮助，请您点亮一颗Star再离开，这将是对我最大的支持！（在这个假开源横行的时代，这个项目就是一个异类，纯靠爱来发电）

## 🎯 适用场景
![适用场景.png](.image/适用场景.png)

## 🛠️ 解决方案
<div>
  <img src=".image/解决方案1.png" alt="Screenshot 1" width="49%" style="margin-right: 10px">
  <img src=".image/解决方案2.png" alt="Screenshot 2" width="49%">
</div>

## 🧩 项目结构
EasyAIoT由五个核心项目组成：
- **WEB模块**: 基于Vue的前端管理界面
- **DEVICE模块**: 基于Java的设备管理模块，负责IoT设备接入与管理
- **VIDEO模块**: 基于Python的视频处理模块，负责视频流处理与传输
- **AI模块**: 基于Python的人工智能处理模块，负责视频分析和AI算法执行
- **TASK模块**: 基于C++的高性能任务处理模块，负责计算密集型任务执行

## ☁️ EasyAIoT = AI + IoT = 云边一体化解决方案
支持上千种垂直场景，支持AI模型定制化和AI算法定制化开发，深度融合。

赋能万物智视：EasyAIoT 构筑了物联网设备（尤其是海量摄像头）的高效接入与管控网络。我们深度融合流媒体实时传输技术与前沿人工智能（AI），打造一体化服务核心。这套方案不仅打通了异构设备的互联互通，更将高清视频流与强大的AI解析引擎深度集成，赋予监控系统"智能之眼"——精准实现人脸识别、异常行为分析、风险人员布控及周界入侵检测

![EasyAIoT平台架构.jpg](.image/iframe1.jpg)

## ⚠️ 免责声明

EasyAIoT是一个开源学习项目，与商业行为无关。用户在使用该项目时，应遵循法律法规，不得进行非法活动。如果EasyAIoT发现用户有违法行为，将会配合相关机关进行调查并向政府部门举报。用户因非法行为造成的任何法律责任均由用户自行承担，如因用户使用造成第三方损害的，用户应当依法予以赔偿。使用EasyAIoT所有相关资源均由用户自行承担风险.

## 📚 官方文档
- 文档地址：http://pro.basiclab.top:9988/

## 🎮 演示环境
- 演示地址：http://pro.basiclab.top:8888/
- 账号：admin
- 密码：admin123

## ⚙️ 项目地址
- Gitee: https://gitee.com/soaring-xiongkulu/easyaiot
- Github: https://github.com/soaring-xiongkulu/easyaiot

## 🛠️ 技术栈
### 前端
- **核心框架**：Vue 3.3.8
- **开发语言**：TypeScript 5.2.2
- **构建工具**：Vite 4.5.0
- **UI组件库**：Ant Design Vue 4.0.7
- **状态管理**：Pinia 2.1.7
- **路由**：Vue Router 4.2.5
- **HTTP客户端**：Axios/Alova 1.6.1
- **CSS**：UnoCSS 0.57.3
- **包管理器**：pnpm 9.0.4

### 后端
- **DEVICE模块框架**: 
  - Spring Boot 2.7.18
  - Spring Boot Starter Security
  - Gateway
  - SkyWalking
  - OpenFeign
  - Sentinel
  - Nacos
  - Kafka
  - TDEngine
  - MyBatis-Plus
  - PostgreSQL
- **AI模块框架**：
  - Python 3.11+
  - Flask
  - Flask-Cors
  - Flask-Migrate
  - Flask-SQLAlchemy
  - OpenCV (cv2)
  - Pillow (PIL.Image)
  - Ultralytics
  - Psycopg2-Binary
- **VIDEO模块框架**：
  - Python 3.11+
  - WSDiscovery
  - Netifaces
  - Onvif-Zeep
  - Pyserial
  - Paho_Mqtt
  - Flask
  - Flask-Cors
  - Flask-Migrate
  - Flask-SQLAlchemy
  - Psycopg2-Binary
- **TASK模块框架**：
  - C++17
  - Opencv2
  - Httplib
  - Json
  - Librknn
  - Minio-Cpp
  - Mk-Media
  - RGA
  - Logging
  - Queue
  - Thread

## 📸 截图
<div>
  <img src=".image/banner/banner1001.png" alt="Screenshot 1" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner1009.jpg" alt="Screenshot 2" width="49%">
</div>
<div>
  <img src=".image/banner/banner1006.jpg" alt="Screenshot 3" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner1010.jpg" alt="Screenshot 4" width="49%">
</div>
<div>
  <img src=".image/banner/banner1015.png" alt="图片1" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner1016.jpg" alt="图片1" width="49%">
</div>
<div>
  <img src=".image/banner/banner1007.jpg" alt="Screenshot 5" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner1008.jpg" alt="Screenshot 6" width="49%">
</div>
<div>
  <img src=".image/banner/banner1013.jpg" alt="图片1" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner1014.png" alt="图片1" width="49%">
</div>
<div>
  <img src=".image/banner/banner1011.jpg" alt="Screenshot 7" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner1012.jpg" alt="Screenshot 8" width="49%">
</div>
<div>
  <img src=".image/banner/banner1003.png" alt="Screenshot 9" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner1004.png" alt="Screenshot 10" width="49%">
</div>
<div>
  <img src=".image/banner/banner1005.png" alt="Screenshot 11" width="49%" style="margin-right: 10px">
  <img src=".image/banner/banner1002.png" alt="Screenshot 12" width="49%">
</div>

## 📞 联系方式
<div>
  <img src=".image/联系方式.jpg" alt="联系方式" width="30%" style="margin-right: 10px">
  <img src=".image/微信群.jpg" alt="联系方式" width="30%" style="margin-right: 10px">
</div>

### 🪐 知识星球：
<p>
  <img src=".image/知识星球.jpg" alt="知识星球" width="30%">
</p>

## 💰 打赏赞助
<div>
    <img src=".image/微信支付.jpg" alt="微信支付" width="30%" height="30%">
    <img src=".image/支付宝支付.jpg" alt="支付宝支付" width="30%" height="10%">
</div>

## 🙏 致谢
感谢以下各位对本项目包括但不限于代码贡献、问题反馈、资金捐赠等各种方式的支持！以下排名不分先后：
<div class="contributors-grid">
  <a href="https://gitee.com/huangzhen1993" target="_blank"><img src="./.image/sponsor/黄振.jpg" alt="黄振" title="黄振"></a>
  <a href="https://gitee.com/shup092_admin" target="_blank"><img src="./.image/sponsor/shup.jpg" alt="shup" title="shup"></a>
  <a href="https://github.com/派大星" target="_blank"><img src="./.image/sponsor/派大星.jpg" alt="派大星" title="派大星"></a>
  <a href="https://gitee.com/wz_vue_gitee_181" target="_blank"><img src="./.image/sponsor/棒槌🧿🍹🍹🧿.jpg" alt="棒槌🧿🍹🍹🧿" title="棒槌🧿🍹🍹🧿"></a>
  <a href="https://gitee.com/huang-xiangtai" target="_blank"><img src="./.image/sponsor/憨憨.jpg" alt="憨憨" title="憨憨"></a>
  <a href="https://gitee.com/gu-beichen-starlight" target="_blank"><img src="./.image/sponsor/文艺小青年.jpg" alt="文艺小青年" title="文艺小青年"></a>
  <a href="https://github.com/zhangnanchao" target="_blank"><img src="./.image/sponsor/lion.jpg" alt="lion" title="lion"></a>
  <a href="https://gitee.com/yupccc" target="_blank"><img src="./.image/sponsor/汪汪队立大功.jpg" alt="汪汪队立大功" title="汪汪队立大功"></a>
  <a href="https://github.com/fengchunshen" target="_blank"><img src="./.image/sponsor/春生.jpg" alt="春生" title="春生"></a>
  <a href="https://gitee.com/mrfox_wang" target="_blank"><img src="./.image/sponsor/贵阳王老板.jpg" alt="贵阳王老板" title="贵阳王老板"></a>
  <a href="https://gitee.com/haobaby" target="_blank"><img src="./.image/sponsor/hao_chen.jpg" alt="hao_chen" title="hao_chen"></a>
  <a href="https://gitee.com/yuer629" target="_blank"><img src="./.image/sponsor/yuer629.jpg" alt="yuer629" title="yuer629"></a>
  <a href="https://gitee.com/cai-peikai/ai-project" target="_blank"><img src="./.image/sponsor/kong.jpg" alt="kong" title="kong"></a>
  <a href="https://gitee.com/HB1731276584" target="_blank"><img src="./.image/sponsor/岁月静好.jpg" alt="岁月静好" title="岁月静好"></a>
  <a href="https://gitee.com/hy5128" target="_blank"><img src="./.image/sponsor/Kunkka.jpg" alt="Kunkka" title="Kunkka"></a>
  <a href="https://gitee.com/cnlijf" target="_blank"><img src="./.image/sponsor/李江峰.jpg" alt="李江峰" title="李江峰"></a>
  <a href="https://gitee.com/Yang619" target="_blank"><img src="./.image/sponsor/Chao..jpg" alt="Chao." title="Chao."></a>
  <a href="https://gitee.com/guo-dida" target="_blank"><img src="./.image/sponsor/灬.jpg" alt="灬" title="灬"></a>
  <a href="https://github.com/XyhBill" target="_blank"><img src="./.image/sponsor/Mr.LuCkY.jpg" alt="Mr.LuCkY" title="Mr.LuCkY"></a>
  <a href="https://gitee.com/timeforeverz" target="_blank"><img src="./.image/sponsor/泓.jpg" alt="泓" title="泓"></a>
  <a href="https://gitee.com/mySia" target="_blank"><img src="./.image/sponsor/i.jpg" alt="i" title="i"></a>
  <a href="https://gitee.com/baobaomo" target="_blank"><img src="./.image/sponsor/放学丶别走.jpg" alt="放学丶别走" title="放学丶别走"></a>
  <a href="https://gitee.com/sunbirder" target="_blank"><img src="./.image/sponsor/小菜鸟先飞.jpg" alt="小菜鸟先飞" title="小菜鸟先飞"></a>
  <a href="https://gitee.com/mmy0" target="_blank"><img src="./.image/sponsor/追溯未来-_-.jpg" alt="追溯未来-_-" title="追溯未来-_-"></a>
  <a href="https://gitee.com/ccqingshan" target="_blank"><img src="./.image/sponsor/青衫.jpg" alt="青衫" title="青衫"></a>
  <a href="https://gitee.com/jiangchunJava" target="_blank"><img src="./.image/sponsor/Fae.jpg" alt="Fae" title="Fae"></a>
  <a href="https://gitee.com/wcjjjjjjj" target="_blank"><img src="./.image/sponsor/wcj.jpg" alt="wcj" title="wcj"></a>
  <a href="https://gitee.com/hufanglei" target="_blank"><img src="./.image/sponsor/🌹怒放de生命😋.jpg" alt="怒放de生命" title="怒放de生命"></a>
  <a href="https://gitee.com/juyunsuan" target="_blank"><img src="./.image/sponsor/蓝速传媒.jpg" alt="蓝速传媒" title="蓝速传媒"></a>
  <a href="https://gitee.com/achieve275" target="_blank"><img src="./.image/sponsor/Achieve_Xu.jpg" alt="Achieve_Xu" title="Achieve_Xu"></a>
  <a href="https://gitee.com/nicholasld" target="_blank"><img src="./.image/sponsor/NicholasLD.jpg" alt="NicholasLD" title="NicholasLD"></a>
  <a href="https://gitee.com/Mo_bai1016" target="_blank"><img src="./.image/sponsor/Bug写手墨白.jpg" alt="Bug写手墨白" title="Bug写手墨白"></a>
  <a href="https://gitee.com/lhyicn" target="_blank"><img src="./.image/sponsor/童年.jpg" alt="童年" title="童年"></a>
  <a href="https://gitee.com/dongxinji" target="_blank"><img src="./.image/sponsor/take%20your%20time%20or.jpg" alt="take your time or" title="take your time or"></a>
</div>
 
## 📄 开源协议
[MIT LICENSE](LICENSE)

## ©️ 版权使用说明
EasyAIoT开源平台遵循 [MIT LICENSE](LICENSE) 协议。 允许商业使用，但务必保留类作者、Copyright 信息。

## 🌟 Star增长趋势图
[![Stargazers over time](https://starchart.cc/soaring-xiongkulu/easyaiot.svg?variant=adaptive)](https://starchart.cc/soaring-xiongkulu/easyaiot)

<style>
.contributors-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(100px, 1fr));
  gap: 15px;
  margin: 20px 0;
}
.contributors-grid a {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-decoration: none;
}
.contributors-grid img {
  width: 80px;
  height: 80px;
  border-radius: 50%;
  object-fit: cover;
  border: 2px solid #eee;
  transition: transform 0.3s;
}
.contributors-grid img:hover {
  transform: scale(1.1);
}
.contributors-grid span {
  margin-top: 5px;
  font-size: 12px;
  color: #666;
  text-align: center;
}
</style>






