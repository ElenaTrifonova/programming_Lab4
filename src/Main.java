/**
 * Main class of the program
 * that creates the text object model
 * variant 91238.9
 *
 * @author Elena
 * @version 1.0
 */

public class Main {

    public static void main(String args[]) {
        //write day of week
        System.out.println("Day of week: " + DayOfWeek.WEDNESDAY.getTitle());
        System.out.println("\n");

        //create person objects
        Student student = new Student("Dima", 18, "male", "Student");
        Leader leader = new Leader("Victor", 35, "male", "Leader");
        Professor professor = new Professor("Sergey Vasilevich", 27, "male", "Professor");
        Scientist scientist = new Scientist("Ivan", 25, "male", "Scientist");

        //set parameters for persons
        student.setSpeed(4);
        leader.setMood(10);
        professor.setEmoState(5);


        //output information about persons
        System.out.println(student.toString());
        System.out.println(professor.toString());
        System.out.println(scientist.toString());
        System.out.println(leader.toString());

        //create object of simulation
        Simul simulation = new Simul();
        simulation.simul(student, professor, leader, scientist); //подаем в метод класса симуляции наши объекты

        System.out.println("It's all.");
    }
}