package cn.levey.myapplication.view;

import java.util.List;

/**
 * Created by Levey on 2018/2/7 13:56.
 * e-mail: m@levey.cn
 */

public class RvPojo {
    /**
     * error : false
     * results : [{"_id":"575cbb83421aa96b20caface","createdAt":"2016-06-12T09:31:47.329Z","desc":"直接看图，，不用看描述。","publishedAt":"2016-06-12T12:04:04.308Z","source":"web","type":"福利","url":"http://ww4.sinaimg.cn/mw690/9844520fjw1f4fqribdg1j21911w0kjn.jpg","used":true,"who":"龙龙童鞋"},{"_id":"5757975b421aa90eca080dd5","createdAt":"2016-06-08T11:56:11.8Z","desc":"6.8","publishedAt":"2016-06-08T12:39:36.270Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f4nog8tjfrj20eg0mgab7.jpg","used":true,"who":"daimajia"},{"_id":"575640bf421aa9759750aee4","createdAt":"2016-06-07T11:34:23.596Z","desc":"隐藏福利","publishedAt":"2016-06-07T11:43:18.947Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f4mi70ns1bj20i20vedkh.jpg","used":true,"who":"代码家"},{"_id":"575446dd421aa948eea75a32","createdAt":"2016-06-05T23:35:57.64Z","desc":"怎么会有一只狗","publishedAt":"2016-06-06T12:24:22.149Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f4kron1wqaj20ia0rf436.jpg","used":true,"who":"代码家"},{"_id":"5750f8a7421aa95653f1b92f","createdAt":"2016-06-03T11:25:27.781Z","desc":"周五啦！","publishedAt":"2016-06-03T11:42:44.370Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034gw1f4hvgpjjapj20ia0ur0vr.jpg","used":true,"who":"代码家"},{"_id":"574f9b58421aa910b3910aef","createdAt":"2016-06-02T10:35:04.323Z","desc":"6.3","publishedAt":"2016-06-02T11:30:26.566Z","source":"api","type":"福利","url":"http://ac-OLWHHM4o.clouddn.com/4063qegYjlC8nx6uEqxV0kT3hn6hdqJqVWPKpdrS","used":true,"who":"CoXier"},{"_id":"574e58df421aa910a742e78f","createdAt":"2016-06-01T11:39:11.549Z","desc":"6、1儿童节快乐","publishedAt":"2016-06-01T12:01:44.959Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1f4fkmatcvdj20hs0qo78s.jpg","used":true,"who":"代码家"},{"_id":"574b9801421aa910a742e742","createdAt":"2016-05-30T09:31:45.793Z","desc":"5.30","publishedAt":"2016-05-31T12:12:06.424Z","source":"api","type":"福利","url":"http://ac-OLWHHM4o.clouddn.com/DPCY44vIYPjVPKNzfHjMdXd9bk27q0i1X2nIaO8Z","used":true,"who":"CoXier"},{"_id":"574b8e6e421aa910b7ff04a5","createdAt":"2016-05-30T08:50:54.535Z","desc":"5.30","publishedAt":"2016-05-30T08:56:14.314Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f4d4iji38kj20sg0izdl1.jpg","used":true,"who":"daimajia"},{"_id":"5747be9c67765923298b5c8b","createdAt":"2016-05-27T11:27:24.288Z","desc":"夏天来了宝宝们","publishedAt":"2016-05-27T11:56:22.790Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f49s6i5pg7j20go0p043b.jpg","used":true,"who":"代码家"},{"_id":"5746702e6776594b0d64dc49","createdAt":"2016-05-26T11:40:30.357Z","desc":"5.26","publishedAt":"2016-05-26T11:52:42.430Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f48mxqcvkvj20lt0pyaed.jpg","used":true,"who":"daimajia "},{"_id":"57451a706776594b0bcff794","createdAt":"2016-05-25T11:22:24.607Z","desc":"5.25","publishedAt":"2016-05-25T11:50:54.367Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f47gspphiyj20ia0rf76w.jpg","used":true,"who":"代码家"},{"_id":"5743cde9677659453b01369a","createdAt":"2016-05-24T11:43:37.996Z","desc":"5.24","publishedAt":"2016-05-24T11:56:12.924Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f46bsdcls2j20sg0izac0.jpg","used":true,"who":"daimajia"},{"_id":"57426fbb6776590a0b0fe26d","createdAt":"2016-05-23T10:49:31.552Z","desc":"5.23","publishedAt":"2016-05-23T10:54:25.890Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f454lcdekoj20dw0kumzj.jpg","used":true,"who":"代码家"},{"_id":"573e6c776776591ca2f31ba5","createdAt":"2016-05-20T09:46:31.535Z","desc":"昨天妹子的正脸","publishedAt":"2016-05-20T10:05:09.959Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f41lxgc3x3j20jh0tcn14.jpg","used":true,"who":"代码家"},{"_id":"573d39ea6776591ca681f8c7","createdAt":"2016-05-19T11:58:34.715Z","desc":"5.19","publishedAt":"2016-05-19T12:09:29.617Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f40k4dyrhhj20iz0sg41b.jpg","used":true,"who":"daimajia"},{"_id":"573be98f6776591c9fd0cd5f","createdAt":"2016-05-18T12:03:27.865Z","desc":"518","publishedAt":"2016-05-18T12:18:37.235Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f3zen8idmkj20dw0kun0i.jpg","used":true,"who":"daimajia"},{"_id":"573a99ee6776591ca681f89f","createdAt":"2016-05-17T12:11:26.506Z","desc":"5.17","publishedAt":"2016-05-17T12:17:17.785Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f3y998rv5uj20m80vxq6c.jpg","used":true,"who":"张涵宇"},{"_id":"573943c06776591ca2f31b55","createdAt":"2016-05-16T11:51:28.480Z","desc":"5.16","publishedAt":"2016-05-16T11:58:08.802Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f3x32bd1hcj20d90k03zx.jpg","used":true,"who":"daimajia"},{"_id":"573542b66776591ca2f31b25","createdAt":"2016-05-13T10:57:58.667Z","desc":"5.13","publishedAt":"2016-05-13T11:08:37.42Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f3tkjebzzpj20kg0v7q9h.jpg","used":true,"who":"xiaobei"},{"_id":"5732c06167765974fbfcfa53","createdAt":"2016-05-11T13:17:21.318Z","desc":"5.12","publishedAt":"2016-05-12T12:04:43.857Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f3rdepqtnij21kw2dc1cx.jpg","used":true,"who":"张涵宇"},{"_id":"5732b0bc67765974f5e27edd","createdAt":"2016-05-11T12:10:36.258Z","desc":"511","publishedAt":"2016-05-11T12:12:08.55Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f3rbikc83dj20dw0kuadt.jpg","used":true,"who":"daimajai"},{"_id":"57315e5d67765974fca83139","createdAt":"2016-05-10T12:06:53.983Z","desc":"510","publishedAt":"2016-05-10T12:14:26.447Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f3q5semm0wj20qo0hsacv.jpg","used":true,"who":"daimajia"},{"_id":"57300a5d67765974fca83128","createdAt":"2016-05-09T11:56:13.267Z","desc":"5.9","publishedAt":"2016-05-09T12:05:34.903Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f3ozv0wqywj20qo0em0vt.jpg","used":true,"who":"daimajia"},{"_id":"572c146a67765974f885c01e","createdAt":"2016-05-06T11:50:02.319Z","desc":"无版权","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f3litmfts1j20qo0hsac7.jpg","used":true,"who":"代码家"},{"_id":"572aa3ea67765974fca830f4","createdAt":"2016-05-05T09:37:46.142Z","desc":"5.5","publishedAt":"2016-05-05T12:14:21.156Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f3k9dp8r9qj20dw0jljtd.jpg","used":true,"who":"张涵宇"},{"_id":"5729794967765974fca830e7","createdAt":"2016-05-04T12:23:37.334Z","desc":"5.4","publishedAt":"2016-05-04T12:26:03.894Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bgw1f3j8jt6qn8j20vr15owvk.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d1d421aa95caa7076b4","createdAt":"2015-06-23T02:00:00.619Z","desc":"6.23","publishedAt":"2016-05-03T12:13:53.904Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bgw1etdsksgctqj20hs0qowgy.jpg","used":true,"who":"张涵宇"},{"_id":"5722b27b67765974fbfcf9b9","createdAt":"2016-04-29T09:01:47.962Z","desc":"4.29","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bgw1f3damign7mj211c0l0dj2.jpg","used":true,"who":"张涵宇"},{"_id":"5721791f67765974fbfcf9a8","createdAt":"2016-04-28T10:44:47.43Z","desc":"4.28","publishedAt":"2016-04-28T13:07:51.7Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f3c7zc3y3rj20rt15odmp.jpg","used":true,"who":"张涵宇"},{"_id":"5720107467765974f885bf9f","createdAt":"2016-04-27T09:05:56.10Z","desc":"4.27","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f3azi5zoysj20dw0kuabb.jpg","used":true,"who":"张涵宇"},{"_id":"571ec86667765974fbfcf97b","createdAt":"2016-04-26T09:46:14.929Z","desc":"4.26","publishedAt":"2016-04-26T11:58:55.460Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f39v1uljz8j20c50hst9q.jpg","used":true,"who":"张涵宇"},{"_id":"571c841e67765974f885bf73","createdAt":"2016-04-24T16:30:22.634Z","desc":"4.25","publishedAt":"2016-04-25T11:24:01.704Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f37vhovzlnj20f00evabt.jpg","used":true,"who":"张涵宇"},{"_id":"5719a5e267765974fbfcf94e","createdAt":"2016-04-22T12:17:38.977Z","desc":"4.22","publishedAt":"2016-04-22T12:18:52.507Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034gw1f35cxyferej20dw0i2789.jpg","used":true,"who":"代码家"},{"_id":"57181bb567765974fca83045","createdAt":"2016-04-21T08:15:49.254Z","desc":"4.21","publishedAt":"2016-04-21T11:41:00.247Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f340c8jrk4j20j60srgpf.jpg","used":true,"who":"张涵宇"},{"_id":"57163a9c67765974f5e27dbd","createdAt":"2016-04-19T22:03:08.319Z","desc":"4.20","publishedAt":"2016-04-20T11:46:37.909Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f32d0cumhkj20ey0mitbx.jpg","used":true,"who":"张涵宇"},{"_id":"5714700267765974f885bf16","createdAt":"2016-04-18T13:26:26.590Z","desc":"4.19","publishedAt":"2016-04-19T12:13:58.869Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f30sgi3jf0j20iz0sg40a.jpg","used":true,"who":"张涵宇"},{"_id":"57136f0e67765974f885bf10","createdAt":"2016-04-17T19:10:06.853Z","desc":"4.18","publishedAt":"2016-04-18T12:05:28.120Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f2zwrqkmwoj20f00lg0v7.jpg","used":true,"who":"张涵宇"},{"_id":"57105d6e67765974fbfcf8f4","createdAt":"2016-04-15T11:18:06.529Z","desc":"4.15","publishedAt":"2016-04-15T13:04:43.738Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f2x7vxkj0uj20d10mi42r.jpg","used":true,"who":"张涵宇"},{"_id":"570eff956776590f57c4e0f9","createdAt":"2016-04-14T10:25:25.991Z","desc":"4.14","publishedAt":"2016-04-14T11:43:31.514Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f2w0qujoecj20f00kzjtt.jpg","used":true,"who":"张涵宇"},{"_id":"570dc90b6776590f5a0ecbb6","createdAt":"2016-04-13T12:20:27.707Z","desc":"4.13","publishedAt":"2016-04-13T13:49:02.190Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f2uyg3nvq7j20gy0p6myx.jpg","used":true,"who":"代码家"},{"_id":"570c5e906776590f62db7b9b","createdAt":"2016-04-12T10:33:52.575Z","desc":"4.12","publishedAt":"2016-04-12T11:47:37.342Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f2tpr3im0mj20f00l6q4o.jpg","used":true,"who":"张涵宇"},{"_id":"570b1c5a6776590f62db7b8e","createdAt":"2016-04-11T11:39:06.138Z","desc":"4.11","publishedAt":"2016-04-11T12:37:49.993Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f2sm0ns82hj20f00l8tb9.jpg","used":true,"who":"张涵宇"},{"_id":"5707051467765950c3190163","createdAt":"2016-04-08T09:10:44.529Z","desc":"4.8","publishedAt":"2016-04-08T12:18:10.29Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f2p0v9vwr5j20b70gswfi.jpg","used":true,"who":"张涵宇"},{"_id":"5705c962677659132abfddcd","createdAt":"2016-04-07T10:43:46.879Z","desc":"4.7","publishedAt":"2016-04-07T11:43:11.427Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f2nxxvgz7xj20hs0qognd.jpg","used":true,"who":"张涵宇"},{"_id":"570480c46776591325d463ff","createdAt":"2016-04-06T11:21:40.621Z","desc":"4.6","publishedAt":"2016-04-06T12:06:32.601Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f2mteyftqqj20jg0siq6g.jpg","used":true,"who":"张涵宇"},{"_id":"570317ed677659634149029a","createdAt":"2016-04-05T09:42:05.911Z","desc":"4.5","publishedAt":"2016-04-05T10:45:46.487Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f2lkx2lhgfj20f00f0dhm.jpg","used":true,"who":"张涵宇"},{"_id":"56fddfcd67765933d8be9193","createdAt":"2016-04-01T10:41:17.615Z","desc":"4.1","publishedAt":"2016-04-01T11:17:05.676Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f2h04lir85j20fa0mx784.jpg","used":true,"who":"张涵宇"},{"_id":"56fc8d3a67765933d9b0a9a9","createdAt":"2016-03-31T10:36:42.628Z","desc":"3.31","publishedAt":"2016-03-31T11:44:55.91Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f2fuecji0lj20f009oab3.jpg","used":true,"who":"张涵宇"},{"_id":"56fb7ca867765933d8be916d","createdAt":"2016-03-30T15:13:44.353Z","desc":"3.29","publishedAt":"2016-03-30T15:17:02.228Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f2ewruruvij20d70miadg.jpg","used":true,"who":"daimajia"},{"_id":"56f8ac1367765933d8be9154","createdAt":"2016-03-28T11:59:15.439Z","desc":"3.28","publishedAt":"2016-03-29T11:56:01.215Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f2cfxa9joaj20f00fzwg2.jpg","used":true,"who":"张涵宇"},{"_id":"56f8a5b0677659164d56442f","createdAt":"2016-03-28T11:32:00.491Z","desc":"3.28","publishedAt":"2016-03-28T11:43:51.83Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034gw1f2cf4ulmpzj20dw0kugn0.jpg","used":true,"who":"daimajia"},{"_id":"56f36e8b67765933d8be9133","createdAt":"2016-03-24T12:35:23.841Z","desc":"3.24","publishedAt":"2016-03-25T11:23:49.570Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f27uhoko12j20ez0miq4p.jpg","used":true,"who":"张涵宇"},{"_id":"56f3697167765933dbbd20d4","createdAt":"2016-03-24T12:13:37.637Z","desc":"3.24","publishedAt":"2016-03-24T12:21:54.835Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f27tuwswd3j20hs0qoq6q.jpg","used":true,"who":"daimajia"},{"_id":"56f2035767765933d8be9121","createdAt":"2016-03-23T10:45:43.811Z","desc":"3.23","publishedAt":"2016-03-23T10:59:23.106Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f26lox908uj20u018waov.jpg","used":true,"who":"张涵宇"},{"_id":"56f0b7d167765933dbbd20ab","createdAt":"2016-03-22T11:11:13.731Z","desc":"3.22","publishedAt":"2016-03-22T11:43:32.863Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f25gtggxqjj20f00b9tb5.jpg","used":true,"who":"张涵宇"},{"_id":"56ef580b67765933d9b0a91c","createdAt":"2016-03-21T10:10:19.492Z","desc":"3.21","publishedAt":"2016-03-21T11:47:48.299Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f249fugof8j20hn0qogo4.jpg","used":true,"who":"张涵宇"},{"_id":"56eb5db867765933d9b0a8fc","createdAt":"2016-03-18T09:45:28.259Z","desc":"3.18","publishedAt":"2016-03-18T12:18:39.928Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f20ruz456sj20go0p0wi3.jpg","used":true,"who":"张涵宇"},{"_id":"56e8d0bb67765933d8be90be","createdAt":"2016-03-16T11:19:23.692Z","desc":"3.16","publishedAt":"2016-03-17T11:14:16.306Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f1yjc38i9oj20hs0qoq6k.jpg","used":true,"who":"张涵宇"},{"_id":"56e8ce3967765933d8be90bd","createdAt":"2016-03-16T11:08:41.957Z","desc":"3.16","publishedAt":"2016-03-16T11:24:01.505Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034gw1f1yj0vc3ntj20e60jc0ua.jpg","used":true,"who":"代码家"},{"_id":"56e764116776592d80511280","createdAt":"2016-03-15T09:23:29.580Z","desc":"3.15","publishedAt":"2016-03-15T11:45:57.350Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f1xad7meu2j20dw0ku0vj.jpg","used":true,"who":"张涵宇"},{"_id":"56e619a46776591744cf05c0","createdAt":"2016-03-14T09:53:40.126Z","desc":"3.14","publishedAt":"2016-03-14T11:55:19.66Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f1w5m7c9knj20go0p0ae4.jpg","used":true,"who":"张涵宇"},{"_id":"56e220ca67765966681b3a23","createdAt":"2016-03-11T09:35:06.879Z","desc":"3.11--一周年快乐！！！","publishedAt":"2016-03-11T12:37:20.4Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f1so7l2u60j20zk1cy7g9.jpg","used":true,"who":"张涵宇"},{"_id":"56e0f0e86776596669cc2511","createdAt":"2016-03-10T11:58:32.298Z","desc":"3.10","publishedAt":"2016-03-10T12:54:31.68Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f1rmqzruylj20hs0qon14.jpg","used":true,"who":"张涵宇"},{"_id":"56df891167765947765e2ad1","createdAt":"2016-03-09T10:23:13.778Z","desc":"3.9","publishedAt":"2016-03-09T12:06:26.401Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f1qed6rs61j20ss0zkgrt.jpg","used":true,"who":"张涵宇"},{"_id":"56de2b1b6776592b6192bf46","createdAt":"2016-03-08T09:30:03.578Z","desc":"3.8","publishedAt":"2016-03-08T12:55:59.161Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f1p77v97xpj20k00zkgpw.jpg","used":true,"who":"张涵宇"},{"_id":"56dd06b56776592b6246e979","createdAt":"2016-03-07T12:42:29.664Z","desc":"3.7","publishedAt":"2016-03-07T12:49:24.470Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f1o75j517xj20u018iqnf.jpg","used":true,"who":"张涵宇"},{"_id":"56d8eb3a67765967efcbd69c","createdAt":"2016-03-04T09:56:10.964Z","desc":"3.4","publishedAt":"2016-03-04T12:44:51.926Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f1klhuc8w5j20d30h9gn8.jpg","used":true,"who":"张涵宇"},{"_id":"56d7b07f6776595ac3e5cf92","createdAt":"2016-03-03T11:33:19.706Z","desc":"3.3","publishedAt":"2016-03-03T12:12:56.684Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f1jionqvz6j20hs0qoq7p.jpg","used":true,"who":"张涵宇"},{"_id":"56d6481e6776592a03e624a4","createdAt":"2016-03-02T09:55:42.63Z","desc":"3.2","publishedAt":"2016-03-02T12:06:37.242Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f1ia8qj5qbj20nd0zkmzp.jpg","used":true,"who":"张涵宇"},{"_id":"56d4f4f9421aa9647be5f908","createdAt":"2016-03-01T09:48:41.472Z","desc":"3.1","publishedAt":"2016-03-01T12:09:30.687Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f1h4f51wbcj20f00lddih.jpg","used":true,"who":"张涵宇"},{"_id":"56d3c506421aa93cbc97e25c","createdAt":"2016-02-29T12:11:50.467Z","desc":"2.29-1","publishedAt":"2016-02-29T12:19:00.15Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f1g2xpx9ehj20ez0mi0vc.jpg","used":true,"who":"张涵宇"},{"_id":"56cfcaba421aa909db4d6ab0","createdAt":"2016-02-26T03:37:44.552Z","desc":"2.26","publishedAt":"2016-02-26T11:58:08.172Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f1cl3c7rfgj20dw0ku76t.jpg","used":true,"who":"张涵宇"},{"_id":"56ce83f8421aa910e89d4379","createdAt":"2016-02-25T02:22:18.992Z","desc":"2.25","publishedAt":"2016-02-25T12:34:54.0Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f1bdal8i3nj20f00lf77g.jpg","used":true,"who":"张涵宇"},{"_id":"56ccf89e421aa92e1da900be","createdAt":"2016-02-24T00:22:24.855Z","desc":"2.24","publishedAt":"2016-02-24T04:42:32.66Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f1a47fpjacj20f00imtam.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d29421aa95caa708336","createdAt":"2016-02-23T02:24:19.518Z","desc":"2.23","publishedAt":"2016-02-23T05:08:46.837Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f19241kkpwj20f00hfabt.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d29421aa95caa70831a","createdAt":"2016-02-22T02:48:39.585Z","desc":"2.22","publishedAt":"2016-02-22T04:20:23.542Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f17x6wmh09j20f00m1mzh.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d29421aa95caa7082f7","createdAt":"2016-02-19T02:15:50.180Z","desc":"2.19","publishedAt":"2016-02-19T03:45:05.172Z","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f14fbwrfptj20zk0npgtu.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d29421aa95caa7082df","createdAt":"2016-02-18T01:35:05.348Z","desc":"2.18","publishedAt":"2016-02-18T04:12:05.777Z","type":"福利","url":"http://ww3.sinaimg.cn/large/7a8aed7bjw1f138l9egrmj20f00mbdij.jpg","used":true,"who":"张涵宇"},{"_id":"56cc6d29421aa95caa7082cd","createdAt":"2016-02-01T13:47:21.517Z","desc":"2.5","publishedAt":"2016-02-17T04:47:21.644Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bgw1f0k67zz05jj20ku0rs0y1.jpg","used":true,"who":"张涵宇"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 575cbb83421aa96b20caface
         * createdAt : 2016-06-12T09:31:47.329Z
         * desc : 直接看图，，不用看描述。
         * publishedAt : 2016-06-12T12:04:04.308Z
         * source : web
         * type : 福利
         * url : http://ww4.sinaimg.cn/mw690/9844520fjw1f4fqribdg1j21911w0kjn.jpg
         * used : true
         * who : 龙龙童鞋
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
