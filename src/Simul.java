/**
 * Class Simulation
 */
public class Simul {
    /**
     * method that simulate situation
     *
     * @param student   first member of the trip
     * @param professor second member of the trip
     * @param leader    third member of the trip
     * @param scientist fourth member of the trip
     */


    public void simul(Student student, Professor professor, Leader leader, Scientist scientist) {
        //create array of persons
        Person[] mas = new Person[4];
        mas[0] = student;
        mas[1] = professor;
        mas[2] = leader;
        mas[3] = scientist;
        //create time object
        Time time = new Time();
        //start of moving
        long start = System.currentTimeMillis();

        //create corridor
        Corridor corridor = new Corridor(4, 4);
        corridor.setSize(6);
        corridor.setX(); //get x2 (x1=0, x2=x1+size)
        corridor.describe();

        //create armchair (non-static inner class of corridor)
        Corridor.Armchair armchair = corridor.new Armchair("barocco");
        //work with exception
        try {
            armchair.getArmchair();
            System.out.println(armchair.toString());
        } catch (ArmchairException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("People are in the corridor.\n");
        //action with flashlight
        leader.light(corridor);
        //create penguins
        Penguin penguin1 = new Penguin(1, "adult", "male", "green");
        Penguin penguin2 = new Penguin(2, "baby", "male", "white");
        Penguin penguin3 = new Penguin(3, "adult", "male", "blue");
        // output information about penguins
        System.out.println(penguin1.toString());
        System.out.println(penguin2.toString());
        System.out.println(penguin3.toString());

        //meeting people with penguins
        penguin2.meet();

        //create anonymous class
        NotPenguin frog = new NotPenguin() {
            @Override
            public void description() {
                System.out.println("Frog jumped nearby.");
            }
        };
        frog.description();

        //moving in the corridor
        int count = 0;
        for (int j = 0; j < mas.length; j++) {
            while (mas[count].pointX < corridor.x2) {
                mas[count].stepAnother();
            }
            System.out.println("\n");
            count++;
            if (count == mas.length) {
                count = 0;
                break;
            }

        }

        for (int j = 0; j < mas.length; j++) {
            mas[j].stepAnother();
            System.out.printf("%s%s", mas[j].getType(), " is in the cave.\n");
        }
        System.out.println("\n");

        //create first cave
        Cave cave1 = new Cave(6, 6); //create first cave
        cave1.describe();
        cave1.setSize(5);
        cave1.setXcorr(corridor);

        //create barelief as static inner class of cave
        Cave.Barelief barelief1 = new Cave.Barelief("circle", 100);
        System.out.println(barelief1.toString());
        barelief1.pointsBeauty();

        //create tunnel
        Tunnel tunnel = new Tunnel(4, 6);
        //length of tunnel
        tunnel.setSize(16);
        tunnel.setX(cave1);

        //create galleries
        Brilliant brill1 = new Brilliant(4, 4);
        Stone stone = new Stone(5, 5);
        Brilliant brill2 = new Brilliant(4, 4);
        brill1.setXY(12, 14);
        stone.setXY(15, 19);
        brill2.setXY(22, 24);

        //moving in the cave
        for (int j = 0; j < mas.length; j++) {
            while (mas[count].pointX < cave1.x2) {
                mas[count].stepAnother();
            }
            System.out.println("\n");
            count++;
            if (count == mas.length) {
                count = 0;
                break;
            }
        }

        for (int j = 0; j < mas.length; j++) {
            mas[j].stepAnother();
            System.out.printf("%s%s", mas[j].getType(), " is in the tunnel.\n");
        }
        System.out.println("\n");

        //create anonymous class
        NotPenguin butterfly = new NotPenguin() {
            @Override
            public void description() {
                System.out.println("Butterfly flew near the people.");
            }
        };

        butterfly.description();

        //time from entering
        long timePassed1 = time.mainn(start);
        //output the time from entering
        time.running(timePassed1);

        Smell smell = new Smell();
        smell.smellTunnel(timePassed1);
        //create temperature object
        Temperature temperature = new Temperature();


        //people say their phrases
        student.saySth();
        professor.saySth();
        scientist.saySth();
        leader.saySth();
        System.out.println("\n");

        //people go into tunnel
        student.step(tunnel);
        professor.step(tunnel);
        leader.step(tunnel);
        scientist.step(tunnel);
        System.out.println("\n");


        System.out.printf("%s%.3f%s", "Distance of student: ", student.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of professor: ", professor.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of leader: ", leader.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of scientist: ", scientist.getX(), "\n");
        System.out.println("\n");

        //checked coordinates of student and gallery
        student.comeIntoBrilliant(brill1);


        long timePassed2 = time.mainn(start);
        time.running(timePassed2);
        smell.smellTunnel(timePassed2);
        //change speed of the student
        student.influenceOnSpeed();
        System.out.println("\n");
        //change temperature
        temperature.increaseDegree(timePassed2);

        //create penguins
        Penguin penguin4 = new Penguin(4, "adult", "male", "green");
        Penguin penguin5 = new Penguin(5, "baby", "female", "pink");
        Penguin penguin6 = new Penguin(6, "adult", "male", "blue");
        //set penguin's health
        penguin4.setHealth(10);
        penguin5.setHealth(10);
        penguin6.setHealth(10);
        //output information about penguins
        System.out.println(penguin4.toString());
        System.out.println(penguin5.toString());
        System.out.println(penguin6.toString());

        System.out.printf("%s%d%s", "Health of penguin1:", penguin4.getHealth(), "\n");
        System.out.printf("%s%d%s", "Health of penguin2:", penguin5.getHealth(), "\n");
        System.out.printf("%s%d%s", "Health of penguin3:", penguin6.getHealth(), "\n");
        System.out.println("\n");
        //scientist writes information about number of penguins
        scientist.count(penguin6);

        //penguins run into tunnel
        penguin4.step(tunnel);
        penguin5.step(tunnel);
        penguin6.step(tunnel);
        //create stalagmites
        Stalakt stalakt1 = new Stalakt();
        Stalakt stalakt2 = new Stalakt();
        Stalakt stalakt3 = new Stalakt();

        //set random coordinates
        stalakt1.setCoord();
        stalakt2.setCoord();
        stalakt3.setCoord();
        //penguins bump into sth
        penguin4.bump(stalakt1);
        penguin5.bump(stalakt2);
        penguin6.bump(stalakt3);


        //people are moving
        student.step(tunnel);
        professor.step(tunnel);
        leader.step(tunnel);
        scientist.step(tunnel);
        System.out.println("\n");

        System.out.printf("%s%.3f%s", "Distance of student: ", student.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of professor: ", professor.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of leader: ", leader.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of scientist: ", scientist.getX(), "\n");
        System.out.println("\n");

        //checked coordinates of student and galleries
        student.comeIntoBrilliant(brill1);
        student.comeIntoBrilliant(brill2);

        long timePassed3 = time.mainn(start);
        time.running(timePassed3);
        //smell in the tunnel
        smell.smellTunnel(timePassed3);
        //change scientist parameter
        scientist.influenceOnHappy(penguin3);
        System.out.println("\n");
        //change temperature
        temperature.increaseDegree(timePassed3);

        //create coat and show information
        Coat coat = new Coat("fur", "S", "white");
        coat.describe();
        //change points of warm
        coat.warm(temperature, timePassed3);
        System.out.printf("%s%d", "Warm effect of coat: ", coat.getWarmeffect());
        System.out.println("\n");


        //лpeople are moving
        student.step(tunnel);
        professor.step(tunnel);
        leader.step(tunnel);
        scientist.step(tunnel);
        System.out.println("\n");

        System.out.printf("%s%.3f%s", "Distance of student: ", student.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of professor: ", professor.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of leader: ", leader.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of scientist: ", scientist.getX(), "\n");
        System.out.println("\n");


        //create coats on the ground
        CutCoat cutcoat1 = new CutCoat("fur", "L", "brown");
        CutCoat cutcoat2 = new CutCoat("leather", "M", "black");

        cutcoat1.describe();
        cutcoat2.describe();
        //people raise clothes
        cutcoat1.toRaise(scientist);
        cutcoat2.toRaise(professor);

        //checked coordinates of student and gallery
        student.comeIntoBrilliant(brill2);

        long timePassed4 = time.mainn(start);
        time.running(timePassed4);
        //smell in the tunnel
        smell.smellTunnel(timePassed4);

        leader.influenceOnMood(temperature, timePassed4);//изменение характеристики лидера
        System.out.println("\n");
        //change temperature
        temperature.increaseDegree(timePassed4);
        //throw coats because of temperature
        coat.fall(temperature, student, timePassed4);

        //people are moving
        student.step(tunnel);
        professor.step(tunnel);
        leader.step(tunnel);
        scientist.step(tunnel);
        System.out.println("\n");

        System.out.printf("%s%.3f%s", "Distance of student: ", student.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of professor: ", professor.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of leader: ", leader.getX(), "\n");
        System.out.printf("%s%.3f%s", "Distance of scientist: ", scientist.getX(), "\n");
        System.out.println("\n");

        //checked coordinates of student and gallery
        student.comeIntoBrilliant(brill2);
        student.comeIntoStone(stone);

        long timePassed5 = time.mainn(start);
        time.running(timePassed5);
        //smell in the tunnel
        smell.smellTunnel(timePassed5);
        //change professor's parameter
        professor.influenceOnState(tunnel);
        System.out.println("\n");
        //change temperature
        temperature.increaseDegree(timePassed5);

        //create second cave
        Cave cave2 = new Cave(6, 7);
        cave2.describe();
        cave2.setSize(6);
        cave2.setXtunn(tunnel);

        //moving in the cave
        for (int j = 0; j < mas.length; j++) {
            while (mas[count].pointX < tunnel.x2) {
                mas[count].stepAnother();
            }
            System.out.println("\n");
            count++;
            if (count == mas.length) {
                count = 0;
                break;
            }

        }

        for (int j = 0; j < mas.length; j++) {
            mas[j].stepAnother();
            System.out.printf("%s%s", mas[j].getType(), " is in the next cave.\n");
        }
        System.out.println("\n");
        //check smell
        smell.smellAfterTunnel(cave2, student);

        //create barelief and show information
        Cave.Barelief barelief2 = new Cave.Barelief("square", 200);
        System.out.println(barelief2.toString());
        barelief2.pointsBeauty();
        //create side gallery
        Stone stonelast = new Stone(5, 5);
        stonelast.setSize(5);
        stonelast.setXY(cave2.getX2(), 7);

        //moving in the side gallery
        for (int j = 0; j < mas.length; j++) {
            while (mas[count].pointX < cave2.x2) {
                mas[count].stepAnother();
            }
            System.out.println("\n");
            count++;
            if (count == mas.length) {
                count = 0;
                break;
            }

        }

        for (int j = 0; j < mas.length; j++) {
            mas[j].stepAnother();

            if (mas[j].pointX < stonelast.x2) {
                System.out.printf("%s%s", mas[j].getType(), " is in the side gallery.\n");
            } else {
                mas[j].pointX = stonelast.x2;
                System.out.printf("%s%s%s%.3f%s", "Distance of ", mas[j].getType(), ": ", mas[j].getX(), "\n");
                System.out.printf("%s%s", mas[j].getType(), " is in the end of side gallery.\n");
            }

        }
        System.out.println("\n");

        scientist.throwLists();


        //create rezba object
        Stone.Rezba rezba = stonelast.new Rezba("landscape", 300);
        System.out.println(rezba.toString());
        rezba.pointsSkill();

        //create map and show it
        Map map = new Map();
        map.showMap(corridor, cave1, tunnel, cave2, stonelast);


    }


}