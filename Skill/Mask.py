# Skill W4

allply=[]

roud1=[]
roud2=[]
roud3=[]
roud4=[]

semi1=[]
semi2=[]

final=[]

ld=[]
lumdab=[]
last=[]

n=int(input())
if n>300 :
    quit()

i=0; 
while i< 4*n :
    ld.append(i)
    inp = int(input())
    
    if inp>1000000:
        quit()
   
    allply.append(inp)

    i+=1




roud1.extend(allply[0:(4*n//4)])
roud2.extend(allply[(4*n//4):2*(4*n//4)])
roud3.extend(allply[2*(4*n//4):3*(4*n//4)])
roud4.extend(allply[3*(4*n//4):4*(4*n//4)])

semi1.extend([max(roud1),max(roud2)])
semi2.extend([max(roud3),max(roud4)])

final.extend([max(semi1),max(semi2)])

lumdab.extend([max(final),min(final),min(semi1),min(semi2)])
#print((allply))
# print(roud1)
# print(max(roud1))
# print(roud2)
# print(max(roud2))
# print(roud3)
# print(max(roud3))
# print(roud4)
# print(max(roud4))
# print(semi1)
# print(semi2)

# print(final)
# print(max(final))
# print(min(final))
# print(ld)

# for e in range(0,len(allply)):
#     print(e+1,end=" ")
# print(lumdab)
# print(allply)
# print(ld)


#print(allply[0])
e=0
while e<(len(lumdab)):#0<3

    mm= allply.index(lumdab[e],0,len(allply))#data,start,
    last.append(mm+1)
    e+=1

for out in last:
    print(out,end=" ")
