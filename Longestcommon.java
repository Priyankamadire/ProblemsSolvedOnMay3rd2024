/*14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/
class Longestcommon {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder sb = new StringBuilder();
       Arrays.sort(strs);
       int n = strs.length;
       char fir[] = strs[0].toCharArray();
       char las[] = strs[n-1].toCharArray();
       for(int i=0;i<fir.length;i++){
        if(fir[i]!=las[i]){
            break;
        }
        sb.append(fir[i]);
       }
       return sb.toString();
    }
}
