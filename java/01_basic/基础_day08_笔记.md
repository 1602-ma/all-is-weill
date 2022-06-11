# 基础班第8天

## 今日课程内容

- API 帮助文档
- String 类
- StringBuilder 类



## 1、API 概述

#### 什么是 API

API（Application Programming Interface，简称 API）：应用程序编程接口



我们学习 API，就是在学习如何使用 Java 已经写好的类（JRE 核心类库中有大量已经写好的类）。



#### API 帮助文档

使用步骤

- 打开帮助文档
- 切换到索引选项卡
- 在输入框中输入我们想要搜索的类
- 查看类在什么包下面    （是否需要导包）
- 查看类的描述    （类是做什么的）
- 查看类的构造方法    （如何创建对象）
- 查看类的成员方法    （如何调用方法）



## 2、String 类

#### String 类的概述

String 类代表字符串，在 Java 程序中，使用双引号括起来的多个字符，都是字符串类的一个实例。



#### String 类的特点

- 字符串的不可变性

  > 字符串对象一旦创建，对象中的值是不能够被更改的。
  >
  > ```java
  > public static void main(String[] args) {
  >     	//创建一个字符串对象
  >     	String s = "aaa";
  >     
  > 	s = "bbb"; //这里不是在修改对象中的值，而是让变量 s 重新指向了一新的字符串对象
  > 
  > 	System.out.println(s);
  > }
  > ```

  

- 字符串的内存共享

  > 字符串对象是可以被共享的
  >
  > ```java
  > public static void main(String[] args) {
  >     String s1 = "abc";
  >     String s2 = "abc";
  >     
  >     System.out.println(s1 == s2); //true
  > }
  > ```
  >
  > 
  >
  > 字符串常量池
  >
  > ​	JDK6及以前	：方法区
  >
  > ​	JDK7 			 ：堆内存
  >
  > 
  >
  > 使用直接赋值的方式创建字符串对象，JVM 会首先到字符串常量池中查找是否有内容一样的对象，如果有，就直接引用。如果没有，就在字符串常量池中创建一个，并引用新创建的字符串。

  

- 字符串的底层实现

  > 底层存储
  >
  > ​	JDK8及以前	：char 数组
  >
  > ​	JDK9			  ：byte 数组
  >
  > 
  >
  > 使用 byte 数组来存储，会更节省内存空间！





## 3、字符串的构造方法

| 构造方法                     | 说明                                     |
| ---------------------------- | ---------------------------------------- |
| public String()              | 创建一个空白的字符串对象，不含有任何内容 |
| public String(char[] chs)    | 根据字符数组创建字符串对象               |
| public String(byte[] bys)    | 根据字节数组创建字符串对象               |
| public String(String origin) | 根据一个原始的字符串创建字符串对象       |
| String str = "abc";          | 直接赋值的方式创建字符串对象             |



示例

```java
public static void main(String[] args) {
    //创建一个空白的字符串对象，不含有任何内容
    String s1 = new String();
    System.out.println("s1: " + s1);
    
    //根据字符数组创建字符串对象
    char[] chs = {'a', 'b', 'c'};
    String s2 = new String(chs);
    System.out.println("s2: " + s2);
    
    //根据字节数组创建字符串对象
    byte[] bys = {97, 98, 99};
    String s3 = new String(bys);
    System.out.println("s3: " + s3);
    
    //根据一个原始的字符串创建字符串对象
    String s4 = new String("abc");
    System.out.println("s4: " + s4);
    
    //直接赋值的方式创建字符串对象
    String s5 = "abc";
    System.out.println("s5: " + s5);
}
```



#### 课堂练习

> ⏱ 10 分钟
>
> 使用 5 中方式创建字符串对象，并将字符串对象输出到控制台



## 4、通过构造方法创建的字符串特点

通过构造方法创建字符串对象，会在堆内存中申请新空间来存储字符串对象，所以，通过构造方法创建的每一个字符串对象都是单独存储在堆内存中的，不存在字符串的共享。



以下程序的运行结果是？

```java
public static void main(String[] args) {
    //通过构造方法创建字符串对象
    String s1 = new String("abc");
    String s2 = new String("abc");
    String s3 = new String("ABC");
    
    System.out.println(s1 == s2); //false
    System.out.println(s1 == s3); //false

    //直接赋值的方式创建字符串对象
    String str1 = "a" + "b" + "c";
    String str2 = "ab" + "c";
    String str3 = "abc";
    
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
}
```



