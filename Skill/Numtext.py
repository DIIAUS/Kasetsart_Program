def zeros(num):
    word=''
    if num=='0':
        word="zero"
    word = word.strip()
    return word

def once(num):
    word = ''
    
    if num == '1':
        word = "one"
    if num == '2':
        word = "two"
    if num == '3':
        word = "three"
    if num == '4':
        word = "four"
    if num == '5':
        word = "five"
    if num == '6':
        word = "six"
    if num == '7':
        word = "seven"
    if num == '8':
        word = "eight"
    if num == '9':
        word = "nine"
    word = word.strip()
    return word

def ten(num):
    word = ''
    if num[0] == '1':
        if num[1] == '0':
            word = "ten"
        if num[1] == '1':
            word = "eleven"
        if num[1] == '2':
            word = "twelve"
        if num[1] == '3':
            word = "thirteen"
        if num[1] == '4':
            word = "fourteen"
        if num[1] == '5':
            word = "fifteen"
        if num[1] == '6':
            word = "sixteen"
        if num[1] == '7':
            word = "seventeen"
        if num[1] == '8':
            word = "eighteen"
        if num[1] == '9':
            word = "nineteen"
    else:
        text = once(num[1])
        if num[0] == '2':
            if num[1]=='0':
                word ="twenty"
            else:
                word = "twenty-"

        if num[0] == '3':
            if num[1]=='0':
                word ="thirty"
            else:
                word = "thirty-"

        if num[0] == '4':
            if num[1]=='0':
                word ="fourty"
            else:
                word = "fourty-"

        if num[0] == '5':
            if num[1]=='0':
                word ="fifty"
            else:
                word = "fifty-"

        if num[0] == '6':
            if num[1]=='0':
                word ="sixty"
            else:
                word = "sixty-"

        if num[0] == '7':
            if num[1]=='0':
                word ="seventy"
            else:
                word = "seventy-"
            
        if num[0] == '8':
            if num[1]=='0':
                word ="eighty"
            else:
                word = "eighty-"
        
        if num[0] == '9':
            if num[1]=='0':
                word ="ninety"
            else:
                word = "ninety-"
            

        word = word + text
    word = word.strip()
    return word

def hundred(num):
    word = ''
    text = ten(num[1:])
    if num[0] == '1':
        word = "one"
    if num[0] == '2':
        word = "two"
    if num[0] == '3':
        word = "three"
    if num[0] == '4':
        word = "four"
    if num[0] == '5':
        word = "five"
    if num[0] == '6':
        word = "six"
    if num[0] == '7':
        word = "seven"
    if num[0] == '8':
        word = "eight"
    if num[0] == '9':
        word = "nine"
    if num[0] != '0':
        word = word + " hundred "
    word = word + text
    word = word.strip()
    return word

def thousand(num):
    word = ''
    pref = ''
    text = ''
    length = len(num)
    if length == 6:
        text = hundred(num[3:])
        pref = hundred(num[:3])
    if length == 5:
        text = hundred(num[2:])
        pref = ten(num[:2])
    if length == 4:
        text = hundred(num[1:])
        if num[0] == '1':
            word = "one"
        if num[0] == '2':
            word = "two"
        if num[0] == '3':
            word = "three"
        if num[0] == '4':
            word = "four"
        if num[0] == '5':
            word = "five"
        if num[0] == '6':
            word = "six"
        if num[0] == '7':
            word = "seven"
        if num[0] == '8':
            word = "eight"
        if num[0] == '9':
            word = "nine"
        word = word + " thousand "
    word = word + text
    if length == 6 or length == 5:
        word = pref + " thousand " + word
    word = word.strip()
    return word

# def million(num):
#     word = ''
#     pref = ''
#     text = ''
#     length = len(num)
#     if length == 9:
#         text = thousand(num[3:])
#         pref = hundred(num[:3])
#     if length == 8:
#         text = thousand(num[2:])
#         pref = ten(num[:2])
#     if length == 7:
#         text = thousand(num[1:])
#         if num[0] == '1':
#             word = "one"
#         if num[0] == '2':
#             word = "two"
#         if num[0] == '3':
#             word = "three"
#         if num[0] == '4':
#             word = "four"
#         if num[0] == '5':
#             word = "five"
#         if num[0] == '6':
#             word = "six"
#         if num[0] == '7':
#             word = "seven"
#         if num[0] == '8':
#             word = "eight"
#         if num[0] == '9':
#             word = "nine"
#         word = word + " million "
#     word = word + text
#     if length == 9 or length == 8:
#         word = pref + " million " + word
#     word = word.strip()
#     return word

# def billion(num):
#     word = ''
#     pref = ''
#     text = ''
#     length = len(num)
#     if length == 12:
#         text = million(num[3:])
#         pref = hundred(num[:3])
#     if length == 11:
#         text = million(num[2:])
#         pref = ten(num[:2])
#     if length == 10:
#         text = million(num[1:])
#         if num[0] == '1':
#             word = "one"
#         if num[0] == '2':
#             word = "two"
#         if num[0] == '3':
#             word = "three"
#         if num[0] == '4':
#             word = "four"
#         if num[0] == '5':
#             word = "five"
#         if num[0] == '6':
#             word = "six"
#         if num[0] == '7':
#             word = "seven"
#         if num[0] == '8':
#             word = "eight"
#         if num[0] == '9':
#             word = "nine"
#         word = word + " billion "
#     word = word + text
#     if length == 12 or length == 11:
#         word = pref + " billion " + word
#     word = word.strip()
#     return word


#104382426112 One Hundred Four Billion Three Hundred Eighty Two Million Four Hundred Twenty Six Thousand One HUndred Twelve
ls=[]
n=int(input())
for i in range(n):
    test = int(input())
    if test>10000 or test<0:
         quit()
    
    a = str(test)
    leng = len(a)
    
    if leng == 1:
        if a=='0':
            num=zeros(a)
        else:
            num = once(a)
    if leng == 2:
        num = ten(a)
    if leng == 3:
        num = hundred(a)
    if leng > 3 and leng < 7:
        if(test<=10000):
            num = thousand(a)+=
        
    # if leng > 6 and leng < 10:
    #     num = million(a)
    # if leng > 9 and leng < 13:
    #     num = billion(a)
    print(num)
    #ls.append(num)


#print(*ls,sep="\n")

