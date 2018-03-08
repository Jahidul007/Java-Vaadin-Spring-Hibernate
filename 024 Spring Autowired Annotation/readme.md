# Spring @Autowired Annotation
The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.
# @Autowired on Setter Methods
@Autowired<br/>
	public void setFileWriter(FileWriter fileWriter) {<br/> 
		this.fileWriter = fileWriter;<br/> 
	}
# @Autowired on Properties
@Autowired<br/> 
private ConsoleWriter consoleWriter;
# @Autowired on Constructors
@Autowired <br/> 
public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter)<br/> 
{<br/> 
this.consoleWriter = consoleWriter; <br/> 
this.fileWriter = fileWriter; <br/> 
}
