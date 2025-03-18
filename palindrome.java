class palindrome{
    public boolean isPalindrome(int x){
       if (x<0 ||(x % 10==0 && x != 0)){
            return false;
        }
        int reversedHalf=0;
        while (x>reversedHalf) {
            reversedHalf=reversedHalf * 10 + x%10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
    public static void main(String[] args){
        palindrome solution=new palindrome();
        int x=121;
        System.out.println(solution.isPalindrome(x));  
        x =-121;
        System.out.println(solution.isPalindrome(x));  
        x = 10;
        System.out.println(solution.isPalindrome(x));  
    }
}