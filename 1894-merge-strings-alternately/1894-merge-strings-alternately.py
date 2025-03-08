class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        merged=[]
        for w1, w2 in zip(word1, word2):
            merged.append(w1)
            merged.append(w2)
    
        merged.append(word1[len(word2):])
        merged.append(word2[len(word1):])
    
        return ''.join(merged)
