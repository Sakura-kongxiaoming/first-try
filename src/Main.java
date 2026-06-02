//public class Main {
//    static void main() {
//        for( int i=1;i<10;i++){
//            if (i<=6){
//                continue;  //如果i<=6就跳过
//                //break;   //如果i大于等于6了就结束循环
//            }
//            System.out.println(i);
//        }
//    }
//}

//import java.util.Random; //导入随机函数
//public class Main {
//    static void main() {
//           int  a =4;
//        if(a>1){
//            System.out.println("第一种情况");
//        } else if ( a==3) {
//            System.out.println("第二种情况");
//        }else {
//            System.out.println("第三种情况");
//        }
//    }
//}
//


//public class Main extends animal{ {
//    //super.indformation();  ///直接调用父类方法///
//    //animal animal= new animal();
//    //animal.indformation();
//    }
//}


//public class Main extends input{
//    static void main() {
//        input input = new input();
//        input.shuru();
//}
//}
import java.util.ArrayList;
import  java.util.Collection;
import  java.util.Iterator;
public class Main  {
    static void main(String[] args) {
        ArrayList<String> man = new ArrayList<>();
        man.add("what");
        man.add("can");
        man.add("i");
        man.add("say");
//        man.add(0,"man");   ///根据索引进行增删查减
//        man.remove(3);
//        System.out.println(man.size());
        for ( String i:man){
            System.out.println(i);
        }


    }
}
