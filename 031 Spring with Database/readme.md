# jdbc.properties
 jdbc.user = root<br/>
 jdbc.password = 202205<br/>
 jdbc.driver= com.mysql.jdbc.Driver<br/>
 jdbc.url=jdbc:mysql://localhost:3306/Database_name<br/>
 
# bean.xml
 <bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource"><br/>
		<property name="driverClassName" value="${jdbc.driver}"></property><br/>
		<property name="url" value="${jdbc.url}"></property><br/>
		<property name="username" value="${jdbc.user}"></property><br/>
		<property name="password" value="${jdbc.password}"></property><br/>
 </bean>
  
# pom.xml (dependencies)
-> MySql-connector-java
-> Commons-dbpc
-> Sprming-jdbc

