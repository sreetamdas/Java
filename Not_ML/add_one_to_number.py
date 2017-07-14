class Solution:
    # @param A : list of integers
    # @return a list of integers
    def plusOne(self, A):

        counter = 1
        final = 0
        # for i in xrange(len(A)):
        #     number = A.pop()
        #     final = final + (number*counter)
        #     counter *= 10

        final = "".join(str(x) for x in A)
        final = int(final)
        final +=1
        final = str(final)
        actual = []
        for ch in final:
            actual.append(ch)
        print actual
        # print "A:", A
        # if A[-1] == 9:
        #     A[-1]
        # else:
        #     print A[-1]



solve = Solution()
size = int(raw_input())
# A = []
# for u in xrange(size):
A = map(int, (raw_input()).split())
solve.plusOne(A)



