#!/bin/python

import sys

from copy import deepcopy

def twinArrays(ar1, ar2):
    # Complete this function
    min1, min2 = min(ar1), min(ar2)
    # print "this"
    # print ar1.index(min1), ar2.index(min2)
    if ar1.index(min1) == ar2.index(min2):
        # print "here"
        orig1, orig2 = deepcopy(ar1), deepcopy(ar2)
        orig1.pop(ar1.index(min1))
        orig2.pop(ar2.index(min2))

        min3, min4 = min(orig1), min(orig2)
        if (min2+min3) < (min1+min4):
            return twinArrays(orig1, ar2)
        else:
            return twinArrays(ar1, orig2)
    return  (min1+min2)

n = int(raw_input().strip())
ar1 = map(int, raw_input().strip().split(' '))
ar2 = map(int, raw_input().strip().split(' '))
result = twinArrays(ar1, ar2)
print(result)
