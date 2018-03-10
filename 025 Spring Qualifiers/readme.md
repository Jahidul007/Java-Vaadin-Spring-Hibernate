# Qualifier Annotation
We can use the @Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired. Following is an example to show the use of @Qualifier annotation.<br/>
@Autowired<br/>
@Qualifier("Filewriter")<br/>
public void setFileWriter(LogWriter fileWriter) {<br/>
 this.fileWriter = fileWriter;<br/>
}
