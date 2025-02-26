**1472. 设计浏览器历史记录**

[题目链接](https://leetcode.cn/problems/design-browser-history/?envType=daily-question&envId=2025-02-26)

维护一个向量+一个指针即可

注意坑点：  

若历史记录：a->b->c->d->e->f，当前为d，此时要visit(b)，并不是把指针放到b，然后把b之后的删除，是把当前指针（d）之后的删除，然后把b添加到后面，也就是  a->b->c->d->b