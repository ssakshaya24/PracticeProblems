class Solution {
    String removeDups(String S) {
        
            String a = "";
            ArrayList<Character> str=new ArrayList<Character>();
            long len = S.length();
            for(int i=0;i<len;i++)
            {
                
                if(!str.contains(S.charAt(i)))
                {   
                    str.add(S.charAt(i));
                    // System.out.print(str);
                }
            }
            
            
            
            for(int i=0;i<str.size();i++)
            {
                a=a+str.get(i);    
            }
            return a;

    }
}
