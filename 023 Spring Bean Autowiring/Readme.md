# Spring Bean Autowire byName, byType, constructor, no and default
# byName : 
Spring container looks for bean name same as property name of the class for autowiring. <br/>
<bean id="logger" class="com.example.maventest.Logger"autowire="byName">
# byType :
Spring container selects the bean by class type for autowiring.<br/> 
<bean id="logger" class="com.example.maventest.Logger"autowire="byType">
# constructor :
Spring container uses constructor based autowiring. <br/>
<bean id="logger" class="com.example.maventest.Logger"autowire="constructor">
# no :
No Autowiring. Use ref attribute to resolve dependency. <br/>
<bean id="logger" class="com.example.maventest.Logger"autowire="no">
# default :
The default autowiring is "no". Default autowiring will inherit parent bean autowiring if nested. <br/>
<bean id="logger" class="com.example.maventest.Logger"autowire="default">
