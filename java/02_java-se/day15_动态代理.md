### 动态代理

对ArrayList集合进行代理，以前的remove(Object obj)方法是删除集合中第一次出现的元素(比如集合中有多个“abc”,调用remove(“abc”)后只会删除第一个元素)。代理后，要求在调用remove(Object obj)方法后，能够删除集合中所有匹配的元素。【动态代理】

```java
package com.itheima.demo9_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author：pengzhilin
 * @Date: 2021/4/21 14:33
 */
@SuppressWarnings("all")
public class Test2 {

    public static void main(String[] args) {
        /*
            对ArrayList集合进行代理，以前的remove(Object obj)方法是删除集合中第一次出现的元素
            (比如集合中有多个“abc”,调用remove(“abc”)后只会删除第一个元素)。
            代理后，要求在调用remove(Object obj)方法后，能够删除集合中所有匹配的元素。【动态代理】

            使用动态代理:
                1.分析是否需要代理对象
                2.如果需要代理对象就使用Proxy调用方法直接生成代理对象
                3.使用代理对象调用方法
         */
        // 1.创建ArrayList集合,限制集合元素类型为String类型
        ArrayList<String> list = new ArrayList<>();// ArrayList:被代理类

        // 2.往集合中添加元素
        list.add("abc");
        list.add("bac");
        list.add("abc");
        list.add("cba");
        list.add("abc");
        list.add("abc");

        // 3.使用Proxy调用方法直接动态生成代理对象
        // 被代理类的类加载器
        ClassLoader classLoader = list.getClass().getClassLoader();

        // 被代理类实现的所有接口的字节码对象
        Class<?>[] interfaces = list.getClass().getInterfaces();

        // 动态生成代理对象
        List<String> proxy = (List<String>) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 代理对象只要调用方法就会来到这里执行
                // 参数1: 代理对象
                // 参数2: 代理对象调用的方法
                // 参数3: 代理对象调用方法传递的实际参数
                // 返回值: 其实就是代理对象调用方法的返回值

                // 执行一次代理对象调用的方法----使用被代理对象调用它原有的方法
                Object res = method.invoke(list, args);

                // 判断是否是remove方法,如果是,就增强remove方法
                if ("remove".equals(method.getName())) {
                    // 获得迭代器对象
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        String e = it.next();
                        // 判断元素是否是要删除的元素
                        if (e.equals(args[0])) {
                            // 删除
                            it.remove();
                        }
                    }
                }

                return res;
            }
        });

        // 3.请代理:使用代理对象调用remove(Object obj)方法---->如果有多个该元素,会删除所有的该元素
        boolean res2 = proxy.remove("abc");
        System.out.println("res2:" + res2);// res2:true
        System.out.println("list:" + list);//list:[bac, cba]

        /*boolean res2 = proxy.remove("bac");
        System.out.println("res2:"+res2);// res2:true
        System.out.println("list:"+list);//list:[abc, abc, cba, abc, abc]*/

        /*boolean res2 = proxy.remove("nba");
        System.out.println("res2:"+res2);// res2:false
        System.out.println("list:"+list);// list:[abc, bac, abc, cba, abc, abc]*/


        // 代理对象调用别的方法--->eg:size方法,不需要增强
        int size = proxy.size();
        System.out.println("size:" + size);

        String setE = proxy.set(1, "nba");
        System.out.println("setE:" + setE);
        System.out.println("list:" + list);

        // 3.不请代理,调用remove(Object obj)方法---->如果有多个该元素,只会删除第一个元素
        // boolean res1 = list.remove("abc");
        // System.out.println("res1:" + res1);// res1:true
        // System.out.println("list:" + list);// list:[bac, abc, cba, abc, abc]
    }
}

```

