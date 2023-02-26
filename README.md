# OS2Assignment

## Observations

Task 3 - Initial assignment has multiple threads accessing a shared resource. Here we face a problem as we are uncertain
about the available seats because the threads are accessing the same piece of shared memory at the exact same time, thus
the same seat could be booked by multiple threads at the same time.


To fix this issue we decided to use the "synchronize" keyword as this will lock the shared resource. This will block 
a thread from accessing the shared memory while another thread is currently accessing it.  

## Operation
This project uses Maven and Java 19. As such these are the prerequisite for running this software.

Once the prerequisites are met the user may run the Main class

The program will execute and output the results to the terminal after which it will exit