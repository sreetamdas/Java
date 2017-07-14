# from collections import deque, Counter


# def palindrome_from(letters):
#     """
#     Forms a palindrome by rearranging :letters: if possible,
#     throwing a :ValueError: otherwise.
#     :param letters: a suitable iterable, usually a string
#     :return: a string containing a palindrome
#     """
#     counter = Counter(letters)
#     sides = []
#     center = deque()
#     for letter, occurrences in counter.items():
#         repetitions, odd_count = divmod(occurrences, 2)
#         if not odd_count:
#             sides.append(letter * repetitions)
#             continue
#         if center:
#             raise ValueError("no palindrome exists for '{}'".format(letters))
#         center.append(letter * occurrences)
#     center.extendleft(sides)
#     center.extend(sides)
#     return ''.join(center)

# Function to print all distinct palindrome sub-strings of s
def palindromeSubStrs(s):
    m = dict()
    n = len(s)

    # table for storing results (2 rows for odd-
    # and even-length palindromes
    R = [[0 for x in xrange(n + 1)] for x in xrange(2)]

    # Find all sub-string palindromes from the given input
    # string insert 'guards' to iterate easily over s
    s = "@" + s + "#"

    for j in xrange(2):
        rp = 0  # length of 'palindrome radius'
        R[j][0] = 0

        i = 1
        while i <= n:

            # Attempt to expand palindrome centered at i
            while s[i - rp - 1] == s[i + j + rp]:
                rp += 1  # Incrementing the length of palindromic
                # radius as and when we find valid palindrome

            # Assigning the found palindromic length to odd/even
            # length array
            R[j][i] = rp
            k = 1
            while (R[j][i - k] != rp - k) and (k < rp):
                R[j][i + k] = min(R[j][i - k], rp - k)
                k += 1
            rp = max(rp - k, 0)
            i += k

    # remove guards
    s = s[1:len(s) - 1]

    # Put all obtained palindromes in a hash map to
    # find only distinct palindrome
    m[s[0]] = 1
    for i in xrange(1, n):
        for j in xrange(2):
            for rp in xrange(R[j][i], 0, -1):
                m[s[i - rp - 1: i - rp - 1 + 2 * rp + j]] = 1
        m[s[i]] = 1

    # printing all distinct palindromes from hash map
    print "Below are " + str(len(m)) + " pali sub-strings"
    for i in m:
        print i
    # return max(m,key=len)


#!/bin/python

import sys

# n, m = raw_input().strip().split(' ')
# n, m = [int(n), int(m)]
# table = []
# string = ""
# for table_i in xrange(n):
#     table_temp = map(int,raw_input().strip().split(' '))
#     table.append(table_temp)
#     # string += (x for x in table_temp)
#
# # string.str(x) for x in table)
# string  = ''.join(str(r) for v in table for r in v)
# print string
# print palindrome_from("bcadcabcdeayua")

print palindromeSubStrs("ababc")
