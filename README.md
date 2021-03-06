# dubbo learn

访问 http://127.0.0.1:8090/test/ceshi 测试云服务化是否成功是否成功，访问 http://127.0.0.1:8080/test/getConfig?name=greet 测试无服务时mybatis是否成功

## 结构
service服务提供者部分，facade服务消费者部分 

```
\ --  dubbo-learn-parent
    + -- dubbo-learn-api   
    + -- dubbo-learn-facade
    + -- dubbo-learn-service
```

## 先决条件
### zookeeper安装与启动 
1. 下载安装文件[zookeeper-3.4.13](https://github.com/Uetty/dubbo-learn-parent/tree/attach/zookeeper)
2. 进入conf文件夹，复制zoo_sample.cfg粘贴在本目录下，命名位zoo.cfg
3. 打开zoo.cfg设置几个变量(这里以windows系统为例，linux系统路径不一样；ip地址为该zookeeper实例所在ip，端口可以随意，一个为zookeeper集群内通讯端口，一个为选举端口) 
```
dataDir=D:\\zookeeper-3.4.13\\data  
dataLogDir=D:\\zookeeper-3.4.13\\log 
server.1=127.0.0.1:2888:3888
``` 
4. zookeeper-3.4.13目录下新建log文件夹，data文件夹，data文件夹下新建myid文件，myid文件中输入1（表明当前实例对应前面server.1） 
5. 启动，进入bin目录，windows运行zkServer.cmd，linux运行zkServer.sh 
