public class ObjectCount {
    static int count=0;

    public ObjectCount() {
        count+=1;
    }

    public static void main(String[] args) {
        ObjectCount [] obj = new ObjectCount[63];
        for (int i = 0; i < obj.length; i++) {
            obj[i] = new ObjectCount();
        }
        System.out.println("we have created the "+count+" objects");
    }
}