class Solution {    static int printfib(int n){        if(n<=1){            return n;        }        return printfib(n-1) + printfib(n-2);    }    public int fib(int n) {            return printfib(n);    }}
class Solution {
    static int printfib(int n){
        if(n<=1){
            return n;
        }
        return printfib(n-1) + printfib(n-2);
    }
    public int fib(int n) {
        
    return printfib(n);
    }
}

