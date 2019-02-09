# dubbo learn 多播注册中心版
仅适合少量主机的测试/开发环境
<p>利用底层网络广播，无需像zookeeper版一样额外安装支持软件
<p>multicast默认为单播模式，url增加unicast=false参数设置为多播(组播)模式
<p>访问 http://127.0.0.1:8090/test/ceshi 测试云服务化是否成功是否成功，访问 http://127.0.0.1:8080/test/getConfig?name=greet 测试无服务时mybatis是否成功

## 结构
service服务提供者部分，facade服务消费者部分 

```
\ --  dubbo-learn-parent
    + -- dubbo-learn-api   
    + -- dubbo-learn-facade
    + -- dubbo-learn-service
```


