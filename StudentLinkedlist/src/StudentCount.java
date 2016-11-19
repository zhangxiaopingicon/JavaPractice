
import java.util.Iterator;
import java.util.LinkedList;

public class StudentCount 
{
 private int id;//学号
 private String name;//姓名
 private double score;//成绩

 public StudentCount(int stuId)
 {
  this.id = stuId;
 }

 public StudentCount(int id, String name, double score)
 {
  this.id = id;
  this.name = name;
  this.score = score;
 }
 
 public static void main(String args[]){
  LinkedList<StudentCount> list = new LinkedList<StudentCount>();
  
  list.add(new StudentCount(1, "Zhang San", 100));
  list.add(new StudentCount(2, "Li Si", 90));
  list.add(new StudentCount(3, "Wang Wu", 30));
  list.add(new StudentCount(4, "Zhao Ba", 65));
  list.add(new StudentCount(5, "Ma liu", 72));
  
//通过get来遍历
  System.out.println("Students information visited by get method: ");
  visitByGet(list);
  
//通过Iterator来遍历
  System.out.println("\n*******Students information visited by Iterator way: ******");
  visitByIterator(list);
  
 }
 
 private static void visitByIterator(LinkedList<StudentCount> list) {//通过迭代器来遍历
  Iterator<StudentCount> ite = list.iterator();
  
  while(ite.hasNext()){
	  StudentCount stu = ite.next();
   System.out.println(stu.toString());
  }
  
 }

 private static void visitByGet(LinkedList<StudentCount> list) {//通过get来遍历

  for(int i = 0, size = list.size(); i < size; i++){
	  StudentCount stu = list.get(i);
   System.out.println(stu.toString());
  }
  
 }

 public String toString(){
  return "Student information[id, name, score]: " + id + ", " + name + ", " + score;
 }
}