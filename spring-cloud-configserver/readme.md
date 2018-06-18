# Spring Cloud Config Server

### 运行
javaw -jar spring-cloud-configserver-0.0.1-snapshot.jar

spring-cloud-configserver-0.0.1-snapshot.jar -Dserver.port=8888 -D

### 关闭
/actuator/shutdown 关闭

### 刷新配置
/monitor POST 传递path=* 刷新所有配置
/actuator/bus-refresh


### 查看进程

window:
wmic process where name="javaw.exe" get processid


### 加密和解密
密钥证书库文件为 server.jks, 访问的密码在bootstrap.yml设置，在生产环境中这样做并不安全，所以可以命令行的方式传递 \
密码