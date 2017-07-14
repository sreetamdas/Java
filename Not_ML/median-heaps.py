#!/bin/python

import sys, bisect

n = int(input())
a = []
a_i = 0
for a_i in range(n):
    a_t = int(input())
    bisect.insort(a, a_t)
    if len(a)%2:
        print('{:.1f}'.format(a[int(len(a)/2)]))
    else:
        pos = int(len(a)/2)
        print('{:.1f}'.format((a[pos-1] + a[pos])/2, 1))