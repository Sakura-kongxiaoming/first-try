import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class learn {
    static void main() {
        Scanner input= new Scanner(System.in);

        ArrayList<String> JP = new ArrayList<>();
        ArrayList<String> CN = new ArrayList<>();

        while (true){
            System.out.println("-----单词本-----");
            System.out.println("1.添加单词");
            System.out.println("2.查看单词本");
            System.out.println("3.日译中");
            System.out.println("4.中译日");
            System.out.println("0.退出界面");
            System.out.print("请输入选项：");
            int number = input.nextInt();       //获取输入的选择
            input.nextLine();                   //去空格

            if (number == 1){
                System.out.print("请输入日文：");
                String jp = input.nextLine();

                System.out.print("请输入中文：");
                String cn = input.nextLine();

                JP.add(jp);
                CN.add(cn);
                System.out.println("成功添加");
            } else if (number==2) {
               if (JP.isEmpty()){
                   System.out.println("单词本为空，请先添加");
               }else {
                   for (String n:JP){
                       System.out.println(n);
                   }
               }
            } else if (number==3) {
                if (JP.isEmpty()){
                    System.out.println("单词本为空");
                } else if (CN.isEmpty()) {
                    System.out.println("单词本为空");
                }else {
                    Random r = new Random();
                    int sy = r.nextInt(JP.size());      //定义索引(sy)等于JP的索引的其中之一的值
                    String Q = JP.get(sy);              //定义Q为从JP中获取索引sy对应的字典值
                    System.out.print(Q+"对应中文意思是：");
                    String A = input.nextLine();        //答案赋值来自系统输入的值

                    if (A.equals(CN.get(sy))){          //系统输入的值根据索引进行查找判断
                        System.out.println("正确");
                    }else {
                        System.out.println("回答错误");
                        System.out.println("正确答案是"+CN.get(sy));     //从CN中获取索引sy对应的字典值
                    }
                }
            }else if (number==4){
                if (JP.isEmpty()){
                    System.out.println("单词本为空");
                } else if (CN.isEmpty()) {
                    System.out.println("单词本为空");
                }else {
                    Random r = new Random();
                    int sy = r.nextInt(CN.size());
                    String Q = CN.get(sy);
                    System.out.print(Q+"对应日文意思是：");
                    String B = input.nextLine();

                    if (B.equals(JP.get(sy))){          //系统输入的值根据索引进行查找判断
                        System.out.println("正确！！！！");
                    }else {
                        System.out.println("回答错误");
                        System.out.println("正确答案是"+JP.get(sy));
                    }
                }
            }else if (number == 0) {
                System.out.println("程序结束");
                break;
            }else {
                System.out.println("错误输入");
            }
        }
    }
}
