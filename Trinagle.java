public class Trinagle {
    private int first_slide;
    private int second_slide;
    private int third_slide;

    public Trinagle(int first_slide, int second_slide, int third_slide) {
        this.first_slide = first_slide;
        this.second_slide = second_slide;
        this.third_slide = third_slide;
    }
    public void calculate_area(){
        int a = this.first_slide;
        int b = this.second_slide;
        int c = this.third_slide;
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
            int s=(a+b+c)/2;
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.printf("Area of Triangle is: %,.3f", area);
        }
        else
            System.out.println("Area of Triangle not exit");
        System.out.println();
    }
    public void calculate_Perimeter(){
        float a = this.first_slide;
        float b = this.second_slide;
        float c = this.third_slide;
        double perimeter = (a+b+c);
        System.out.printf("Perimeter of Triangle %,.2f",perimeter);
    }

    public static void main(String[] args) {
        Trinagle trinagle = new Trinagle(5,4,3);
        trinagle.calculate_area();
        trinagle.calculate_Perimeter();
    }
}