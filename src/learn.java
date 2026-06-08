//import java.util.Queue;
import java.util.*;
void main() throws Exception {
    Scanner input = new Scanner(System.in);
    HashMap<String, String> words = new HashMap<>();

    File file = new File("src/词典.txt");     //创建file用来读取本地字典
    if (file.exists()) {        //判读是否存在
        Scanner dq = new Scanner(file);
        while (dq.hasNextLine()) {
            String line = dq.nextLine();
            String[] parts = line.split("=");      //创建集合来读取整个文本内容，split(分隔)，表示使用“=”进行分隔了//
            if (parts.length >= 2) {
                words.put(parts[0], parts[1]);
            }
        }
        dq.close();
    }
    IO.println("!!!词典读取成功!!!");

    Random r = new Random();
    do {
        IO.println("-----单词本-----");
        IO.println("1.添加单词");
        IO.println("2.查看单词本");
        IO.println("3.日译中");
        IO.println("4.中译日");
        IO.println("5.删除单词");
        IO.println("6.修改单词");
        IO.println("0.退出界面");

        int number;
        while (true) {
            IO.print("请输入选项：");
            String line = input.nextLine(); //获取输入的选择
            try {
                number = Integer.parseInt(line);
                break;
            } catch (NumberFormatException exception) {
                IO.println("输入有错，请输入正确的选择!!!");
            }
        }

        if (number == 1) {
            IO.print("请输入日文：");
            String jp = input.nextLine();
            IO.print("请输入中文：");
            String cn = input.nextLine();
            words.put(jp, cn);
            IO.println("成功添加");

        } else if (number == 2) {
            if (words.isEmpty()) {
                IO.println("单词本为空，请先添加");
            } else {
                for (String key : words.keySet()) {
                    IO.println(key + "=" + words.get(key));
                }
            }

        } else if (number == 3) {
            if (words.isEmpty()) {
                IO.println("单词本为空");
            } else {
                ArrayList<String> keys = new ArrayList<>(words.keySet());   //创建一个表存储keys;
                int key = r.nextInt(keys.size());      //定义key等于词典的大小中的随机值
                String jp = keys.get(key);              //定义Q为从词典中获取key对应的字典值
                IO.print(jp + "对应中文意思是？:");
                String A = input.nextLine();            //答案赋值来自系统输入的值
                if (A.equals(words.get(jp))) {          //系统输入的值根据索引进行查找判断
                    IO.println("正确");
                } else {
                    IO.println("回答错误");
                    IO.println("正确答案是" + words.get(jp));     //从CN中获取索引sy对应的字典值
                }
            }
        } else if (number == 4) {
            if (words.isEmpty()) {
                IO.println("单词本为空");
            } else {
                ArrayList<String> keys = new ArrayList<>(words.keySet());   //创建一个表存储keys;
                int key = r.nextInt(keys.size());
                String jp = keys.get(key);
                String cn = words.get(jp);
                IO.print(cn + "对应日文意思是：");
                String answer = input.nextLine();
                if (answer.equals(jp)) {          //系统输入的值根据索引进行查找判断
                    IO.println("正确！！！！");
                } else {
                    IO.println("回答错误");
                    IO.println("正确答案是" + jp);
                }
            }
        } else if (number == 5) {
            IO.print("请输入需要删除单词：");
            String jp = input.nextLine();
            if (words.containsKey(jp)) {
                words.remove(jp);
                IO.println("已经成功删除");
            } else {
                IO.println("删除失败，请确认是否输入正确");
            }

        } else if (number == 6) {
            IO.print("请输入需要修改的日文单词：");
            String jp = input.nextLine();
            IO.println("目前的中文意思是：" + words.get(jp));
            IO.print("请输入你要修改的中文意思：");
            String cn = input.nextLine();
            if (words.containsKey(jp)) {
                IO.print("请输入yes进行修改：");
                String qr = input.nextLine();
                if (qr.equals("yes")) {
                    words.put(jp, cn);
                    IO.println("修改成功");
                } else {
                    IO.println("三思而后行");
                }
            } else {
                IO.println("修改失败，请确认是否输入有误");
            }
        } else if (number == 0) {
            FileWriter fw = new FileWriter("src/词典.txt");       //创建变量并写入词典中
            for (String l : words.keySet()) {
                fw.write(l + "=" + words.get(l) + "\n");
            }
            fw.close();
            IO.print("保存成功，程序退出");
            break;
        } else {
            IO.println("错误输入");
        }
    } while (true);
}