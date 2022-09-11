package bai11;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseArray<T> {
    private LinkedList<T> stack;

    ReverseArrayIntegerUseStack(){
        stack= new LinkedList<>();
    }
    public void push(T elememts){
        stack.addFirst(elememts);
    }
    public T pop(){
        if(stack.size()==0){
            System.out.println("My Genneric Stack empty");
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
    public  void print(){
        if(stack.size()==0){
            System.out.println("My Genneric Stack empty");
        }else{
            for(int i=0; i<stack.size();i++){
                System.out.print(stack.get(i)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ReverseArrayIntegerUseStack<Integer> reverseArrayIntegerUseStack= new ReverseArrayIntegerUseStack<>();
        System.out.println("Ban muon nhap bao nhieu so vao mang: ");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int i=0;
        while (i<number){
            System.out.print("Nhap so thu "+i+" : ");
            int x= sc.nextInt();
            reverseArrayIntegerUseStack.push(x);
            i++;
        }
        System.out.println("Mang sau khi chua doi nguoc: ");
        reverseArrayIntegerUseStack.print();
        final int SIZE= reverseArrayIntegerUseStack.size();
        ReverseArrayIntegerUseStack<Integer> reverseArrayIntegerUseStack1= new ReverseArrayIntegerUseStack<>();
        for(int j=0;j<SIZE;j++){
            reverseArrayIntegerUseStack1.push(reverseArrayIntegerUseStack.pop());
        }
        System.out.println("Mang sau khi da doi nguoc: ");
        reverseArrayIntegerUseStack1.print();
    }
}
