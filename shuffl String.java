class Solution {
    public String restoreString(String s, int[] ind) {
          StringBuilder ans=new StringBuilder();
          char arr[]=new char[ind.length];
          for(int i=0;i<ind.length;i++){
           arr[ind[i]]=s.charAt(i);  
          }
          for(int i=0;i<arr.length;i++){
              ans.append(arr[i]);
          }
          return ans.toString();
    }
}
