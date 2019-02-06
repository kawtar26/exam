package mooc;

import java.util.* ;

public class Platform
{

    public Platform()
    {
    }

   
    public void addCourse(Course c) {
        throw new UnsupportedOperationException("Not supported yet.");   
    }

    /**
     * @return les étudiants inscrits à l'université
     */
    public Collection<Person> students() {
        throw new UnsupportedOperationException("Not supported yet.");    
    }

    /**
     * @return les cours dispensés par l'université
     */
    public Collection<Course> courses() {
        throw new UnsupportedOperationException("Not supported yet.");    
    }

    /**
     * Inscrire un étudiant à l'université
     */
    public void registerStudent(Person s) {
        throw new UnsupportedOperationException("Not supported yet.");    
    }

    /**
     * Inscrire un étudiant à un cours
     */
    public void enroll(Person s, Course c) throws PlatformException{
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Désinscrire un étudiant à un cours
     */
    public void withdraw(Person s, Course c) throws PlatformException{
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Donner une note à un étudiant pour un cours
     */
    public void setMark(Person s, Course c, int mark) throws PlatformException{
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Connaitre la note d'un étudiant pour un cours
     */
    public int getMark(Person s, Course c) throws PlatformException{
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c le cours considéré
     * @return les étudiants inscrits à un cours
     */
    public Set<Person> studentsForCourse(Course c) throws PlatformException{
        throw new UnsupportedOperationException("Not supported yet.");
    }

     /**
     * @param s l'étudiant considéré
     * @return les cours auxquels un étudiant est incrit
     */
    public Set<Course> coursesForStudent(Person s) throws PlatformException{
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return les cours auxquels aucun étudiant n'est incrit
     */
    public Set<Course> emptyCourses() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