## 5、字符串的比较

#### == 运算符的作用

- 基本数据类型

  > 使用 == 运算符比较基本数据类型时，比较的是值本身
  >
  > ```java
  > public static void main(String[] args) {
  > 	int a = 10;
  >     	int b = 10;
  >     	System.out.println(a == b); //true
  > }
  > ```

- 引用数据类型

  > 使用 == 运算符比较引用数据类型时，比较的是对象的地址值
  >
  > ```java
  > public static void main(String[] args) {
  > 	int[] arr1 = {1, 2, 3};
  >     	int[] arr2 = {1, 2, 3};
  >     	System.out.println(arr1 == arr2); //false
  > }
  > ```



#### equals 方法的使用

字符串的 equals 方法用于比较两个字符串对象中的内容是相同。

代码示例

```java
public static void main(String[] args) {
    //使用构造方法创建两个字符串对象
	String s1 = new String("abc");
    String s2 = new String("abc");
    
    System.out.println(s1 == s2); //false，因为 == 比较的是地址值
    
    System.out.println(s1.equals(s2)); //true，因为 equals 比较的是内容
}
```



#### 课堂问答

以下程序的运行结果是

```java
public static void main(String[] args) {
    String s1 = new String("abc");
    String s2 = new String("abc");
    String s3 = new String("ABC");
    System.out.println(s1.equals(s2)); //true
    System.out.println(s1.equals(s3)); //false

    String str1 = "abc";
    String str2 = "abc";
    String str3 = "ABC";
    System.out.println(str1.equals(str2)); //true
    System.out.println(str1.equals(str3)); //false
}
```



#### 课堂练习

> ⏱ 10 分钟
>
> 练习一下【课堂问答】中的字符串的比较



## 6、案例-用户登录

> ⏱ 10 分钟
>
> 模拟用户登录，用户在控制台输入用户名和密码，判断用户是否登录成功，用户有三次登录机会，超过三次账户将被锁定。



案例实现

```java
public static void main(String[] args) {
    //定义两个字符串变量，存储正确的用户名和密码
    String username = "itheima";
    String password = "123456";
    
    //创建 Scanner 对象
    Scanner sc = new Scanner(System.in);
    
    //使用循环控制登录次数
    for (int i = 0; i < 3; i++) {
        //提示用户输入并接收数据
        System.out.println("请输入用户名");
        String inputUsername = sc.nextLine();
        
        System.out.println("请输入密码");
        String inputPassword = sc.nextLine();
        
        //判断用户是否登录成功
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            //提示登录成功
            System.out.println("登录成功");
            break; //结束循环
        } 
        
        //判断是否需要锁定账户
        if (i == 2) {
            //提示账户锁定
            System.out.println("登录失败，您的账户已经被锁定！");
        } else {
            //提示用户剩余次数
            System.out.println("登录失败，您还有" + (2 - i) + "次登录机会！");
        }
    }
}
```



## 7、案例-遍历字符串

> ⏱ 10 分钟
>
> 键盘录入一个字符串，使用循环遍历字符串中的每一个字符
>
> length() 方法，获取字符串的长度
>
> charAt() 方法，获取指定位置的字符



代码实现

```java
public static void main(String[] args) {
    //创建 Scanner 对象
    Scanner sc = new Scanner(System.in);

    //提示用户输入
    System.out.println("请输入一个字符串：");
    
    //接收数据
    String line = sc.nextLine();

    //遍历字符串中的每一个字符
    for(int i = 0; i < line.length(); i++) {
        //取出并打印当前遍历到的字符
        System.out.println(line.charAt(i));
    }
}
```



## 8、案例-统计字符的出现次数

> ⏱ 10 分钟
>
> 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)



案例实现

