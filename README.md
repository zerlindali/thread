[TOC]
# java并发编程学习示例代码
## 线程的状态
- start() 初始化状态-->创建线程，并指定线程任务
- ready-to-run 就绪
    - start()
    - Waiting Object.notify() or Object.notifyAll()
    - Sleeping Object.notify() or Object.notifyAll()
    - Running Scheduler swap Or Thread.yield();
- Running 运行 
    - ready-to-run Chosen by scheduler 
    - Blocked Data received Or Lock obtained
- Dead 终止
    - stop() or run() exits
    - Running done
    - Blocked Another closes IO socket
- Sleeping 超时等待
    - Running Thread.sleep();
- Waiting 等待
    - Running Object.wait()
- Blocked 阻塞
    - Running Blocks for IO Or Enters synchronized code
## 守护线程DaemonThread && 用户线程 UserThread
线程分为2种，一种是守护线程，另一种是用户线程   
一个主线程可以启动几个守护线程，最经典的就是GC(垃圾回收机制)   
当进程中不存在非守护线程时，守护线程就会立即自动销毁。即使是finally里面的代码，也不会执行了。   
## 创建线程的四种方式
- 实现Runnable接口
- 重写Thread的run方法
- 实现Callable的call方法
- 将线程放到FutureTask中，得到线程返回结果
## 定时器
- Timer
- quartz框架
## 线程池
- ExecutorService
## Lambda表达式
- parallelStream 并行流
## 线程带来的风险
- 线程安全性问题
- 活跃性问题 
    - 死锁 
    - 活锁 
    - 饥饿 
        - 从线程优先级来看饥饿问题
            - 高优先级吞噬所有低优先级的cpu时间片
            - 线程被永久堵塞在一个等待进入同步块的状态
            - 等待的线程永远不被唤醒
        - 如何尽量避免饥饿问题
            - 设置合理的优先级
            - 使用锁
- 性能问题 cpu上下文切换带来的性能问题
## Synchronized原理与使用
- 内置锁
- 互斥锁