## Multithreading
### Advantage of multithreading
1) we can perform multiple operations at the same time 
2) threads are independent, so it doesn't affect other thread if an exception occurs in a single thread

### multitasking
1) process based multitasking (multiprocessing)
2) thread based multitasking (multithreading)

#### 1) multiprocessing
-> each process allocated a seperate memory area
-> process is heavyweight
-> cost of communication between the process is high
#### 2) multithreading
-> threads share the same address space
-> a thread is a lightweight
-> cost of communtication between the thread is low

### What is thread
thread is a lightweight subprocess, the smallest unit of the procesing

thread is executed inside the process

### Java thread class
1) java provides thread class to achieve thread programming
2) Thread class provides constructor and methods to create and perform operations on thread
3) Thread class extends Object class and implements Runnable interface

#### Java Thread methods
void start() // start the execution of thread
void run() // used to do an action for a thread
static void sleep() // it sleeps a thread for the specified amount of time
static thread currentThread() // return the reference to the currently executing thread object
void join() //waits for a thread to die
static void yield() //causes the currently executing thread object to pause and allow other thread to execute temporarily
