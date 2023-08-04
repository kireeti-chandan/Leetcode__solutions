// https://practice.geeksforgeeks.org/problems/reverse-a-stack/1
class ReverseStack
{ 
    static void reverse(Stack<Integer> s)
    {
        Queue<Integer> sc=new LinkedList<>() ;
        while(s.isEmpty() == false){
            sc.add(s.pop() );
        }
        while(sc.isEmpty() == false){
            s.push(sc.remove());
        }
    }
}
