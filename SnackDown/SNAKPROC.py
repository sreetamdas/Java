
total = int(raw_input())

for count in xrange(total):
    length = int(raw_input())

    string = str(raw_input())

    flag = 0
    for char in string:
        # print char,
        if flag == 1 and char == "H":
            flag = -1
            break
        elif flag == 0 and char == "T":
            flag = -1
            break
        elif char == "H":
            flag += 1
        elif char == "T":
            flag -= 1
        else:
            continue

    if flag == 0:
        print "Valid"
    else:
        print "Invalid"

