//import java.util.Queue;
void main() throws Exception {
    Scanner input = new Scanner(System.in);

    ArrayList<String> JP = new ArrayList<>();
    ArrayList<String> CN = new ArrayList<>();
    File file = new File("词典.txt");
    if (file.exists()) {
        Scanner dq = new Scanner(file);
        while (dq.hasNextLine()) {
            String line = dq.nextLine();
            String[] parts = line.split("=");
            if (parts.length >= 2) {
                JP.add(parts[0]);
                CN.add(parts[1]);
            }
        }
        dq.close();
    }
    IO.println("!!!词典读取成功!!!");

    while (true) {
        IO.println("-----单词本-----");
        IO.println("1.添加单词");
        IO.println("2.查看单词本");
        IO.println("3.日译中");
        IO.println("4.中译日");
        IO.println("0.退出界面");
        IO.print("请输入选项：");
        int number = input.nextInt();       //获取输入的选择
        input.nextLine();                   //去空格

        if (number == 1) {
            IO.print("请输入日文：");
            String jp = input.nextLine();

            IO.print("请输入中文：");
            String cn = input.nextLine();

            JP.add(jp);
            CN.add(cn);
            IO.println("成功添加");
        } else if (number == 2) {
            if (JP.isEmpty()) {
                IO.println("单词本为空，请先添加");
            } else {
                for (String n : JP) {
                    IO.println(n);
                }
            }
        } else if (number == 3) {
            if (JP.isEmpty()) {
                IO.println("单词本为空");
            } else if (CN.isEmpty()) {
                IO.println("单词本为空");
            } else {
                Random r = new Random();
                int sy = r.nextInt(JP.size());      //定义索引(sy)等于JP的索引的其中之一的值
                String Q = JP.get(sy);              //定义Q为从JP中获取索引sy对应的字典值
                IO.print(Q + "对应中文意思是：");
                String A = input.nextLine();        //答案赋值来自系统输入的值

                if (A.equals(CN.get(sy))) {          //系统输入的值根据索引进行查找判断
                    IO.println("正确");
                } else {
                    IO.println("回答错误");
                    IO.println("正确答案是" + CN.get(sy));     //从CN中获取索引sy对应的字典值
                }
            }
        } else if (number == 4) {
            if (JP.isEmpty()) {
                IO.println("单词本为空");
            } else if (CN.isEmpty()) {
                IO.println("单词本为空");
            } else {
                Random r = new Random();
                int sy = r.nextInt(CN.size());
                String Q = CN.get(sy);
                IO.print(Q + "对应日文意思是：");
                String B = input.nextLine();

                if (B.equals(JP.get(sy))) {          //系统输入的值根据索引进行查找判断
                    IO.println("正确！！！！");
                } else {
                    IO.println("回答错误");
                    IO.println("正确答案是" + JP.get(sy));
                }
            }
        } else if (number == 0) {
            FileWriter fw = new FileWriter("词典.txt");
            for (String l : JP) {
                fw.write(l + "=" + CN.get(number) + "\n");
                number++;
            }
            fw.close();
            IO.print("保存成功，程序退出");
            break;
        } else {
            IO.println("错误输入");
        }
    }
}