```java
public static void main(String[] args) {
    //创建 Scanner 对象
    Scanner sc = new Scanner(System.in);

    //提示用户输入
    System.out.println("请输入一个字符串");

    //接收数据
    String line = sc.nextLine();

    //定义三个变量，用于记录不同类型的字符的出现次数
    int bigCount = 0;
    int smallCount = 0;
    int numberCount = 0;

    //遍历字符串中的每一个字符
    for(int i=0; i<line.length(); i++) {
    char ch = line.charAt(i);

    //判断该字符属于哪种类型，对应类型的统计变量+1
    if(ch>='A' && ch<='Z') {
    bigCount++;
    } else if(ch>='a' && ch<='z') {
    smallCount++;
    } else if(ch>='0' && ch<='9') {
    numberCount++;
    }
    }

    //输出三种类型的字符个数
    System.out.println("大写字母：" + bigCount + "个");
    System.out.println("小写字母：" + smallCount + "个");
    System.out.println("数字：" + numberCount + "个");
}
```



## 9、案例-字符串拼接

> ⏱ 10 分钟
>
> 定义一个方法，将数组元素按照指定格式拼接成字符串并返回
>
> 格式：[10, 20, 30, 40, 50]



代码实现

```java
public static void main(String[] args) {
    //定义数组
    int[] arr = {10, 20, 30, 40, 50};

    //调用方法
    String result = arrayToString(arr);

    //打印结果
    System.out.println(result);
}

public static String arrayToString(int[] arr) {
    //定义一个字符串类型的变量，初始值为左中括号
    String str = "[";

    //遍历数组中的每一个字符串
    for (int i = 0; i < arr.length; i++) {
        //拼接当前遍历到的元素
        str += arr[i];

        //判断当前遍历到元素是否是数组中的最后一个元素
        if (i != arr.length - 1) {
            //不是最后一个元素，再拼接一个逗号
            str += ", ";
        }
    }


    //最后添加一个右中括号
    str += "]";

    //返回结果
    return str;
}
```



## 10、案例-字符串反转

> ⏱ 10 分钟
>
> 定义一个方法，实现字符串的反转，并将反转后的字符串返回
>
> 键盘接收一个字符串，调用方法并接收反转后的结果，将结果打印在控制台



代码实现

```java
public static void main(String[] args) {
    //创建 Scanner 对象
    Scanner sc = new Scanner(System.in);

    //提示用户输入
    System.out.println("请输入一个字符串");

    //接收数据
    String line = sc.nextLine();

    //调用方法
    String newLine = reverse(line);

    //打印结果
    System.out.println(newLine);
}

private static String reverse(String line) {
    //字符串的反转思路：倒着遍历一遍字符串中的每一个字符即可
    //定义变量，存储反转后的字符串
    String newLine = "";

    //遍历字符串中的每一个字符
    for (int i = line.length() - 1; i >= 0; i--) {
        newLine += line.charAt(i);
    }

    //返回结果
    return newLine;
}
```



## 11、String类的常用方法

```java
public char charAt(int index)							//获取指定位置的字符
    
public int length()										//获取字符串长度
    
public boolean equals(Object anObject)					//判断两个字符串内容是否相同
    
public boolean equalsIgnoreCase(String anotherString)	//判断两个字符串内容是否相同，忽略大小写

public String substring(int beginIndex, int endIndex)	//截取字符串
    
public boolean contains(CharSequence s)					//判断是否包含某个字串
```



## 12、StringBuilder（字符串缓冲区）类

#### StringBuilder 类的介绍

StringBuilder 是一个可变的字符序列，它内部存储的字符串数据是可变的



由于字符串的不可变性，在拼接字符串时，会产生大量的内存垃圾，使用 StringBuilder 类就可以解决这个问题。



#### StringBuilder 类的构造方法

```java
public StringBuilder()				//创建一个空的字符串缓冲区
public StringBuilder(String str)	//创建一个带有初始数据的字符串缓冲区
```



示例

```java
public static void main(String[] args) {
    //创建空的字符串缓冲区
    StringBuilder sb1 = new StringBuilder();
    System.out.println("sb1:" + sb1);
    
    //创建一个带有初始数据的字符串缓冲区
    StringBuilder sb1 = new StringBuilder("hello");
    System.out.println("sb2:" + sb2);
}
```



课堂练习

> ⏱ 5 分钟
>
> 练习一下 StringBuilder 类的两个构造方法



## 13、StringBuilder 的添加和反转

#### 添加方法

创建好 StringBuilder 对象之后，我们可以通过 append 方法添加数据到缓冲区中。

```java
public StringBuilder append(任意数据类型)
```

示例

