// package deadlock;

// class Pen {

//     public synchronized void writeWithPenAndPaper(Paper paper){
//         System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying");
//         paper.finishWriting();
//     }

//     public synchronized void finishWriting(){

//         System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
//     }
// }

// class Paper{
// public synchronized void writeWithPaperAndPen(Pen pen){
//         System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying");
//         pen.finishWriting();
//     }

//     public synchronized void finishWriting(){

//         System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
//     }
// }


// class Task2 implements Runnable{
//     private Pen pen;
//     private Paper paper;

//     public Task2(Pen pen , Paper paper){
//         this.pen = pen;
//         this.paper = paper;
//     }

//     @Override
//     public void run() {
//         // TODO Auto-generated method stub
   
//     }
    
// }

// public class DeadExample {
    
// }
