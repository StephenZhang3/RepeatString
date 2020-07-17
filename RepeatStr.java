package homework;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatStr {
    public static void main(String[] args) {
        //输入字符串
        Scanner scanner = new Scanner(System.in);
        System.out.printf("请输入字符串：");
        String str = scanner.nextLine();

        HashSet<Character> set1 = new HashSet<>();    //重复的字符
        HashSet<Character> set2 = new HashSet<>();    //不重复的字符
        HashSet<Character> set3 = new HashSet<>();    //消除重复以后的字符

        char[] ch = str.toCharArray();  //将字符串转换为字符数组
        for (char c : ch) {
            boolean bool = set3.add(c); //将所有字符写进set3

            //如果set3无法写入，即出现相同的字符，则bool值为0，之后将重复的字符写入set1
            if (!bool) {
                set1.add(c);
            }
        }

        //set2即消除重复以后的字符去掉重复的字符
        set2.addAll(set3);
        set2.removeAll(set1);

        //输出三种字符数组
        System.out.println("重复的字符有：" + set1);
        System.out.println("不重复的字符有：" + set2);
        System.out.println("消除重复以后的字符有：" + set3);
    }
}
