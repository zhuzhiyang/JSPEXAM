本项目使用JETTY服务器 

数据库类连接路径：src/main/java/com.hand.Util 下面的 jdbCon.java文件      是我连接MYSQL数据库类的地址，里面可以修改连接数据库时的账号和密码

运行时先mvn package
然后运行 jetty:run

注意访问端口是8081
打开浏览器 localhost:8081/index.jsp


