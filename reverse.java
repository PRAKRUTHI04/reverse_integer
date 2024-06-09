class reverse {
    public int reverse(int x) {
        int temp;
        int rev=0;
        while(x!=0){
            temp=x%10;
            x/=10;
            rev=(rev*10)+temp;
        }
        return rev;
    }
}
