package com.example.jvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JvmApplication {

	public static void main(String[] args) {
		SpringApplication.run(JvmApplication.class, args);
	}




//	垃圾：没有任何引用指向的任何对象

//	熟悉GC常用算法，熟悉常见垃圾收集器，具有实际jvm调优实战经验    tuning-----调优

//	how  to find garbage   reference count 、   	root searching
//								引用计数				根可达		GC roots			 线程栈变量 静态变量 常量池 JNI指针

//	   gc Algorithms   GC算法
//（不可回收、可回收、空闲）		Mark-Sweep 标记清除     标记可回收的-----成为可使用     存活对象比较多的情况下效率较高  根可达   两边扫描，效率较低，易产生碎片
//		Copying	拷贝		将内存一分为二 移动复制对象  需要调整对象的引用 扫描一次没有碎片，效率较高
//		Mark-Compact	标记压缩	不会产生碎片	 扫描两次，需要移动对象，效率偏低
//   Epsilon、zgc、sd之前所有的算法都是逻辑分代模型
//	G1逻辑分代物理不分代  ，除此之外不仅逻辑分代，而且物理分代

//	新生代     复制算法
//	老年代采用MC或者Ms


//	  Copying								mark sweep 和mark compact
//   8	     1              1
//	eden    survivor       survivr   		tenured（终身）
//	       new/young（新生代）				old（老年代）

//			s1 from			s2 to

//	stack        s0-s1之间的复制年龄超过限制时，进入old区 通过配置参数； -XX：MaxTenuringThreshold配置

//				-Xmn	     n：new    m：memory   -X:非标参数
//|								-Xms -Xmx				|   s：最小值    x：最大值
//	MinorGc/YGC:年轻代空间耗尽时触发
//	MajorGC/FullGC：在老年代无法继续分配空间时触发，新生代老年代同时进行回收


	//线程本地分配TLAB(Thread Local Allocation Buffer)








}