```java
public static void main(String[] args) {
    //创建空的字符串缓冲区
    StringBuilder sb = new StringBuilder();
    
    //添加数据
    sb.append("Hello");
    sb.append("World");
    
    System.out.println(sb); //HelloWorld
}
```



StringBuilder 类的 append 方法还支持链式编程

```java
public static void main(String[] args) {
    //创建空的字符串缓冲区
    StringBuilder sb = new StringBuilder();
    
    //添加数据（链式编程）
    sb.append("Hello").append("World");
    
    System.out.println(sb);
}
```



#### 反转方法

要反转字符串缓冲区中的内容，可以调用 StringBuilder 类的 reverse 方法

```java
public StringBuilder reverse()	//反转字符串缓冲区中的内容
```



示例

```java
public static void main(String[] args) {
    //创建空的字符串缓冲区
    StringBuilder sb = new StringBuilder();
    
    //添加数据
    sb.append("12345");
    
    //反转
    sb.reverse();
    
    System.out.println(sb); //54321
}
```



#### 课堂练习

> ⏱ 5 分钟
>
> 练习一下 StringBuilder 类的添加和反转方法





## 14、StringBuilder 和 String 的转换

#### StringBuilder 转 String

```java
public static void main(String[] args) {
    //创建空的字符串缓冲区
    StringBuilder sb = new StringBuilder();
    
    //添加数据
    sb.append("Hello");
    
    //StringBuilder 转换成 String
    String str = sb.toString();
    
    System.out.println(str);
}
```



#### String 转 StringBuilder

```java
public static void main(String[] args) {
    //创建一个字符串
    String str = "Hello";
    
    //String 转 StringBulder
    StringBuilder sb = new StringBuilder(str);
    
    System.out.println(sb);
}
```



## 15、案例-字符串拼接升级版

> ⏱ 10 分钟
>
> 使用 StringBuilder 类优化字符串拼接案例



代码实现

```java
public static void main(String[] args) {
    //定义数组
    int[] arr = {10, 20, 30, 40, 50};

    //调用方法
    String result = arrayToString(arr);

    //打印结果
    System.out.println(result);
}

public static String arrayToString(int[] arr) {
    //创建 StringBuilder 对象，初始值为左中括号
    StringBuilder sb = new StringBuilder("[");

    //遍历数组中的每一个字符串
    for (int i = 0; i < arr.length; i++) {
        //拼接当前遍历到的元素
        sb.append(arr[i]);

        //判断当前遍历到元素是否是数组中的最后一个元素
        if (i != arr.length - 1) {
            //不是最后一个元素，再拼接一个逗号
            sb.append(", ");
        }
    }


    //最后添加一个右中括号，并返回结果
    return sb.append("]").toString();
}
```



## 16、案例-字符串反转升级版

> ⏱ 10 分钟
>
> 使用 StringBuilder 类优化字符串反转案例



代码实现

```java
public static void main(String[] args) {
    //创建 Scanner 对象
    Scanner sc = new Scanner(System.in);

    //提示用户输入
    System.out.println("请输入一个字符串");

    //接收数据
    String line = sc.nextLine();

    //调用方法
    String newLine = reverse(line);

    //打印结果
    System.out.println(newLine);
}

private static String reverse(String line) {
    //链式编程 - 反转字符串
    return new StringBuilder(line).reverse().toString();
}
```



## 今日学习目标

- 能够知道帮助文档的使用步骤

- 能够知道字符串对象通过构造方法创建和直接赋值的区别

  > 直接赋值
  >
  > ​	先在字符串常量池中查找是否有内容相同的字符串对象，如果有，就直接引用，如果没有就在常量池中创建该字符串对象。
  >
  > 构造方法
  >
  > ​	每次创建都会在堆内存中申请内存空间存储字符串对象，没有内存共享的！！！
  >
  > String s = "a";
  >
  > String s1 = s + "b"; //堆内存
  >
  > String s2 = "a" + "b"; //常量池  编译器优化

- 能够完成用户登录案例

- 能够完成统计字符串中大写,小写,数字字符的个数

- 能够知道String和StringBuilder的区别

  > String 是不可变的，在拼接字符串时会产生大量的内存垃圾
  >
  > StringBuilder 是可变的

- 能够完成String和StringBuilder的相互转换

- 能够使用StringBuilder完成字符串的拼接

- 能够使用StringBuilder完成字符串的反转