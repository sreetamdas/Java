#!/bin/python

import sys

def patternCount(s):
    # Complete this function
    count = 0
    second_flag = False
    for i in xrange(len(s)):
        if s[i] == '1':
            if second_flag and (i) and s[i-1] == '0':
                count += 1
            if (i != len(s)-1) and s[i+1] == '0':
                second_flag = True
        elif s[i] == '0':
            continue
        else:
            second_flag = False

    return count

q = int(raw_input().strip())
for a0 in xrange(q):
    s = raw_input().strip()
    result = patternCount(s)
    print(result)