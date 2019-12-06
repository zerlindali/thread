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
- 
## 从java字节码的角度看线程安全性问题
## 线程的优先级