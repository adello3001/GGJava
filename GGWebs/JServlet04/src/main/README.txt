

[JDBC Driver]
http:www.oracle.com/kr/database/technologies/appdev.hdbc-downloads

oracle Database 12.2.0.1 JDBC Driver & UCP Downloads
https://www.oracle.com/database/technologies/jdbc-ucp-122-downloads.html

[컨넥션풀(Connection Pool)]
(DBCP)
http://www.java2s.com/Code/Jar/t/Downloadtomcatdbcp7030jar.htm

(Tomcat:lib)
tomcat-dbcp-7.0.30.jar

(Tomcat:/conf/context.xml)
<Context>
    <Resource
		name="jdbc/oracle"
		auth="Container"
		type="javax.sql.DataSource"
		driverClassName="oracle.jdbc.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe"
		username="SOLUSER"
		password="1234"
		maxActive="50"
		maxWait="-1"
    />
</Context>