N,M = input().split()
N =  int(N)
M = int(M) 
H=[]
J=[]
count=0
if(N<1 or N>1000):
    quit()
if(M<1 or M>1000):
    quit()
    
for i in range(N):
    H.append(int(input()))
    # if(H[i]<1 or H[i]>10000):
    #     quit()
for i in range(M):
    J.append(int(input()))
    # if(J[i]<1 or J[i]>10000):
    #     quit()

# print("Before\n{}\n{}".format(H,J))
for i in range(len(J)):
    for k in range(len(H)): 
        
        # print(J[i]," ",H[k])
        if len(H)==1:
            if(J[i]<H[k]):
                H[k]=0
                count+=1;    


        elif len(H)>1:
            if(J[i]<H[k]): #J=Hight_Barack H=Hight_Bottle10
                
                if(H[k]==H[0] and k==0): #first check list
                    if H[k+1]==0:
                        H[k]=0
                        count+=1
                    else:
                        H[k]=0
                        H[k+1]=0
                        count+=2

                elif(H[k] == H[len(H)-1] and k==(len(H)-1)):
                    if H[k-1]==0:
                        H[k]=0
                        count+=1
                    else:
                        H[k]=0
                        H[k-1]=0
                        count+=2
        #*********************** Problem **********************
                else: #** NOT Head or Tail
                    if H[k]==0:
                        continue
                    elif H[k-1]==0:
                        if H[k+1]>=H[k]:
                            H[k]=0
                            count+=1
                        else:
                            if(H[k+1]==0 and H[k-1]==0):
                                H[k]=0;
                                count+=1
                            else:
                                H[k]=0;
                                H[k+1]=0;
                                count+=2
                    elif H[k+1]==0:
                        if H[k+1]==0 and H[k-1]==0:
                            H[k]=0
                            count+=1
                        else:
                            H[k]=0
                            H[k-1]=0
                            count+=2
                    elif H[k-1]!=0 and H[k+1]!=0:
                        if(H[k+1]>=H[k]):  
                            H[k]=0;
                            H[k-1]=0;
                            count+=2
                            
                        else:
                            H[k]=0;
                            H[k-1]=0;
                            H[k+1]=0;
                            count+=3
    print(count)
    count=0                     

print("After\n{}\n{}\n".format(H,J))

