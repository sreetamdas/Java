# def mod_fib(first, second, i):
#     """
#     term(i+2) = term(i) + term(i+1)^2
#     :param first:
#     :param second:
#     :param power:
#     :return:
#     """
#
#     if i == 1:
#         return first
#     elif i == 2:
#         return second
#     else:
#         return (mod_fib(first, second, (i-2)) + pow(mod_fib(first, second, (i-1)), 2))
#
#
#
#
#
# input_vals = (raw_input().split())
# # print input_vals
# print mod_fib(int(input_vals[0]), int(input_vals[1]), int(input_vals[2]))


# # !/bin/python
#
# import sys
#
# n = int(raw_input().strip())
# a = map(int, raw_input().strip().split(' '))
# # Write Your Code Here
# numberOfSwaps = 0
# for i in xrange(n):
#     # print a
#     for j in xrange(n - 1):
#         if a[j] > a[j + 1]:
#             print a
#             a[j], a[j + 1] = a[j + 1], a[j]
#             numberOfSwaps += 1
#     if not numberOfSwaps:
#         break
#
# print "Array is sorted in", numberOfSwaps, "swaps."
# print "First Element:", a[0]
# print "Last Element:", a[n - 1]
# print a