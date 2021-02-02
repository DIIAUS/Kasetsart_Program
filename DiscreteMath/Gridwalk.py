N,M = map(int, input().split())
C = N + M
fac1 = 1
fac2 = 1
fac3 = 1
for i in range(2, N+1):
    fac1 = fac1 * i
for ii in range(2, M+1):
    fac2 = fac2 * ii
for iii in range(2, C+1):
    fac3 = fac3 * iii
print(fac3 // (fac1*fac2))


