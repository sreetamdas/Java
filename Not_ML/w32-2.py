#!/bin/python3

import sys

def getMaxMonsters(n, hit, t, h):
    sort_this = sorted(h)

    counter, i = 0, 0
    while i < n:
        if sort_this[counter] > 0:
            sort_this[counter] -= hit
            i += 1
            continue
        # print(counter, i, sort_this)
        counter += 1

    return counter

n, hit, t = input().strip().split(' ')
n, hit, t = [int(n), int(hit), int(t)]
h = list(map(int, input().strip().split(' ')))
result = getMaxMonsters(n, hit, t, h)
print(result)
