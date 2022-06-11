# 基础班第7天

## 今日课程内容

- 面向对象概述
- 类和对象
- 对象内存图
- 成员变量和局部变量
- 封装
- 构造方法



## 1、面向对象思想概述

#### 什么是面向过程

面向过程，强调的是过程，是需要自己一步步的完成对应的需求。

> 自己做一道菜



#### 什么是面向对象

面向对象，强调的是对象，是通过指挥对象去帮助我们完成对应的需求。

> 请厨师帮我们做一道菜



#### 面向对象的好处

- 面向对象是一种编程思想，它更加符合我们思考问题的一种习惯。
- 将复杂的问题简单化
- 将我们从【执行者】的位置，变成了【指挥者】



## 2、类和对象

#### 什么是类

类，是一类具有相同属性和行为的事物的抽象。简单理解，类就是对“事物”的“描述”。



任何事物都能够通过属性和行为对其进行描述，以“学生”为例

属性

> 姓名，性别，年龄，地址

行为

> 学习，睡觉，吃饭



#### 什么是对象

对象，即客观存在的事物，例如“张三”同学！



#### 类和对象的关系

类是对象的抽象（描述），对象是类的实体。



## 3、类的定义

#### 编写类的步骤

1. 定义类
2. 编写成员变量（属性）
3. 编写成员方法（行为）



在类中，我们使用成员变量来描述“属性”，使用成员方法描述“行为”

- 成员变量

  > 定义在类中，方法外的变量

- 成员方法

  > 与之前定义方法的格式相同，只不过现在不需要加 static 关键字



#### 课堂练习

> ⏱ 10 分钟
>
> 创建一个类，类名为 Phone
>
> 编写 Phone 类的成员变量（字符串类型的品牌，整数类型的价格）
>
> 编写 Phone 类的成员方法（打电话，发短信）



代码实现

```java
/**
 * 用于描述手机的类
 */
public class Phone {
    //成员变量（属性）
    String brand;	//品牌
    int price;		//价格
    
    //成员方法（行为）
    public void call() {
        System.out.println("打电话...");
    }
    
    public void senMessage() {
        System.out.println("发短信...");
    }
}
```



## 4、对象的使用

#### 对象的创建格式

```java
类名 对象名 = new 类名();


//举例
Phone p = new Phone();
```



#### 访问成员变量

```java
对象名.成员变量;
    

//举例
//为对象的成员变量赋值
p.brand = "华为";

//获取对象的成员变量
System.out.println(p.brand);
```



#### 访问成员方法

```java
对象名.成员方法名();

//举例
p.call();
p.sendMessage();
```



#### 课堂练习

> ⏱ 5 分钟
>
> 创建并使用手机类的对象



代码实现

```java
public static void main(String[] args) {
    //创建手机类的对象
    Phone p = new Phone();
    
    //为对象的成员变量赋值
    p.brand = "华为";
    p.price = 5999;
    
    //获取对象的成员变量
    System.out.println(p.brand);
    System.out.println(p.price);
    
    //访问对象的成员方法
    p.call();
    p.sendMessage();
}
```



## 5、学生类练习

> ⏱ 10 分钟
>
> 创建一个学生类，在测试类的 main 方法中创建并使用学生类的对象
>
> 学生类
>
> - 属性：姓名，年龄
> - 行为：学习，做作业



代码实现

```java
public class Student {
    //成员变量
    String name;	//姓名
    int age;		//年龄
    
    //成员方法
    public void study() {
        System.out.println("好好学习");
    }
    
    public void doHomework() {
        System.out.println("多做练习");
    }
}
```

```java
public StudentDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student stu = new Student();
        
        //为对象的成员变量赋值
        stu.name = "张三";
        stu.age = 18;
        
        //获取对象成员变量的值
        System.out.println(stu.name);
        System.out.println(stu.age);
        
        //调用对象的成员方法
        stu.study();
        stu.doHomework();
    }
}
```



## 6、单个对象的内存图

知识点视频讲解



## 7、多个对象的内存图

知识点视频讲解



## 8、多个变量指向相同对象的内存图

知识点视频讲解



## 9、成员变量和局部变量的区别

|              | 成员变量                                   | 局部变量                                   |
| ------------ | ------------------------------------------ | ------------------------------------------ |
| 类中的位置   | 类中，方法外                               | 方法中或方法声明上                         |
| 内存中的位置 | 堆内存                                     | 栈内存                                     |
| 初始化值     | 有初始化值                                 | 无初始化值，必须先赋值后使用               |
| 生命周期     | 随着对象的创建而存在，随着对象的销毁而消失 | 随着方法的入栈而存在，随着方法的出栈而消失 |
| 作用范围     | 整个类中                                   | 所处的大括号中                             |



## 10、private 关键字

#### private 关键字概述

private 关键字是一个访问权限修饰符，它可以用来修饰成员变量和方法。



#### 被 private 修饰的成员有什么特点

被 private 关键字修饰的成员，只能够在类中访问。



#### 在类中使用 private 关键字

我们可以使用 private 关键字修饰类的成员变量，使得成员变量无法被外部直接访问，同时提供外部可以访问到的 set & get 方法。



#### 课堂练习

> ⏱ 10 分钟
>
> 定义标准的学生类，要求 name 和 age 使用 private 修饰，并提供 set 和get 方法以及便于显示数据的 show 方法，测试类中创建对象并使用，最终控制台输出 林青霞，30



代码实现

```java
public class Student {
    //成员变量
    private String name;
    private String age;
    
    //getter & setter
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
    
    //成员方法
    public void show() {
        System.out.println(name + ", " + age);
    }
}
```

