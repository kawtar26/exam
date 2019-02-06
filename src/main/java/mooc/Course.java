package mooc;

public class Course
{
    private String myLabel;
    private int myVolume;
    
    public Course(String name, int hours)
    {
        if (null == name)
            throw new IllegalArgumentException("name is null");
        if (hours <= 0)
            throw new IllegalArgumentException("hours is negative");
        myLabel = name;
        myVolume = hours;
    }
    
    public String getLabel() { return myLabel;  }
    
    public int getVolume() { return myVolume; }
    
    @Override
    public String toString() { return "Course: " + getLabel(); }

}
