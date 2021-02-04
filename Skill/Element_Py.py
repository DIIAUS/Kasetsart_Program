# Skill W4

n=int(input())


if n>1 and n<1000000:
    x=list(map(int,input().split())) #6
    ans=int(input())

    if(len(x)!=n):
        quit()

    if n<4:
        print("NO")

    elif n>3:    
        for i in range(n):
            p=i+4
            
            if p<=n:    
                a=sum(x[i:p])
                #print(a,end=" ")
                if(a==ans):
                    print("YES")
                    break

        if ans!=a:
            print("NO")
