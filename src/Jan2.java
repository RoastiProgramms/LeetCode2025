public class Jan2 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] cheatSheet=new int[words.length];
        for(int i=0;i<words.length;i++)
        {
            if(words[i].charAt(0)=='a'||words[i].charAt(0)=='e'||
                    words[i].charAt(0)=='i'||words[i].charAt(0)=='o'||words[i].charAt(0)=='u')
            {
                if(words[i].charAt(words[i].length()-1)=='a'||words[i].charAt(words[i].length()-1)=='i'||
                        words[i].charAt(words[i].length()-1)=='o'||words[i].charAt(words[i].length()-1)=='e'||
                        words[i].charAt(words[i].length()-1)=='u')
                {
                    cheatSheet[i]=1;
                }
            }
        }
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int cur=0;
            for(int j=queries[i][0];j<=queries[i][1];j++)
            {
                cur+=cheatSheet[j];
            }
            result[i]=cur;
        }
        return result;
    }
}
