# EAGER VS LAZY
The University entity might have some basic properties such as id, name, address, etc. as well as a property called students:
<br/>
**public class University {<br/>
 private String id;<br/>
 private String name;<br/>
 private String address;<br/>
 private List<Student> students;** <br/>

 // setters and getters<br/>
}<br/>
Now when you load a University from the database, JPA loads its id, name, and address fields for you. But you have two options for students: to load it together with the rest of the fields (i.e. eagerly) or to load it on-demand (i.e. lazily) when you call the university's getStudents() method.
<br/>
<br/>
When a university has many students it is not efficient to load all of its students with it when they are not needed. So in suchlike cases, you can declare that you want students to be loaded when they are actually needed. This is called lazy loading.<br/>

# FETCH TYPE 
![fa](https://user-images.githubusercontent.com/26745548/39108234-fa4eeb52-46e8-11e8-9a82-1bb7327c7440.JPG)
# OPTION 1: Using getter method
![gett](https://user-images.githubusercontent.com/26745548/39108244-12047028-46e9-11e8-9d87-b61ba6000072.JPG)
# OPTION 2: Hibernate query with HQL
![hql](https://user-images.githubusercontent.com/26745548/39108248-161b31b0-46e9-11e8-8b39-b415d9e5301f.JPG)
