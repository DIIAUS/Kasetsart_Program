X,Y,N = input().split()
X,Y,N = int(X),int(Y),int(N)

cx=True
H=0
sum=0
if Y>100 or N<1:
    quit()

for i in range(N):    
    cx=True
    if X<Y:
        quit()
    H=int(input())
    if H>1000:
        quit()
    

    elif X!=Y:    
        while cx:
            if H!=X:
                H=H-(X-Y)
                sum=sum+1
                if H<=0:
                    H=0
                    cx=False 
            elif H==X:
                H=H-H
                sum=sum+1
                if H<=0:
                    H=0
                    cx=False
    

    

    elif X==Y:
        if H<=X:
            sum=sum+1
        elif H>X:
            sum="\0"
print(sum)