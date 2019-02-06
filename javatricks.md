https://www.geeksforgeeks.org/java-tricks-competitive-programming-java-8/

Sort array list with custom comparator
Collections.sort(studList, new Comparator<Student>(){
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
    }
});