# Spring AOP
One of the key components of Spring Framework is the Aspect Oriented Programming (AOP) framework.<br/>
Aspect Oriented Programming entails breaking down program logic into distinct parts called so-called concerns. <br/>
The functions that span multiple points of an application are called cross-cutting concerns. These cross-cutting <br/>
concerns are conceptually separate from the application's business logic. There are various common good examples <br/>
of aspects such as logging, auditing, declarative transactions, security, caching, etc.<br/>

# Before Aspect 
**@Before is an advice type which ensures that an advice runs before the method execution. <br/>
Following is the syntax of @Before advice.<br/><br/>**
@PointCut("execution(* com.tutorialspoint.Student.getName(..))")<br/>
private void selectGetName(){}<br/><br/>
@Before("selectGetName()")<br/>
public void beforeAdvice(){<br/>
   System.out.println("Going to setup student profile.");<br/>
}
