本项目使用JETTY服务器 

数据库类连接路径：src/main/java/com/hand/Util 下面的 jdbCon.java文件      是我连接MYSQL数据库类的地址，里面可以修改连接数据库时的账号和密码

运行时先
mvn clean
mvn package
mvn jetty:run

注意访问端口是8081
打开浏览器 localhost:8081/index.jsp

求教：
删除功能有问题，因为这里面film表，删除film表里面一条数据，其他所有表以filmid作为外键的表都
要对应的删除，而且其它表的主键又是另外表的外键，表与表之间互相级连，如果要删除的话只能一个表一个表的删除，JDBC好像不支持级联
删除，然后我吧数据库里面所有表的外键属性  删除时  改为CASCADE 就可以删除了
删除film里面的一条数据  其它表中互相关联的数据全部被删除   不知道叶老大有没有什么简便方法可以解决？
