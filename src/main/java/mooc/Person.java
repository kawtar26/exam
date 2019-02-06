package mooc;

public class Person
{
    private String myName;
    public Person(String name)
    {
        if (null == name)
            throw new IllegalArgumentException("name is null");
        myName = name;
    }
    
       
    public String getName() { return myName;  }
    
    @Override
    public String toString() { return "Student: " + getName(); }

}
