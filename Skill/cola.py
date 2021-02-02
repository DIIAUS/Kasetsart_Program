#Skill W4
#--------------SetUp--------------#
n=int(input())
start=n
btn=0
binbtn=0
lis=[]
cx = 1
#-----------CheckInput---------#
if n<1 or n>200:
    quit()
if n<3 and n==start:
        print(0)
        cx=0

#------------Counting-----------#
while(cx==1):
    
    if n==start: 
        if n==3:
            print(3)
            break
        lis.append(n)
        btn=n//3
        lis.append(btn)
        binbtn=n-(btn*3)
        n=btn+binbtn
    else:
        if n==1:
            print(sum(lis))
            cx=0
        if n==2: #add => 1
            n=n+1
        else:
            btn=n//3
            lis.append(btn)
            binbtn=n-(btn*3)
            n=btn+binbtn
