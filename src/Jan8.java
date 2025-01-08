public class Jan8 {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(startsAndEnds(words[i],words[j]))
                {
                    count++;
                }
            }
        }
        return count;

    }
    public boolean startsAndEnds(String w1,String w2)
    {
        if(w2.startsWith(w1)&&w2.endsWith(w1))
        {
            return true;
        }
        return false;
    }
}
