本项目使用JETTY服务器 

数据库类连接路径：src/main/java/com/hand/Util 下面的 jdbCon.java文件      是我连接MYSQL数据库类的地址，里面可以修改连接数据库时的账号和密码

运行时先mvn package
mvn jetty:run

注意访问端口是8081
打开浏览器 localhost:8081/index.jsp

求教：
删除功能有问题，因为这里面film是主表，删除主表里面一条数据，其他所有表的数据都
要对应的删除，表与表之间互相级连，如果要删除的话只能一个表一个表的删除，JDBC好像不支持级联
删除，不知道叶老大有没有什么简便方法可以解决？
