# 基础班第9天

## 今日课程内容

- ArrayList 集合
- 学生信息管理系统



## 1、ArrayList 集合的介绍

#### 什么是 ArrayList 集合

集合，是存储数据的容器，ArrayList 是众多集合类中最常用的一种。





#### ArrayList 集合的特点

- ArrayList 的长度是可变的
- ArrayList 底层是由数组实现的





## 2、ArrayList 类的构造方法和添加方法

#### 构造方法

```java
public ArrayList()				//创建一个空的集合
```



#### 添加方法

```java
public boolean add(E e)			//添加一个元素到集合的末尾
```



示例

```java
public static void main(String[] args) {
	//创建集合对象
    ArrayList list = new ArrayList<>();
    
    //添加元素
    list.add("张三");
    list.add("李四");
    
    //打印集合中的元素
    System.out.println(list);
}
```



#### 什么是泛型

泛型，现在我们可以将其理解为，用于限制集合中可以存储的数据类型！



#### 包装类型

由于泛型不支持基本数据类型，Java 为基本数据类型都提供了对应的包装类型

```java
byte	->		Byte
short	->		Short
int		->		Integer
long	->		Long
float	->		Float
double	->		Double
char    ->		Character
boolean ->		Boolean
```

要在集合中存储基本数据类型的数据，我们可以将泛型设置为对应的包装类型



## 3、ArrayList常用方法

```java
public boolean add(E e)				//向集合中添加元素
public void add(int index,E e)		//向集合中指定索引处添加元素
public boolean remove(Object obj)	//删除集合中指定元素
public E remove(int index)			//删除集合中指定索引处的元素
public E set(int index,E e)			//修改集合中指定索引处的元素
public E get(int index)				//获取集合中指定索引处的元素
public int size()					//获取集合的长度
```



> ⏱ 10 分钟
>
> 练习一下集合的常用方法





## 4、ArrayList 存储字符串并遍历

> ⏱ 10 分钟
>
> 创建一个集合，存储 3 个字符串，编写程序遍历集合中的所有元素



代码实现

```java
public static void main(String[] args) {
    //创建集合对象
    ArrayList<String> list = new ArrayList<>();

    //往集合中添加字符串
    list.add("刘正风");
    list.add("左冷禅");
    list.add("风清扬");

    //集合的 size 方法可以获得集合中的元素数量
    //遍历集合
    for(int i = 0; i < list.size(); i++) {
        //取出当前遍历到的元素
        String ele = list.get(i);
        //打印在控制台
        System.out.println(ele);
    }
}
```



## 5、ArrayList 存储学生对象并遍历

> ⏱ 10 分钟
>
> 创建一个集合，存储 3 个学生对象，编写程序遍历集合中的所有元素



代码实现

```java
public static void main(String[] args) {
    //创建集合对象
    ArrayList<Student> list = new ArrayList<>();

    //创建学生对象
    Student s1 = new Student("林青霞", 30);
    Student s2 = new Student("风清扬", 33);
    Student s3 = new Student("张曼玉", 18);

    //将学生对象到集合中
    list.add(s1);
    list.add(s2);
    list.add(s3);

    //遍历集合，采用通用遍历格式实现
    for (int i = 0; i < list.size(); i++) {
        Student s = list.get(i);
        System.out.println(s.getName() + "," + s.getAge());
    }
}
```



## 6、ArrayList 存储学生对象并遍历-升级版

> ⏱ 10 分钟
>
> 创建一个集合，存储 3 个学生对象，编写程序遍历集合中的所有元素
>
> 要求：学生的姓名和年龄来自键盘录入



代码实现

```java
public static void main(String[] args) {
    //创建集合对象
    ArrayList<Student> list = new ArrayList<>();
    
    //创建Scanner对象
    Scanner sc = new Scanner(System.in);
    
    //循环接收数据创建对象
    for (int i = 1; i <= 3; i++) {
        System.out.println("请输入第" + i + "个学生的姓名");
        String name = sc.next();
        
        System.out.println("请输入第" + i + "个学生的年龄");
        int age = sc.nextInt();
        
        //创建对象
        Student stu = new Student(name, age);
        
        //将对象添加到集合中
        list.add(stu);
    }

    //遍历集合中的每一个学生对象
    for (int i = 0; i < list.size(); i++) {
        //取出当前遍历到的学生对象
        Student s = list.get(i);
        
        //打印学生对象信息
        System.out.println(s.getName() + "," + s.getAge());
    }
}
```



## 7、学生信息管理系统





## 今日学习目标

- 能够知道集合和数组的区别

- 能够完成ArrayList集合添加字符串并遍历

- 能够完成ArrayList集合添加学生对象并遍历

- 能够完成学生管理系统主界面编写

- 能够完成学生管理系统添加操作

- 能够完成学生管理系统查询操作

- 能够完成学生管理系统删除操作

- 能够完成学生管理系统修改操作