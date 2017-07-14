from __builtin__ import any

class Contacts:
    def __init__(self):
        self.contacts = []

    def add(self, value):
        self.contacts.append(value)
        print "contacts:", self.contacts

    def find(self, value):
        try:
            # if value in self.contacts:
            print any(value in x for x in self.contacts)
            
        except:
            print "not ofund", value
            pass




n = int(raw_input().strip())
contacts = Contacts()

for a0 in xrange(n):
    op, contact = raw_input().strip().split(' ')

    if op == "add":
        contacts.add(contact)
    elif op == "find":
        contacts.find(contact)
    else:
        raise Exception("Not recog. command")



