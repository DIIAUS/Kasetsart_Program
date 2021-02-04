#SKill W5
N,M,L= (input().split())
N,M,L= int(N),int(M),int(L)
start=0
K=[]

for i in range(1,L+1):
    K.append(i)
cx=True
sum=0

if N<1 or M>10**9 :
    if L<1 and L>10**12:
        quit()



if N>=len(K):
    sum=len(K[0:len(K)])

else:   
    if(M<N) :
        while cx:
            sum=sum+len(K[start:N])
            sum=sum+M
            start=N-M
            N=N+(N-M)
            if(N==len(K)):
                sum=sum+len(K[start:N])
                break;
            if(N>len(K)):
                sum=sum+len(K[start:len(K)])
                break;
    else:
        quit()
print(sum)