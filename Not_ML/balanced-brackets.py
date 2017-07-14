def is_matched(expression):
    stack = []
    open_braces = "{[("
    close_braces = "}])"
    flag = True
    stacked = False
    for brace in expression:
        # print "stack : ", stack
        if stacked and len(stack) == 0 and brace in close_braces:
            flag = False
            break
        if brace in open_braces:
            stack.append(brace)
            stacked = True
        elif brace in close_braces and stacked:
            if brace == "}" and stack.pop() == "{":
                continue
            elif brace == "]" and stack.pop() == "[":
                continue
            elif brace == ")" and stack.pop() == "(":
                continue
            else:
                flag = False
                break
        else:
            pass
    if len(stack):
        return False
    if not stacked:
        return False
    return flag






t = int(raw_input().strip())
for a0 in xrange(t):
    expression = raw_input().strip()
    # is_matched(expression)
    if is_matched(expression) == True:
        print "YES"
    else:
        print "NO"
