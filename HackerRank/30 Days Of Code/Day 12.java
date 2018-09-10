class Student extends Person {
    private int[] testScores;

    /*
     * Class Constructor
     * 
     * @param firstName - A string denoting the Person's first name.
     * 
     * @param lastName - A string denoting the Person's last name.
     * 
     * @param id - An integer denoting the Person's ID number.
     * 
     * @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstname, String lastname, int id, int[] scores) {
        super(firstname, lastname, id);
        this.testScores = scores;
    }

    /*
     * Method Name: calculate
     * 
     * @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int average = 0;
        for (int i = 0; i < testScores.length; i++) {
            average += testScores[i];
        }
        int faverage = average / testScores.length;
        if (faverage >= 90 && faverage <= 100) {
            return 'O';
        } else if (faverage >= 80 && faverage < 90) {
            return 'E';

        } else if (faverage >= 70 && faverage < 80) {
            return 'A';
        } else if (faverage >= 55 && faverage < 70) {
            return 'P';
        } else if (faverage >= 40 && faverage < 55) {
            return 'D';

        } else {
            return 'T';
        }
    }

}