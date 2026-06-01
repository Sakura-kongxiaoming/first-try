import java.lang.reflect.Array;
import java.util.*;
//public class t2 {
//    static void main() {
//
//        ArrayList<String > man =new ArrayList<String>();
//        for ( int i=0;i<=10;i++){
//            man.add(String.valueOf(i));
//        }  ///循环添加
//        System.out.println(man);
//    }
//}
//import java.util.ArrayList;
//import java.util.Collections;  // 导入 Collections 类

//public class t2 {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//       Collections.sort(myNumbers);        ///利用sort进行排序
//        for (int i :myNumbers){
//            System.out.println(i);
//        }
//    }
//}

//public class t2 {
//    static void main() {
//        ArrayList<String> f =new ArrayList<>();
//        f.add("巧乐兹");
//        f.add("雪碧");
//        f.set(0,"张雪峰");
//        System.out.println(f.get(1));   ///根据索引获取相应的值
//        Collections.sort(f,Collections.reverseOrder());     //reverseOrder——指定倒序排列
//        for (String n:f){
//            System.out.println(n);
//        }
//    }
//}
//
//public class t2 {
//    public static void main(String[] args) {
//        String originalStr = "Hello";
//        String reversedStr = "";
//        System.out.println("原始字符串: " + originalStr);
//
//        for (int i = 0; i < originalStr.length(); i++) {
//            reversedStr = originalStr.charAt(i) + reversedStr;
//        }
//
//        System.out.println("反转后字符串: "+ reversedStr);
//    }
//}

//public  class t2 {
//    static void main() {
//        int ages[]={20,21,13,24,12,56,78};
//        int low = ages[0];
//        for (int age:ages){
//            if (low >age ){
//                low=age;
//            }
//        }
//        System.out.println("最小年龄是"+low);
//    }
//}

//public class t2 {
//    static void main() {
//        ArrayList<String> kobe = new ArrayList<>();
//        Collections.addAll(kobe,"man","what","can","i","say");
//        System.out.println(kobe.contains("24"));
//    }
//}

//public class t2 {
//    static void main() {
//        HashSet<String> man = new HashSet<>();
//        Collections.addAll(man,"科比","梅西","张雪峰","科比");       //注意使用Hashset方法时不会存在重复值///
//        if (man.contains("科比")){        //  contains=="查询"，
//            System.out.println("孩子们我打赢复活赛了");
//        }else {
//            System.out.println("不好，孩子们我没肘赢对面");
//        }
//        Iterator<String> aa = man.iterator();
//        //System.out.println(it.hasNext());   //判断后续是否还有值
//        while (aa.hasNext()){
//            System.out.println(aa.next());
//        }
//    }
//}

import java.util.Iterator;
public class t2 {
    static void main() {
        ArrayList<Integer> number = new ArrayList<>();
        Collections.addAll(number,1,2,3,4,5,6);
        //System.out.println(number);
        Iterator<Integer> test = number.iterator();
        while (test.hasNext()){
            Integer m= test.next();     //创建临时变量赋值
            if (m<=2){
                test.remove();
            }
        }
        System.out.println(number);
    }
}
