# 基础班第6天

## 今日课程内容

- debug 断点调试
- 基础练习
  - 减肥计划 if 版
  - 减肥计划 switch 版
  - 逢七跳过
  - 不死神兔
  - 百钱百鸡
  - 数组元素求和
  - 判断两个数组是否相同
  - 查找元素在数组中的索引位置
  - 数组元素反转
  - 评委打分



## 1、debug

#### 什么是 debug

debug 是供程序员使用的调试工具，它可以用于追踪程序的执行流程，从而调试程序。



程序在 debug 模式下运行时，我们可以观察到程序执行每一个步骤，以及程序运行过程中变量中数据的变化。



## 2、基础练习

#### 减肥计划 if 版

> ⏱ 10 分钟
>
> 接收用户键盘输入的星期数，判断并输出对应的减肥活动
>
> 减肥活动
>
> - 星期一：跑步
>
> - 星期二：游泳
> - 星期三：慢走
> - 星期四：动感单车
> - 星期五：拳击
> - 星期六：爬山
> - 星期日：好好吃一顿



代码实现

```java
public class Demo01 {

    /**
     * 减肥计划 if 版
     */
    public static void main(String[] args) {
        //创建 Scanner 对象
        Scanner sc = new Scanner(System.in);

        //提示用户输入
        System.out.println("请输入一个星期数");

        //接收数据
        int week = sc.nextInt();

        //使用 if 语句判断，并输出对应的减肥活动
        if (week == 1) {
            System.out.println("跑步");
        } else if (week == 2) {
            System.out.println("游泳");
        } else if (week == 3) {
            System.out.println("慢走");
        } else if (week == 4) {
            System.out.println("动感单车");
        } else if (week == 5) {
            System.out.println("拳击");
        } else if (week == 6) {
            System.out.println("爬山");
        } else if (week == 7) {
            System.out.println("好好吃一顿");
        } else {
            System.out.println("您输入的星期数有误");
        }
    }
}
```



#### 减肥计划 switch 版

> ⏱ 10 分钟
>
> 接收用户键盘输入的星期数，判断并输出对应的减肥活动
>
> 减肥活动
>
> - 星期一：跑步
>
> - 星期二：游泳
> - 星期三：慢走
> - 星期四：动感单车
> - 星期五：拳击
> - 星期六：爬山
> - 星期日：好好吃一顿



代码实现

```java
public class Demo02 {

    /**
     * 减肥计划 switch 版
     */
    public static void main(String[] args) {
        //创建 Scanner 对象
        Scanner sc = new Scanner(System.in);

        //提示用户输入
        System.out.println("请输入一个星期数");

        //接收数据
        int week = sc.nextInt();

        //使用 switch 语句判断，并输出对应的减肥活动
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("您输入的星期数有误");
        }
    }
}
```



#### 逢七跳过

> ⏱ 10 分钟
>
> 朋友聚会时可能会玩的一个游戏，逢七过。
>
> 游戏规则：从数字 1 开始报数，当你报到包含 7 或者 7 的倍数时，要说“过”。



代码实现

```java
public class Demo03 {

    /**
     * 逢七跳过
     *
     * 游戏规则：从数字 1 开始报数，当你报到包含 7 或者 7 的倍数时，要说“过”。
     *
     * 我们以数字 1 ~ 100 为例，模式逢七跳过的游戏过程。
     */
    public static void main(String[] args) {

        //循环 1 ~ 100 中所有的数字
        for (int i = 0; i < 100; i++) {
            /*
               判断当前数字是否包含7，或者是7的倍数
               
               i % 10 == 7       ：  个位包含7
               i / 10 % 10 == 7  ：  十位包含7
               i % 7 == 0        ：  7的倍数
             */
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                continue; //跳过
            }

            System.out.println(i); //报数
        }
    }
}
```



#### 不死神兔

> ⏱ 10 分钟
>
> 有一对兔子，从出生后第3个月起，每个月都生一对兔子。生下的小兔子也是从第3个月起，每个月都生一对兔子。
>
> 假如兔子不生病，也不会死，问：第24个月时，兔子的对数为多少？



代码实现

```java
public class Demo04 {

    /**
     * 不死神兔
     */
    public static void main(String[] args) {
        //定义数组，长度为24，用于存储每个月兔子的数量
        int[] arr = new int[24];

        //第一个月和第二个月兔子数量是已知的
        arr[0] = 1;
        arr[1] = 1;

        //循环计算每个月兔子的数量
        for (int i = 2; i < arr.length; i++) {
            //当前月兔子的数量 = 前两个月兔子数量之和
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        //打印第24个月兔子的数量
        System.out.println(arr[23]);
    }
}
```



#### 百钱百鸡

> ⏱ 10 分钟
>
> 我国古代数学家张丘建在《算经》一书中提出的数学问题：
>
> 鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一. 百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？



代码实现

```java
public class Demo05 {

    /**
     * 百钱百鸡
     */
    public static void main(String[] args) {

        //外层循环控制公鸡的数量
        for (int x = 0; x < 20; x++) {
            //内层循环控制母鸡的数量
            for (int y = 0; y < 33; y++) {
                //计算小鸡的数量
                int z = 100 - x - y;

                //判断是否满足百钱百鸡
                if (z % 3 == 0 && x * 5 + y * 3 + z / 3 == 100) {
                    System.out.println(x + ", " + y + ", " + z);
                }
            }
        }

    }
}
```



