#!/bin/python

import sys

def getMoneySpent(keyboards, drives, s):
    # Complete this function
    keyboards, drives = sorted(keyboards), sorted(drives)
    len_key, len_dri = len(keyboards), len(drives)
    # print "len", len_key, len_dri
    print keyboards
    print drives
    i = j = -1
    maximum = keyboards[i] + drives[j]
    f1, f2 = False, False
    if maximum > s:
        while True:
            max_sum = 0
            if i < (1-len_key):
                max_sum += keyboards[i]
                print "a", max_sum
            else:
                max_sum += keyboards[-len_key]
                print "b", max_sum
                f1 = True
            if j < (1-len_dri):
                max_sum += drives[j]
                print "c"
            else:
                max_sum += drives[-len_dri]
                print "d", max_sum
                f2 = True

            # print f1, f2
            if max_sum <= s:
                print i, j
                return max_sum
            if not f1 or not f2:
                if not f1:
                    i -= 1
                if not f2:
                    j -= 1
                continue
            return -1
    else:
        return maximum





s,n,m = raw_input().strip().split(' ')
s,n,m = [int(s),int(n),int(m)]
keyboards = map(int, raw_input().strip().split(' '))
drives = map(int, raw_input().strip().split(' '))
#  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
moneySpent = getMoneySpent(keyboards, drives, s)
print(moneySpent)
