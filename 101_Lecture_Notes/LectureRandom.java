/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        double x = Math.random() * 5;
        System.out.println(x);
        double y = Math.random() * 20 + 15;
        System.out.println(y);
        double z = Math.random() * (2523-1472) + 1472;
        System.out.println(z);
        int a = (int)(Math.random() * (513+342) -342);
        System.out.print(a);
        int low = (int)(Math.random() * 40 + 30);
        int high = (int)(Math.random() * 80 + 90);
        System.out.print((int)(Math.random() * (high-low) + low));
	}
}
