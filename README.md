# 小记
该工程为记录笔者spring cloud为服务学习进程，包括服务注册与发现组件eureka、服务调用组件：ribbon、feeign等。
其中版本记录如下：
```
jdk: "1.8.0_161"
spring-boot：1.5.10
spring-cloud:Edgware.SR3
```
# 各工程介绍  
|name|description|port|
|:---:|:---:|:---:|
|melody-spring-boot-parent|父工程，用于依赖管理，版本控制|无服务发布|
|melody-spring-boot-common|common工程，主要维护公共方法|无服务发布|
|melody-eureka-server|微服务eureka注册中心|8081|