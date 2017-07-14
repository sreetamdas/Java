total = int(raw_input())

for count in xrange(total):
    length = int(raw_input())
    # print "len:", length

    arr = map(int, raw_input().strip().split(' '))
    flag = True
    # print "start"
    if not length % 2:
        flag = False
    else:
        if arr[0] != 1:
            flag = False
        if max(arr) != arr[length/2]:
            flag = False
        for i in xrange(length):
            if i == length - 1:
                break
            elif abs(arr[i+1] - arr[i]) != 1:
                flag = False
                break
            else:
                continue
    if flag:
        print "yes"
    else:
        print "no"
