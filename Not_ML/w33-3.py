
def lps(str):
    n = len(str)

    # Create a table to store results of subproblems
    L = [[0 for x in range(n)] for x in range(n)]

    # Strings of length 1 are palindrome of length 1
    for i in range(n):
        L[i][i] = 1

    for cl in range(2, n + 1):
        for i in range(n - cl + 1):
            j = i + cl - 1
            if str[i] == str[j] and cl == 2:
                L[i][j] = 2
            elif str[i] == str[j]:
                L[i][j] = L[i + 1][j - 1] + 2
            else:
                L[i][j] = max(L[i][j - 1], L[i + 1][j])

    return L[0][n - 1]



import sys

n,k,m = raw_input().strip().split(' ')
n,k,m = [int(n),int(k),int(m)]
# i = 0
# t = [[] for _ in xrange(1)]
alphabets = [i for i in xrange(n)]
i = 0
my = {}

for a0 in xrange(k):
    x,y = raw_input().strip().split(' ')
    x,y = [int(x),int(y)]
    flagx, flagy = False, False
    another = my.values()

    keyx, keyy = 0, 0
    if any(x in sl for sl in another):
    # if (next((j for j, sublist in enumerate(another) if x in sublist), -1) != ):
        flagx = True
        keyx = next((j for j, sublist in enumerate(another) if x in sublist), -1)
    if any(y in sl for sl in another):
        flagy = True
        keyy = next((j for j, sublist in enumerate(another) if y in sublist), -1)
    # if flagx and flagy:
    #     continue
    if flagx:
        my[keyx].append(y)
    if flagy:
        my[keyy].append(x)
    if not flagx and not flagy:
        my[alphabets[i]] = [x, y]
        i += 1
another = my.values()
a = map(int, raw_input().strip().split(' '))

for i,sub in enumerate(another):
    for x in sub:
        flag = next((j for j, sublist in enumerate(another) if x in sublist), -1)
        if flag >= 0 and (flag != i):

            my[flag].extend(list(set(sub) - set(my[flag]))) #sub
            my[i] = []
        if flag >= 0:
            # printflag
            a[i] = flag
        else:
            a[i] = str(a[i])
        another = my.values()

for i, x in enumerate(a):
    flag = next((j for j, sublist in enumerate(my.values()) if x in sublist), -1)
    if flag >= 0:
        # printflag
        a[i] = flag
    else:
        a[i] = str(a[i])

print my
print a
print str(lps(a))