#### 数组元素求和

> ⏱ 10 分钟
>
> 有这样一个数组：{68, 27, 95, 88, 171, 996, 51, 210}
>
> 求出数组中满足条件的元素之和
>
> 条件：个位和十位不能是7，并且是偶数



代码实现

```java
public class Demo06 {

    /**
     * 数组元素求和
     */
    public static void main(String[] args) {
        //创建数组
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};

        //定义变量，存储满足条件元素的累加和
        int sum = 0;

        //遍历数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //判断当前遍历到的元素是否符合条件
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        //打印结果
        System.out.println("sum: " + sum);
    }
}
```



#### 判断两个数组是否相同

> ⏱ 10 分钟
>
> 定义一个方法，判断两个数组中的内容是否相同



代码实现

```java
public class Demo07 {

    /**
     * 判断两个数组的内容是否相同
     */
    public static void main(String[] args) {
        //定义两个数组
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};

        //调用方法
        boolean result = compare(arr1, arr2);

        //打印结果
        System.out.println(result);
    }

    public static boolean compare(int[] arr1, int[] arr2) {
        //判断数组长度是否相同
        if (arr1.length != arr2.length) {
            return false;
        }

        //遍历数组，判断两个数组中的元素是否相同
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
```



#### 查找元素在数组中的索引位置

> ⏱ 10 分钟
>
> 键盘录入一个数字，定义方法，查找该数字在数组中的索引位置
>
> 如果在数组中没有找到这个数字，返回 -1



代码实现

```java
public class Demo08 {

    /**
     * 查找元素在数组中的索引位置
     */
    public static void main(String[] args) {
        //创建数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        //创建 Scanner 对象
        Scanner sc = new Scanner(System.in);

        //提示用户输入
        System.out.println("请输入一个数字");

        //接收数据
        int num = sc.nextInt();

        //调用方法
        int index = findIndex(arr, num);

        //打印结果
        System.out.println(index);
    }

    public static int findIndex(int[] arr, int num) {
        //遍历数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //判断当前元素是否和num相等
            if (arr[i] == num) {
                return i;
            }
        }

        //如果没有在数组中找到num，返回-1
        return -1;
    }
}
```



#### 数组元素反转

> ⏱ 10 分钟
>
> 定义一个方法，该方法可以将一个数组中的元素进行反转，例如
>
> {11, 22, 33, 44, 55}
>
> 反转后
>
> {55, 44, 33, 22, 11}



代码实现

```java
public class Demo09 {

    /**
     * 数组元素反转
     */
    public static void main(String[] args) {
        //创建数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        //调用方法
        reverse(arr);

        //打印数组中的元素
        printArray(arr);
    }

    public static void reverse(int[] arr) {
        //定义两个指针，分别执行数组的两端
        //交换两个指针处的元素
        //指针逐渐靠拢，直到碰撞为止
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static void printArray(int[] arr) {
        //先打印左中括号
        System.out.print("["); //不用换行

        //使用for循环遍历数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //打印当前遍历到的元素
            System.out.print(arr[i]); //不用换行

            //判断当前遍历到的元素是否为最后一个元素
            if (i != arr.length - 1) {
                //如果还不是最后一个元素，再打印一个逗号
                System.out.print(", ");//不用换行
            }
        }

        //最后打印右中括号
        System.out.println("]");
    }
}
```



#### 评委打分

> ⏱ 10 分钟
>
> 在一场编程竞赛中，六位评委将为参赛选手打分（百分制）
>
> 选手的最终得分：去掉最高分，去掉最低分，取剩余剩余评分的平均值



代码实现

```java
public class Demo10 {

    public static void main(String[] args) {
        //创建数组，用于存储六位评委的打分
        int[] arr = new int[6];

        //创建 Scanner 对象
        Scanner sc = new Scanner(System.in);

        //循环接收评委的打分
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分");
            arr[i] = sc.nextInt();
        }

        //获得最高分
        int max = getMax(arr);

        //获得最低分
        int min = getMin(arr);

        //获得总分
        int sum = getSum(arr);

        //最终得分 = （总分 - 最高分 - 最低分） / 4
        int score = (sum - max - min) / (arr.length - 2);

        //打印结果
        System.out.println(score);
    }

    public static int getMax(int[] arr) {
        //定义变量，用于记录遍历过程中找到的最高分
        int max = arr[0];

        //遍历数组中每一个元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int getMin(int[] arr) {
        //定义变量，用于记录遍历过程中找到的最低分
        int min = arr[0];

        //遍历数组中每一个元素
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static int getSum(int[] arr) {
        //定义变量，用于记录累加和
        int sum = 0;

        //遍历数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
```



## 今日学习目标

- 能够使用断点调试查看循环求和流程
- 能够完成减肥计划案例
- 能够完成逢七必过案例
- 能够完成不死神兔案例
- 能够完成百钱百鸡案例
- 能够完成数组中的元素查找
- 能够完成数组中的元素反转
- 能够完成评委打分案例