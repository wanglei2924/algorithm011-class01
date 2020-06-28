# 学习笔记
## 第一周学习总结
1. 五毒神掌
2. 掌握数组、链表、跳表、Stack、Queue、Deque的原理和实现
3. PriorityQueue的特点和空间复杂度
4. 解题思路：升维思想 + 空间换时间
---
## 分析Queue 和 PriorityQueue源代码
Queue是接口，定义了如下的队列API。
boolean add(E e);插入元素到队列，插入成功返回true，否则抛异常
boolean offer(E e); 插入元素到队列，插入成功返回true，否则返回false
E remove(); 返回并删除队列头，如果队列为空抛异常
E poll();   返回并删除队列头，如果队列为空返回null
E element();返回不删出队列头，如果队列为空抛异常
E peek();   返回不删出队列头，如果队列为空返回null
---
PriorityQueue是优先级队列，内部有一个queue数组维持一个平衡二叉堆，优先级队列按照comparator排序，或者如果没有传入comparator的话按照元素的自然顺序。插入的时间复杂度是O(1)，取出是O(logN)。