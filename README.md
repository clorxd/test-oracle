# test-oracle<br>  
项目使用springboot+mybatis+pageHelper <br>  
oracle相关jar包需从oracle官网下载<br>
使用sql文件夹下的建表语句建表<br>

项目编译：<br>
cd test-oracle<br>
mvn package<br>
运行项目<br>
cd target\toDeploy\apps<br>
java -jar test-oracle.jar<br>
获取数据<br>
visit http://localhost:10028/test-oracle/oracle
