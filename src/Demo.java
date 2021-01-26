public class Demo {
    public int getmax(int a,int b){
        return Math.max(a, b);
    }

    public int getmax(int a,int b,int c){
        if(a>b) {
            if (a > c)
                return a;
        } else {
            if (b > c)
                return b;
        }
        return c;
    }

    public double getmax(double a,double b){
        return Math.max(a, b);
    }

    public double getmax(double a,double b,double c){
        if(a>b) {
            if (a > c)
                return a;
        } else {
            if (b > c)
                return b;
        }
        return c;
    }

    public static void main(String[] args){
        Demo demo = new Demo();
        System.out.printf("6,12的最大值为：%d\n",demo.getmax(6,12));
        System.out.printf("6,12,10的最大值为：%d\n",demo.getmax(6,12,10));
        System.out.printf("19.35,28.99,65.99的最大值为：%.2f\n",demo.getmax(19.35,28.99,65.99));
        System.out.printf("9.58,18.65的最大值为%.2f\n",demo.getmax(9.58,18.65));
    }
}
