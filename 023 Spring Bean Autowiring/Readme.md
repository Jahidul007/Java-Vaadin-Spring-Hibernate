# Spring Bean Autowire byName, byType, constructor,no and default
# byName : 
Spring container looks for bean name same as property name of the class for autowiring. 
<bean id="logger" class="com.example.maventest.Logger"autowire="byName">
# byType :
Spring container selects the bean by class type for autowiring. 
<bean id="logger" class="com.example.maventest.Logger"autowire="byType">
# constructor :
Spring container uses constructor based autowiring. 
<bean id="logger" class="com.example.maventest.Logger"autowire="constructor">
# no :
No Autowiring. Use ref attribute to resolve dependency. 
<bean id="logger" class="com.example.maventest.Logger"autowire="no">
# default :
The default autowiring is "no". Default autowiring will inherit parent bean autowiring if nested. 
<bean id="logger" class="com.example.maventest.Logger"autowire="default">
