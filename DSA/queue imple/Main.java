

// class Main{

//     int queue[]=new int[8];
//     int size;
//     int front=0;
//     int rear=0;    
//     public static void main(String[] args) {
//         Main q = new Main(); 
//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.dequeue();
//         q.enqueue(40);
//         q.enqueue(50);
//         q.dequeue();
//         q.show();
//     }
//     public void enqueue(int a)
//         {
//             queue[rear]=a;
//             rear++;
//             size=size+1;
//         }
//         public void show()
//         {
//             System.out.println("elements:");
//             for(int i=0;i<size;i++)
//             {
//                 System.out.print(queue[front+i]+ " ");
//             }
//         }
//         public void dequeue()
//         {
//             int data=queue[front];
//             front++;
//             size--;
            
//         }
// }

//circular queue

class Main {
    int queue[] = new int[4];
    int size = 0;
    int front = 0;
    int rear = 0;

    public static void main(String[] args) {
        Main q = new Main();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.show();

        System.out.println("\nDequeuing two elements...");
        q.dequeue();
        q.dequeue();
        q.show();

        System.out.println("\nEnqueueing after dequeue (should wrap around)...");
        q.enqueue(50);
        q.enqueue(60);
        q.show();
    }

    public void enqueue(int a) {
        if (size == queue.length) {
            System.out.println("Queue is full! Cannot insert " + a);
        } else {
            queue[rear] = a;
            rear = (rear + 1) % queue.length; // Circular increment
            size++;
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Dequeued: " + queue[front]);
            front = (front + 1) % queue.length; // Circular increment
            size--;
        }
    }

    public void show() {
        System.out.println("Elements in queue:");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}