```java
public class StudentDemo {
    public static void main(Stirng[] args) {
        //创建对象
        Student stu = new Student();
        
        //调用set方法为对象的成员变量赋值
        stu.setName("林青霞");
        stu.setAge(18);
        
        //调用对象的show方法
        stu.show();
    }
}
```



## 11、this 关键字

#### this 关键字的作用

当成员变量和局部变量重名时，可以使用 this 关键字进行区分，加上 this 关键字的就是成员变量。



#### 课堂练习

> ⏱ 10 分钟
>
> 需求：定义标准学生类，加入this关键字（可在原有代码基础上进行修改）



代码实现

```java
public class Student {
    //成员变量
    private String name;
    private String age;
    
    //getter & setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    
    //成员方法
    public void show() {
        System.out.println(name + ", " + age);
    }
}
```

```java
public class StudentDemo {
    public static void main(Stirng[] args) {
        //创建对象
        Student stu = new Student();
        
        //调用set方法为对象的成员变量赋值
        stu.setName("林青霞");
        stu.setAge(18);
        
        //调用对象的show方法
        stu.show();
    }
}
```



## 12、this 的内存原理

#### this 在内存中代表了什么

this 关键字代表当前对象的引用，哪个对象调用方法，方法中的 this 就代表了这个对象的。



## 13、封装

#### 面向对象的三大特征

- 封装
- 继承
- 多态



#### 封装的原则

将类的某些信息隐藏在类内部，不允许外部直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问。



封装是一个比较大的概念

- 私有化成员变量（对类的实现细节进行封装）
- 将一段代码抽取到方法中（对代码进行封装）



#### 封装的好处

封装能够更好的隐藏实现细节，并且能够提高代码的安全性以及复用性。



## 14、构造方法

#### 构造方法的定义格式

- 构造方法的方法名与类名相同

- 构造方法没有返回值，连 void 也没有



举例

```java
public class Person {
    
    //构造方法
    public Person() {
        //方法体
    }
}
```



#### 构造方法的调用

构造方法不能手动调用，当我们创建类的对象时，系统会自动调用类的构造方法



#### 构造方法的作用

构造方法也可以接收参数，通常情况下，我们可以利用构造方法在创建对象的同时，帮助我们初始化对象的成员变量。

```java
public class Person {
    //成员变量
    private String name;
    private int age;
    
    //构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //getter & setter 略
}
```

```java
public class PersonDemo {
    public static void main(String[] args) {
        //创建类的对象
        Person p = new Person("张三", 18);
    }
}
```



## 15、构造方法的注意事项

- 构造方法也能够重载
- 如果我们没有在类中写任何的构造方法，编译器会自动添加一个空参的构造方法
- 如果我们在类中手动的写出了构造方法，编译器就不会帮我们添加空参构造方法了



## 16、标准类的制作

> ⏱ 10 分钟
>
> 需求：定义标准学生类，要求分别使用空参和有参构造方法创建对象，空参创建的对象通过setXxx赋值，有参创建的对象直接赋值，并通过show方法展示数据。



代码实现

```java
public class Student {
    //成员变量
    private String name;
    private int age;
    
    //空参构造
    public Student() {
        
    }
    
    //全参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //getter & setter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    
    
    //成员方法
    public void show() {
        System.out.println(name + ", " + age);
    }
}
```

```java
public class StudentClass {
    public static void main(String[] args) {
        //空参构造创建对象
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(18);
        stu1.show();
        
        //全参构造创建对象
        Student stu2 = new Student("李四", 20);
        stu2.show();
    }
}
```



## 今日学习目标

- 能够知道类和对象的关系

  > 类是对象的抽象，对象是类的实体

- 能够完成类的定义及使用

  > 类中可以定义的成员
  >
  > - 成员变量
  > - 成员方法
  > - 构造方法
  >
  > 类的使用
  >
  > 创建对象的格式
  >
  > ​	类名 对象名 = new 类名();
  >
  > 访问对象的成员
  >
  > ​	对象名.成员变量名
  >
  > ​	对象名.成员方法名

- 能够知道对象在内存中的初始化过程

  > 对象存储在堆内存中的
  >
  > 如果没有给对象的成员变量赋值，它是有默认值的
  >
  > 基本数据类型
  >
  > - 整数：0
  > - 浮点：0.0
  > - 字符：空字符
  > - 布尔：false
  >
  > 引用类型：null

- 能够知道局部变量和成员变量的区别

- 能够知道private关键字的特点

  > 被 private 关键字修饰的成员，是只能在本类中访问，外界无法直接访问
  >
  > 可以使用 private 关键字私有化类中的成员变量
  >
  > 被私有化的成员变量，需要在类中提供对外公开的 getter & setter 方法，外界可以通过这些方法间接访问

- 能够知道this关键字的作用

  > 区分同名的成员变量和局部变量，加上 this 关键字的变量，就是成员变量

- 能够知道构造方法的格式和注意事项

  > 格式
  >
  > 	- 构造方法的方法名和类名是完全一致的
  > 	- 构造方法没有返回值的，连 void 也不用写
  >
  > 执行时机
  >
  > - 在每次创建类的对象时，都会自动执行构造方法
  >
  > 作用
  >
  > - 在创建类的对象的同时，初始化对象的成员变量
  >
  > 注意事项
  >
  > - 构造方法也是可以重载的
  > - 如果类中没有编写构造方法，编译器会在编译代码的时候自动的添加一个空参的构造方法
  > - 如果类中写了构造方法，编译器就不会帮我们添加任何的构造方法

- 能够完成一个标准类代码的编写及测试