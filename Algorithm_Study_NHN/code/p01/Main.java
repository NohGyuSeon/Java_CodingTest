package JavaStudy.code.p01;

import java.util.Scanner;

@SuppressWarnings("checkstyle:Indentation")
public class Main {
    public static int size = 0;
    public static int[] array;

    public void func() {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder();

            int N = sc.nextInt();
            array = new int[N];

            for (int i = 0; i < N; i++) {
                String str = sc.next();
                switch (str) {
                    case "push":
                        push(sc.nextInt());
                        break;
                    case "pop":
                        sb.append(pop()).append('\n');
                        break;
                    case "top":
                        sb.append(top()).append('\n');
                        break;
                    case "size":
                        sb.append(size()).append('\n');
                        break;
                    case "empty":
                        sb.append(isEmpty()).append('\n');
                        break;
                }
            }
            System.out.println(sb.toString().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void push(int i) {
        array[size] = i;
        size++;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        } else {
            int popValue = array[size-1];
            array[size-1] = 0;
            size--;
            return popValue;
        }
    }

    public int size() {
        return size;
    }

    public int isEmpty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top() {
        if (size == 0) {
            return -1;
        } else {
            return array[size-1];
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.func();
    }
}
