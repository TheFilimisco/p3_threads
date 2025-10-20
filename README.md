# Thread
In Java there is the Thread class that is used to create different threads of execution. To create a thread, we must create a class that inherits from Thread and implements the run() method. We can see a Thread object as a virtual CPU that we add to our program and that in run() has the code to execute and that the data on which it will work will be those that are accessible from this method, shared, or not, with other threads.

## Example  (_[Threads](src/Threads)_)
