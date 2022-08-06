class Solution{
    public int myAtoi(String s){
        String inp = s.trim();
        
        if(inp.length() == 0)
            return 0;
    
        int chars = 0;
        boolean neg = false;
        
        if(inp.charAt(0) =='-')
            neg = true;
        
        long n = 0;
        for(int i = 0; i<inp.length(); i++){
            
            if(i == 0 && (inp.charAt(i) == '-' || inp.charAt(i) == '+'))
                continue;
            
            if(chars > 10) // if it passes limit of int ,break
                break;
            
            if(inp.charAt(i) - 48 >= 0 && inp.charAt(i) - 48 <= 9){ 
                n = n*10 + (inp.charAt(i) - 48);
                if(n == 0 && (inp.charAt(i) - 48) == 0)
                    continue;
                else
                    chars++; 
            }
            else break; 
        }
        
        if(neg)
            n = -n;
        
         if(n > Integer.MAX_VALUE)
         return Integer.MAX_VALUE;
        
     else if(n < Integer.MIN_VALUE)
         return Integer.MIN_VALUE;
    
     return (int)n;
    }
}