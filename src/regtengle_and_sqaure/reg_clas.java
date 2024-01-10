package regtengle_and_sqaure;

public class reg_clas {
    private double width ;
    private double lenght;

    public reg_clas(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }
    public  double getParameter(){
        return  ((width+lenght)*2);
    }
}
