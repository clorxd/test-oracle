# test-oracle
项目使用springboot+mybatis+pageHelper
oracle相关jar包需从oracle官网下载
使用sql文件夹下的建表语句建表
cd test-oracle
打包项目
mvn package
cd target\toDeploy\apps
运行项目
java -jar test-oracle.jar
获取数据
visit http://localhost:10028/test-oracle/oracle