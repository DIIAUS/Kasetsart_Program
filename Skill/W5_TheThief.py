#Skill W5
N,T = input().split()
T=int(T)
N=int(N)

# if N<1:
#     quit()
# if T>100000:
#     quit()

# if T>N:
#     quit()

ls = list(map(int , input().split()))

for i in ls:
    if i > 100000:
        quit()

if len(ls)!=N:
    quit()

if not(N>=1):
    quit()

if not(T<=100000):
    quit()

if T>N:
    quit()












ls.sort()

# print(ls)

# print(len(ls)-T)
# print(len(ls))
if len(ls)==N:
    print(sum(ls[len(ls)-T:len(ls)]))