package testclasses;
/**
 *
 * public class Array {
 *     public static void main(String[] args) {
 *         int[] arr = new int[20];
 *
 *         arr[0] = 1;
 *         arr[1] = 1;
 *
 *
 *         for (int x = 2; x < arr.length; x++) {
 *             arr[x] = arr[x - 2] + arr[x - 1];
 *         }
 *         System.out.println("第二十个月兔子的对数是：" + arr[19]);
 *
 *     }
 * }
 *
 *
 * 方法：
 *  1、方法名第一个单词小写，后续每个单词的首字母大写
 *
 *
 * 面向对象
 *
 *
 *
 *class Book { //定义图书信息
 *     // 图书名称肯定是多为字符串，所以通过字符串来进行多个字符对策定义
 *     String title;   //图书名称
 *     String author;  //图书作者
 *
 *     //价格一定是一个小数，而Java开发语言里面，double的准确度高于float
 *     double price;    //图书价格
 *     public void getInfo () {    //输出图书信息
 *         System.out.println("图书名称：" + title + "、图书作者：" + author + "、图书价格" + price);
 *     }
 * }
 *
 * public class Array {    //主类
 *     public static void main(String[] args) {
 *         Book book = new Book(); //产生了一个实例化对象
 *
 *         //book.getInfo();     //在没有赋值属性内容之前输出
 *
 *         book.title = "沐言Java";  //为title属性赋值
 *         book.author = "李兴华";    //为author属性赋值
 *         book.price = 89.6;      //为price属性赋值
 *         book.getInfo();         //调用类中的方法
 *     }
 * }
 *
 *
 */
class Book { //定义图书信息
    // 图书名称肯定是多为字符串，所以通过字符串来进行多个字符对策定义
    private String title;   //图书名称
    private String author;  //图书作者
    private double price;    //图书价格[价格一定是一个小数，而Java开发语言里面，double的准确度高于float]

    public void getInfo () {    //输出图书信息
        System.out.println("图书名称：" + title + "、图书作者：" + author + "、图书价格" + price);
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setAuthor(String a) {
        author = a;
    }
    public void setPrice(double p) {
        price = p;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
}

public class Array {    //主类
    public static void main(String[] args) {
        Book book = new Book(); //声明并实例化对象
        book.setTitle("沐言Java"); //为title属性赋值
        book.setAuthor("李兴华"); //为author属性赋值
        book.setPrice(79.6);      //为price属性赋值
        book.getInfo();
    }
}

















































