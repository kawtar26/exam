package mooc;

/**
 * Cette classe décrit l'inscription d'un étudiant à un cours, et la note éventuelle de l'étudiant au cours
 */
class Enrollment {

    private final Person student;
    private final Course course;
    private Integer mark = null;

    Enrollment(Person s, Course c) {
        if (null == s) {
            throw new NullPointerException("Person is null");
        }
        if (null == c) {
            throw new NullPointerException("Course is null");
        }
        student = s;
        course = c;
    }

    public Person getPerson() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    /**
     * Connaitre la note pour cette inscription
     *
     * @throws Exception si la note n'est pas définie
     * @return la note pour cette inscription
     */
    public int getMark() throws Exception {
        if (studentHasMark()) // est-ce qu'il a une note ?
        {
            return mark; // Conversion implicite Integer -> int
        } else {
            throw new Exception("Person has no mark");
        }
    }

    /**
     * D�finir la note pour cette inscription
     *
     * @throws Exception si la note est déjà définie
     */
    public void setMark(int mark) throws Exception {
        if (studentHasMark()) {
            throw new Exception("Person already has mark");
        } else {
            this.mark = mark;
        }
    }

    /**
     * Savoir si la note est déjà définie pour cette inscription
     *
     * @return true si la note est définie, false sinon
     */
    public boolean studentHasMark() {
        return mark != null;
    }
}
